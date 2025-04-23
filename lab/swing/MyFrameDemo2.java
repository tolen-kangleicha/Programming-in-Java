import javax.swing.*;

public class MyFrameDemo2 {
  JFrame f;

  MyFrameDemo2() {
    f = new JFrame("My Button Frame");

    JButton b = new JButton("Click Me");
    b.setBounds(130, 100, 100, 40);

    b.addActionListener(e -> JOptionPane.showMessageDialog(f, "Button clicked!"));

    f.add(b);
    f.setSize(400, 500);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new MyFrameDemo2();
  }
}
