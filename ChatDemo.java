import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JTextArea area;
    private JTextField text;
    private JButton bt1, bt2;
    private JPanel p;
    public ChatDemo(){
        fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        bt1 = new JButton("Submit");
        bt2 = new JButton("Reset");
        area = new JTextArea(20, 45);
        text = new JTextField(45);
        p = new JPanel();
        fr.add(area, BorderLayout.NORTH);
        fr.add(text, BorderLayout.CENTER);
        p.setLayout(new FlowLayout());
        p.add(bt1); p.add(bt2);
        fr.add(p, BorderLayout.SOUTH);
        fr.pack();
        fr.setVisible(true);
        fr.setResizable(false);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        fr.addWindowListener(this);
    }
    public static void main(String[] args) {
        new ChatDemo();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(bt1)){
            String text1 = text.getText();
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            
            String datetime = now.format(dtf);
            String tarea = area.getText();
            tarea = tarea + "\n" + datetime + ": " + text1;
            area.setText(tarea);
            text.setText("");
        }
        else if(ae.getSource().equals(bt2)){
            text.setText("");
        }
    }
    public void windowClosing(WindowEvent ev){
        try(FileWriter fw = new FileWriter("ChatDemo.dat"); ){
            String str = area.getText();
            fw.write(str);
            System.out.println("Pass");
}
        catch (IOException ex) {
            System.out.println(ex);}
        
    }
    @Override
    public void windowOpened(WindowEvent ev){
        String str = "";
        try(FileReader fr = new FileReader("ChatDemo.dat")){
            int ch;
            while ((ch=fr.read())!=-1){
                str += (char)ch;
            }
            fr.close();
        } catch(IOException ex){
        }
        area.setText(str);
    }
    @Override
    public void windowClosed(WindowEvent ev) {}
    @Override
    public void windowIconified(WindowEvent ev) {}
    @Override
    public void windowDeiconified(WindowEvent ev) {}
    @Override
    public void windowActivated(WindowEvent ev) {}
    @Override
    public void windowDeactivated(WindowEvent ev) {}
}
