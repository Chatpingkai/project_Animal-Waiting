import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class Main_user implements ActionListener {

    private JFrame fr;
    private JPanel info, pn, main, line1, line2, line3, colorL, colorR, ex1, buttonPanel, bordercalen, empty, namePanel, petnamePanel,
     typePanel, breedPanel, datePanel, sexPanel, agePanel, weightPanel, callPanel, mailPanel, addressPanel, emptyline, something, 
     infotop, infobottom, empty1, empty2, empty3, empty4;
    private JLabel imagelogoLabel, nameLabel, petnameLabel, typeLabel, breedLabel, dateLabel, 
        sexLabel, ageLabel, weightLabel, callLabel, mailLabel, addressLabel;
    private JButton edit, history, logout, reserve;
    private ImageIcon imagelogo, resizedImageIcon, roundedIcon;

    public Main_user() {

        //JFrame
        fr = new JFrame("Main");
        //JPanel
        pn = new JPanel(new BorderLayout());
        main = new JPanel(new BorderLayout());
        line1 = new JPanel(new FlowLayout());
        line2 = new JPanel(new FlowLayout());
        line3 = new JPanel(new FlowLayout());
        colorL = new JPanel(new BorderLayout());
        colorR = new JPanel(new FlowLayout());
        ex1 = new JPanel(new FlowLayout());
        buttonPanel = new JPanel(new GridLayout(4, 1));
        bordercalen = new JPanel(new FlowLayout());
        empty = new JPanel(new FlowLayout());
        namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        petnamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        typePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        breedPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        datePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        sexPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        agePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        weightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        callPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        addressPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        emptyline = new JPanel();
        info = new JPanel(new BorderLayout());
        something = new JPanel(new BorderLayout());
        infotop = new JPanel(new GridLayout(10,1));
        infobottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
        empty1 = new JPanel();
        empty2 = new JPanel();
        empty3 = new JPanel();
        empty4 = new JPanel();
        //JLabel
        nameLabel = new JLabel("ชื่อ-นามสกุล :");
        petnameLabel = new JLabel("ชื่อสัตว์เลี้ยง :");
        typeLabel = new JLabel("ชนิด :");
        breedLabel = new JLabel("สายพันธ์ุ :");
        dateLabel = new JLabel("วัน/เดือน/ปีเกิด :");
        sexLabel = new JLabel("เพศ :");
        ageLabel = new JLabel("อายุ :");
        weightLabel = new JLabel("น้ำหนัก :");
        callLabel = new JLabel("เบอร์โทรศัพท์ :");
        mailLabel = new JLabel("E-mail :");
        addressLabel = new JLabel("ที่อยู่ : ");
        //JButton
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
        colorL.setPreferredSize(new Dimension(350, 1000));
        ex1.setBackground(new Color(0xFEE3A8));
        ex1.add(imagelogoLabel);

        

        //button southwest
        edit.setBackground(Color.WHITE);
        edit.setFocusPainted(false);
        edit.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit.setPreferredSize(new Dimension(120, 40));

        history.setBackground(Color.WHITE);
        history.setFocusPainted(false);
        history.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        history.setPreferredSize(new Dimension(120, 40));

        logout.setBackground(Color.WHITE);
        logout.setFocusPainted(false);
        logout.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        logout.setPreferredSize(new Dimension(120, 40));

        emptyline.setBackground(new Color(0xFEE3A8));
        line1.add(edit);
        line2.add(history);
        line3.add(logout);
        line1.setBackground(new Color(0xFEE3A8));
        line2.setBackground(new Color(0xFEE3A8));
        line3.setBackground(new Color(0xFEE3A8));
        buttonPanel.add(line1);
        buttonPanel.add(line2);
        buttonPanel.add(line3);
        buttonPanel.add(emptyline);

        //Infomation
        something.setBackground(new Color(0xFEE3A8));
        something.add(info, BorderLayout.CENTER);
        something.add(empty1, BorderLayout.NORTH);
        something.add(empty2, BorderLayout.WEST);
        something.add(empty3, BorderLayout.EAST);
        something.add(empty4, BorderLayout.SOUTH);
        empty1.setBackground(new Color(0xFEE3A8));
        empty2.setBackground(new Color(0xFEE3A8));
        empty3.setBackground(new Color(0xFEE3A8));
        empty4.setBackground(new Color(0xFEE3A8));
        info.setBackground(new Color(0xFDFAE5));
        info.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        info.add(infotop, BorderLayout.CENTER);
        info.add(infobottom, BorderLayout.SOUTH);
        infobottom.setBackground(new Color(0xFDFAE5));
        infobottom.add(addressPanel);
        infotop.setBackground(new Color(0xFDFAE5));
        namePanel.setBackground(new Color(0xFDFAE5));
        petnamePanel.setBackground(new Color(0xFDFAE5));
        typePanel.setBackground(new Color(0xFDFAE5));
        breedPanel.setBackground(new Color(0xFDFAE5));
        datePanel.setBackground(new Color(0xFDFAE5));
        sexPanel.setBackground(new Color(0xFDFAE5));
        agePanel.setBackground(new Color(0xFDFAE5));
        weightPanel.setBackground(new Color(0xFDFAE5));
        callPanel.setBackground(new Color(0xFDFAE5));
        mailPanel.setBackground(new Color(0xFDFAE5));
        addressPanel.setBackground(new Color(0xFDFAE5));
        namePanel.add(nameLabel);
        petnamePanel.add(petnameLabel);
        typePanel.add(typeLabel);
        breedPanel.add(breedLabel);
        datePanel.add(dateLabel);
        sexPanel.add(sexLabel);
        agePanel.add(ageLabel);
        weightPanel.add(weightLabel);
        callPanel.add(callLabel);
        mailPanel.add(mailLabel);
        addressPanel.add(addressLabel);
        infotop.add(namePanel);
        infotop.add(petnamePanel);
        infotop.add(typePanel);
        infotop.add(breedPanel);
        infotop.add(datePanel);
        infotop.add(sexPanel);
        infotop.add(agePanel);
        infotop.add(weightPanel);
        infotop.add(callPanel);
        infotop.add(mailPanel);

        //Main
        bordercalen.setSize(100,1000);
        bordercalen.setBackground(new Color(0xFEE3A8));

        empty.add(bordercalen);
        empty.setBackground(new Color(0xFEEE3A8));
        empty.setBounds(200,220,1000,1000);

        //setting and addcomponent
        pn.add(something);
        pn.add(buttonPanel, BorderLayout.SOUTH);
        pn.setBackground(new Color(0xFEE3A8));

        colorL.add(ex1, BorderLayout.NORTH);
        colorL.add(pn, BorderLayout.CENTER);

        colorR.add(empty);//เดี๋ยวแก้

        main.setSize(1000, 850);
        main.add(colorL, BorderLayout.WEST);
        main.add(colorR, BorderLayout.CENTER);

        fr.add(main);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setSize(1200, 950);
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
        new Main_user();
    }

}
