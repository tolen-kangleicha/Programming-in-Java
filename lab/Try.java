import javax.swing.*;
import java.awt.event.*;

public class Try {
	public static void main(String[] args) {
		JFrame f = new JFrame("Palindrome Checker");
		JLabel l = new JLabel("Enter a number:");
		JTextField t = new JTextField();
		JButton b = new JButton("Check");
		JLabel result = new JLabel();

		l.setBounds(50, 20, 150, 20);
		t.setBounds(150, 20, 10, 10);
		b.setBounds(150, 40, 10, 19);
		result.setBounds(50, 80, 100, 100);

		f.add(l);
		f.add(t);
		f.add(b);
		f.add(result);
		f.setBounds(100, 100, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		b.addActionListener(
				new ActionListener () {
					public void actionPerformed(ActionEvent e) {
						String input = t.getText();
						String rev = new StringBuilder(input).reverse().toString();
						result.setText(input.equals(rev)? "Palindrome" : "Not Palindrome");
	}
	});
	}
}
