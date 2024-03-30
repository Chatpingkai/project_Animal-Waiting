import back.Connec_table;
import back.hash;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login implements ActionListener {

    private JFrame fr;
    private JPanel panel_left, panel_right, panel_right_main, panel_box1, panel_box2, panel_box3, panel_box4
, panel_box5, panel_box6, panel_right_north, panel_space1, panel_space2, panel_space3, 
panel_space4, panel_space5, panel_space6, panel_space7, panel_space8, panel_space9;
    private JLabel head, donthaveacc, imagLabel, username, password, imagelogoLabel;
    private JButton button_login, register;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private ImageIcon imagepage, imagelogo, resizedImageIcon, roundedIcon;

    public Login() {

        //Main Page
        fr = new JFrame("Login");
        fr.setLayout(new BorderLayout());

        //BorderLayout.WEST
        imagepage = new ImageIcon(System.getProperty("user.dir")+"/src/test.jpg");
        imagLabel = new JLabel(imagepage);
        imagLabel.setPreferredSize(new Dimension(300, 200));

        //Head Line
        imagelogo = new ImageIcon(System.getProperty("user.dir")+"/src/test.jpg");
        resizedImageIcon = resizeImageIcon(imagelogo, 100, 100);
        roundedIcon = getRoundedImageIcon(resizedImageIcon);
        imagelogoLabel = new JLabel(roundedIcon);

        panel_left = new JPanel(new GridLayout(1, 1));
        panel_right = new JPanel(new BorderLayout());
        panel_right_main = new JPanel(new BorderLayout());
        panel_right_north = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel_box1 = new JPanel(new GridLayout(2, 1));
        panel_box2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel_box3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel_box4 = new JPanel();
        panel_box5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel_box6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel_space1 = new JPanel();
        panel_space2 = new JPanel();
        panel_space3 = new JPanel();
        panel_space4 = new JPanel();
        panel_space5 = new JPanel();
        panel_space6 = new JPanel();
        panel_space7 = new JPanel();
        panel_space8 = new JPanel();
        panel_space9 = new JPanel();

        head = new JLabel("    Animal-Waiting");
        donthaveacc = new JLabel("Don't have an account?");
        username = new JLabel("Username");
        password = new JLabel("Password");

        button_login = new JButton("Login");
        register = new JButton("Register Here");

        register.setBorderPainted(false);

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        fr.add(panel_left, BorderLayout.WEST);
        fr.add(panel_right, BorderLayout.CENTER);

        panel_left.add(imagLabel);
        
        panel_right.add(panel_right_north, BorderLayout.NORTH);
        panel_right.add(panel_right_main, BorderLayout.CENTER);
        panel_right.add(panel_box5, BorderLayout.SOUTH);

        panel_right_north.add(panel_space5);
        panel_right_north.add(panel_space1);
        panel_right_north.add(imagelogoLabel);
        panel_right_north.add(head);

        panel_right_main.add(panel_box1, BorderLayout.CENTER);
        panel_right_main.add(panel_box6, BorderLayout.SOUTH);

        panel_box1.add(panel_box2);
        panel_box1.add(panel_box3);

        panel_box2.add(panel_space2);
        panel_box2.add(username);
        panel_box2.add(panel_space6);
        panel_box2.add(panel_space7);
        panel_box2.add(usernameField);

        panel_box3.add(panel_space3);
        panel_box3.add(password);
        panel_box3.add(panel_space8);
        panel_box3.add(panel_space9);
        panel_box3.add(passwordField);

        panel_box6.add(panel_space4);
        panel_box6.add(donthaveacc);
        panel_box6.add(register);

        panel_box5.add(button_login);
        panel_box5.add(panel_box4);

        head.setFont(new Font("Josefin Sans", Font.BOLD, 30));
        username.setFont(new Font("Jost", Font.BOLD, 20));
        password.setFont(new Font("Jost", Font.BOLD, 20));
        donthaveacc.setFont(new Font("Inter", Font.PLAIN, 15));
        register.setFont(new Font("Jost", Font.PLAIN, 20));
        button_login.setFont(new Font("Jost", Font.PLAIN, 20));
        usernameField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        usernameField.setMargin(new Insets(5, 10, 5, 5));
        passwordField.setMargin(new Insets(5, 10, 5, 5));

        panel_right_north.setPreferredSize(new Dimension(80, 150));
        panel_box4.setPreferredSize(new Dimension(80, 10));
        panel_box5.setPreferredSize(new Dimension(200, 150));
        panel_box6.setPreferredSize(new Dimension(200, 150));
        usernameField.setPreferredSize(new Dimension(400, 40));
        passwordField.setPreferredSize(new Dimension(400, 40));
        panel_space1.setPreferredSize(new Dimension(30, 30));
        panel_space2.setPreferredSize(new Dimension(30, 30));
        panel_space3.setPreferredSize(new Dimension(30, 30));
        panel_space4.setPreferredSize(new Dimension(30, 30));
        panel_space5.setPreferredSize(new Dimension(700, 40));
        button_login.setPreferredSize(new Dimension(120, 40));
        panel_space6.setPreferredSize(new Dimension(530, 10));
        panel_space7.setPreferredSize(new Dimension(30, 10));
        panel_space8.setPreferredSize(new Dimension(530, 10));
        panel_space9.setPreferredSize(new Dimension(30, 10));

        donthaveacc.setForeground(new Color(0x7C7979));
        panel_left.setBackground(new Color(0xFFEEE3));
        panel_right.setBackground(new Color(0xFFEEE3));
        panel_right_main.setBackground(new Color(0xFFEEE3));
        panel_right_north.setBackground(new Color(0xFFEEE3));
        panel_box1.setBackground(new Color(0xFFEEE3));
        panel_box2.setBackground(new Color(0xFFEEE3));
        panel_box3.setBackground(new Color(0xFFEEE3));
        panel_box4.setBackground(new Color(0xFFEEE3));
        panel_box5.setBackground(new Color(0xFFEEE3));
        panel_box6.setBackground(new Color(0xFFEEE3));
        panel_space1.setBackground(new Color(0xFFEEE3));
        panel_space2.setBackground(new Color(0xFFEEE3));
        panel_space3.setBackground(new Color(0xFFEEE3));
        panel_space4.setBackground(new Color(0xFFEEE3));
        panel_space5.setBackground(new Color(0xFFEEE3));
        panel_space6.setBackground(new Color(0xFFEEE3));
        panel_space7.setBackground(new Color(0xFFEEE3));
        panel_space8.setBackground(new Color(0xFFEEE3));
        panel_space9.setBackground(new Color(0xFFEEE3));
        register.setBackground(new Color(0xFFEEE3));
        register.setForeground(new Color(0xFF0000));

        //JFrame Setting
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1000, 700);
        fr.setResizable(false);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);

        register.addActionListener(this);
        button_login.addActionListener(this);
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
        String userName, passWord, testUsername, testPassword;
        Connec_table ct = new Connec_table();
        ResultSet rs = null;
        hash h = new hash();
        if (ev.getSource() == button_login) {
            userName = usernameField.getText();
            passWord = new String(passwordField.getPassword());
            passWord = h.doHash(passWord);
            String get = String.format("SELECT * FROM User_id WHERE username = '%s' and password = '%s'", userName, passWord);
            try {
                rs = ct.getData(get);
                if (rs.next()) {
                    System.out.println("In");
                    if (userName.equals("")) {
                        new Main_MDI();
                    } else {
                        new Main_user();
                    }
                    fr.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invaild Username or Password");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
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