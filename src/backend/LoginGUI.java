package backend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {
    private JLabel titleLabel, usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        titleLabel = new JLabel("Login Form");
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        panel.add(titleLabel);
        panel.add(new JLabel());
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        Connec db = new Connec();
        String sql = String.format("select * from mydb where name = '%s' and password = '%s'", username, password);
        db.getConnec(sql);
        if (db.getConnec(sql) != null){
            System.out.println("fdsfaf");
            db.discon();
        }
        // Add login logic here
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        new LoginGUI();
    }

}
