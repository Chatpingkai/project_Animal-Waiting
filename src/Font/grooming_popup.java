package Font;


import back.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class grooming_popup implements ActionListener, MouseListener{
    private JFrame frame_grooming;
    private JTextField box_name_owner, box_name_pet, box_type, box_breed, box_age, 
box_sex, box_Chronic_illness, box_date, box_cutting, box_shower, box_amount;
    private JLabel pet_history, name_owner, name_pet, type, breed, age, sex, 
Chronic_illness, date, treatment, cutting, bathing, amount, details;
    private JButton button_submit;
    private JPanel p1, space1, space2, space3, space4, space5, space6, space9, 
space10, space11, space12, space13, space14, space15, space16, space17, space18, 
space19, space20, space21, space22, space23, space24, space25, space26, space27, 
space28, space29, space30, space31, space32, space33;
    private JTextArea box_details;
    private JScrollPane scroll;
    private GroomReipt groom_r;
    private Customer customer;
    public grooming_popup(GroomReipt groom_r){
        this.customer = groom_r.getCustomer();
        this.groom_r = groom_r;
        frame_grooming = new JFrame("Other Service Charge");
        frame_grooming.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame_grooming.setLayout(new GridLayout(1, 1));

        p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        space1 = new JPanel();
        space2 = new JPanel();
        space3 = new JPanel();
        space4 = new JPanel();
        space5 = new JPanel();
        space6 = new JPanel();
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
        space31 = new JPanel();
        space32 = new JPanel();
        space33 = new JPanel();

        pet_history = new JLabel("  ประวัติสัตว์เลี้ยง");
        pet_history.setFont(new Font("Tahoma", Font.BOLD, 25));
        name_owner = new JLabel("ชื่อลูกค้า :");
        name_owner.setFont(new Font("Tahoma", Font.PLAIN, 15));
        name_pet = new JLabel("ชื่อสัตวืเลี้ยง : ");
        name_pet.setFont(new Font("Tahoma", Font.PLAIN, 15));
        type = new JLabel("ประเภทของสัตว์เลี้ยง : ");
        type.setFont(new Font("Tahoma", Font.PLAIN, 15));
        breed = new JLabel("สายพันธุ์ : ");
        breed.setFont(new Font("Tahoma", Font.PLAIN, 15));
        age = new JLabel("  อายุของสัตว์เลี้ยง : ");
        age.setFont(new Font("Tahoma", Font.PLAIN, 15));
        sex = new JLabel("  เพศ : ");
        sex.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Chronic_illness = new JLabel("โรคประจำตัว : ");
        Chronic_illness.setFont(new Font("Tahoma", Font.PLAIN, 15));
        date = new JLabel("  วันที่");
        date.setFont(new Font("Tahoma", Font.BOLD, 25));
        treatment = new JLabel("  การบริการ");
        treatment.setFont(new Font("Tahoma", Font.BOLD, 25));
        cutting = new JLabel("ตัดขน");
        cutting.setFont(new Font("Tahoma", Font.PLAIN, 15));
        bathing = new JLabel("อาบน้ำ");
        bathing.setFont(new Font("Tahoma", Font.PLAIN, 15));
        amount = new JLabel("ยอดสุทธิ");
        amount.setFont(new Font("Tahoma", Font.PLAIN, 15));
        details = new JLabel("รายละเอียด");
        details.setFont(new Font("Tahoma", Font.PLAIN, 15));

        box_name_owner = new JTextField();
        box_name_pet = new JTextField();
        box_type = new JTextField();
        box_breed = new JTextField();
        box_age = new JTextField();
        box_sex = new JTextField();
        box_Chronic_illness = new JTextField();
        box_date = new JTextField();
        box_cutting = new JTextField();
        box_shower = new JTextField();
        box_amount = new JTextField();

        box_details = new JTextArea(null, 5, 46);
        box_details.setWrapStyleWord(true);
        box_details.setLineWrap(true);
        scroll = new JScrollPane(box_details);

        button_submit = new JButton("Submit");
        button_submit.setBackground(Color.WHITE);
        button_submit.setFont(new Font("Jost", Font.PLAIN, 15));

        p1.add(pet_history);
        p1.add(space1);
        p1.add(space2);
        p1.add(name_owner);
        p1.add(box_name_owner);
        p1.add(space3);
        p1.add(space4);
        p1.add(name_pet);
        p1.add(box_name_pet);
        p1.add(space5);
        p1.add(space6);
        p1.add(type);
        p1.add(box_type);
        p1.add(sex);
        p1.add(box_sex);
        p1.add(space33);
        p1.add(breed);
        p1.add(box_breed);
        p1.add(age);
        p1.add(box_age);
        p1.add(space9);
        p1.add(space10);
        p1.add(Chronic_illness);
        p1.add(box_Chronic_illness);
        p1.add(space11);
        p1.add(date);
        p1.add(space12);
        p1.add(space13);
        p1.add(box_date);
        p1.add(space14);
        p1.add(treatment);
        p1.add(space15);
        p1.add(space16);
        p1.add(cutting);
        p1.add(space17);
        p1.add(space18);
        p1.add(box_cutting);
        p1.add(space19);
        p1.add(space20);
        p1.add(bathing);
        p1.add(space21);
        p1.add(space22);
        p1.add(box_shower);
        p1.add(space23);
        p1.add(space24);
//        p1.add(amount);
        p1.add(space25);
        p1.add(space26);
//        p1.add(box_amount);
        p1.add(space27);
        p1.add(space28);
        p1.add(details);
        p1.add(space29);
        p1.add(space30);
        p1.add(scroll);
        p1.add(space31);
        p1.add(space32);
        p1.add(button_submit);

        frame_grooming.add(p1);

        p1.setBackground(new Color(0xFFEEE3));
        space1.setBackground(new Color(0xFFEEE3));
        space2.setBackground(new Color(0xFFEEE3));
        space3.setBackground(new Color(0xFFEEE3));
        space4.setBackground(new Color(0xFFEEE3));
        space5.setBackground(new Color(0xFFEEE3));
        space6.setBackground(new Color(0xFFEEE3));
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
        space31.setBackground(new Color(0xFFEEE3));
        space32.setBackground(new Color(0xFFEEE3));
        space33.setBackground(new Color(0xFFEEE3));

        space1.setPreferredSize(new Dimension(270, 10));
        space2.setPreferredSize(new Dimension(50, 10));
        space3.setPreferredSize(new Dimension(100, 10));
        space4.setPreferredSize(new Dimension(50, 10));
        space5.setPreferredSize(new Dimension(75, 10));
        space6.setPreferredSize(new Dimension(50, 10));
        space9.setPreferredSize(new Dimension(30, 10));
        space10.setPreferredSize(new Dimension(50, 10));
        space11.setPreferredSize(new Dimension(10, 10));
        space12.setPreferredSize(new Dimension(400, 10));
        space13.setPreferredSize(new Dimension(10, 10));
        space14.setPreferredSize(new Dimension(200, 10));
        space15.setPreferredSize(new Dimension(300, 10));
        space16.setPreferredSize(new Dimension(50, 10));
        space17.setPreferredSize(new Dimension(380, 10));
        space18.setPreferredSize(new Dimension(50, 10));
        space19.setPreferredSize(new Dimension(20, 10));
        space20.setPreferredSize(new Dimension(50, 10));
        space21.setPreferredSize(new Dimension(350, 10));
        space22.setPreferredSize(new Dimension(50, 10));
        space23.setPreferredSize(new Dimension(20, 10));
        space24.setPreferredSize(new Dimension(50, 10));
        space25.setPreferredSize(new Dimension(350, 10));
        space26.setPreferredSize(new Dimension(50, 10));
        space27.setPreferredSize(new Dimension(10, 10));
        space28.setPreferredSize(new Dimension(50, 10));
        space29.setPreferredSize(new Dimension(330, 10));
        space30.setPreferredSize(new Dimension(50, 10));
        space31.setPreferredSize(new Dimension(200, 10));
        space32.setPreferredSize(new Dimension(340, 10));
        space33.setPreferredSize(new Dimension(50, 10));

        box_name_owner.setPreferredSize(new Dimension(250, 20));
        box_name_pet.setPreferredSize(new Dimension(250, 20));
        box_type.setPreferredSize(new Dimension(120, 20));
        box_breed.setPreferredSize(new Dimension(120, 20));
        box_age.setPreferredSize(new Dimension(50, 20));
        box_sex.setPreferredSize(new Dimension(70, 20));
        box_Chronic_illness.setPreferredSize(new Dimension(280, 20));
        box_date.setPreferredSize(new Dimension(200, 20));
        box_cutting.setPreferredSize(new Dimension(375, 20));
        box_shower.setPreferredSize(new Dimension(375, 20));
        box_amount.setPreferredSize(new Dimension(375, 20));
        button_submit.setPreferredSize(new Dimension(100, 40));
        button_submit.addActionListener(this);
        setText();
        frame_grooming.setSize(500, 650);
        frame_grooming.setVisible(true);
        frame_grooming.setLocationRelativeTo(null);
        frame_grooming.setResizable(false);
        
    }
    public void setText(){
        Pet pet = customer.getPet();
        box_date.setText(groom_r.getDate());
        box_date.setEditable(false);
        box_name_owner.setText(customer.getFirstName()+" "+customer.getLastName());
        box_name_owner.setEditable(false);
        box_name_pet.setText(pet.getName());
        box_name_pet.setEditable(false);
        box_breed.setText(pet.getType());
        box_breed.setEditable(false);
        box_sex.setText(pet.getSex());
        box_sex.setEditable(false);
        box_type.setText(pet.getSpicies());
        box_type.setEditable(false);
        box_Chronic_illness.setText(pet.getDisease());
        box_Chronic_illness.setEditable(false);
        box_age.setText(pet.getAge());
        box_age.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button_submit)){
            groom_r.setCut(Double.parseDouble(box_cutting.getText()));
            groom_r.setShower(Double.parseDouble(box_shower.getText()));
            groom_r.setDetails(box_details.getText());
            groom_r.updatedb();
            frame_grooming.dispose();
        }
     }

    @Override
    public void mouseClicked(MouseEvent e) {
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
}
