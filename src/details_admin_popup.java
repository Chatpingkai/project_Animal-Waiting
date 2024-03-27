
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class details_admin_popup extends JInternalFrame implements ActionListener{
    private JPanel fr_pet, space1, space2, space3, space4, 
space5, space6, space7, space8, space9, space10, space11, 
space12, space13, space14, space15, space16, space17, space18, 
space19, space20, space21, space22, space23, space24, space25, 
space26, space27, space28, space29, space30;
    private JTextField box_name_owner, box_name_pet, box_type, 
box_breed, box_age, box_sex, box_Chronic_illness, box_date, 
box_name_doctor, box_symptoms, box_diagnosis, box_treatment_methods, 
box_doctor_opinion, box_note;
    private JLabel pet_history, name_owner, name_pet, type, breed, 
age, sex, Chronic_illness, date, treatment, name_docter, symptoms, 
diagnosis, treatment_methods, doctor_opinion, note;
    private JButton button_plus, button_next;
    private JTable table;
    private JScrollPane scroll, scrollPane_main;

    public details_admin_popup(){
        super("Animal-Waiting", false, true, true, true);
        setLayout(new GridLayout(1, 1));

        space1 = new JPanel();
        space2 = new JPanel();
        space3 = new JPanel();
        space4 = new JPanel();
        space5 = new JPanel();
        space6 = new JPanel();
        space7 = new JPanel();
        space8 = new JPanel();
        space9 = new JPanel();
        space10 = new JPanel();
        space11 = new JPanel();
        space12 = new JPanel();
        space13 = new JPanel();
        space14 = new JPanel();
        space15 = new JPanel();
        space16 = new JPanel();
        space17 = new JPanel();
        space18 = new JPanel();
        space19 = new JPanel();
        space20 = new JPanel();
        space21 = new JPanel();
        space22 = new JPanel();
        space23 = new JPanel();
        space24 = new JPanel();
        space25 = new JPanel();
        space26 = new JPanel();
        space27 = new JPanel();
        space28 = new JPanel();
        space29 = new JPanel();
        space30 = new JPanel();

        fr_pet = new JPanel();
        fr_pet.setLayout(new FlowLayout(FlowLayout.LEFT));

        pet_history = new JLabel("  ประวัติสัตว์เลี้ยง");
        pet_history.setFont(new Font("Tahoma", Font.BOLD, 25));
        name_owner = new JLabel("           ชื่อลุกค้า :");
        name_owner.setFont(new Font("Tahoma", Font.PLAIN, 15));
        name_pet = new JLabel("           ชื่อสัตว์เลี้ยง : ");
        name_pet.setFont(new Font("Tahoma", Font.PLAIN, 15));
        type = new JLabel("           ประเภทของสัตว์ : ");
        type.setFont(new Font("Tahoma", Font.PLAIN, 15));
        breed = new JLabel("    สายพันธุ์ : ");
        breed.setFont(new Font("Tahoma", Font.PLAIN, 15));
        age = new JLabel("           อายุสัตว์เลี้ยง : ");
        age.setFont(new Font("Tahoma", Font.PLAIN, 15));
        sex = new JLabel("  เพศ : ");
        sex.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Chronic_illness = new JLabel("           โรคประจำตัว : ");
        Chronic_illness.setFont(new Font("Tahoma", Font.PLAIN, 15));
        date = new JLabel("  วันที่");
        date.setFont(new Font("Tahoma", Font.BOLD, 25));
        treatment = new JLabel("  การรักษา");
        treatment.setFont(new Font("Tahoma", Font.BOLD, 25));
        name_docter = new JLabel("           ชื่อแพทย์");
        name_docter.setFont(new Font("Tahoma", Font.PLAIN, 15));
        symptoms = new JLabel("           อาการ");
        symptoms.setFont(new Font("Tahoma", Font.PLAIN, 15));
        diagnosis = new JLabel("           การวินิจฉัย");
        diagnosis.setFont(new Font("Tahoma", Font.PLAIN, 15));
        treatment_methods = new JLabel("           การรักษา");
        treatment_methods.setFont(new Font("Tahoma", Font.PLAIN, 15));
        doctor_opinion = new JLabel("           ความเห็นแพทย์");
        doctor_opinion.setFont(new Font("Tahoma", Font.PLAIN, 15));
        note = new JLabel("           หมายเหตุ");
        note.setFont(new Font("Tahoma", Font.PLAIN, 15));

        table = new JTable();  
        Object[] columns = {"ชื่อสามัญทางยา","ชื่อทางการค้า"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        scrollPane_main= new JScrollPane();
        scroll = new JScrollPane();
        scroll.setViewportView(table);
        scroll.setBounds(40, 340, 400, 130);
        scroll.setViewportView(table);

        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false);
        table.setGridColor(new Color(0xFFE3A7));
        
        Font defaultFont2 = table.getFont();
        Font font = defaultFont2.deriveFont(defaultFont2.getSize() + 1.5f); 
        table.setFont(font);
        table.getTableHeader().setFont(font);
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setBackground(new Color(0xFFE3A8));
        table.setDefaultRenderer(Object.class, renderer);
        
        for(int i=0; i <=50; i++){
            model.addRow(new Object[0]);
        }
        
        table.setDefaultEditor(Object.class, null);

        box_name_owner = new JTextField();
        box_name_pet = new JTextField();
        box_type = new JTextField();
        box_breed = new JTextField();
        box_age = new JTextField();
        box_sex = new JTextField();
        box_Chronic_illness = new JTextField();
        box_date = new JTextField();
        box_name_doctor = new JTextField();
        box_symptoms = new JTextField();
        box_diagnosis = new JTextField();
        box_treatment_methods = new JTextField();
        box_doctor_opinion = new JTextField();
        box_note = new JTextField();

        button_next = new JButton("Next");
        button_next.setFont(new Font("Jost", Font.BOLD, 15));
        button_plus = new JButton("+");
        button_next.addActionListener(this);

        getContentPane().add(scrollPane_main);
        fr_pet.add(pet_history);
        fr_pet.add(space1);
        fr_pet.add(name_owner);
        fr_pet.add(box_name_owner);
        fr_pet.add(name_pet);
        fr_pet.add(box_name_pet);
        fr_pet.add(space2);
        fr_pet.add(type);
        fr_pet.add(box_type);
        fr_pet.add(breed);
        fr_pet.add(box_breed);
        fr_pet.add(age);
        fr_pet.add(box_age);
        fr_pet.add(sex);
        fr_pet.add(box_sex);
        fr_pet.add(Chronic_illness);
        fr_pet.add(box_Chronic_illness);
        fr_pet.add(date);
        fr_pet.add(space3);
        fr_pet.add(space27);
        fr_pet.add(box_date);
        fr_pet.add(space11);
        fr_pet.add(treatment);
        fr_pet.add(space4);
        fr_pet.add(name_docter);
        fr_pet.add(space5);
        fr_pet.add(space12);
        fr_pet.add(box_name_doctor);
        fr_pet.add(space13);
        fr_pet.add(symptoms);
        fr_pet.add(space6);
        fr_pet.add(space14);
        fr_pet.add(box_symptoms);
        fr_pet.add(space15);
        fr_pet.add(diagnosis);
        fr_pet.add(space7);
        fr_pet.add(space16);
        fr_pet.add(box_diagnosis);
        fr_pet.add(space17);
        fr_pet.add(treatment_methods);
        fr_pet.add(space8);
        fr_pet.add(space18);
        fr_pet.add(box_treatment_methods);
        fr_pet.add(space19);
        fr_pet.add(doctor_opinion);
        fr_pet.add(space9);
        fr_pet.add(space20);
        fr_pet.add(box_doctor_opinion);
        fr_pet.add(space21);
        fr_pet.add(note);
        fr_pet.add(space10);
        fr_pet.add(space22);
        fr_pet.add(box_note);
        fr_pet.add(space23);
        fr_pet.add(scroll);
        fr_pet.add(space30);
        fr_pet.add(button_next);

        getContentPane().add(fr_pet);

        button_next.setBackground(Color.WHITE);
        button_plus.setBackground(Color.WHITE);
        setBackground(new Color(0xFFEEE3));
        fr_pet.setBackground(new Color(0xFFEEE3));
        space1.setBackground(new Color(0xFFEEE3));
        space2.setBackground(new Color(0xFFEEE3));
        space3.setBackground(new Color(0xFFEEE3));
        space4.setBackground(new Color(0xFFEEE3));
        space5.setBackground(new Color(0xFFEEE3));
        space6.setBackground(new Color(0xFFEEE3));
        space7.setBackground(new Color(0xFFEEE3));
        space8.setBackground(new Color(0xFFEEE3));
        space9.setBackground(new Color(0xFFEEE3));
        space10.setBackground(new Color(0xFFEEE3));
        space11.setBackground(new Color(0xFFEEE3));
        space12.setBackground(new Color(0xFFEEE3));
        space13.setBackground(new Color(0xFFEEE3));
        space14.setBackground(new Color(0xFFEEE3));
        space15.setBackground(new Color(0xFFEEE3));
        space16.setBackground(new Color(0xFFEEE3));
        space17.setBackground(new Color(0xFFEEE3));
        space18.setBackground(new Color(0xFFEEE3));
        space19.setBackground(new Color(0xFFEEE3));
        space20.setBackground(new Color(0xFFEEE3));
        space21.setBackground(new Color(0xFFEEE3));
        space22.setBackground(new Color(0xFFEEE3));
        space23.setBackground(new Color(0xFFEEE3));
        space24.setBackground(new Color(0xFFEEE3));
        space25.setBackground(new Color(0xFFEEE3));
        space26.setBackground(new Color(0xFFEEE3));
        space27.setBackground(new Color(0xFFEEE3));
        space28.setBackground(new Color(0xFFEEE3));
        space29.setBackground(new Color(0xFFEEE3));
        space30.setBackground(new Color(0xFFEEE3));

        space1.setPreferredSize(new Dimension(300, 10));
        space2.setPreferredSize(new Dimension(30, 10));
        space3.setPreferredSize(new Dimension(400, 10));
        space4.setPreferredSize(new Dimension(300, 10));
        space5.setPreferredSize(new Dimension(300, 10));
        space6.setPreferredSize(new Dimension(350, 10));
        space7.setPreferredSize(new Dimension(350, 10));
        space8.setPreferredSize(new Dimension(300, 10));
        space9.setPreferredSize(new Dimension(300, 10));
        space10.setPreferredSize(new Dimension(400, 10));
        space11.setPreferredSize(new Dimension(200, 10));
        space12.setPreferredSize(new Dimension(40, 10));
        space13.setPreferredSize(new Dimension(50, 10));
        space14.setPreferredSize(new Dimension(40, 10));
        space15.setPreferredSize(new Dimension(50, 10));
        space16.setPreferredSize(new Dimension(40, 10));
        space17.setPreferredSize(new Dimension(50, 10));
        space18.setPreferredSize(new Dimension(40, 10));
        space19.setPreferredSize(new Dimension(50, 10));
        space20.setPreferredSize(new Dimension(40, 10));
        space21.setPreferredSize(new Dimension(50, 10));
        space22.setPreferredSize(new Dimension(40, 10));
        space23.setPreferredSize(new Dimension(50, 10));
        space24.setPreferredSize(new Dimension(80, 10));
        space25.setPreferredSize(new Dimension(40, 10));
        space26.setPreferredSize(new Dimension(50, 10));
        space27.setPreferredSize(new Dimension(10, 10));
        space28.setPreferredSize(new Dimension(40, 10));
        space29.setPreferredSize(new Dimension(300, 10));
        space30.setPreferredSize(new Dimension(330, 10));

        box_name_owner.setPreferredSize(new Dimension(250, 20));
        box_name_pet.setPreferredSize(new Dimension(250, 20));
        box_type.setPreferredSize(new Dimension(120, 20));
        box_breed.setPreferredSize(new Dimension(120, 20));
        box_age.setPreferredSize(new Dimension(100, 20));
        box_sex.setPreferredSize(new Dimension(100, 20));
        box_Chronic_illness.setPreferredSize(new Dimension(280, 20));
        box_date.setPreferredSize(new Dimension(200, 20));
        box_name_doctor.setPreferredSize(new Dimension(370, 20));
        box_symptoms.setPreferredSize(new Dimension(370, 20));
        box_diagnosis.setPreferredSize(new Dimension(370, 20));
        box_treatment_methods.setPreferredSize(new Dimension(370, 20));
        box_doctor_opinion.setPreferredSize(new Dimension(370, 20));
        box_note.setPreferredSize(new Dimension(370, 20));

        button_next.setPreferredSize(new Dimension(80, 40));

        setSize(500, 750);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args){
        new details_admin_popup();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_next){
            dispose();
            new doctor_popup();
        }
    }
}
