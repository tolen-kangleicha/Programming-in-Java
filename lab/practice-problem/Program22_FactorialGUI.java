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
    b.setBounds(90, 70, 120, 30);
    result.setBounds(90, 110, 200, 30);

    b.addActionListener(
        e -> {
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
        });

    f.add(l1);
    f.add(t1);
    f.add(b);
    f.add(result);
    f.setSize(300, 200);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
