package Font;


import  back.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.*;

public class main_admin extends JInternalFrame implements MouseInputListener, ActionListener{
    private JPanel panel_left, panel_right, panel_left1, panel_calendar, 
panel_left2, panel_left3, panel_left4, panel_left5, panel_left6, panel_space1, 
panel_right1, panel_right2, panel_right3, panel_right_button, panel_space, 
panel_space2, pl1, pl2, pl3, space, space1, space2, space3, space4, space5;
    private JButton button_medicine, button_history, button_logout;
    private JTable table;
    private JLabel photo, monthLabel;
    private ImageIcon profile, resizedImageIcon, roundedIcon;
    private Main_MDI main;
    private Connec_table tabledb;
    private String today,code;
    private Map<String, String> queue;
    private Map<String, String[]> datahistory;
    private String[] work = {"10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00"};
    private int introw;
    private Ranmdom wordcode = new Ranmdom();
    private ResultSet rs;
    private details_admin_popup details;
    private grooming_popup grooming;
    private Customer customer;
    private CureReipt cure_r;
    private GroomReipt groom_r;
    private JTextField[] boxes = new JTextField[42];
    private JLabel[] dayLabels = new JLabel[7];
    private String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private Calendar calendar;
    private int currentMonth;

    public main_admin() {
        super("Animal-Waiting", false, false, false, true);
        today = String.format("%d-%02d-%02d", Datetoday.date.getYear()+543,Datetoday.date.getMonthValue(),Datetoday.date.getDayOfMonth());
        try {
            setQueue(today);
        } catch (SQLException ex) {
        }
        setLayout(new BorderLayout());

        panel_left = new JPanel();
        panel_right = new JPanel();
        panel_left1 = new JPanel();
        panel_left2 = new JPanel();
        panel_left3 = new JPanel();
        panel_left4 = new JPanel();
        panel_left5 = new JPanel();
        panel_left6 = new JPanel();
        panel_calendar = new JPanel();
        panel_right_button = new JPanel();
        panel_right1 = new JPanel();
        panel_right2 = new JPanel();
        panel_right3 = new JPanel();
        panel_space = new JPanel();
        panel_space1 = new JPanel();
        panel_space2 = new JPanel();

        panel_left.setLayout(new BorderLayout());
        panel_left1.setLayout(new BorderLayout());
        panel_left2.setLayout(new GridLayout(2, 1));
        panel_left3.setLayout(new FlowLayout());
        panel_left4.setLayout(new FlowLayout());
        panel_left5.setLayout(new FlowLayout());
        panel_left6.setLayout(new FlowLayout());
        panel_right_button.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel_calendar.setLayout(new BorderLayout());

        button_medicine = new JButton("คลังยา");
        button_history = new JButton("เวชระเบียน");
        button_logout = new JButton("Logout");

        button_medicine.addActionListener(this);
        button_history.addActionListener(this);

        button_medicine.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button_history.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button_logout.setFont(new Font("Tahoma", Font.BOLD, 15));

        profile = new ImageIcon(System.getProperty("user.dir")+"/src/Font/admin_profile.jpg");
        resizedImageIcon = resizeImageIcon(profile, 100, 100);
        roundedIcon = getRoundedImageIcon(resizedImageIcon);
        photo = new JLabel(roundedIcon);

        panel_left5.add(panel_space);
        panel_left5.add(photo);
        panel_left5.add(panel_space2);
        panel_left5.add(panel_space1);

        panel_left.add(panel_left5, BorderLayout.NORTH);
        panel_left.add(panel_left1, BorderLayout.CENTER);

        panel_left1.add(panel_left6, BorderLayout.NORTH);
        panel_left1.add(panel_calendar, BorderLayout.CENTER);
        panel_left1.add(panel_left2, BorderLayout.SOUTH);

        panel_left2.add(panel_left3);
        panel_left2.add(panel_left4);

        panel_left3.add(button_medicine);

        panel_left4.add(button_history);

        // สร้างตาราง
        String[][] data = {{"10:00 - 11:00", queue.get("10:00 - 11:00")}, {"11:00 - 12:00", queue.get("11:00 - 12:00")}, 
{"12:00 - 13:00", queue.get("12:00 - 13:00")}, {"13:00 - 14:00", "พัก"}, {"14:00 - 15:00", queue.get("14:00 - 15:00")},       
{"15:00 - 16:00", queue.get("15:00 - 16:00")}, {"16:00 - 17:00", queue.get("16:00 - 17:00")}, {"17:00 - 18:00", queue.get("17:00 - 18:00")}, 
{"18:00 - 19:00", queue.get("18:00 - 19:00")}, {"19:00 - 20:00", queue.get("19:00 - 20:00")}};
        String[] columnNames = {"เวลา", "รายละเอียด"};
        table = new JTable(data, columnNames);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        table.setIntercellSpacing(new Dimension(5, 5));
        table.setDefaultEditor(Object.class, null);
        table.addMouseListener(this);
        
        panel_right_button.add(button_logout);

        pl1 = new JPanel(new BorderLayout());
        pl2 = new JPanel(new GridLayout(1, 7));
        pl3 = new JPanel(new GridLayout(6, 7));
        space = new JPanel();
        space1 = new JPanel(new BorderLayout());
        space2 = new JPanel();
        space3 = new JPanel();
        space4 = new JPanel();
        space5 = new JPanel(new BorderLayout());

        updateCalendar();

        pl1.add(space5, BorderLayout.NORTH);
        pl1.add(pl3, BorderLayout.CENTER);

        space5.add(space1, BorderLayout.CENTER);
        space5.add(pl2, BorderLayout.SOUTH);

        calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Bangkok"));
        currentMonth = calendar.get(Calendar.MONTH);
        monthLabel = new JLabel(month[currentMonth]);
        space1.add(monthLabel, BorderLayout.CENTER);

        space1.add(space2, BorderLayout.SOUTH);

        monthLabel.setFont(new Font("Angsana New", Font.BOLD, 40));

        panel_right.setLayout(new BorderLayout());
        panel_right.add(panel_right_button, BorderLayout.NORTH);
        panel_right.add(new JScrollPane(table), BorderLayout.CENTER);
        panel_right.add(panel_right1, BorderLayout.WEST);
        panel_right.add(panel_right2, BorderLayout.EAST);
        panel_right.add(panel_right3, BorderLayout.SOUTH);

        panel_calendar.add(pl1);

        button_medicine.setPreferredSize(new Dimension(150, 50));
        button_history.setPreferredSize(new Dimension(150, 50));
        button_logout.setPreferredSize(new Dimension(150, 50));
        panel_left.setPreferredSize(new Dimension(200, 500));
        panel_left5.setPreferredSize(new Dimension(200, 150));
        panel_left6.setPreferredSize(new Dimension(200, 50));
        panel_right3.setPreferredSize(new Dimension(200, 133));
        panel_space.setPreferredSize(new Dimension(200, 10));
        panel_space1.setPreferredSize(new Dimension(200, 3));
        panel_space2.setPreferredSize(new Dimension(200, 10));
        panel_left2.setPreferredSize(new Dimension(200, 150));
        space5.setPreferredSize(new Dimension(50, 60));
        space2.setPreferredSize(new Dimension(250, 1));
        space1.setPreferredSize(new Dimension(50, 50));
        pl2.setPreferredSize(new Dimension(50, 20));

        panel_left.setBackground(new Color(0xFFE3A8));
        panel_left1.setBackground(new Color(0xFFE3A8));
        panel_left2.setBackground(new Color(0xFFE3A8));
        panel_left3.setBackground(new Color(0xFFE3A8));
        panel_left4.setBackground(new Color(0xFFE3A8));
        panel_left6.setBackground(new Color(0xFFE3A8));
        panel_calendar.setBackground(new Color(0xFFE3A8));
        panel_space.setBackground(new Color(0xFFE3A8));
        panel_left5.setBackground(new Color(0xFFE3A8));
        panel_space2.setBackground(new Color(0xFFE3A8));
        panel_right_button.setBackground(new Color(0xFFEEE3));
        panel_right.setBackground(new Color(0xFFEEE3));
        panel_right1.setBackground(new Color(0xFFEEE3));
        panel_right2.setBackground(new Color(0xFFEEE3));
        panel_right3.setBackground(new Color(0xFFEEE3));
        panel_space1.setBackground(Color.WHITE);
        space5.setBackground(Color.WHITE);
        pl2.setBackground(Color.WHITE);
        space1.setBackground(Color.WHITE);
        space2.setBackground(Color.BLACK);
        button_logout.addActionListener(this);

        getContentPane().add(panel_left, BorderLayout.WEST);
        getContentPane().add(panel_right, BorderLayout.CENTER);
        setSize(1000, 550);
        setLocation(470, 200);
        setVisible(true);
        setLayer(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_medicine){
            openInternalFrame(new Medicinehome());
            button_medicine.setEnabled(false);
        }else if (e.getSource() == button_history){
            openInternalFrame(new Patient_history());
            button_history.setEnabled(false);
        }else if (e.getSource().equals(button_logout)){
            JDesktopPane desktopPane = getDesktopPane();
            if (desktopPane != null) {
                JRootPane rootPane = desktopPane.getRootPane();
                if (rootPane != null) {
                    JFrame topLevelFrame = (JFrame) SwingUtilities.getWindowAncestor(rootPane);
                    if (topLevelFrame != null) {
                        topLevelFrame.dispose();
                    }
                }
            }
            new Login();
        }
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
                    textField.setBackground(Color.WHITE);
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
    
        panel_calendar.validate();
        panel_calendar.repaint();
    }

    private void openInternalFrame(JInternalFrame internalFrame) {
        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
        @Override
        public void internalFrameClosing(InternalFrameEvent e) {
            button_history.setEnabled(true);
            button_medicine.setEnabled(true);
            }
        });
        internalFrame.setVisible(true);
        getParent().add(internalFrame);
        
    }
    public void setQueue(String today) throws SQLException{
        queue = new HashMap<String, String>();
        datahistory = new HashMap<String, String[]>();
        tabledb = new Connec_table();
        String sql = String.format("SELECT * FROM Reserve where date = '%s' ORDER BY Time ASC",today);
        rs = tabledb.getData(sql);
        while (rs.next()) {
            String[] s = {rs.getString("Details"),rs.getString("ID"),rs.getString("Type")};
            datahistory.put(rs.getString("Time"), s);
            queue.put(rs.getString("Time"), rs.getString("Details"));
        }
        tabledb.Discon();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try{
          if (e.getClickCount() == 2){
            introw = table.rowAtPoint(e.getPoint());
            tabledb = new Connec_table();
            String sql = String.format("SELECT * FROM History where id = '%s' and time = '%s'and date = '%s'",datahistory.get(work[introw])[1],work[introw],today);
            rs = tabledb.getData(sql);
            try {
                if(rs.next()){
                    code = rs.getString("Type_Code");
                    tabledb.Discon();
                }else{
                    tabledb.Discon();
                    if(datahistory.get(work[introw])[2].equals("เข้ารับการรักษา")){
                       code = "Cure"+"_"+datahistory.get(work[introw])[1]+wordcode.rcode(); 
                    }else{
                        code = "Grooming"+"_"+datahistory.get(work[introw])[1]+wordcode.rcode();
                    }
                    sql = String.format("INSERT INTO History (ID, Type_Code, Date, Type, Time, Detail) VALUES('%s', '%s', '%s', '%s', '%s', '%s')",
                       datahistory.get(work[introw])[1],code,today,datahistory.get(work[introw])[2],work[introw],datahistory.get(work[introw])[0]);
                    tabledb = new Connec_table();
                    tabledb.UpdateData(sql);
                    tabledb.Discon();
                }
                customer = new Customer(Integer.parseInt(datahistory.get(work[introw])[1]));

               if (datahistory.get(work[introw])[2].equals("เข้ารับการรักษา")){
                    tabledb = new Connec_table();
                    sql = String.format("SELECT * FROM Cure where Type_Code = '%s'",code);
                    rs = tabledb.getData(sql);
                    if (!rs.next()) {
                        cure_r = new CureReipt(customer, code,today);
                        details = new details_admin_popup(cure_r);
                    }else{
                        JOptionPane.showMessageDialog(null, "This page has completed filling out information.");
                    }
                    tabledb.Discon();
                }else{
                    tabledb = new Connec_table();
                    sql = String.format("SELECT * FROM Groomer where Type_Code = '%s'",code);
                    rs = tabledb.getData(sql);
                    if (!rs.next()) {
                        groom_r = new GroomReipt(customer, code,today);
                        grooming = new grooming_popup(groom_r);
                    }else{
                        JOptionPane.showMessageDialog(null, "This page has completed filling out information.");
                    }
                }
                tabledb.Discon();
            } catch (SQLException ex) {
            }
          }  
        }catch(NullPointerException nu){
            JOptionPane.showMessageDialog(null, "No information"); 
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}