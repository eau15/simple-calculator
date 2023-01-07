

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SimpleCalculator {
  private JFrame frmCalculator;
  
  private JTextField expression;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              SimpleCalculator window = new SimpleCalculator();
              window.frmCalculator.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public SimpleCalculator() {
    initialize();
  }
  
  private void initialize() {
    this.frmCalculator = new JFrame();
    this.frmCalculator.getContentPane().setBackground(new Color(250, 240, 230));
    this.frmCalculator.setTitle("Simple Calculator");
    this.frmCalculator.setBounds(100, 100, 303, 396);
    this.frmCalculator.setDefaultCloseOperation(3);
    this.frmCalculator.getContentPane().setLayout((LayoutManager)null);
    this.expression = new JTextField();
    this.expression.setHorizontalAlignment(11);
    this.expression.setFont(new Font("Palatino Linotype", 0, 15));
    this.expression.addKeyListener(new KeyAdapter() {
          public void keyTyped(KeyEvent e) {
            if ('\n' == e.getKeyChar())
              SimpleCalculator.this.evaluateDisplay(); 
          }
        });
    this.expression.setBounds(52, 21, 180, 40);
    this.frmCalculator.getContentPane().add(this.expression);
    this.expression.setColumns(10);
    JButton button7 = new JButton("7");
    button7.setFont(new Font("Palatino Linotype", 0, 15));
    button7.setForeground(new Color(0, 0, 0));
    button7.setBackground(new Color(245, 222, 179));
    button7.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "7");
          }
        });
    button7.setBounds(26, 82, 50, 40);
    this.frmCalculator.getContentPane().add(button7);
    JButton button4 = new JButton("4");
    button4.setFont(new Font("Palatino Linotype", 0, 15));
    button4.setBackground(new Color(245, 222, 179));
    button4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "4");
          }
        });
    button4.setBounds(26, 133, 50, 40);
    this.frmCalculator.getContentPane().add(button4);
    JButton button1 = new JButton("1");
    button1.setFont(new Font("Palatino Linotype", 0, 15));
    button1.setBackground(new Color(245, 222, 179));
    button1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "1");
          }
        });
    button1.setBounds(26, 184, 50, 40);
    this.frmCalculator.getContentPane().add(button1);
    JButton button8 = new JButton("8");
    button8.setFont(new Font("Palatino Linotype", 0, 15));
    button8.setBackground(new Color(245, 222, 179));
    button8.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "8");
          }
        });
    button8.setBounds(86, 82, 50, 40);
    this.frmCalculator.getContentPane().add(button8);
    JButton button5 = new JButton("5");
    button5.setFont(new Font("Palatino Linotype", 0, 15));
    button5.setBackground(new Color(245, 222, 179));
    button5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "5");
          }
        });
    button5.setBounds(86, 133, 50, 40);
    this.frmCalculator.getContentPane().add(button5);
    JButton button2 = new JButton("2");
    button2.setFont(new Font("Palatino Linotype", 0, 15));
    button2.setBackground(new Color(245, 222, 179));
    button2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "2");
          }
        });
    button2.setBounds(86, 184, 50, 40);
    this.frmCalculator.getContentPane().add(button2);
    JButton button9 = new JButton("9");
    button9.setFont(new Font("Palatino Linotype", 0, 15));
    button9.setBackground(new Color(245, 222, 179));
    button9.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "9");
          }
        });
    button9.setBounds(146, 82, 50, 40);
    this.frmCalculator.getContentPane().add(button9);
    JButton button6 = new JButton("6");
    button6.setFont(new Font("Palatino Linotype", 0, 15));
    button6.setBackground(new Color(245, 222, 179));
    button6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "6");
          }
        });
    button6.setBounds(146, 133, 50, 40);
    this.frmCalculator.getContentPane().add(button6);
    JButton button3 = new JButton("3");
    button3.setFont(new Font("Palatino Linotype", 0, 15));
    button3.setBackground(new Color(245, 222, 179));
    button3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "3");
          }
        });
    button3.setBounds(146, 184, 50, 40);
    this.frmCalculator.getContentPane().add(button3);
    JButton button0 = new JButton("0");
    button0.setFont(new Font("Palatino Linotype", 0, 15));
    button0.setBackground(new Color(245, 222, 179));
    button0.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "0");
          }
        });
    button0.setBounds(26, 235, 50, 40);
    this.frmCalculator.getContentPane().add(button0);
    JButton buttonOpenBracket = new JButton("(");
    buttonOpenBracket.setFont(new Font("Palatino Linotype", 0, 15));
    buttonOpenBracket.setBackground(new Color(245, 222, 179));
    buttonOpenBracket.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "(");
          }
        });
    buttonOpenBracket.setBounds(86, 235, 50, 40);
    this.frmCalculator.getContentPane().add(buttonOpenBracket);
    JButton buttonCloseBracket = new JButton(")");
    buttonCloseBracket.setFont(new Font("Palatino Linotype", 0, 15));
    buttonCloseBracket.setBackground(new Color(245, 222, 179));
    buttonCloseBracket.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + ")");
          }
        });
    buttonCloseBracket.setBounds(146, 235, 50, 40);
    this.frmCalculator.getContentPane().add(buttonCloseBracket);
    JButton buttonAdd = new JButton("+");
    buttonAdd.setFont(new Font("Palatino Linotype", 0, 15));
    buttonAdd.setBackground(new Color(245, 222, 179));
    buttonAdd.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "+");
          }
        });
    buttonAdd.setBounds(206, 82, 50, 40);
    this.frmCalculator.getContentPane().add(buttonAdd);
    JButton buttonSub = new JButton("-");
    buttonSub.setFont(new Font("Palatino Linotype", 0, 15));
    buttonSub.setBackground(new Color(245, 222, 179));
    buttonSub.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "-");
          }
        });
    buttonSub.setBounds(206, 133, 50, 40);
    this.frmCalculator.getContentPane().add(buttonSub);
    JButton buttonMultiply = new JButton("*");
    buttonMultiply.setFont(new Font("Palatino Linotype", 0, 15));
    buttonMultiply.setBackground(new Color(245, 222, 179));
    buttonMultiply.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "*");
          }
        });
    buttonMultiply.setBounds(206, 184, 50, 40);
    this.frmCalculator.getContentPane().add(buttonMultiply);
    JButton buttonDivide = new JButton("/");
    buttonDivide.setFont(new Font("Palatino Linotype", 0, 15));
    buttonDivide.setBackground(new Color(245, 222, 179));
    buttonDivide.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "/");
          }
        });
    buttonDivide.setBounds(206, 235, 50, 40);
    this.frmCalculator.getContentPane().add(buttonDivide);
    JButton buttonExponent = new JButton("^");
    buttonExponent.setFont(new Font("Palatino Linotype", 0, 15));
    buttonExponent.setBackground(new Color(245, 222, 179));
    buttonExponent.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText(String.valueOf(SimpleCalculator.this.expression.getText()) + "^");
          }
        });
    buttonExponent.setBounds(206, 286, 50, 40);
    this.frmCalculator.getContentPane().add(buttonExponent);
    JButton buttonClear = new JButton("C");
    buttonClear.setFont(new Font("Palatino Linotype", 0, 15));
    buttonClear.setBackground(new Color(245, 222, 179));
    buttonClear.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.expression.setText("");
          }
        });
    buttonClear.setBounds(146, 286, 50, 40);
    this.frmCalculator.getContentPane().add(buttonClear);
    JButton buttonBackspace = new JButton("B");
    buttonBackspace.setFont(new Font("Palatino Linotype", 0, 15));
    buttonBackspace.setBackground(new Color(245, 222, 179));
    buttonBackspace.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String expressionString = SimpleCalculator.this.expression.getText();
            if (expressionString.length() == 0) {
              SimpleCalculator.this.expression.setText("");
            } else {
              int newExpressionLength = expressionString.length() - 1;
              String newExpression = expressionString.substring(0, newExpressionLength);
              SimpleCalculator.this.expression.setText(newExpression);
            } 
          }
        });
    buttonBackspace.setBounds(86, 286, 50, 40);
    this.frmCalculator.getContentPane().add(buttonBackspace);
    JButton buttonEquals = new JButton("=");
    buttonEquals.setFont(new Font("Palatino Linotype", 0, 15));
    buttonEquals.setBackground(new Color(245, 222, 179));
    buttonEquals.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            SimpleCalculator.this.evaluateDisplay();
          }
        });
    buttonEquals.setBounds(26, 286, 50, 40);
    this.frmCalculator.getContentPane().add(buttonEquals);
  }
  
  private void evaluateDisplay() {
    try {
      String infixExpression = this.expression.getText();
      InfixEvaluator i = new InfixEvaluator();
      int j = i.evaluate(infixExpression);
      this.expression.setText(Integer.toString(j));
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Error!", "", 0);
    } 
  }
}
