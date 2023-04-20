import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JTextField tf;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private JButton plus, minus, multi, divide, equal, clear;
    private JPanel p;
    private int num1;
    private String operator;
    private int num2;
    public CalculatorSample(){
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
        
        plus.addActionListener(this);
        minus.addActionListener(this);
        multi.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
        equal.addActionListener(this);
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
 }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(minus) || ae.getSource().equals(plus) || ae.getSource().equals(multi) || ae.getSource().equals(divide)){
            operator = ae.getActionCommand();
            num1 = Integer.parseInt(tf.getText());
            tf.setText("");
       }else if(ae.getSource().equals(btn0) || ae.getSource().equals(btn1) || ae.getSource().equals(btn2) || ae.getSource().equals(btn3) || ae.getSource().equals(btn4) || ae.getSource().equals(btn5) 
               || ae.getSource().equals(btn6) || ae.getSource().equals(btn7) || ae.getSource().equals(btn8) || ae.getSource().equals(btn9)){
            String num = ae.getActionCommand();
            tf.setText(tf.getText()+num);
            tf.getText();
        }else if(ae.getSource().equals(clear)){
            String str = ae.getActionCommand();
            tf.setText("");
        }else if(ae.getSource().equals(equal)){
            num2 = Integer.parseInt(tf.getText());
            int result = 0;
            if(operator.equals("+")){
                result = num1 + num2;
                tf.setText(String.valueOf(result));
            }else if(operator.equals("-")){
                result = num1 - num2;
                tf.setText(String.valueOf(result));
            }else if(operator.equals("x")){
                result = num1 * num2;
                tf.setText(String.valueOf(result));
            }else if(operator.equals("/")){
                result = num1 / num2;
                tf.setText(String.valueOf(result));
            }
    }
    }
}
