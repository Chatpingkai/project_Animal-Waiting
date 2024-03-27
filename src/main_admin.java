
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import com.toedter.calendar.JCalendar;

public class main_admin{
    private JFrame fr;
    private JPanel fr_left, fr_right, fr_left_under, emthy1, emthy2, emthy3, fr_left_under_med, emthy4, emthy5, emthy6, emthy7, fr_left_under_Medical_records, fr_right_top, fr_right_under, emthy8, emthy9, emthy10, emthy11, emthy12;
    private ImageIcon photo, photo_size, photo_smth;
    private JLabel photo_JLabel;
    private JButton button_med, button_Medical_records, button_logout;
    private JTable table;
    private JCalendar calendar;

    public main_admin(){
        fr = new JFrame("Animal-Wating");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());

        fr_left = new JPanel();
        fr_right = new JPanel();
        fr_left_under = new JPanel();
        emthy1 = new JPanel();
        emthy2 = new JPanel();
        emthy3 = new JPanel();
        emthy4 = new JPanel();
        emthy5 = new JPanel();
        emthy6 = new JPanel();
        emthy7 = new JPanel();
        emthy8 = new JPanel();
        emthy9 = new JPanel();
        emthy10 = new JPanel();
        emthy11 = new JPanel();
        emthy12 = new JPanel();
        fr_left_under_med = new JPanel();
        fr_left_under_med.setLayout(new BorderLayout());
        fr_left_under_Medical_records = new JPanel();
        fr_left_under_Medical_records.setLayout(new BorderLayout());
        fr_right_top = new JPanel();
        fr_right_top.setLayout(new FlowLayout(FlowLayout.RIGHT));
        fr_right_under = new JPanel();
        fr_right_under.setLayout(new BorderLayout());
        fr_left.setLayout(new GridLayout(3, 1));
        fr_left_under.setLayout(new GridLayout(5, 1));
        fr_right.setLayout(new BorderLayout());

        String[] columnNames = {"Time", "details"};
        Object[][] data= {{"10:00 - 11:00", null},
        {"11:00 - 12:00", null},
        {"12:00 - 13:00", null},
        {"13:00 - 14:00", null},
        {"14:00 - 15:00", null},
        {"15:00 - 16:00", null},
        {"16:00 - 17:00", null},
        {"17:00 - 18:00", null},
        {"18:00 - 19:00", null},
        {"19:00 - 20:00", null}};
        table = new JTable(data, columnNames);
        table.getTableHeader().setReorderingAllowed(false);

        fr_right_under.add(table, BorderLayout.CENTER);
        fr_right_under.add(emthy9, BorderLayout.WEST);
        fr_right_under.add(emthy10, BorderLayout.EAST);
        fr_right_under.add(emthy11, BorderLayout.SOUTH);
        table.setRowHeight(29);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        emthy9.setBackground(new Color(0xFFEEE3));
        emthy10.setBackground(new Color(0xFFEEE3));
        emthy11.setBackground(new Color(0xFFEEE3));

        fr_right.add(fr_right_top, BorderLayout.NORTH);
        fr_right.add(fr_right_under, BorderLayout.CENTER);

        button_logout = new JButton("Logout");
        button_logout.setBackground(Color.WHITE);
        button_logout.setFont(new Font("Jost", Font.PLAIN, 20));

        button_med = new JButton("Pharmacy");
        button_Medical_records = new JButton("Medical records");
        button_med.setBackground(Color.WHITE);
        button_med.setFont(new Font("Jost", Font.PLAIN, 20));
        button_med.setHorizontalAlignment(SwingConstants.CENTER);
        button_Medical_records.setBackground(Color.WHITE);
        button_Medical_records.setFont(new Font("Jost", Font.PLAIN, 20));
        button_Medical_records.setHorizontalAlignment(SwingConstants.CENTER);

        fr_right_top.add(emthy8);
        fr_right_top.add(button_logout);
        fr_right_top.add(emthy12);

        fr_left_under_med.add(button_med, BorderLayout.CENTER);
        fr_left_under_med.add(emthy4, BorderLayout.WEST);
        fr_left_under_med.add(emthy5, BorderLayout.EAST);

        fr_left_under_Medical_records.add(button_Medical_records, BorderLayout.CENTER);
        fr_left_under_Medical_records.add(emthy6, BorderLayout.WEST);
        fr_left_under_Medical_records.add(emthy7, BorderLayout.EAST);

        fr_left_under.add(emthy1);
        fr_left_under.add(fr_left_under_med);
        fr_left_under.add(emthy2);
        fr_left_under.add(fr_left_under_Medical_records);
        fr_left_under.add(emthy3);
        emthy1.setBackground(new Color(0xFFE3A8));
        emthy2.setBackground(new Color(0xFFE3A8));
        emthy3.setBackground(new Color(0xFFE3A8));
        emthy4.setBackground(new Color(0xFFE3A8));
        emthy5.setBackground(new Color(0xFFE3A8));
        emthy6.setBackground(new Color(0xFFE3A8));
        emthy7.setBackground(new Color(0xFFE3A8));
        emthy8.setBackground(new Color(0xFFEEE3));
        emthy12.setBackground(new Color(0xFFEEE3));

        photo = new ImageIcon(System.getProperty("user.dir")+"/src/koala.png");
        photo_size = resizeImageIcon(photo, 150, 150);
        photo_smth = getRoundedImageIcon(photo_size);
        photo_JLabel = new JLabel(photo_smth);
        
        calendar = new JCalendar();
        

        fr_left.add(photo_JLabel);
        fr_left.add(calendar);
        fr_left.add(fr_left_under);
        fr_left.setBackground(new Color(0xFFE3A8));
        fr_right.setBackground(new Color(0xFFEEE3));
        fr_right_top.setBackground(new Color(0xFFEEE3));
        fr_right_under.setBackground(new Color(0xFFEEE3));

        fr.add(fr_left, BorderLayout.WEST);
        fr.add(fr_right, BorderLayout.CENTER);

        fr_left.setPreferredSize(new Dimension(300, 500));
        fr_right.setPreferredSize(new Dimension(200, 500));
        emthy4.setPreferredSize(new Dimension(50, 100));
        emthy5.setPreferredSize(new Dimension(50, 100));
        emthy6.setPreferredSize(new Dimension(50, 100));
        emthy7.setPreferredSize(new Dimension(50, 100));
        emthy8.setPreferredSize(new Dimension(300, 100));
        emthy9.setPreferredSize(new Dimension(20, 100));
        emthy10.setPreferredSize(new Dimension(20, 100));
        //emthy11.setPreferredSize(new Dimension(300, 198));
        emthy12.setPreferredSize(new Dimension(10, 100));
        fr_right_top.setPreferredSize(new Dimension(200, 200));

        fr.setSize(1000, 750);
        fr.setVisible(true);
        fr.setResizable(false);
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

    public static void main(String[] args){
        new main_admin();
    }
}

