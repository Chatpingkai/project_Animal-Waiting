
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main_user implements ActionListener {

    private JFrame fr;
    private JPanel info, pn, main, line1, line2, line3, colorL, colorR, ex1, buttonPanel, bordercalen, empty, namePanel,
            petnamePanel, line4,
            typePanel, breedPanel, datePanel, sexPanel, agePanel, weightPanel, callPanel, mailPanel, addressPanel,
            emptyline, something, reservePanel, cancelPanel, allreservePanel,border1, border2,border3,border4,
            infotop, infobottom, empty1, empty2, empty3, empty4, empty5;
    private JLabel imagelogoLabel, nameLabel, petnameLabel, typeLabel, breedLabel, dateLabel,
            sexLabel, ageLabel, weightLabel, callLabel, mailLabel, addressLabel;
    private JButton edit, history, logout, reserve, cancel;
    private ImageIcon imagelogo, resizedImageIcon, roundedIcon;
    private JPanel pl1, pl2, pl3, space, space1, space2, space3, space4, space5;
    private JTextField[] boxes = new JTextField[42];
    private JLabel[] dayLabels = new JLabel[7];
    private JTextArea addressarea;

    public Main_user() {

        // JFrame
        fr = new JFrame("Main");
        // JPanel
        pn = new JPanel(new BorderLayout());
        main = new JPanel(new BorderLayout());
        line1 = new JPanel(new FlowLayout());
        line2 = new JPanel(new FlowLayout());
        line3 = new JPanel(new FlowLayout());
        line4 = new JPanel(new BorderLayout());
        colorL = new JPanel(new BorderLayout());
        colorR = new JPanel(new BorderLayout());
        ex1 = new JPanel(new FlowLayout());
        buttonPanel = new JPanel(new GridLayout(4, 1));
        bordercalen = new JPanel(new BorderLayout());
        empty = new JPanel(new BorderLayout());
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
        reservePanel = new JPanel();
        cancelPanel = new JPanel();
        allreservePanel = new JPanel(new GridLayout(2,1));
        infotop = new JPanel(new GridLayout(11, 1));
        infobottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
        empty1 = new JPanel();
        empty2 = new JPanel();
        empty3 = new JPanel();
        empty4 = new JPanel();
        empty5 = new JPanel();
        border1 = new JPanel();
        border2 = new JPanel();
        border3 = new JPanel();
        border4 = new JPanel();
        // JLabel
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
        // JButton
        edit = new JButton("แก้ไขข้อมูล");
        history = new JButton("ประวัติการรักษา");
        logout = new JButton("Logout");
        reserve = new JButton("จองคิว");
        cancel = new JButton("ยกเลิกการจอง");
        //JTextArea
        addressarea = new JTextArea();
        addressarea.setEditable(false);

        // panel northwest
        imagelogo = new ImageIcon(System.getProperty("user.dir") + "/src/test.jpg");
        resizedImageIcon = resizeImageIcon(imagelogo, 150, 150);
        roundedIcon = getRoundedImageIcon(resizedImageIcon);
        imagelogoLabel = new JLabel(roundedIcon);

        colorL.setBackground(new Color(0xFFE3A8));
        colorR.setBackground(new Color(255, 238, 227));
        colorL.setPreferredSize(new Dimension(350, 1000));
        ex1.setBackground(new Color(0xFEE3A8));
        ex1.add(imagelogoLabel);

        // button southwest
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

        // Infomation
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
        addressPanel.add(addressarea);
        infotop.add(namePanel);
        infotop.add(petnamePanel);
        infotop.add(typePanel);
        infotop.add(breedPanel);
        infotop.add(datePanel);
        infotop.add(sexPanel);
        infotop.add(agePanel);
        infotop.add(weightPanel);
        infotop.add(addressPanel);
        infotop.add(callPanel);
        infotop.add(mailPanel);

        // Main
        line4.setBackground(new Color(255, 238, 227));
        empty5.setBackground(new Color(255, 238, 227));
        reserve.setBackground(Color.WHITE);
        reserve.setFocusPainted(false);
        reserve.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        reserve.setPreferredSize(new Dimension(120, 40));

        cancel.setBackground(Color.WHITE);
        cancel.setFocusPainted(false);
        cancel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        cancel.setPreferredSize(new Dimension(120, 40));

        reservePanel.setBackground(new Color(255, 238, 227));
        reservePanel.add(reserve);

        cancelPanel.setBackground(new Color(255, 238, 227));
        cancelPanel.add(cancel);

        allreservePanel.setBackground(new Color(255,238, 227));
        allreservePanel.add(reservePanel);
        allreservePanel.add(cancelPanel);

        line4.add(allreservePanel, BorderLayout.EAST);
        line4.add(empty5, BorderLayout.CENTER);

        bordercalen.setBackground(new Color(255,238, 227));

        empty.add(bordercalen, BorderLayout.CENTER);
        empty.add(line4, BorderLayout.SOUTH);
        empty.setBackground(new Color(0xFEEE3A8));

        border1.setBackground(new Color(255,238, 227));
        border2.setBackground(new Color(255,238, 227));
        border3.setBackground(new Color(255,238, 227));
        border4.setBackground(new Color(255,238, 227));

        border1.setPreferredSize(new Dimension(200,200));
        border2.setPreferredSize(new Dimension(70,200));
        border3.setPreferredSize(new Dimension(200,200));
        border4.setPreferredSize(new Dimension(70,200));

        pl1 = new JPanel(new BorderLayout());
        pl2 = new JPanel(new GridLayout(1, 7));
        pl3 = new JPanel(new GridLayout(6, 7));
        space = new JPanel();
        space1 = new JPanel();
        space2 = new JPanel();
        space3 = new JPanel();
        space4 = new JPanel();
        space5 = new JPanel(new BorderLayout());

        space.setBackground(Color.white);
        space1.setBackground(Color.white);
        space2.setBackground(Color.white);
        space3.setBackground(Color.white);
        space4.setBackground(Color.white);
        space5.setBackground(Color.white);
        pl2.setBackground(Color.white);

        bordercalen.add(pl1, BorderLayout.CENTER);
        bordercalen.add(border1, BorderLayout.NORTH);
        bordercalen.add(border2, BorderLayout.EAST);
        bordercalen.add(border3, BorderLayout.SOUTH);
        bordercalen.add(border4, BorderLayout.WEST);

        pl1.add(space5, BorderLayout.NORTH);
        pl1.add(pl3, BorderLayout.CENTER);
        pl1.add(space, BorderLayout.WEST);
        pl1.add(space1, BorderLayout.EAST);
        pl1.add(space2, BorderLayout.SOUTH);

        space5.add(pl2, BorderLayout.CENTER);
        space5.add(space3, BorderLayout.WEST);
        space5.add(space4, BorderLayout.EAST);

        updateCalendar();

     // setting and addcomponent
        // Left
        pn.add(something, BorderLayout.CENTER);
        pn.add(buttonPanel, BorderLayout.SOUTH);
        pn.setBackground(new Color(0xFEE3A8));

        colorL.add(ex1, BorderLayout.NORTH); 
        colorL.add(pn, BorderLayout.CENTER);
        //right
        colorR.add(empty, BorderLayout.CENTER);

        main.setSize(1000, 850);
        main.add(colorL, BorderLayout.WEST);
        main.add(colorR, BorderLayout.CENTER);

        fr.add(main);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setSize(1200, 950);
        fr.setVisible(true);

        // AddListener
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

    private void setCurrentMonth() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.DAY_OF_MONTH, 1); // Set to first day of the month
        int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // Get the day of the week of the first day

        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        // Set label for each box with corresponding date
        int dayOfMonth = 1;
        for (int i = firstDayOfWeek - 1; i < boxes.length; i++) {
            if (cal.get(Calendar.MONTH) == month) {
                boxes[i].setText(String.valueOf(dayOfMonth));
                dayOfMonth++;
            }
            else {
                boxes[i].setText("");
            }
            cal.add(Calendar.DAY_OF_MONTH, 1); // Move to the next day
        }
    }

    private void updateCalendar() {
        pl3.removeAll();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Bangkok"));
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int startingDay = cal.get(Calendar.DAY_OF_WEEK);
        cal.add(Calendar.DAY_OF_MONTH, -startingDay + 1);
    
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
    
        for (int i = 0; i < 42; i++) {
            int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
            JTextField textField = new JTextField(String.valueOf(dayOfMonth));
            textField.setEditable(false);
            
            if (cal.get(Calendar.MONTH) != currentMonth) {
                textField.setBackground(Color.LIGHT_GRAY);
            } else {
                if (dayOfMonth == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) {
                    textField.setBackground(Color.RED);
                }
            }
    
            boxes[i] = textField;
            pl3.add(boxes[i]);
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
    
        String[] dayNames = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for (int i = 0; i < 7; i++) {
            dayLabels[i] = new JLabel(dayNames[i]);
            pl2.add(dayLabels[i]);
        }
    
        fr.validate();
        fr.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(edit)) {
            fr.dispose();
            new edit_register();
        } else if (e.getSource().equals(history)) {

        } else if (e.getSource().equals(logout)) {

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
