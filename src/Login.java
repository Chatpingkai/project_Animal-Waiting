import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class Login implements ActionListener {

    private JFrame fr;
    private JPanel main, haedPanel, usernamePanel, passwordPanel, donthaveaccPanel, loginPanel;
    private JLabel head, donthaveacc, imagLabel, usernameLabel, passwordLabel, imagelogoLabel;
    private JButton login, register;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private ImageIcon imagepage, imagelogo, resizedImageIcon, roundedIcon;

    public Login() {

        //Main Page
        fr = new JFrame("Login");
        fr.setLayout(new BorderLayout());
        main = new JPanel(new FlowLayout());
        main.setBackground(new Color(255, 238, 227));

        //BorderLayout.WEST
        imagepage = new ImageIcon(System.getProperty("user.dir")+"/src/test.jpg");
        imagLabel = new JLabel(imagepage);
        imagLabel.setPreferredSize(new Dimension(300, 200));

        //Head Line
        imagelogo = new ImageIcon(System.getProperty("user.dir")+"/src/test.jpg");
        resizedImageIcon = resizeImageIcon(imagelogo, 150, 150);
        roundedIcon = getRoundedImageIcon(resizedImageIcon);
        imagelogoLabel = new JLabel(roundedIcon);
        
        
        head = new JLabel("Animal-Waiting", SwingConstants.LEADING);
        head.setFont(new Font("Inter", Font.BOLD, 50));

        haedPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 30, 70));
        haedPanel.setBackground(new Color(255, 238, 227));
        haedPanel.add(imagelogoLabel);
        haedPanel.add(head);

        //Username Line
        usernamePanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 30, 50));
        usernamePanel.setBackground(new Color(255, 238, 227));
        
        usernameLabel = new JLabel("Username", SwingConstants.LEADING);
        usernameLabel.setFont(new Font("Inter", Font.BOLD, 30));

        usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(400, 60));
        usernameField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        usernameField.setFont(new Font("Inter", Font.PLAIN, 20));
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);

        //Password Line
        passwordPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 30, 50));
        passwordPanel.setBackground(new Color(255, 238, 227));

        passwordLabel = new JLabel("Password", SwingConstants.LEADING);
        passwordLabel.setFont(new Font("Inter", Font.BOLD, 30));

        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(400, 60));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        passwordField.setFont(new Font("Inter", Font.PLAIN, 20));
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        //Don't have account Line
        donthaveaccPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 20, 50));
        donthaveaccPanel.setBackground(new Color(255, 238, 227));

        donthaveacc = new JLabel("Don't have an account?", SwingConstants.LEADING);
        donthaveacc.setFont(new Font("Inter", Font.PLAIN, 23));
        donthaveacc.setForeground(Color.GRAY);

        register = new JButton("Register Here");
        register.setFont(new Font("Inter", Font.PLAIN, 20));
        register.setFocusPainted(false);
        register.setBackground(new Color(255, 238, 227));
        register.setBorder(BorderFactory.createLineBorder((new Color(255, 238, 227))));

        donthaveaccPanel.add(donthaveacc);
        donthaveaccPanel.add(register);
        
        //login Line
        loginPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING, 70, 15));
        loginPanel.setBackground(new Color(255, 238, 227));

        login = new JButton("Login");
        login.setBackground(Color.WHITE);
        login.setFocusPainted(false);
        login.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        login.setFont(new Font("Inter", Font.PLAIN, 30));
        login.setPreferredSize(new Dimension(200, 60));
        loginPanel.add(login);

        //Add in JFrameBorderLayout.CENTER
        main.add(haedPanel);
        main.add(usernamePanel);
        main.add(passwordPanel);
        main.add(donthaveaccPanel);
        main.add(loginPanel);

        //JFrame Setting
        fr.add(imagLabel, BorderLayout.WEST);
        fr.add(main, BorderLayout.CENTER);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1280, 980);
        fr.setVisible(true);

        register.addActionListener(this);
        login.addActionListener(this);
    }

    private ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    private ImageIcon getRoundedImageIcon(ImageIcon originalIcon) {
        int diameter = Math.min(originalIcon.getIconWidth(), originalIcon.getIconHeight());
        BufferedImage image = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();

        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, diameter, diameter);
        g2.setClip(ellipse);
        originalIcon.paintIcon(null, g2, 0, 0);

        g2.dispose();
        return new ImageIcon(image);
    }
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == login) {
            if (usernameField.getText().equals("admin")) {
                new main_admin();
            }
        }
        if (ev.getSource() == register) {
            fr.dispose();
            new Register();
        }
    }
    

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            SwingUtilities.invokeLater(() -> { 
                Login frame = new Login();
            });
    }
}