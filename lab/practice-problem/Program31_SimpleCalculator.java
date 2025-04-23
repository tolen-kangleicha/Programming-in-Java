import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program31_SimpleCalculator extends JFrame implements ActionListener {
  JTextField n1 = new JTextField(5), n2 = new JTextField(5);
  JButton add = new JButton("Add"), sub = new JButton("Subtract"), mul = new JButton("Multiply");
  JLabel result = new JLabel("Result will be shown here");

  public Program31_SimpleCalculator() {
    super("Simple Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(5, 2, 10, 10)); // rows, columns, hgap, vgap

    add(new JLabel("Num1:"));
    add(n1);

    add(new JLabel("Num2:"));
    add(n2);

    add(add);
    add(sub);
    add(mul);
    add(new JLabel("")); // empty label to fill the cell

    add(result);

    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);

    setSize(350, 200);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      int a = Integer.parseInt(n1.getText());
      int b = Integer.parseInt(n2.getText());

      if (e.getSource() == add) result.setText("Sum: " + (a + b));
      else if (e.getSource() == sub) result.setText("Difference: " + (a - b));
      else result.setText("Product: " + (a * b));
    } catch (NumberFormatException ex) {
      result.setText("Please enter valid numbers!");
    }
  }

  public static void main(String[] args) {
    new Program31_SimpleCalculator();
  }
}
