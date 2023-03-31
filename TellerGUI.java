import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p;
    private JButton btn1, btn2, btn3;
    private JLabel lb1, lb2;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        p = new JPanel();
        fr.setLayout(new BorderLayout());
        fr.add(lb1, BorderLayout.WEST);
        fr.add(lb2, BorderLayout.WEST);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        fr.setSize(300, 300);
        fr.setResizable(false);
        fr.setVisible(true);
    }
}
