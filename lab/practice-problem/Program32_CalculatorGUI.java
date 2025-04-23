import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program32_CalculatorGUI extends JFrame implements ActionListener {
  JTextField num1Field, num2Field, resultField;
  JButton addBtn, subBtn, mulBtn, divBtn;

  public Program32_CalculatorGUI() {
    setTitle("Simple Calculator");
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(4, 2, 10, 10));

    JLabel num1Label = new JLabel("Enter First Number:");
    JLabel num2Label = new JLabel("Enter Second Number:");
    JLabel resultLabel = new JLabel("Result:");

    num1Field = new JTextField();
    num2Field = new JTextField();
    resultField = new JTextField();
    resultField.setEditable(false);

    // Buttons
    divBtn = new JButton("Divide");
    mulBtn = new JButton("Multiply");
    addBtn = new JButton("Add");
    subBtn = new JButton("Subtract");

    // Add ActionListeners
    divBtn.addActionListener(this);
    mulBtn.addActionListener(this);
    addBtn.addActionListener(this);
    subBtn.addActionListener(this);

    // Layout setup
    JPanel topPanel = new JPanel(new GridLayout(3, 2, 5, 5));
    topPanel.add(num1Label);
    topPanel.add(num1Field);
    topPanel.add(num2Label);
    topPanel.add(num2Field);
    topPanel.add(resultLabel);
    topPanel.add(resultField);

    JPanel buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.add(divBtn);
    buttonPanel.add(mulBtn);
    buttonPanel.add(addBtn);
    buttonPanel.add(subBtn);

    add(topPanel);
    add(buttonPanel);

    setLayout(new BorderLayout());
    add(topPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      double num1 = Double.parseDouble(num1Field.getText());
      double num2 = Double.parseDouble(num2Field.getText());
      double result = 0;

      if (e.getSource() == addBtn) result = num1 + num2;
      else if (e.getSource() == subBtn) result = num1 - num2;
      else if (e.getSource() == mulBtn) result = num1 * num2;
      else if (e.getSource() == divBtn) {
        if (num2 == 0) {
          resultField.setText("Cannot divide by zero");
          return;
        }
        result = num1 / num2;
      }

      resultField.setText(String.valueOf(result));
    } catch (NumberFormatException ex) {
      resultField.setText("Invalid input");
    }
  }

  public static void main(String[] args) {
    new Program32_CalculatorGUI();
  }
}
