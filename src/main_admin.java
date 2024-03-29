
import  back.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import com.toedter.calendar.JCalendar;

import java.sql.*;
import java.util.*;
import javax.swing.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main_admin extends JInternalFrame{
    private JPanel panel_left, panel_right, panel_left1, panel_calendar, 
panel_left2, panel_left3, panel_left4, panel_left5, panel_left6, panel_space1, 
panel_right1, panel_right2, panel_right3, panel_right_button, panel_space, 
panel_space2;
    private JButton button_medicine, button_history, button_logout;
    private JTable table;
    private JLabel photo;
    private JCalendar calendar;
    private ImageIcon profile, resizedImageIcon, roundedIcon;
    private Main_MDI main;
    private Connec_table tabledb;
    private String today;
    private Map<String, String> queue=new HashMap<>();
    public main_admin() {
        super("Animal-Waiting", false, true, false, true);
        //today = String.format("%d-%02d-%02d", Datetoday.date.getYear()+543,Datetoday.date.getMonthValue(),Datetoday.date.getDayOfMonth());
        //try {
        //    setQueue(today);
        //} catch (SQLException ex) {
        //    Logger.getLogger(main_admin.class.getName()).log(Level.SEVERE, null, ex);
        //}
        //System.out.println(today);
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

        button_medicine = new JButton("คลังยา");
        button_history = new JButton("เวชระเบียน");
        button_logout = new JButton("Logout");

        button_medicine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openInternalFrame(new Medicinehome());
                button_medicine.setEnabled(false);
            }
        });

        button_history.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openInternalFrame(new Patient_history());
                button_medicine.setEnabled(false);
            }
        });

        button_medicine.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button_history.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button_logout.setFont(new Font("Tahoma", Font.BOLD, 15));

        calendar = new JCalendar();

        profile = new ImageIcon(System.getProperty("user.dir")+"/src/admin_profile.jpg");
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
        
        panel_calendar.add(calendar);

        // สร้างตาราง
        String[][] data = {{"10:00 - 11:00", queue.get("10.00-11.00")}, {"11:00 - 12:00", queue.get("11.00-12.00")}, 
{"12:00 - 13:00", queue.get("12.00-13.00")}, {"13:00 - 14:00", "พัก"}, {"14:00 - 15:00", queue.get("14.00-15.00")},       
{"15:00 - 16:00", queue.get("15.00-16.00")}, {"16:00 - 17:00", queue.get("16.00-17.00")}, {"17:00 - 18:00", queue.get("17.00-18.00")}, 
{"18:00 - 19:00", queue.get("18.00-19.00")}, {"19:00 - 20:00", queue.get("19.00-20.00")}};
        String[] columnNames = {"เวลา", "รายละเอียด"};
        table = new JTable(data, columnNames);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        table.setIntercellSpacing(new Dimension(5, 5));

        panel_right_button.add(button_logout);

        panel_right.setLayout(new BorderLayout());
        panel_right.add(panel_right_button, BorderLayout.NORTH);
        panel_right.add(new JScrollPane(table), BorderLayout.CENTER);
        panel_right.add(panel_right1, BorderLayout.WEST);
        panel_right.add(panel_right2, BorderLayout.EAST);
        panel_right.add(panel_right3, BorderLayout.SOUTH);

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

        getContentPane().add(panel_left, BorderLayout.WEST);
        getContentPane().add(panel_right, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 550);
        setLocation(470, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new main_admin();
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

    private void openInternalFrame(JInternalFrame internalFrame) {
        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
        @Override
        public void internalFrameClosing(InternalFrameEvent e) {
            button_medicine.setEnabled(true);
            }
        });
        internalFrame.setVisible(true);
        getParent().add(internalFrame);
        
    }
    public void setQueue(String today) throws SQLException{
        System.out.println("fdffdsffsdfsdf");
        queue = new HashMap<String, String>();
        tabledb = new Connec_table();
        String sql = String.format("SELECT * FROM Reserve where date = '2567-03-28' ORDER BY Time ASC");
        System.out.println(sql);
        ResultSet rs = tabledb.getData(sql);
        while (rs.next()) {
            queue.put(rs.getString("Time"), rs.getString("Details"));
        }
//        for (int i = 0; i < 9; i++) {
//            if(rs.next()){
//                System.out.println(rs.getString("Time"));
//                queue.add(rs.getString("Details"));
//            }
//            else{
//                queue.add("");
//            }
//        }
        tabledb.Discon();
    }
}