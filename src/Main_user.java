import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class Main_user implements ActionListener {

    private JFrame fr;
    private JPanel pn, main, line1, line2, line3, colorL, colorR, ex1, buttonPanel, bordercalen, empty;
    private JLabel info, imagelogoLabel;
    private JButton edit, history, logout, reserve;
    private ImageIcon imagelogo, resizedImageIcon, roundedIcon;

    public Main_user() {

        //ประกาศทั้งหมด
        fr = new JFrame("Main");
        pn = new JPanel(new FlowLayout());
        main = new JPanel(new BorderLayout());
        line1 = new JPanel(new FlowLayout());
        line2 = new JPanel(new FlowLayout());
        line3 = new JPanel(new FlowLayout());
        colorL = new JPanel(new BorderLayout());
        colorR = new JPanel(new FlowLayout());
        ex1 = new JPanel(new FlowLayout());
        buttonPanel = new JPanel(new GridLayout(3, 1));
        bordercalen = new JPanel(new FlowLayout());
        empty = new JPanel(new FlowLayout());
        info = new JLabel();
        edit = new JButton("แก้ไขข้อมูล");
        history = new JButton("ประวัติการรักษา");
        logout = new JButton("Logout");
        reserve = new JButton("จองคิว");

        //panel northwest
        imagelogo = new ImageIcon(System.getProperty("user.dir") + "/src/test.jpg");
        resizedImageIcon = resizeImageIcon(imagelogo, 150, 150);
        roundedIcon = getRoundedImageIcon(resizedImageIcon);
        imagelogoLabel = new JLabel(roundedIcon);
        colorL.setBackground(new Color(0xFFE3A8));
        colorR.setBackground(new Color(255, 238, 227));
        colorL.setPreferredSize(new Dimension(250, 1000));
        ex1.setBackground(new Color(0xFEE3A8));
        ex1.add(imagelogoLabel);

        info.setBackground(new Color(0xFDFAE5));
        info.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        //button southwest
        edit.setBackground(Color.WHITE);
        edit.setFocusPainted(false);
        edit.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit.setSize(new Dimension());
        edit.setPreferredSize(new Dimension(120, 40));

        history.setBackground(Color.WHITE);
        history.setFocusPainted(false);
        history.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        logout.setBackground(Color.WHITE);
        logout.setFocusPainted(false);
        logout.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        line1.add(edit);
        line2.add(history);
        line3.add(logout);
        line1.setBackground(new Color(0xFEE3A8));
        line2.setBackground(new Color(0xFEE3A8));
        line3.setBackground(new Color(0xFEE3A8));
        buttonPanel.add(line1);
        buttonPanel.add(line2);
        buttonPanel.add(line3);






        //Main
        bordercalen.setSize(100,1000);
        bordercalen.setBackground(new Color(0xFEE3A8));


        empty.add(bordercalen);
        empty.setBackground(new Color(0xFEEE3A8));
        empty.setBounds(200,220,1000,1000);

        //setting and addcomponent

        pn.add(buttonPanel);
        pn.setBackground(new Color(0xFEE3A8));

        colorL.add(ex1, BorderLayout.NORTH);
        colorL.add(pn, BorderLayout.CENTER);

        colorR.add(empty);

        main.setSize(1000, 850);
        main.add(colorL, BorderLayout.WEST);
        main.add(colorR, BorderLayout.CENTER);

        fr.add(main);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setSize(1000, 850);
        fr.setVisible(true);

        //AddListener
        edit.addActionListener(this);
        history.addActionListener(this);
        logout.addActionListener(this);
        reserve.addActionListener(this);

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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(edit)) {
            fr.dispose();
            new edit_register();
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> new Main_user());
    }

}
