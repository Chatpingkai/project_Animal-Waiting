
import java.awt.*;
import java.util.concurrent.Flow;

import javax.swing.*;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;
import java.awt.event.*;
public class Reservation implements ActionListener{
    private JFrame frame_reservation;
    private JPanel panel_main, panel_north, panel_center1, panel_south, panel_box1, 
panel_box2, panel_box3, panel_space1, panel_space2, panel_box4, panel_box5, 
panel_center_main, panel_center2, panel_box6, panel_box7;
    private JComboBox box_time, box_type;
    private JTextArea box_details;
    private JLabel txt_reservation, txt_date, txt_time, txt_type, txt_details;
    private UtilDateModel model;
    private JDatePicker box_date;
    private JScrollPane scroll;
    private JButton button_sub;

    public Reservation(){
        frame_reservation = new JFrame("Reservation");
        frame_reservation.setDefaultCloseOperation(frame_reservation.EXIT_ON_CLOSE);
        frame_reservation.setLayout(new BorderLayout());

        txt_reservation = new JLabel("จองคิว");
        txt_date = new JLabel("วันที่");
        txt_time = new JLabel("เวลา");
        txt_type = new JLabel("ประเภท");
        txt_details = new JLabel("รายละเอียด");

        model = new UtilDateModel();

        box_date = new JDatePicker(model);

        String time[] = {"10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", 
"13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", 
"18:00 - 19:00", "19:00 - 20:00", };
        String type[] = {"เข้ารับการรักษา", "บริการอาบน้ำ/ตัดขน"};
        box_time = new JComboBox<>(time);
        box_type = new JComboBox<>(type);
        box_time.setSelectedItem(null);
        box_type.setSelectedItem(null);

        box_details = new JTextArea(null, 5, 30);
        box_details.setWrapStyleWord(true);
        box_details.setLineWrap(true);
        scroll = new JScrollPane(box_details);

        button_sub = new JButton("ยืนยัน");
        button_sub.addActionListener(this);
        panel_main = new JPanel(new BorderLayout());
        panel_north = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel_center1 = new JPanel(new GridLayout(3, 1));
        panel_south = new JPanel(new BorderLayout());
        panel_box1 = new JPanel(new GridLayout(2, 1));
        panel_box2 = new JPanel(new GridLayout(2, 1));
        panel_box3 = new JPanel(new GridLayout(2, 1));
        panel_box4 = new JPanel(new BorderLayout());
        panel_box5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel_space1 = new JPanel();
        panel_space2 = new JPanel();
        panel_center_main = new JPanel(new BorderLayout());
        panel_center2 = new JPanel(new BorderLayout());
        panel_box6 = new JPanel();
        panel_box7 = new JPanel();

        panel_main.add(panel_north, BorderLayout.NORTH);
        panel_main.add(panel_center_main, BorderLayout.CENTER);
        panel_main.add(panel_south, BorderLayout.SOUTH);
        panel_main.add(panel_space1, BorderLayout.WEST);
        panel_main.add(panel_space2, BorderLayout.EAST);

        panel_center_main.add(panel_center1, BorderLayout.NORTH);
        panel_center_main.add(panel_center2, BorderLayout.CENTER);

        panel_center1.add(panel_box1);
        panel_center1.add(panel_box2);
        panel_center1.add(panel_box3);

        panel_center2.add(panel_box4, BorderLayout.NORTH);
        panel_center2.add(scroll, BorderLayout.CENTER);

        panel_box4.add(txt_details, BorderLayout.WEST);

        panel_north.add(txt_reservation);

        panel_box1.add(txt_date);
        panel_box1.add(box_date);

        panel_box2.add(txt_time);
        panel_box2.add(box_time);

        panel_box3.add(txt_type);
        panel_box3.add(box_type);

        panel_south.add(panel_box5, BorderLayout.CENTER);
        panel_south.add(panel_box6, BorderLayout.NORTH);
        panel_south.add(panel_box7, BorderLayout.SOUTH);

        panel_box5.add(button_sub);

        frame_reservation.add(panel_main);

        txt_reservation.setFont(new Font("Tahoma", Font.BOLD, 25));
        txt_date.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_time.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_type.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_details.setFont(new Font("Tahoma", Font.PLAIN, 15));

        box_date.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_time.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_type.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_details.setFont(new Font("Tahoma", Font.PLAIN, 13));
        
        button_sub.setFont(new Font("Tahoma", Font.BOLD, 15));

        panel_box1.setPreferredSize(new Dimension(400, 60));
        panel_box4.setPreferredSize(new Dimension(400, 40));
        panel_south.setPreferredSize(new Dimension(400, 80));
        panel_space1.setPreferredSize(new Dimension(20, 60));
        panel_space2.setPreferredSize(new Dimension(20, 60));
        button_sub.setPreferredSize(new Dimension(110, 50));

        panel_main.setBackground(new Color(0xFFEEE3));
        panel_north.setBackground(new Color(0xFFEEE3));
        panel_center1.setBackground(new Color(0xFFEEE3));
        panel_south.setBackground(new Color(0xFFEEE3));
        panel_box1.setBackground(new Color(0xFFEEE3));
        panel_box2.setBackground(new Color(0xFFEEE3));
        panel_box3.setBackground(new Color(0xFFEEE3));
        panel_space1.setBackground(new Color(0xFFEEE3));
        panel_space2.setBackground(new Color(0xFFEEE3));
        panel_box4.setBackground(new Color(0xFFEEE3));
        panel_box5.setBackground(new Color(0xFFEEE3));
        panel_center_main.setBackground(new Color(0xFFEEE3));
        panel_center2.setBackground(new Color(0xFFEEE3));
        panel_box6.setBackground(new Color(0xFFEEE3));
        panel_box7.setBackground(new Color(0xFFEEE3));

        frame_reservation.setSize(400, 600);
        frame_reservation.setVisible(true);
        frame_reservation.setLocationRelativeTo(null);
        frame_reservation.setResizable(false);
    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            e.printStackTrace();
            }
            SwingUtilities.invokeLater(() -> { 
                Reservation frame = new Reservation();
            });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(box_date.getModel().getYear()+"-"+box_date.getModel().getMonth()+"-"+box_date.getModel().getDay());
        
    }
    
}
