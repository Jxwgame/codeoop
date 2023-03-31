import java.awt.*;
import javax.swing.*;
public class Calculator {
    private JFrame fr;
    private JButton bt1, bt2, bt3, bt4;
    private JTextField tf1, tf2, tf3;
    private JPanel p;
    public Calculator(){
        fr = new JFrame("Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt1 = new JButton("Plus");
        bt2 = new JButton("Minus");
        bt3 = new JButton("Multi");
        bt4 = new JButton("Divide");
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);
        p = new JPanel();
        // Layout
        fr.setLayout(new FlowLayout());
        fr.add(tf1);
        fr.add(tf2);
        p.add(bt1);
        p.add(bt2);
        p.add(bt3);
        p.add(bt4);
        fr.add(p);
        fr.add(tf3);
        fr.setResizable(false);
        fr.setLayout(new GridLayout(4, 1));
        fr.pack();
        fr.setVisible(true);
    }
}
