import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program28_PalindromeChecker extends JFrame implements ActionListener {
  JTextField field = new JTextField(10);
  JButton button = new JButton("Check");
  JLabel result = new JLabel("Result will be shown here");

  public Program28_PalindromeChecker() {
    super("Palindrome Checker");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, 10px padding

    add(new JLabel("Enter Text or Number:"));
    add(field);
    add(button);
    add(new JLabel("")); // Empty cell for spacing
    add(new JLabel("Result:"));
    add(result);

    button.addActionListener(this);

    setSize(400, 150);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String input = field.getText().trim();

    if (input.isEmpty()) {
      result.setText("Please enter something.");
      return;
    }

    String reversed = new StringBuilder(input).reverse().toString();
    if (input.equals(reversed)) {
      result.setText("Palindrome");
    } else {
      result.setText("Not Palindrome");
    }
  }

  public static void main(String[] args) {
    new Program28_PalindromeChecker();
  }
}
