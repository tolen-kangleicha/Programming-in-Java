import java.awt.event.*;
import javax.swing.*;

public class Program27_LargestNumberFinder extends JFrame implements ActionListener {
  JTextField[] fields = new JTextField[5];
  JButton button = new JButton("Find Largest");
  JLabel result = new JLabel();

  public Program27_LargestNumberFinder() {
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    for (int i = 0; i < 5; i++) {
      fields[i] = new JTextField(5);
      add(fields[i]);
    }
    button.addActionListener(this);
    add(button);
    add(result);
    setSize(300, 200);
    setVisible(true);
    setBounds(100, 100, 400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
    int max = Integer.MIN_VALUE;
    for (JTextField tf : fields) {
      int num = Integer.parseInt(tf.getText());
      if (num > max) max = num;
    }
    result.setText("Largest: " + max);
  }

  public static void main(String[] args) {
    new Program27_LargestNumberFinder();
  }
}
