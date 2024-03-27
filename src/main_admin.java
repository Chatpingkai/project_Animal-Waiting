
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JCalendar;

public class main_admin extends JInternalFrame {
    private JPanel panel_left, panel_right, panel_left1, panel_calendar, 
panel_left2, panel_left3, panel_left4, panel_left5, panel_left6, 
panel_right1, panel_right2, panel_right3,
panel_right_button;
    private JButton button_medicine, button_history, button_logout;
    private JTable table;
    private JLabel photo;
    private JCalendar calendar;
    private ImageIcon profile;

    public main_admin() {
        super("Animal-Waiting", false, true, true, true);
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

        calendar = new JCalendar();

        //profile = new ImageIcon(getClass().getResource("koala.png"));

        photo = new JLabel();
        //photo.setIcon(profile);
        //photo.setSize(100, 50);
        //panel_left5.add(photo);
        panel_left5.setBackground(Color.RED);

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
        String[][] data = {{"10:00 - 11:00", null}, {"11:00 - 12:00", null}, 
{"12:00 - 13:00", null}, {"13:00 - 14:00", null}, {"14:00 - 15:00", null}, 
{"15:00 - 16:00", null}, {"16:00 - 17:00", null}, {"17:00 - 18:00", null}, 
{"18:00 - 19:00", null}, {"19:00 - 20:00", null}};
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

        panel_left.setBackground(new Color(0xFFE3A8));
        panel_left1.setBackground(new Color(0xFFE3A8));
        panel_left2.setBackground(new Color(0xFFE3A8));
        panel_left3.setBackground(new Color(0xFFE3A8));
        panel_left4.setBackground(new Color(0xFFE3A8));
        panel_left6.setBackground(new Color(0xFFE3A8));
        panel_calendar.setBackground(new Color(0xFFE3A8));
        panel_right_button.setBackground(new Color(0xFFEEE3));
        panel_right.setBackground(new Color(0xFFEEE3));
        panel_right1.setBackground(new Color(0xFFEEE3));
        panel_right2.setBackground(new Color(0xFFEEE3));
        panel_right3.setBackground(new Color(0xFFEEE3));

        getContentPane().add(panel_left, BorderLayout.WEST);
        getContentPane().add(panel_right, BorderLayout.CENTER);
        setBounds(50, 50, 1000, 550);
        setVisible(true);
    }

    public static void main(String[] args) {
        new main_admin();
    }
}