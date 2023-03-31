import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JTextField tf;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private JButton plus, minus, multi, divide, equal, clear;
    private JPanel p;
    public CalculatorTwoGUI(){
        fr = new JFrame("Calculator2");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        p = new JPanel();
        tf = new JTextField(20);
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        plus = new JButton("+");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        minus = new JButton("-");
        multi = new JButton("x");
        divide = new JButton("/");
        btn0 = new JButton("0");
        clear = new JButton("c");
        equal = new JButton("=");
        fr.add(tf, BorderLayout.NORTH);
        p.setLayout(new GridLayout(4,4));
        p.add(btn7); p.add(btn8); p.add(btn9); p.add(plus);
        p.add(btn4); p.add(btn5); p.add(btn6); p.add(minus);
        p.add(btn1); p.add(btn2); p.add(btn3); p.add(multi);
        p.add(btn0); p.add(clear); p.add(equal); p.add(divide);
        fr.add(p, BorderLayout.CENTER);
        fr.setResizable(false);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
}
