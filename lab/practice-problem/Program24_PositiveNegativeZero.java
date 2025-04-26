import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Program24_PositiveNegativeZero {
  public static void main(String[] args) {
    JFrame f = new JFrame("Number Checker");
    JLabel l = new JLabel("Enter a number:");
    JTextField t = new JTextField();
    JButton b = new JButton("Check");
    JLabel result = new JLabel();

    l.setBounds(20, 20, 120, 30);
    t.setBounds(150, 20, 100, 30);
    b.setBounds(150, 70, 100, 30);
    result.setBounds(20, 110, 200, 30);

    b.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            int n = Integer.parseInt(t.getText());
            if (n > 0) result.setText("Positive");
            else if (n < 0) result.setText("Negative");
            else result.setText("Zero");
          }
        });
    f.add(l);
    f.add(t);
    f.add(b);
    f.add(result);
    f.setSize(300, 200);
    f.setLayout(null);
    f.setVisible(true);
    f.setBounds(100, 100, 300, 200);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
