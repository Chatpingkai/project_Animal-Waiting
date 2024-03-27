package backend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterGUI extends JFrame implements ActionListener {
    private JLabel titleLabel, usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;
    private Connec db;

    public RegisterGUI() {
        setTitle("Register");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        titleLabel = new JLabel("Register Form");
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        panel.add(titleLabel);
        panel.add(new JLabel());
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(registerButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        db = new Connec();
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String sql = String.format("INSERT INTO test (name, password) VALUES('%s', '%s')", username,password);
        db.getInsert(sql);
        db.discon();
        // Add registration logic here
        System.out.println("Registering new user:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        new RegisterGUI();
    }
}
