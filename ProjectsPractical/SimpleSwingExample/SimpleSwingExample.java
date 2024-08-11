package ProjectsPractical.SimpleSwingExample;

import javax.swing.*; // Importing Swing components
import java.awt.*; // Importing AWT components for layout
import java.awt.event.*;

public class SimpleSwingExample {
    public static void main(String[] args) {
        // Create a new JFrame (the main window)
        JFrame frame = new JFrame("Simple Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        frame.setSize(400, 200); // Set the size of the window

        // Create a new JPanel to hold the components
        JPanel panel = new JPanel();
        frame.add(panel); // Add the panel to the frame
        placeComponents(panel); // Method to place components on the panel

        // Set the frame visibility to true to display the window
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // Set the layout of the panel
        panel.setLayout(null);

        // Create a JLabel for the text
        JLabel userLabel = new JLabel("Enter Text:");
        userLabel.setBounds(10, 20, 80, 25); // Set the position and size of the label
        panel.add(userLabel); // Add the label to the panel

        // Create a text field for user input
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25); // Set the position and size of the text field
        panel.add(userText); // Add the text field to the panel

        // Create a button
        JButton loginButton = new JButton("Show Text");
        loginButton.setBounds(10, 80, 150, 25); // Set the position and size of the button
        panel.add(loginButton); // Add the button to the panel

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 120, 300, 25); // Set the position and size of the result label
        panel.add(resultLabel); // Add the result label to the panel

        // Add an action listener to the button to perform an action when clicked
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the text field and set it as the text of the result label
                String text = userText.getText();
                resultLabel.setText("Result: " + text);
            }
        });
    }
}
