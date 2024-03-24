
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Register implements KeyListener{
    private JFrame fr_register;
    private JPanel panel_main, empty1, empty2, empty3, empty4, empty5, empty6, 
empty7, empty8, empty9, empty10, empty11, empty12, empty13, empty14, empty15,
empty16, empty17, empty18, empty19, empty20, empty21, empty22, empty23, empty24,
empty25, empty26, empty27, empty28, empty29, empty30, empty31, empty32, empty33,
empty34, empty35, empty36, empty37, empty38, empty39, empty40, empty41, empty42,
empty43, empty44, empty45, empty46, empty47, empty48, empty49, empty50;
    private JTextField box_name, box_lastname, box_title, box_ethnicity, 
box_nation, box_religion, box_name_pet, box_type, box_species, box_birthday, 
box_disease, box_ageyear, box_agemonth, box_weight, box_raising, box_place, 
box_addres, box_alley, box_road, box_no, box_Sub_district, box_District,
 box_province, box_postal, box_phone, box_email, box_note, box_user, box_pass, box_confirm;
    private JLabel txt_register, txt_owner, txt_name, txt_last, txt_title, txt_gender, 
txt_male, txt_female, txt_other, txt_ethnicity, txt_nation, txt_religion, txt_name_pet, 
txt_type, txt_gen_pet, txt_male_pet, txt_female_pet, txt_idk, txt_species, txt_birthday, 
txt_disease, txt_ageyear, txt_agemonth, txt_weight, txt_raising, txt_place, txt_addres, 
txt_alley, txt_road, txt_no, txt_Sub_district, txt_District, txt_province, txt_postal, 
txt_phone, txt_email, txt_note, txt_user, txt_pass, txt_confirm, txt_pet_information, 
txt_Contact_information, txt_regis;
    private JRadioButton circle_male, circle_female, circle_other, circle_male_pet, 
circle_pet_female, circle_idk;
    private JScrollPane scrollpane;

    public Register() {
        fr_register = new JFrame();
        fr_register.setDefaultCloseOperation(fr_register.EXIT_ON_CLOSE);
        fr_register.setLayout(new GridLayout(1, 1));

        panel_main = new JPanel();
        empty1 = new JPanel();
        empty2 = new JPanel();
        empty3 = new JPanel();
        empty4 = new JPanel();
        empty5 = new JPanel();
        empty6 = new JPanel();
        empty7 = new JPanel();
        empty8 = new JPanel();
        empty9 = new JPanel();
        empty10 = new JPanel();
        empty11 = new JPanel();
        empty12 = new JPanel();
        empty13 = new JPanel();
        empty14 = new JPanel();
        empty15 = new JPanel();
        empty16 = new JPanel();
        empty17 = new JPanel();
        empty18 = new JPanel();
        empty19 = new JPanel();
        empty20 = new JPanel();
        empty21 = new JPanel();
        empty22 = new JPanel();
        empty23 = new JPanel();
        empty24 = new JPanel();
        empty25 = new JPanel();
        empty26 = new JPanel();
        empty27 = new JPanel();
        empty28 = new JPanel();
        empty29 = new JPanel();
        empty30 = new JPanel();
        empty31 = new JPanel();
        empty32 = new JPanel();
        empty33 = new JPanel();
        empty34 = new JPanel();
        empty35 = new JPanel();
        empty36 = new JPanel();
        empty37 = new JPanel();
        empty38 = new JPanel();
        empty39 = new JPanel();
        empty40 = new JPanel();
        empty41 = new JPanel();
        empty42 = new JPanel();
        empty43 = new JPanel();
        empty44 = new JPanel();
        empty45 = new JPanel();
        empty46 = new JPanel();
        empty47 = new JPanel();
        empty48 = new JPanel();
        empty49 = new JPanel();
        empty50 = new JPanel();

        panel_main.setLayout(new FlowLayout());

        box_name = new JTextField();
        box_lastname = new JTextField();
        box_title = new JTextField();
        box_ethnicity = new JTextField();
        box_nation = new JTextField();
        box_religion = new JTextField();
        box_name_pet = new JTextField();
        box_type = new JTextField();
        box_species = new JTextField();
        box_birthday = new JTextField();
        box_disease = new JTextField();
        box_ageyear = new JTextField();
        box_agemonth = new JTextField();
        box_weight = new JTextField();
        box_raising = new JTextField();
        box_place = new JTextField();
        box_addres = new JTextField();
        box_alley = new JTextField();
        box_road = new JTextField();
        box_no = new JTextField();
        box_Sub_district = new JTextField();
        box_District = new JTextField();
        box_province = new JTextField();
        box_postal = new JTextField();
        box_phone = new JTextField();
        box_email = new JTextField();
        box_note = new JTextField();
        box_user = new JTextField();
        box_pass = new JTextField();
        box_confirm = new JTextField();

        circle_male = new JRadioButton();
        circle_female = new JRadioButton();
        circle_other = new JRadioButton();
        circle_male_pet = new JRadioButton();
        circle_pet_female = new JRadioButton();
        circle_idk = new JRadioButton();

        txt_register = new JLabel("    Register");
        txt_owner = new JLabel("owner information");
        txt_name = new JLabel("name");
        txt_last = new JLabel("last name");
        txt_title = new JLabel("title");
        txt_gender = new JLabel("gender");
        txt_male = new JLabel("male");
        txt_female = new JLabel("female");
        txt_other = new JLabel("other");
        txt_ethnicity = new JLabel("ethnicity");
        txt_nation = new JLabel("nationality");
        txt_religion = new JLabel("religion");
        txt_name_pet = new JLabel("Name");
        txt_type = new JLabel("type");
        txt_gen_pet = new JLabel("gender");
        txt_male_pet = new JLabel("male");
        txt_female_pet = new JLabel("female");
        txt_idk = new JLabel("unaware");
        txt_species = new JLabel("species");
        txt_birthday = new JLabel("day/month/year");
        txt_disease = new JLabel("congenital disease");
        txt_ageyear = new JLabel("age year");
        txt_agemonth = new JLabel("age month");
        txt_weight = new JLabel("weight");
        txt_raising = new JLabel("Nature of raising");
        txt_place = new JLabel("Location");
        txt_addres = new JLabel("addres");
        txt_alley = new JLabel("alley");
        txt_road = new JLabel("road");
        txt_no = new JLabel("Village No.");
        txt_Sub_district = new JLabel("Sub-district");
        txt_District = new JLabel("District");
        txt_province = new JLabel("province");
        txt_postal = new JLabel("Postal Code");
        txt_phone = new JLabel("phone");
        txt_email = new JLabel("E-mail");
        txt_note = new JLabel("Note");
        txt_user = new JLabel("Username");
        txt_pass = new JLabel("Password");
        txt_confirm = new JLabel("Confirm Password");
        txt_pet_information = new JLabel("Pet Information");
        txt_Contact_information = new JLabel("Contact Information");
        txt_regis = new JLabel("Registration Information");

        panel_main.add(empty1);
        panel_main.add(txt_register);
        panel_main.add(txt_owner);
        panel_main.add(txt_name);
        panel_main.add(box_name);
        panel_main.add(txt_last);
        panel_main.add(box_lastname);
        panel_main.add(txt_title);
        panel_main.add(box_title);
        panel_main.add(txt_gender);
        panel_main.add(circle_male);
        panel_main.add(txt_male);
        panel_main.add(circle_female);
        panel_main.add(txt_female);
        panel_main.add(circle_other);
        panel_main.add(txt_other);
        panel_main.add(txt_ethnicity);
        panel_main.add(box_ethnicity);
        panel_main.add(txt_nation);
        panel_main.add(box_nation);
        panel_main.add(txt_religion);
        panel_main.add(box_religion);
        panel_main.add(txt_pet_information);
        panel_main.add(txt_name_pet);
        panel_main.add(box_name_pet);
        panel_main.add(txt_type);
        panel_main.add(box_type);
        panel_main.add(txt_species);
        panel_main.add(box_species);
        panel_main.add(txt_gen_pet);
        panel_main.add(circle_male_pet);
        panel_main.add(txt_male_pet);
        panel_main.add(circle_pet_female);
        panel_main.add(txt_female_pet);
        panel_main.add(circle_idk);
        panel_main.add(txt_idk);
        panel_main.add(txt_birthday);
        panel_main.add(box_birthday);
        panel_main.add(txt_disease);
        panel_main.add(box_disease);
        panel_main.add(txt_ageyear);
        panel_main.add(box_ageyear);
        panel_main.add(txt_agemonth);
        panel_main.add(box_agemonth);
        panel_main.add(txt_weight);
        panel_main.add(box_weight);
        panel_main.add(txt_raising);
        panel_main.add(box_raising);
        panel_main.add(txt_place);
        panel_main.add(box_place);
        panel_main.add(txt_Contact_information);
        panel_main.add(txt_addres);
        panel_main.add(box_addres);
        panel_main.add(txt_alley);
        panel_main.add(box_alley);
        panel_main.add(txt_no);
        panel_main.add(box_no);
        panel_main.add(txt_road);
        panel_main.add(box_road);
        panel_main.add(txt_Sub_district);
        panel_main.add(box_Sub_district);
        panel_main.add(txt_District);
        panel_main.add(box_District);
        panel_main.add(txt_province);
        panel_main.add(box_province);
        panel_main.add(txt_postal);
        panel_main.add(box_postal);
        panel_main.add(txt_phone);
        panel_main.add(box_phone);
        panel_main.add(txt_email);
        panel_main.add(box_email);
        panel_main.add(txt_note);
        panel_main.add(box_note);
        panel_main.add(txt_regis);
        panel_main.add(txt_user);
        panel_main.add(box_user);
        panel_main.add(txt_pass);
        panel_main.add(box_pass);
        panel_main.add(txt_confirm);
        panel_main.add(box_confirm);

        txt_register.setFont(new Font("Jost", Font.BOLD, 25));

        empty1.setPreferredSize(new Dimension(1000, 10));
        box_name.setPreferredSize(new Dimension(250, 20));
        box_lastname.setPreferredSize(new Dimension(250, 20));
        box_title.setPreferredSize(new Dimension(100, 20));
        box_ethnicity.setPreferredSize(new Dimension(150, 20));
        box_nation.setPreferredSize(new Dimension(150, 20));
        box_religion.setPreferredSize(new Dimension(150, 20));
        box_name_pet.setPreferredSize(new Dimension(250, 20));
        box_type.setPreferredSize(new Dimension(150, 20));
        box_species.setPreferredSize(new Dimension(150, 20));
        box_birthday.setPreferredSize(new Dimension(100, 20));
        box_disease.setPreferredSize(new Dimension(200, 20));
        box_ageyear.setPreferredSize(new Dimension(80, 20));
        box_agemonth.setPreferredSize(new Dimension(80, 20));
        box_weight.setPreferredSize(new Dimension(80, 20));
        box_raising.setPreferredSize(new Dimension(150, 20));
        box_place.setPreferredSize(new Dimension(150, 20));
        box_addres.setPreferredSize(new Dimension(300, 80));
        box_alley.setPreferredSize(new Dimension(70, 20));
        box_road.setPreferredSize(new Dimension(70, 20));
        box_no.setPreferredSize(new Dimension(70, 20));
        box_Sub_district.setPreferredSize(new Dimension(150, 20));
        box_District.setPreferredSize(new Dimension(150, 20));
        box_province.setPreferredSize(new Dimension(150, 20));
        box_postal.setPreferredSize(new Dimension(150, 20));
        box_phone.setPreferredSize(new Dimension(150, 20));
        box_email.setPreferredSize(new Dimension(250, 20));
        box_note.setPreferredSize(new Dimension(300, 60));
        box_user.setPreferredSize(new Dimension(300, 20));
        box_pass.setPreferredSize(new Dimension(300, 20));
        box_confirm.setPreferredSize(new Dimension(300, 20));
        box_confirm.addKeyListener(this);

        fr_register.add(panel_main);

        fr_register.setSize(1000, 750);
        fr_register.setVisible(true);
        fr_register.setResizable(false);
    }
    public static void main(String[] args){
        new Register();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        if (box_confirm.getText().length() > 2){
            box_confirm.setEditable(false);
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
