import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatApp extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JTextArea chatArea;

    public ChatApp() {
        setTitle("Chat Application");
        setSize(450, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Chat area
        chatArea = new JTextArea();
        chatArea.setBounds(30, 30, 386, 350);
        chatArea.setEditable(false);
        contentPane.add(new JScrollPane(chatArea));

        // Input text field
        textField = new JTextField();
        textField.setBounds(30, 414, 386, 40);
        contentPane.add(textField);
        textField.setColumns(10);

        // Send button
        JButton sendButton = new JButton("Send");
        sendButton.setBounds(170, 470, 100, 40);
        contentPane.add(sendButton);

        // Action listener for the send button
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = textField.getText().trim();
                if (!message.isEmpty()) {
                    chatArea.append("You: " + message + "\n");
                    textField.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ChatApp().setVisible(true);
            }
        });
    }
}
