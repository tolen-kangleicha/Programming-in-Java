import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Program23_PalindromeGUI {
  public static void main(String[] args) {
    JFrame f = new JFrame("Palindrome Checker");
    JLabel l = new JLabel("Enter a number/word:");
    JTextField t = new JTextField();
    JButton b = new JButton("Check");
    JLabel result = new JLabel();

    l.setBounds(20, 20, 150, 30);
    t.setBounds(150, 20, 100, 30);
    b.setBounds(150, 70, 100, 30);
    result.setBounds(20, 110, 200, 30);

    b.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String input = t.getText();
            String rev = new StringBuilder(input).reverse().toString();
            result.setText(input.equals(rev) ? "Palindrome" : "Not Palindrome");
          }
        });

    f.add(l);
    f.add(t);
    f.add(b);
    f.add(result);
    f.setBounds(100, 100, 300, 200);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
