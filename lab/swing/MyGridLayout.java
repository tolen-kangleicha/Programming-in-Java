import java.awt.*;
import javax.swing.*;

public class MyGridLayout {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Grid Layout");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(3, 3));
    frame.setSize(300, 300);

    for (int i = 1; i <= 9; i++) {
      frame.add(new JButton(String.valueOf(i)));
    }

    frame.setVisible(true);
  }
}
