package Font;


import back.Connec_table;
import back.Customer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main_user implements ActionListener {

    private JFrame fr;
    private JPanel info, pn, main, line1, line2, line3, colorL, colorR, ex1, buttonPanel, 
bordercalen, empty, namePanel, petnamePanel, line4,pl1, pl2, pl3, space, space1, space2, 
space3, space4, space5, help1, help2, help3, typePanel, breedPanel, datePanel, sexPanel, 
agePanel, weightPanel, callPanel, mailPanel, addressPanel, emptyline, something, reservePanel, 
cancelPanel, allreservePanel,border1, border2,border3,border4, help10, infotop, infobottom, 
empty1, empty2, empty3, empty4, empty5, empty6, border, edit1, edit2, edit3, edit4, edit5, 
edit16, edit17;
    private JLabel imagelogoLabel, nameLabel, petnameLabel, typeLabel, breedLabel, dateLabel,
sexLabel, ageLabel, weightLabel, callLabel, mailLabel, addressLabel, 
monthLabel, address10;
    private JButton edit, history, logout, reserve, cancel;
    private ImageIcon imagelogo, resizedImageIcon, roundedIcon;
    private JTextField[] boxes = new JTextField[42];
    private JLabel[] dayLabels = new JLabel[7];
    private JTextArea addressarea;
    private Customer customer;
    private static int lookid;
    private String[] name_day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    private String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private Calendar calendar;
    private int currentMonth;

    public Main_user(Customer customer) {
        
        //send data
        this.customer = customer;
        this.lookid = customer.getId();
        //====================
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
        ex1 = new JPanel(new BorderLayout());
        edit16 = new JPanel();
        edit17 = new JPanel(new BorderLayout());
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
        allreservePanel = new JPanel(new GridLayout(3,1));
        infobottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
        empty1 = new JPanel();
        empty2 = new JPanel();
        empty3 = new JPanel();
        empty4 = new JPanel();
        empty5 = new JPanel();
        empty6 = new JPanel();
        border = new JPanel(new BorderLayout());
        border1 = new JPanel();
        border2 = new JPanel();
        border3 = new JPanel();
        border4 = new JPanel();
        edit1 = new JPanel(new BorderLayout());
        edit2 = new JPanel();
        edit3 = new JPanel();
        edit4 = new JPanel();
        edit5 = new JPanel();
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
        addressarea.setBackground(new Color(0xFDFAE5));
        addressarea.setFont(new Font("Tahoma", Font.PLAIN, 13));
        address10 = new JLabel("");
        
        //set data for human
        try {
            Connec_table ct = new Connec_table();
            ResultSet rs;
            String getData = String.format("SELECT * FROM User_Profile WHERE ID = '%s'",this.customer.getId());
            rs = ct.getData(getData);
            if (rs.next()) {
                nameLabel.setText(nameLabel.getText().substring(0, nameLabel.getText().length() - 1) + " : " + rs.getString("Name") + "  " + rs.getString("Last"));
                callLabel.setText(callLabel.getText().substring(0, callLabel.getText().length() - 1) + " : " + rs.getString("Phone"));
                mailLabel.setText(mailLabel.getText().substring(0, mailLabel.getText().length() - 1) + " : " + rs.getString("Email"));
                String[] listAddress = rs.getString("Contact").split(",");
                String address = String.format("บ้านเลขที่ : '%s'  หมู่ : '%s' ซอย : '%s' ถนน : '%s'",
                        listAddress[0], listAddress[2], listAddress[1], listAddress[3]
                );
                String address2 = String.format("อำเภอ : '%s' ตำบล : '%s'",
                        listAddress[5], listAddress[4]
                );
                String address3 = String.format("จังหวัด : '%s' รหัสไปรษณีย์ : '%s'",
                        listAddress[6], listAddress[7]
                );
                addressLabel.setText(addressLabel.getText().substring(0, addressLabel.getText().length() - 2) + " : " + address.replaceAll("'", ""));
                addressarea.setText(address2.replaceAll("'", ""));
                address10.setText(address3.replaceAll("'", ""));
            ct.Discon();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //====================================================================

        //set data for pet
        try {
            Connec_table ct = new Connec_table();
            ResultSet rs;
            String getData = String.format("SELECT * FROM Pet WHERE ID = '%s'",this.customer.getId());
            rs = ct.getData(getData);
            if (rs.next()) {
                petnameLabel.setText(petnameLabel.getText().substring(0, petnameLabel.getText().length() - 1) + " : " + rs.getString("Name"));
                typeLabel.setText(typeLabel.getText().substring(0, typeLabel.getText().length() - 1) + " : " + rs.getString("Type"));
                breedLabel.setText(breedLabel.getText().substring(0, breedLabel.getText().length() - 1) + " : " + rs.getString("Spicies"));
                dateLabel.setText(dateLabel.getText().substring(0, dateLabel.getText().length() - 1) + " : " + rs.getString("Birth"));
                sexLabel.setText(sexLabel.getText().substring(0, sexLabel.getText().length() - 1) + " : " + rs.getString("Sex"));
                ageLabel.setText(ageLabel.getText().substring(0, ageLabel.getText().length() - 1) + " : " + rs.getString("Age"));
                weightLabel.setText(weightLabel.getText().substring(0, weightLabel.getText().length() - 1) + " : " + rs.getString("Weight"));
            ct.Discon();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //====================================================================

        // panel northwest
        imagelogo = new ImageIcon(System.getProperty("user.dir")+"/src/Font/logo1.png");
        resizedImageIcon = resizeImageIcon(imagelogo, 100, 100);
        imagelogoLabel = new JLabel(resizedImageIcon);

        colorL.setBackground(new Color(0xFFE3A8));
        colorR.setBackground(new Color(255, 238, 227));
        colorL.setPreferredSize(new Dimension(350, 1000));
        ex1.setBackground(new Color(0xFEE3A8));
        ex1.add(edit16, BorderLayout.NORTH);
        ex1.add(imagelogoLabel, BorderLayout.CENTER);

        ex1.setPreferredSize(new Dimension(400, 150));
        edit16.setPreferredSize(new Dimension(1000, 10));
        edit16.setBackground(new Color(0xFEE3A8));

        edit.setFocusPainted(false);
        edit.setPreferredSize(new Dimension(150, 40));

        history.setFocusPainted(false);
        history.setPreferredSize(new Dimension(150, 40));

        logout.setFocusPainted(false);
        logout.setPreferredSize(new Dimension(150, 40));

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
        info.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        infobottom.setBackground(new Color(0xFDFAE5));
        infobottom.add(addressPanel);
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
        infotop = new JPanel(new GridLayout(10, 1));
        info.add(infotop, BorderLayout.CENTER);
        info.add(edit17, BorderLayout.SOUTH);
        infotop.setBackground(new Color(0xFDFAE5));
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
        addressPanel.add(address10);
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
        edit17.add(addressPanel);

        address10.setFont(new Font("tahoma", Font.PLAIN, 13));

        edit17.setPreferredSize(new Dimension(30, 90));

        // Main 
        edit1.setBackground(new Color(255, 238, 227));
        edit2.setBackground(new Color(255, 238, 227));
        edit3.setBackground(new Color(255, 238, 227));
        edit4.setBackground(new Color(255, 238, 227));
        edit5.setBackground(new Color(255, 238, 227));
        empty6.setBackground(new Color(255, 238, 227));
        border.setBackground(new Color(255,238, 227));
        line4.setBackground(new Color(255, 238, 227));
        empty5.setBackground(new Color(255, 238, 227));
        reserve.setFocusPainted(false);
        reserve.setPreferredSize(new Dimension(120, 40));
        edit16.setPreferredSize(new Dimension(30, 5));

        cancel.setForeground(Color.RED);
        cancel.setFocusPainted(false);
        cancel.setPreferredSize(new Dimension(120, 40));

        reservePanel.setBackground(new Color(255, 238, 227));
        reservePanel.add(reserve);

        cancelPanel.setBackground(new Color(255, 238, 227));
        cancelPanel.add(cancel);

        allreservePanel.setBackground(new Color(255,238, 227));
        allreservePanel.add(empty6);
        allreservePanel.add(reservePanel);
        allreservePanel.add(cancelPanel);

        line4.add(allreservePanel, BorderLayout.EAST);
        line4.add(empty5, BorderLayout.CENTER);

        bordercalen.setBackground(new Color(255,238, 227));

        empty.add(border, BorderLayout.CENTER);
        empty.add(line4, BorderLayout.SOUTH);
        empty.setBackground(new Color(0xFEEE3A8));

        edit1.add(empty, BorderLayout.CENTER);
        edit1.add(edit2, BorderLayout.NORTH);
        edit1.add(edit3, BorderLayout.EAST);
        edit1.add(edit4, BorderLayout.SOUTH);
        edit1.add(edit5, BorderLayout.WEST);

        edit2.setPreferredSize(new Dimension(200,150));
        edit3.setPreferredSize(new Dimension(50,200));
        edit4.setPreferredSize(new Dimension(200,200));
        edit5.setPreferredSize(new Dimension(50,150));

        border1.setBackground(new Color(0xFEE3A8));
        border2.setBackground(new Color(0xFEE3A8));
        border3.setBackground(new Color(0xFEE3A8));
        border4.setBackground(new Color(0xFEE3A8));
        edit17.setBackground(new Color(0xFEE3A8));

        border1.setPreferredSize(new Dimension(20,20));
        border2.setPreferredSize(new Dimension(20,20));
        border3.setPreferredSize(new Dimension(20,20));
        border4.setPreferredSize(new Dimension(20,20));

        pl1 = new JPanel(new BorderLayout());
        pl2 = new JPanel(new GridLayout(1, 7));
        pl3 = new JPanel(new GridLayout(6, 7));
        space = new JPanel();
        space1 = new JPanel();
        space2 = new JPanel();
        space3 = new JPanel();
        space4 = new JPanel();
        space5 = new JPanel(new BorderLayout());
        help1 = new JPanel(new FlowLayout());
        help2 = new JPanel(new BorderLayout());
        help3 = new JPanel();
        help10 = new JPanel();

        space.setBackground(Color.white);
        space1.setBackground(Color.white);
        space2.setBackground(Color.white);
        space3.setBackground(Color.white);
        space4.setBackground(Color.white);
        space5.setBackground(Color.white);
        pl2.setBackground(Color.white);

        border.add(bordercalen);
        border.setPreferredSize(new Dimension(700,700));
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

        space5.add(help1, BorderLayout.SOUTH);
        space5.add(space3, BorderLayout.WEST);
        space5.add(space4, BorderLayout.EAST);
        space5.add(help2, BorderLayout.CENTER);
        space5.add(help3, BorderLayout.NORTH);

        help1.add(pl2);

        help2.add(help10, BorderLayout.SOUTH);

        updateCalendar();

        space5.setPreferredSize(new Dimension(200, 90));
        pl2.setPreferredSize(new Dimension(670, 20));
        help3.setPreferredSize(new Dimension(200, 5));
        help10.setPreferredSize(new Dimension(200, 2));

        help1.setBackground(Color.WHITE);
        help2.setBackground(Color.WHITE);
        help3.setBackground(Color.WHITE);
        help10.setBackground(Color.BLACK);

        calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Bangkok"));
        currentMonth = calendar.get(Calendar.MONTH);
        monthLabel = new JLabel(month[currentMonth]);
        help2.add(monthLabel, BorderLayout.CENTER);

        monthLabel.setFont(new Font("Angsana New", Font.BOLD, 50));

     // setting and addcomponent
        // Left
        pn.add(something, BorderLayout.CENTER);
        pn.add(buttonPanel, BorderLayout.SOUTH);
        pn.setBackground(new Color(0xFEE3A8));

        colorL.add(ex1, BorderLayout.NORTH); 
        colorL.add(pn, BorderLayout.CENTER);
        //right
        colorR.add(edit1, BorderLayout.CENTER);

        main.add(colorL, BorderLayout.WEST);
        main.add(colorR, BorderLayout.CENTER);

        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        petnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        typeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        breedLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        sexLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        weightLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        callLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        mailLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));

        edit.setFont(new Font("Tahoma", Font.PLAIN, 15));
        history.setFont(new Font("Tahoma", Font.PLAIN, 15));
        logout.setFont(new Font("Tahoma", Font.PLAIN, 15));
        reserve.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cancel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        fr.add(main);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setSize(1200, 950);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);

        // AddListener
        edit.addActionListener(this);
        history.addActionListener(this);
        logout.addActionListener(this);
        reserve.addActionListener(this);
        cancel.addActionListener(this);

    }
    
    private ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
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
                }else {
                    textField.setBackground(Color.white);
                }
            }
    
            boxes[i] = textField;
            pl3.add(boxes[i]);
            cal.add(Calendar.DAY_OF_MONTH, 1);
            
        }

        for (int i = 0; i < 7; i++) {
            dayLabels[i] = new JLabel(name_day[i]);
            pl2.add(dayLabels[i]);
        }
    
        fr.validate();
        fr.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(edit)) {
            fr.dispose();
            System.out.println(customer.getId());
            new edit_register(customer);
        }else if (e.getSource().equals(reserve)) {
            new Reservation(customer);
        }else if (e.getSource().equals(history)) {
            new User_history_J(customer.getId());

        }else if (e.getSource().equals(logout)) {
            fr.dispose();
            new Login();
        }else if (e.getSource().equals(cancel)) {
            new CancelQ(customer);
        }
    }
}
