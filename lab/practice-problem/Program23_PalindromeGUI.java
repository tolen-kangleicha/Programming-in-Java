import java.awt.event.*;
import javax.swing.*;

public class Program23_PalindromeGUI {
  public static void main(String[] args) {
    JFrame f = new JFrame("Palindrome Checker");
    JLabel l = new JLabel("Enter a number:");
    JTextField t = new JTextField();
    JButton b = new JButton("Check");
    JLabel result = new JLabel();

    l.setBounds(20, 20, 120, 30);
    t.setBounds(150, 20, 100, 30);
    b.setBounds(90, 70, 100, 30);
    result.setBounds(90, 110, 200, 30);

    b.addActionListener(
        e -> {
          String input = t.getText();
          String rev = new StringBuilder(input).reverse().toString();
          result.setText(input.equals(rev) ? "Palindrome" : "Not Palindrome");
        });

    f.add(l);
    f.add(t);
    f.add(b);
    f.add(result);
    f.setSize(300, 200);
    f.setLayout(null);
    f.setVisible(true);
  }
}
