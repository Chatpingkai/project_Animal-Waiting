
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class details_admin_popup extends JFrame implements ActionListener{
    private JFrame fr;
    private JPanel fr_pet, space1, space2, space3, space4, space5, space6, space7, space8, space9, space10, space11, space12, space13, space14, space15, space16, space17, space18, space19, space20, space21, space22, space23, space24, space25, space26, space27, space28, space29, space30;
    private JTextField box_name_owner, box_name_pet, box_type, box_breed, box_age, box_sex, box_Chronic_illness, box_date, box_name_doctor, box_symptoms, box_diagnosis, box_treatment_methods, box_doctor_opinion, box_note, box_medicine, box_quantity, box_price;
    private JLabel pet_history, name_owner, name_pet, type, breed, age, sex, Chronic_illness, date, treatment, name_docter, symptoms, diagnosis, treatment_methods, doctor_opinion, note, medicine, quantity, price;
    private JButton button_plus, button_next;

    public details_admin_popup(){
        fr = new JFrame("treatment");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridLayout(1, 1));

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

        pet_history = new JLabel("  Pet History");
        pet_history.setFont(new Font("Jost", Font.BOLD, 25));
        name_owner = new JLabel("           Customer Name :");
        name_owner.setFont(new Font("Jost", Font.PLAIN, 15));
        name_pet = new JLabel("           Pet Name : ");
        name_pet.setFont(new Font("Jost", Font.PLAIN, 15));
        type = new JLabel("           Type of pet : ");
        type.setFont(new Font("Jost", Font.PLAIN, 15));
        breed = new JLabel("    Breed : ");
        breed.setFont(new Font("Jost", Font.PLAIN, 15));
        age = new JLabel("           Age of the pet : ");
        age.setFont(new Font("Jost", Font.PLAIN, 15));
        sex = new JLabel("  Gender : ");
        sex.setFont(new Font("Jost", Font.PLAIN, 15));
        Chronic_illness = new JLabel("           Chronic illness : ");
        Chronic_illness.setFont(new Font("Jost", Font.PLAIN, 15));
        date = new JLabel("  Date");
        date.setFont(new Font("Jost", Font.BOLD, 25));
        treatment = new JLabel("  Treatment");
        treatment.setFont(new Font("Jost", Font.BOLD, 25));
        name_docter = new JLabel("           Doctor's name");
        name_docter.setFont(new Font("Jost", Font.PLAIN, 15));
        symptoms = new JLabel("           Symptoms");
        symptoms.setFont(new Font("Jost", Font.PLAIN, 15));
        diagnosis = new JLabel("           Diagnosis");
        diagnosis.setFont(new Font("Jost", Font.PLAIN, 15));
        treatment_methods = new JLabel("           Treatment methods");
        treatment_methods.setFont(new Font("Jost", Font.PLAIN, 15));
        doctor_opinion = new JLabel("           Doctor's opinion");
        doctor_opinion.setFont(new Font("Jost", Font.PLAIN, 15));
        note = new JLabel("           Note");
        note.setFont(new Font("Jost", Font.PLAIN, 15));
        medicine = new JLabel("           Medicine");
        medicine.setFont(new Font("Jost", Font.PLAIN, 15));
        quantity = new JLabel("                                     Quantity");
        quantity.setFont(new Font("Jost", Font.PLAIN, 15));
        price = new JLabel("    Price");
        price.setFont(new Font("Jost", Font.PLAIN, 15));

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
        box_medicine = new JTextField();
        box_quantity = new JTextField();
        box_price = new JTextField();

        button_next = new JButton("Next");
        button_next.setFont(new Font("Jost", Font.BOLD, 15));
        button_plus = new JButton("+");
        button_next.addActionListener(this);

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
        fr_pet.add(medicine);
        fr_pet.add(quantity);
        fr_pet.add(price);
        fr_pet.add(space24);
        fr_pet.add(space25);
        fr_pet.add(box_medicine);
        fr_pet.add(box_quantity);
        fr_pet.add(box_price);
        fr_pet.add(space26);
        fr_pet.add(space28);
        fr_pet.add(button_plus);
        fr_pet.add(space29);
        fr_pet.add(space30);
        fr_pet.add(button_next);

        fr.add(fr_pet);

        button_next.setBackground(Color.WHITE);
        button_plus.setBackground(Color.WHITE);
        fr.setBackground(new Color(0xFFEEE3));
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
        box_medicine.setPreferredSize(new Dimension(200, 20));
        box_quantity.setPreferredSize(new Dimension(70, 20));
        box_price.setPreferredSize(new Dimension(70, 20));

        button_next.setPreferredSize(new Dimension(80, 40));

        fr.setSize(500, 750);
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_next){
            fr.dispose();
            new doctor_popup();
        }
    }
}
