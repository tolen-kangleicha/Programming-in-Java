import java.awt.event.*;
import javax.swing.*;

public class Program25_SwapGUI {
  public static void main(String[] args) {
    JFrame f = new JFrame("Swap Numbers");
    JLabel l1 = new JLabel("Num 1:");
    JLabel l2 = new JLabel("Num 2:");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JButton b = new JButton("Swap");

    l1.setBounds(20, 20, 60, 30);
    l2.setBounds(20, 60, 60, 30);
    t1.setBounds(90, 20, 100, 30);
    t2.setBounds(90, 60, 100, 30);
    b.setBounds(90, 110, 80, 30);

    b.addActionListener(
        e -> {
          String temp = t1.getText();
          t1.setText(t2.getText());
          t2.setText(temp);
        });

    f.add(l1);
    f.add(t1);
    f.add(l2);
    f.add(t2);
    f.add(b);
    f.setSize(250, 200);
    f.setLayout(null);
    f.setVisible(true);
  }
}
