import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Program22_FactorialGUI {
  public static void main(String[] args) {
    JFrame f = new JFrame("Factorial Calculator");
    JLabel l1 = new JLabel("Enter a number:");
    JTextField t1 = new JTextField();
    JButton b = new JButton("Calculate");
    JLabel result = new JLabel();

    l1.setBounds(20, 20, 120, 30);
    t1.setBounds(150, 20, 100, 30);
    b.setBounds(150, 70, 100, 30);
    result.setBounds(20, 110, 200, 30);

    b.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            try {
              int num = Integer.parseInt(t1.getText());
              if (num < 0) {
                result.setText("Enter non-negative number");
                return;
              }
              int fact = 1;
              for (int i = 1; i <= num; i++) fact *= i;
              result.setText("Factorial: " + fact);
            } catch (NumberFormatException ex) {
              result.setText("Invalid input");
            }
          }
        });

    f.add(l1);
    f.add(t1);
    f.add(b);
    f.add(result);
    f.setLayout(null);
    f.setVisible(true);
    f.setBounds(100, 100, 300, 200);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
