
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;

public class details_admin_popup implements ActionListener{
    private JFrame fr;
    private JPanel panel_main, panel_history, panel_his_north, panel_his_center, panel_his1, panel_his2, 
panel_his3, panel_his4, panel_his5, panel_his6, panel_his7, panel_date, panel_txt_date, 
panel_box_date, panel_treatment, panel_treat_north, panel_treat_center, panel_treat_south, 
panel_cen1, panel_cen2, panel_cen3, panel_cen4, panel_center, panel_help1, panel_help2, 
panel_help3, panel_help4, panel_help5, panel_help6, panel_button, panel_cen5, panel_help7, 
panel_help8, panel_help9, panel_help10, panel_help11, panel_button_jingjing;
    private JScrollPane scroll_table, scroll_main;
    private JLabel txt_history_pet, txt_name, txt_name_pet, txt_type, txt_breed, txt_age, txt_gender, 
txt_disease, txt_date, txt_treatment, txt_name_docter, txt_symptom, txt_diagnose, txt_trestment_method, 
txt_opinion, txt_note;
    private JTextField box_name, box_name_pet, box_type, box_breed, box_age, box_gender, 
box_disease, box_name_docter, box_symptom, box_diagnose, box_trestment_method, 
box_opinion, box_note;
    private JButton button_plus, button_minus, button_next;
    private JDatePicker box_date;
    private UtilDateModel models;

    public details_admin_popup(){
        fr = new JFrame("การรักษา");
        fr.setLayout(new GridLayout(1, 1));
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);

        txt_history_pet = new JLabel("ประวัติสัตว์เลี้ยง");
        txt_name = new JLabel("        ชื่อลูกค้า ");
        txt_name_pet = new JLabel("ชื่อสัตว์เลี้ยง ");
        txt_type = new JLabel("        ประเภทของสัตว์เลี้ยง ");
        txt_breed = new JLabel("สายพันธุ์");
        txt_age = new JLabel("       อายุของสัตว์เลี้ยง ");
        txt_gender = new JLabel("เพศ ");
        txt_disease = new JLabel("       โรคประจำตัว ");
        txt_date = new JLabel("วันที่ ");
        txt_treatment = new JLabel("รายละเอียดการรักษา");
        txt_name_docter = new JLabel("ชื่อแพทย์ ");
        txt_symptom = new JLabel("อาการ ");
        txt_diagnose = new JLabel("การวินิจฉัย");
        txt_trestment_method = new JLabel("การักษา");
        txt_opinion = new JLabel("ความเห็นแพทย์ ");
        txt_note = new JLabel("หมายเหตุ ");

        box_name = new JTextField();
        box_name_pet = new JTextField();
        box_type = new JTextField();
        box_breed = new JTextField();
        box_age = new JTextField();
        box_gender = new JTextField();
        box_disease = new JTextField();
        box_name_docter = new JTextField();
        box_symptom = new JTextField();
        box_diagnose = new JTextField();
        box_trestment_method = new JTextField();
        box_opinion = new JTextField();
        box_note = new JTextField();

        button_minus = new JButton("-");
        button_plus = new JButton("+");
        button_next = new JButton("Next");

        button_minus.addActionListener(this);
        button_plus.addActionListener(this);
        button_next.addActionListener(this);

        JTable table = new JTable();
        Object[] columns = {"ชื่อยา", "จำนวน", "ราคา"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);
        
        scroll_table = new JScrollPane(table);
        scroll_table.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll_table.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll_table.setViewportView(table);

        table.setRowHeight(20);
        table.getTableHeader().setReorderingAllowed(false);
        table.setGridColor(new Color(0xFFE3A7));
        
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(20);
        table.getColumnModel().getColumn(2).setPreferredWidth(20);
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setBackground(new Color(0xFFE3A8));
        table.setDefaultRenderer(Object.class, renderer);
        
        for(int i=0; i <=20; i++){
            model.addRow(new Object[4]);
        }
        
        table.setDefaultEditor(Object.class, null);
        scroll_table.setPreferredSize(new Dimension(50, 200));

        models = new UtilDateModel();
        box_date = new JDatePicker(models);

        panel_main = new JPanel();
        panel_history = new JPanel();
        panel_his_north = new JPanel();
        panel_his_center = new JPanel();
        panel_his1 = new JPanel();
        panel_his2 = new JPanel();
        panel_his3 = new JPanel();
        panel_his4 = new JPanel();
        panel_his5 = new JPanel();
        panel_his6 = new JPanel();
        panel_his7 = new JPanel();
        panel_date = new JPanel();
        panel_txt_date = new JPanel();
        panel_box_date = new JPanel();
        panel_treatment = new JPanel();
        panel_treat_north = new JPanel();
        panel_treat_center = new JPanel();
        panel_treat_south = new JPanel();
        panel_cen1 = new JPanel();
        panel_cen2 = new JPanel();
        panel_cen3 = new JPanel();
        panel_cen4 = new JPanel();
        panel_center = new JPanel();
        panel_help1 = new JPanel();
        panel_help2 = new JPanel();
        panel_help3 = new JPanel();
        panel_help4 = new JPanel();
        panel_help5 = new JPanel();
        panel_help6 = new JPanel();
        panel_button = new JPanel();
        panel_cen5 = new JPanel();
        panel_help7 = new JPanel();
        panel_help8 = new JPanel();
        panel_help9 = new JPanel();
        panel_help10 = new JPanel();
        panel_help11 = new JPanel();
        panel_button_jingjing = new JPanel();

        panel_main.setLayout(new BorderLayout());
        panel_history.setLayout(new BorderLayout());
        panel_his_north.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_his_center.setLayout(new GridLayout(4,2));
        panel_his1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_his2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_his3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_his4.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_his5.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_his6.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_his7.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_date.setLayout(new GridLayout(2, 1));
        panel_txt_date.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_box_date.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_treatment.setLayout(new BorderLayout());
        panel_treat_north.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_treat_center.setLayout(new GridLayout(6, 1));
        panel_treat_south.setLayout(new BorderLayout());
        panel_center.setLayout(new BorderLayout());
        panel_help1.setLayout(new GridLayout(2, 1));
        panel_help2.setLayout(new GridLayout(2, 1));
        panel_help3.setLayout(new GridLayout(2, 1));
        panel_help4.setLayout(new GridLayout(2, 1));
        panel_help5.setLayout(new GridLayout(2, 1));
        panel_help6.setLayout(new GridLayout(2, 1));
        panel_button.setLayout(new GridLayout(2, 1));
        panel_help7.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_help8.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel_button_jingjing.setLayout(new BorderLayout());

        panel_main.add(panel_history, BorderLayout.NORTH);
        panel_main.add(panel_center, BorderLayout.CENTER);

        panel_history.add(panel_his_north, BorderLayout.NORTH);
        panel_history.add(panel_his_center, BorderLayout.CENTER);

        panel_his_north.add(txt_history_pet);

        panel_his_center.add(panel_his1);
        panel_his_center.add(panel_his2);
        panel_his_center.add(panel_his3);
        panel_his_center.add(panel_his4);
        panel_his_center.add(panel_his5);
        panel_his_center.add(panel_his6);
        panel_his_center.add(panel_his7);

        panel_his1.add(txt_name);
        panel_his1.add(box_name);

        panel_his2.add(txt_name_pet);
        panel_his2.add(box_name_pet);

        panel_his3.add(txt_type);
        panel_his3.add(box_type);

        panel_his4.add(txt_breed);
        panel_his4.add(box_breed);

        panel_his5.add(txt_age);
        panel_his5.add(box_age);

        panel_his6.add(txt_gender);
        panel_his6.add(box_gender);

        panel_his7.add(txt_disease);
        panel_his7.add(box_disease);

        panel_center.add(panel_date, BorderLayout.NORTH);
        panel_center.add(panel_treatment, BorderLayout.CENTER);

        panel_date.add(panel_txt_date);
        panel_date.add(panel_box_date);

        panel_txt_date.add(txt_date);

        panel_box_date.add(box_date);

        panel_treatment.add(panel_treat_north, BorderLayout.NORTH);
        panel_treatment.add(panel_treat_center, BorderLayout.CENTER);
        panel_treatment.add(panel_treat_south, BorderLayout.SOUTH);
        panel_treatment.add(panel_cen1, BorderLayout.WEST);
        panel_treatment.add(panel_cen2, BorderLayout.EAST);

        panel_treat_north.add(txt_treatment);

        panel_treat_center.add(panel_help1);
        panel_treat_center.add(panel_help2);
        panel_treat_center.add(panel_help3);
        panel_treat_center.add(panel_help4);
        panel_treat_center.add(panel_help5);
        panel_treat_center.add(panel_help6);

        panel_help1.add(txt_name_docter);
        panel_help1.add(box_name_docter);

        panel_help2.add(txt_symptom);
        panel_help2.add(box_symptom);

        panel_help3.add(txt_diagnose);
        panel_help3.add(box_diagnose);

        panel_help4.add(txt_trestment_method);
        panel_help4.add(box_trestment_method);

        panel_help5.add(txt_opinion);
        panel_help5.add(box_opinion);

        panel_help6.add(txt_note);
        panel_help6.add(box_note);

        panel_treat_south.add(scroll_table, BorderLayout.CENTER);
        panel_treat_south.add(panel_cen3, BorderLayout.WEST);
        panel_treat_south.add(panel_cen4, BorderLayout.EAST);
        panel_treat_south.add(panel_button_jingjing, BorderLayout.SOUTH);
        panel_treat_south.add(panel_cen5, BorderLayout.NORTH);

        panel_button_jingjing.add(panel_button, BorderLayout.CENTER);
        panel_button_jingjing.add(panel_help9, BorderLayout.NORTH);
        panel_button_jingjing.add(panel_help10, BorderLayout.WEST);
        panel_button_jingjing.add(panel_help11, BorderLayout.EAST);
        
        panel_button.add(panel_help7);
        panel_button.add(panel_help8);

        panel_help7.add(button_plus);
        panel_help7.add(button_minus);

        panel_help8.add(button_next);

        scroll_main = new JScrollPane(panel_main);
        scroll_main.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll_main.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll_main.setViewportView(panel_main);
        fr.add(scroll_main);

        box_name.setPreferredSize(new Dimension(200, 25));
        box_name_pet.setPreferredSize(new Dimension(120, 25));
        box_type.setPreferredSize(new Dimension(100, 25));
        box_breed.setPreferredSize(new Dimension(100, 25));
        box_age.setPreferredSize(new Dimension(100, 25));
        box_gender.setPreferredSize(new Dimension(100, 25));
        box_disease.setPreferredSize(new Dimension(180, 25));
        box_date.setPreferredSize(new Dimension(150, 25));

        button_plus.setPreferredSize(new Dimension(100, 40));
        button_minus.setPreferredSize(new Dimension(100, 40));
        button_next.setPreferredSize(new Dimension(100, 40));

        button_plus.setFont(new Font("Jost", Font.BOLD, 15));
        button_minus.setFont(new Font("Jost", Font.BOLD, 15));
        button_next.setFont(new Font("Jost", Font.BOLD, 15));

        box_name.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_name_pet.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_type.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_breed.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_age.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_gender.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_disease.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_date.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_name_docter.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_symptom.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_diagnose.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_trestment_method.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_opinion.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_note.setFont(new Font("Tahoma", Font.PLAIN, 13));

        txt_history_pet.setFont(new Font("Tahoma", Font.BOLD, 15));
        txt_name.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_name_pet.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_type.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_breed.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_age.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_disease.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_date.setFont(new Font("Tahoma", Font.BOLD, 15));
        txt_treatment.setFont(new Font("Tahoma", Font.BOLD, 15));
        txt_name_docter.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_symptom.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_diagnose.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_trestment_method.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_opinion.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_note.setFont(new Font("Tahoma", Font.PLAIN, 15));

        panel_cen1.setPreferredSize(new Dimension(50, 50));
        panel_cen2.setPreferredSize(new Dimension(50, 50));
        panel_cen3.setPreferredSize(new Dimension(50, 50));
        panel_cen4.setPreferredSize(new Dimension(50, 50));
        panel_help9.setPreferredSize(new Dimension(50, 20));
        panel_help10.setPreferredSize(new Dimension(50, 50));
        panel_help11.setPreferredSize(new Dimension(50, 50));
        panel_button.setPreferredSize(new Dimension(100, 150));

        panel_main.setBackground(new Color(0xFFEEE3));
        panel_history.setBackground(new Color(0xFFEEE3));
        panel_his_north.setBackground(new Color(0xFFEEE3));
        panel_his_center.setBackground(new Color(0xFFEEE3));
        panel_his1.setBackground(new Color(0xFFEEE3));
        panel_his2.setBackground(new Color(0xFFEEE3));
        panel_his3.setBackground(new Color(0xFFEEE3));
        panel_his4.setBackground(new Color(0xFFEEE3));
        panel_his5.setBackground(new Color(0xFFEEE3));
        panel_his6.setBackground(new Color(0xFFEEE3));
        panel_his7.setBackground(new Color(0xFFEEE3));
        panel_date.setBackground(new Color(0xFFEEE3));
        panel_txt_date.setBackground(new Color(0xFFEEE3));
        panel_box_date.setBackground(new Color(0xFFEEE3));
        panel_treatment.setBackground(new Color(0xFFEEE3));
        panel_treat_north.setBackground(new Color(0xFFEEE3));
        panel_treat_center.setBackground(new Color(0xFFEEE3));
        panel_treat_south.setBackground(new Color(0xFFEEE3));
        panel_cen1.setBackground(new Color(0xFFEEE3));
        panel_cen2.setBackground(new Color(0xFFEEE3));
        panel_cen3.setBackground(new Color(0xFFEEE3));
        panel_cen4.setBackground(new Color(0xFFEEE3));
        panel_center.setBackground(new Color(0xFFEEE3));
        panel_help1.setBackground(new Color(0xFFEEE3));
        panel_help2.setBackground(new Color(0xFFEEE3));
        panel_help3.setBackground(new Color(0xFFEEE3));
        panel_help4.setBackground(new Color(0xFFEEE3));
        panel_help5.setBackground(new Color(0xFFEEE3));
        panel_help6.setBackground(new Color(0xFFEEE3));
        panel_button.setBackground(new Color(0xFFEEE3));
        panel_cen5.setBackground(new Color(0xFFEEE3));
        panel_help7.setBackground(new Color(0xFFEEE3));
        panel_help8.setBackground(new Color(0xFFEEE3));
        panel_help9.setBackground(new Color(0xFFEEE3));
        panel_help10.setBackground(new Color(0xFFEEE3));
        panel_help11.setBackground(new Color(0xFFEEE3));
        panel_button_jingjing.setBackground(new Color(0xFFEEE3));

        fr.setSize(650, 750);
        fr.setVisible(true);
        fr.setResizable(false);
    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            e.printStackTrace();
            }
            SwingUtilities.invokeLater(() -> { 
                details_admin_popup frame = new details_admin_popup();
            });
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_next){
            fr.dispose();
            new doctor_popup();
        }
    }
}
