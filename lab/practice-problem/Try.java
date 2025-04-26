import java.awt.event.*;
import javax.swing.*;

public class Try extends JFrame {
  JLabel l1, l2, l3, l4;
  JTextField t1, t2;
  JButton b;

  Try(String str) {
    super(str);
  }

  public void set_Component() {
    l1 = new JLabel("To find the sum of two numbers");
    l2 = new JLabel("Enter first number");
    l3 = new JLabel("Enter second number");
    l4 = new JLabel("Result: ");
    t1 = new JTextField();
    t2 = new JTextField();
    b = new JButton("ADD");

    setLayout(null);

    l1.setBounds(50, 50, 250, 20);
    l2.setBounds(50, 80, 120, 20);
    t1.setBounds(180, 80, 100, 20);
    l3.setBounds(50, 110, 120, 20);
    t2.setBounds(180, 110, 100, 20);
    b.setBounds(150, 150, 80, 25);
    l4.setBounds(50, 190, 200, 20);

    add(l1);
    add(l2);
    add(t1);
    add(l3);
    add(t2);
    add(b);
    add(l4);

    // Button click logic
    b.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            try {
              int num1 = Integer.parseInt(t1.getText());
              int num2 = Integer.parseInt(t2.getText());
              int sum = num1 + num2;
              l4.setText("Result: " + sum);
            } catch (NumberFormatException ex) {
              l4.setText("Please enter valid integers!");
            }
          }
        });

    setBounds(100, 100, 400, 300);
  }

  public static void main(String[] args) {
    Try obj = new Try("Add Two Numbers");
    obj.set_Component();
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
