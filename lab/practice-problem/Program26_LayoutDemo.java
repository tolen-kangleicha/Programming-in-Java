import java.awt.*;
import javax.swing.*;

public class Program26_LayoutDemo {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Layout Example");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // GridLayout 4x3
    JPanel gridPanel = new JPanel(new GridLayout(4, 3));
    for (int i = 1; i <= 12; i++) {
      gridPanel.add(new JButton("Btn " + i));
    }

    // BorderLayout
    JPanel borderPanel = new JPanel(new BorderLayout());
    borderPanel.add(new JButton("North"), BorderLayout.NORTH);
    borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
    borderPanel.add(new JButton("East"), BorderLayout.EAST);
    borderPanel.add(new JButton("West"), BorderLayout.WEST);
    borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

    frame.setLayout(new GridLayout(2, 1));
    frame.add(gridPanel);
    frame.add(borderPanel);

    frame.setVisible(true);
  }
}
