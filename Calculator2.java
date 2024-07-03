import java.awt.*;
import java.awt.event.*;

public class Calculator2 extends Frame implements ActionListener {
    // Create a frame
    Frame frame;
    
    // Create text field
    TextField textField;
    
    // Store operator and operands
    String operator;
    double num1, num2, result;

    // Create constructor
    Calculator2() 
    {
        frame = new Frame("Calculator");
        textField = new TextField();
        
        // Set layout
        frame.setLayout(new BorderLayout());
        
        // Add text field at the top
        frame.add(textField, BorderLayout.NORTH);
        
        // Panel to hold buttons
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));
        
        // Array of button labels
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
     };
        
        // Add buttons to the panel
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            panel.add(button);
        }
        
        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);
        
        // Frame settings
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Handle button click events
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) == 'C') {
            // Clear the text field
            textField.setText("");
        } else if (command.charAt(0) == '=') {
            // Calculate result
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }
            textField.setText(String.valueOf(result));
        } else if (command.charAt(0) == '+' || command.charAt(0) == '-' || 
                   command.charAt(0) == '*' || command.charAt(0) == '/') {
            // Store operator and first operand
            operator = command;
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        } else {
            // Append the pressed button's text to the text field
            textField.setText(textField.getText() + command);
        }
    }

    public static void main(String[] args) {
        new Calculator2();
    }
}
