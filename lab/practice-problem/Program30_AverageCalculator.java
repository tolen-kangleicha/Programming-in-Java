import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program30_AverageCalculator extends JFrame implements ActionListener {
  JTextField f1 = new JTextField(5), f2 = new JTextField(5), f3 = new JTextField(5);
  JButton button = new JButton("Calculate Average");
  JLabel result = new JLabel("Result will be shown here");

  public Program30_AverageCalculator() {
    super("Average Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns

    add(new JLabel("Number 1:"));
    add(f1);
    add(new JLabel("Number 2:"));
    add(f2);
    add(new JLabel("Number 3:"));
    add(f3);
    add(button);
    add(new JLabel("")); // spacer
    add(result);

    button.addActionListener(this);

    setSize(350, 250);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      int n1 = Integer.parseInt(f1.getText());
      int n2 = Integer.parseInt(f2.getText());
      int n3 = Integer.parseInt(f3.getText());
      double average = (n1 + n2 + n3) / 3.0;
      result.setText("Average: " + average);
    } catch (NumberFormatException ex) {
      result.setText("Enter valid numbers!");
    }
  }

  public static void main(String[] args) {
    new Program30_AverageCalculator();
  }
}
