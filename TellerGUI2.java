import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI2 implements ActionListener{
    private JFrame fr;
    private JPanel p, a, a2;
    private JButton btn1, btn2, btn3;
    private JLabel lb1, lb2;
    private JTextField tf, tf1;
    private Account ac;
    public TellerGUI2(){
        ac = new Account(6000, "");
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        p = new JPanel();
        a = new JPanel();
        a2 = new JPanel();
        tf = new JTextField((int) ac.getBalance()+"");
        tf1 = new JTextField();
        tf.setEditable(false);
        a.setLayout(new GridLayout(1, 2));
        a.add(lb1); a.add(tf);
        a2.setLayout(new GridLayout(1, 2));
        a2.add(lb2); a2.add(tf1);
        fr.setLayout(new GridLayout(4, 1));
//        fr.setLayout(new GridLayout(2,2));
//        p.add(lb1); p.add(tf);
//        p.add(lb2); p.add(tf1);
        fr.add(a, BorderLayout.NORTH);
        fr.add(a2, BorderLayout.SOUTH);
        //fr.add(tf1, BorderLayout.EAST);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        //a2.setLayout(new FlowLayout());
        fr.add(p, BorderLayout.CENTER);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(btn2)){
            int amount = Integer.parseInt(tf1.getText());
            ac.withdraw(amount);
            tf.setText(ac.getBalance()+"");
            }
        else if(ae.getSource().equals(btn1)){
            int amount = Integer.parseInt(tf1.getText());
            ac.deposit(amount);
            tf.setText(ac.getBalance()+"");
        }
        else if(ae.getSource().equals(btn3)){
            System.exit(0);
        }
    }
}
