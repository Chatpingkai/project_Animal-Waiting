package Font;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Properties;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;
import back.RegisterBackend;
import back.Connec_table;

public class Register implements ActionListener{
    private JFrame fr_register;
    private JPanel panel_main, empty2, empty3, empty4, empty5, empty6,
empty7, empty8, empty9, empty10, empty11, empty12, empty13, empty14, empty15,
empty16, empty17, empty18, empty19, empty20, empty21, empty22, empty23, empty24,
empty25, empty26, empty27, empty28, empty29, empty30, empty31, empty32, empty33,
empty34, empty35, empty36, empty37, empty38, empty39, empty40, empty41, empty42,
empty43, empty44, empty45, empty46, empty47, empty48, empty49, empty50, empty51,
empty52, empty53, empty54, empty55, empty56, empty57, empty58, empty59, empty60,
empty61, empty62, empty63, empty64, empty65, empty66, empty67, empty68, empty69,
empty70, empty71, empty72, empty73, empty74, empty75, empty76, empty77, empty78,
empty79, empty80, empty81, empty82, empty83, empty84, empty85, empty86, empty87,
empty88, empty89, empty90, empty91, empty92, empty93, empty94, empty95, empty96,
empty97;
    private JTextField box_name, box_lastname, box_ethnicity, 
box_nation, box_religion, box_name_pet, box_type, box_species, box_disease, 
box_ageyear, box_agemonth, box_weight, box_raising, box_place, box_addres, 
box_alley, box_road, box_no, box_Sub_district, box_District, box_province, 
box_postal, box_phone, box_email, box_note, box_user;
    private JLabel txt_register, txt_owner, txt_name, txt_last, txt_title, txt_gender, 
txt_ethnicity, txt_nation, txt_religion, txt_name_pet, 
txt_type, txt_gen_pet, txt_species, txt_birthday, 
txt_disease, txt_ageyear, txt_agemonth, txt_weight, txt_raising, txt_place, txt_addres, 
txt_alley, txt_road, txt_no, txt_Sub_district, txt_District, txt_province, txt_postal, 
txt_phone, txt_email, txt_note, txt_user, txt_pass, txt_confirm, txt_pet_information, 
txt_Contact_information, txt_regis;
    private JRadioButton circle_male, circle_female, circle_other, circle_male_pet, 
circle_pet_female, circle_idk;
    private JButton button_submit;
    private JComboBox box_title;
    private JPasswordField box_password, box_confirm;
    private ButtonGroup group1, group2;
    private UtilDateModel model;
    private Properties ppt;
    private JDatePicker box_birthday;

    public Register() {
        fr_register = new JFrame("Register");
        fr_register.setDefaultCloseOperation(fr_register.EXIT_ON_CLOSE);
        fr_register.setLayout(new GridLayout(1, 1));

        panel_main = new JPanel();
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
        empty51 = new JPanel();
        empty52 = new JPanel();
        empty53 = new JPanel();
        empty54 = new JPanel();
        empty55 = new JPanel();
        empty56 = new JPanel();
        empty57 = new JPanel();
        empty58 = new JPanel();
        empty59 = new JPanel();
        empty60 = new JPanel();
        empty61 = new JPanel();
        empty62 = new JPanel();
        empty63 = new JPanel();
        empty64 = new JPanel();
        empty65 = new JPanel();
        empty66 = new JPanel();
        empty67 = new JPanel();
        empty68 = new JPanel();
        empty69 = new JPanel();
        empty70 = new JPanel();
        empty71 = new JPanel();
        empty72 = new JPanel();
        empty73 = new JPanel();
        empty74 = new JPanel();
        empty75 = new JPanel();
        empty76 = new JPanel();
        empty77 = new JPanel();
        empty78 = new JPanel();
        empty79 = new JPanel();
        empty80 = new JPanel();
        empty81 = new JPanel();
        empty82 = new JPanel();
        empty83 = new JPanel();
        empty84 = new JPanel();
        empty85 = new JPanel();
        empty86 = new JPanel();
        empty87 = new JPanel();
        empty88 = new JPanel();
        empty89 = new JPanel();
        empty90 = new JPanel();
        empty91 = new JPanel();
        empty92 = new JPanel();
        empty93 = new JPanel();
        empty94 = new JPanel();
        empty95 = new JPanel();
        empty96 = new JPanel();
        empty97 = new JPanel();

        panel_main.setLayout(new FlowLayout());

        button_submit = new JButton("Submit");

        box_name = new JTextField();
        box_lastname = new JTextField();
        box_ethnicity = new JTextField();
        box_nation = new JTextField();
        box_religion = new JTextField();
        box_name_pet = new JTextField();
        box_type = new JTextField();
        box_species = new JTextField();
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
        box_title = new JComboBox();
        box_title.addItem("นาย");
        box_title.addItem("นาง");
        box_title.addItem("นางสาว");
        box_title.addItem("ด.ช.");
        box_title.addItem("ด.ญ.");
        box_title.setSelectedItem(null);
        box_password = new JPasswordField();
        box_confirm = new JPasswordField();

        group1 = new ButtonGroup();
        group2 = new ButtonGroup();

        circle_male = new JRadioButton("ชาย");
        circle_female = new JRadioButton("หญิง");
        circle_other = new JRadioButton("อื่น ๆ");
        circle_male_pet = new JRadioButton("ตัวผู้");
        circle_pet_female = new JRadioButton("ตัวเมีย");
        circle_idk = new JRadioButton("ไม่ทราบ");
        group1.add(circle_male);
        group1.add(circle_female);
        group1.add(circle_other);
        group2.add(circle_male_pet);
        group2.add(circle_pet_female);
        group2.add(circle_idk);

        model = new UtilDateModel();
        ppt = new Properties();
        ppt.put("text.today", "วันนี้");
        ppt.put("text.month", "เดือน");
        ppt.put("text.year", "ปี");
        box_birthday = new JDatePicker(model);

        txt_register = new JLabel("   Register");
        txt_owner = new JLabel("ข้อมูลเจ้าของ");
        txt_name = new JLabel("ชื่อ");
        txt_last = new JLabel("นามสกุล");
        txt_title = new JLabel("คำนำหน้า");
        txt_gender = new JLabel("เพศ");
        txt_ethnicity = new JLabel("เชื้อชาติ");
        txt_nation = new JLabel("สัญชาติ");
        txt_religion = new JLabel("ศาสนา");
        txt_name_pet = new JLabel("ชื่อสัตว์เลี้ยง");
        txt_type = new JLabel("ชนิดสัตว์เลี้ยง");
        txt_gen_pet = new JLabel("เพศ");
        txt_species = new JLabel("สายพันธุ์");
        txt_birthday = new JLabel("วัน-เดือน/ปี เกิด");
        txt_disease = new JLabel("โรคประจำตัว");
        txt_ageyear = new JLabel("อายุปี");
        txt_agemonth = new JLabel("อายุเดือน");
        txt_weight = new JLabel("น้ำหนัก");
        txt_raising = new JLabel("ลักษณะการเลี้ยงดู");
        txt_place = new JLabel("สถานที่ที่เลี้ยง");
        txt_addres = new JLabel("ที่อยู่");
        txt_alley = new JLabel("ซอย");
        txt_road = new JLabel("ถนน");
        txt_no = new JLabel("หมู่ที่");
        txt_Sub_district = new JLabel("ตำบล");
        txt_District = new JLabel("อำเภอ");
        txt_province = new JLabel("จังหวัด");
        txt_postal = new JLabel("รหัสไปรษณีย์");
        txt_phone = new JLabel("เบอร์โทรศัพท์");
        txt_email = new JLabel("E-mail");
        txt_note = new JLabel("หมายเหตุ");
        txt_user = new JLabel("Username    ");
        txt_pass = new JLabel("Password     ");
        txt_confirm = new JLabel("Confirm Password     ");
        txt_pet_information = new JLabel("ข้อมูลสัตว์เลี้ยง");
        txt_Contact_information = new JLabel("ข้อมูลติดต่อ");
        txt_regis = new JLabel("ข้อมูลลงทะเบียน");

        panel_main.add(txt_register);
        panel_main.add(empty2);
        panel_main.add(empty3);
        panel_main.add(txt_owner);
        panel_main.add(empty4);
        panel_main.add(empty5);
        panel_main.add(txt_title);
        panel_main.add(empty6);
        panel_main.add(txt_name);
        panel_main.add(empty7);
        panel_main.add(txt_last);
        panel_main.add(empty8);
        panel_main.add(empty9);
        panel_main.add(box_title);
        panel_main.add(empty10);
        panel_main.add(box_name);
        panel_main.add(empty11);
        panel_main.add(box_lastname);
        panel_main.add(empty12);
        panel_main.add(empty13);
        panel_main.add(txt_ethnicity);
        panel_main.add(empty14);
        panel_main.add(txt_nation);
        panel_main.add(empty15);
        panel_main.add(txt_religion);
        panel_main.add(empty16);
        panel_main.add(txt_gender);
        panel_main.add(empty17);
        panel_main.add(empty21);
        panel_main.add(box_ethnicity);
        panel_main.add(empty18);
        panel_main.add(box_nation);
        panel_main.add(empty19);
        panel_main.add(box_religion);
        panel_main.add(empty20);
        panel_main.add(circle_male);
        panel_main.add(circle_female);
        panel_main.add(circle_other);
        panel_main.add(empty22);

        panel_main.add(empty23);
        panel_main.add(txt_pet_information);
        panel_main.add(empty24);
        panel_main.add(empty25);
        panel_main.add(txt_name_pet);
        panel_main.add(empty26);
        panel_main.add(txt_type);
        panel_main.add(empty27);
        panel_main.add(txt_species);
        panel_main.add(empty28);
        panel_main.add(empty29);
        panel_main.add(box_name_pet);
        panel_main.add(empty30);
        panel_main.add(box_type);
        panel_main.add(empty31);
        panel_main.add(box_species);
        panel_main.add(empty32);
        panel_main.add(empty33);
        panel_main.add(txt_gen_pet);
        panel_main.add(empty34);
        panel_main.add(txt_birthday);
        panel_main.add(empty35);
        panel_main.add(txt_weight);
        panel_main.add(empty36);
        panel_main.add(empty37);
        panel_main.add(circle_male_pet);
        panel_main.add(circle_pet_female);
        panel_main.add(circle_idk);
        panel_main.add(empty38);
        panel_main.add(box_birthday);
        panel_main.add(empty39);
        panel_main.add(box_weight);
        panel_main.add(empty40);
        panel_main.add(empty41);
        panel_main.add(txt_disease);
        panel_main.add(empty42);
        panel_main.add(txt_ageyear);
        panel_main.add(empty43);
        panel_main.add(txt_agemonth);
        panel_main.add(empty44);
        panel_main.add(empty45);
        panel_main.add(box_disease);
        panel_main.add(empty46);
        panel_main.add(box_ageyear);
        panel_main.add(empty47);
        panel_main.add(box_agemonth);
        panel_main.add(empty48);
        panel_main.add(empty49);
        panel_main.add(txt_raising);
        panel_main.add(empty50);
        panel_main.add(txt_place);
        panel_main.add(empty51);
        panel_main.add(empty52);
        panel_main.add(box_raising);
        panel_main.add(empty53);
        panel_main.add(box_place);
        panel_main.add(empty54);

        panel_main.add(empty55);
        panel_main.add(txt_Contact_information);
        panel_main.add(empty56);
        panel_main.add(empty57);
        panel_main.add(txt_addres);
        panel_main.add(empty58);
        panel_main.add(empty59);
        panel_main.add(box_addres);
        panel_main.add(empty60);
        panel_main.add(empty88);
        panel_main.add(txt_alley);
        panel_main.add(empty61);
        panel_main.add(txt_no);
        panel_main.add(empty62);
        panel_main.add(txt_road);
        panel_main.add(empty63);
        panel_main.add(empty64);
        panel_main.add(box_alley);
        panel_main.add(empty65);
        panel_main.add(box_no);
        panel_main.add(empty66);
        panel_main.add(box_road);
        panel_main.add(empty67);
        panel_main.add(empty68);
        panel_main.add(txt_Sub_district);
        panel_main.add(empty69);
        panel_main.add(txt_District);
        panel_main.add(empty70);
        panel_main.add(txt_province);
        panel_main.add(empty71);
        panel_main.add(empty72);
        panel_main.add(box_Sub_district);
        panel_main.add(empty73);
        panel_main.add(box_District);
        panel_main.add(empty74);
        panel_main.add(box_province);
        panel_main.add(empty75);
        panel_main.add(empty76);
        panel_main.add(txt_postal);
        panel_main.add(empty77);
        panel_main.add(txt_phone);
        panel_main.add(empty78);
        panel_main.add(txt_email);
        panel_main.add(empty79);
        panel_main.add(empty80);
        panel_main.add(box_postal);
        panel_main.add(empty81);
        panel_main.add(box_phone);
        panel_main.add(empty82);
        panel_main.add(box_email);
        panel_main.add(empty83);
        panel_main.add(empty84);
        panel_main.add(txt_note);
        panel_main.add(empty85);
        panel_main.add(empty86);
        panel_main.add(box_note);
        panel_main.add(empty87);

        panel_main.add(empty89);
        panel_main.add(txt_regis);
        panel_main.add(empty90);
        panel_main.add(empty91);
        panel_main.add(txt_user);
        panel_main.add(box_user);
        panel_main.add(empty92);
        panel_main.add(empty93);
        panel_main.add(txt_pass);
        panel_main.add(box_password);
        panel_main.add(empty94);
        panel_main.add(empty95);
        panel_main.add(txt_confirm);
        panel_main.add(box_confirm);
        panel_main.add(empty96);
        panel_main.add(empty97);
        panel_main.add(button_submit);

        txt_register.setFont(new Font("Jost", Font.BOLD, 38));
        txt_owner.setFont(new Font("Tahoma", Font.BOLD, 15));
        txt_pet_information.setFont(new Font("Tahoma", Font.BOLD, 15));
        txt_Contact_information.setFont(new Font("Tahoma", Font.BOLD, 15));
        txt_regis.setFont(new Font("Tahoma", Font.BOLD, 15));
        button_submit.setBackground(Color.WHITE);
        button_submit.setFont(new Font("Jost", Font.BOLD, 15));
        txt_name.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_last.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_title.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_ethnicity.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_nation.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_religion.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_name_pet.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_type.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_gen_pet.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_species.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_birthday.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_disease.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_ageyear.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_agemonth.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_weight.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_raising.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_place.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_addres.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_alley.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_road.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_no.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_Sub_district.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_District.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_province.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_postal.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_phone.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_email.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_note.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_user.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_pass.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_confirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
        circle_male.setFont(new Font("Tahoma", Font.PLAIN, 15));
        circle_female.setFont(new Font("Tahoma", Font.PLAIN, 15));
        circle_other.setFont(new Font("Tahoma", Font.PLAIN, 15));
        circle_male_pet.setFont(new Font("Tahoma", Font.PLAIN, 15));
        circle_pet_female.setFont(new Font("Tahoma", Font.PLAIN, 15));
        circle_idk.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_title.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_name.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_lastname.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_ethnicity.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_nation.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_religion.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_name_pet.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_type.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_species.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_birthday.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_disease.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_ageyear.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_agemonth.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_weight.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_raising.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_place.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_addres.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_alley.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_road.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_no.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_Sub_district.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_District.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_province.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_postal.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_phone.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_email.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_note.setFont(new Font("Tahoma", Font.PLAIN, 15));
        box_user.setFont(new Font("Tahoma", Font.PLAIN, 15));

//space regis
        empty2.setPreferredSize(new Dimension(780, 10));
//space owner information
        empty3.setPreferredSize(new Dimension(80, 10));
        empty4.setPreferredSize(new Dimension(790, 10));
//space name
        empty5.setPreferredSize(new Dimension(120, 10));
        empty6.setPreferredSize(new Dimension(123, 10));
        empty7.setPreferredSize(new Dimension(315, 10));
        empty8.setPreferredSize(new Dimension(252, 10));
//space box name
        empty9.setPreferredSize(new Dimension(120, 10));
        empty10.setPreferredSize(new Dimension(83, 10));
        empty11.setPreferredSize(new Dimension(80, 10));
        empty12.setPreferredSize(new Dimension(57, 10));
//space gender
        empty13.setPreferredSize(new Dimension(120, 10));
        empty14.setPreferredSize(new Dimension(135, 10));
        empty15.setPreferredSize(new Dimension(130, 10));
        empty16.setPreferredSize(new Dimension(160, 10));
        empty17.setPreferredSize(new Dimension(225, 10));
//space box gender
        empty18.setPreferredSize(new Dimension(35, 10));
        empty19.setPreferredSize(new Dimension(25, 10));
        empty20.setPreferredSize(new Dimension(45, 10));
        empty21.setPreferredSize(new Dimension(120, 10));
        empty22.setPreferredSize(new Dimension(85, 10));

        empty2.setBackground(new Color(0xFFEEE3));
        empty3.setBackground(new Color(0xFFEEE3));
        empty4.setBackground(new Color(0xFFEEE3));
        empty5.setBackground(new Color(0xFFEEE3));
        empty6.setBackground(new Color(0xFFEEE3));
        empty7.setBackground(new Color(0xFFEEE3));
        empty8.setBackground(new Color(0xFFEEE3));
        empty9.setBackground(new Color(0xFFEEE3));
        empty10.setBackground(new Color(0xFFEEE3));
        empty11.setBackground(new Color(0xFFEEE3));
        empty12.setBackground(new Color(0xFFEEE3));
        empty13.setBackground(new Color(0xFFEEE3));
        empty14.setBackground(new Color(0xFFEEE3));
        empty15.setBackground(new Color(0xFFEEE3));
        empty16.setBackground(new Color(0xFFEEE3));
        empty17.setBackground(new Color(0xFFEEE3));
        empty18.setBackground(new Color(0xFFEEE3));
        empty19.setBackground(new Color(0xFFEEE3));
        empty20.setBackground(new Color(0xFFEEE3));
        empty21.setBackground(new Color(0xFFEEE3));
        empty22.setBackground(new Color(0xFFEEE3));

//space pet information
        empty23.setPreferredSize(new Dimension(80, 10));
        empty24.setPreferredSize(new Dimension(770, 10));
//space name pet
        empty25.setPreferredSize(new Dimension(120, 10));
        empty26.setPreferredSize(new Dimension(250, 10));
        empty27.setPreferredSize(new Dimension(168, 10));
        empty28.setPreferredSize(new Dimension(192, 10));
//space box name pet
        empty29.setPreferredSize(new Dimension(120, 10));
        empty30.setPreferredSize(new Dimension(73, 10));
        empty31.setPreferredSize(new Dimension(100, 10));
        empty32.setPreferredSize(new Dimension(97, 10));
//space gender
        empty33.setPreferredSize(new Dimension(120, 10));
        empty34.setPreferredSize(new Dimension(300, 10));
        empty35.setPreferredSize(new Dimension(153, 10));
        empty36.setPreferredSize(new Dimension(202, 10));
//space box gender
        empty37.setPreferredSize(new Dimension(115, 10));
        empty38.setPreferredSize(new Dimension(129, 10));
        empty39.setPreferredSize(new Dimension(150, 10));
        empty40.setPreferredSize(new Dimension(166, 10));
//space age
        empty41.setPreferredSize(new Dimension(120, 10));
        empty42.setPreferredSize(new Dimension(250, 10));
        empty43.setPreferredSize(new Dimension(215, 10));
        empty44.setPreferredSize(new Dimension(190, 10));
//space box age
        empty45.setPreferredSize(new Dimension(120, 10));
        empty46.setPreferredSize(new Dimension(25, 10));
        empty47.setPreferredSize(new Dimension(170, 10));
        empty48.setPreferredSize(new Dimension(170, 10));
//space place
        empty49.setPreferredSize(new Dimension(120, 10));
        empty50.setPreferredSize(new Dimension(213, 10));
        empty51.setPreferredSize(new Dimension(422, 10));
//box place
        empty52.setPreferredSize(new Dimension(120, 10));
        empty53.setPreferredSize(new Dimension(175, 10));
        empty54.setPreferredSize(new Dimension(360, 10));

        empty23.setBackground(new Color(0xFFEEE3));
        empty24.setBackground(new Color(0xFFEEE3));
        empty25.setBackground(new Color(0xFFEEE3));
        empty26.setBackground(new Color(0xFFEEE3));
        empty27.setBackground(new Color(0xFFEEE3));
        empty28.setBackground(new Color(0xFFEEE3));
        empty29.setBackground(new Color(0xFFEEE3));
        empty30.setBackground(new Color(0xFFEEE3));
        empty31.setBackground(new Color(0xFFEEE3));
        empty32.setBackground(new Color(0xFFEEE3));
        empty33.setBackground(new Color(0xFFEEE3));
        empty34.setBackground(new Color(0xFFEEE3));
        empty35.setBackground(new Color(0xFFEEE3));
        empty36.setBackground(new Color(0xFFEEE3));
        empty37.setBackground(new Color(0xFFEEE3));
        empty38.setBackground(new Color(0xFFEEE3));
        empty39.setBackground(new Color(0xFFEEE3));
        empty40.setBackground(new Color(0xFFEEE3));
        empty41.setBackground(new Color(0xFFEEE3));
        empty42.setBackground(new Color(0xFFEEE3));
        empty43.setBackground(new Color(0xFFEEE3));
        empty44.setBackground(new Color(0xFFEEE3));
        empty45.setBackground(new Color(0xFFEEE3));
        empty46.setBackground(new Color(0xFFEEE3));
        empty47.setBackground(new Color(0xFFEEE3));
        empty48.setBackground(new Color(0xFFEEE3));
        empty49.setBackground(new Color(0xFFEEE3));
        empty50.setBackground(new Color(0xFFEEE3));
        empty51.setBackground(new Color(0xFFEEE3));
        empty52.setBackground(new Color(0xFFEEE3));
        empty53.setBackground(new Color(0xFFEEE3));
        empty54.setBackground(new Color(0xFFEEE3));

//space contact
        empty55.setPreferredSize(new Dimension(80, 10));
        empty56.setPreferredSize(new Dimension(795, 10));
//space address
        empty57.setPreferredSize(new Dimension(115, 10));
        empty58.setPreferredSize(new Dimension(810, 10));
//space box address
        empty59.setPreferredSize(new Dimension(115, 10));
        empty60.setPreferredSize(new Dimension(240, 10));
//space road
        empty88.setPreferredSize(new Dimension(120, 10));
        empty61.setPreferredSize(new Dimension(200, 10));
        empty62.setPreferredSize(new Dimension(185, 10));
        empty63.setPreferredSize(new Dimension(355, 10));
//space box rode
        empty64.setPreferredSize(new Dimension(115, 10));
        empty65.setPreferredSize(new Dimension(80, 10));
        empty66.setPreferredSize(new Dimension(145, 10));
        empty67.setPreferredSize(new Dimension(130, 10));
//space province
        empty68.setPreferredSize(new Dimension(120, 10));
        empty69.setPreferredSize(new Dimension(195, 10));
        empty70.setPreferredSize(new Dimension(175, 10));
        empty71.setPreferredSize(new Dimension(345, 10));
//space box province
        empty72.setPreferredSize(new Dimension(115, 10));
        empty73.setPreferredSize(new Dimension(80, 10));
        empty74.setPreferredSize(new Dimension(65, 10));
        empty75.setPreferredSize(new Dimension(235, 10));
//space email
        empty76.setPreferredSize(new Dimension(120, 10));
        empty77.setPreferredSize(new Dimension(150, 10));
        empty78.setPreferredSize(new Dimension(130, 10));
        empty79.setPreferredSize(new Dimension(345, 10));
//space box email
        empty80.setPreferredSize(new Dimension(115, 10));
        empty81.setPreferredSize(new Dimension(80, 10));
        empty82.setPreferredSize(new Dimension(67, 10));
        empty83.setPreferredSize(new Dimension(133, 10));
//space note
        empty84.setPreferredSize(new Dimension(115, 10));
        empty85.setPreferredSize(new Dimension(790, 10));
//space box note
        empty86.setPreferredSize(new Dimension(115, 10));
        empty87.setPreferredSize(new Dimension(150, 10));

        empty55.setBackground(new Color(0xFFEEE3));
        empty56.setBackground(new Color(0xFFEEE3));
        empty57.setBackground(new Color(0xFFEEE3));
        empty58.setBackground(new Color(0xFFEEE3));
        empty59.setBackground(new Color(0xFFEEE3));
        empty60.setBackground(new Color(0xFFEEE3));
        empty61.setBackground(new Color(0xFFEEE3));
        empty62.setBackground(new Color(0xFFEEE3));
        empty63.setBackground(new Color(0xFFEEE3));
        empty64.setBackground(new Color(0xFFEEE3));
        empty65.setBackground(new Color(0xFFEEE3));
        empty66.setBackground(new Color(0xFFEEE3));
        empty67.setBackground(new Color(0xFFEEE3));
        empty68.setBackground(new Color(0xFFEEE3));
        empty69.setBackground(new Color(0xFFEEE3));
        empty70.setBackground(new Color(0xFFEEE3));
        empty71.setBackground(new Color(0xFFEEE3));
        empty72.setBackground(new Color(0xFFEEE3));
        empty73.setBackground(new Color(0xFFEEE3));
        empty74.setBackground(new Color(0xFFEEE3));
        empty75.setBackground(new Color(0xFFEEE3));
        empty76.setBackground(new Color(0xFFEEE3));
        empty77.setBackground(new Color(0xFFEEE3));
        empty78.setBackground(new Color(0xFFEEE3));
        empty79.setBackground(new Color(0xFFEEE3));
        empty80.setBackground(new Color(0xFFEEE3));
        empty81.setBackground(new Color(0xFFEEE3));
        empty82.setBackground(new Color(0xFFEEE3));
        empty83.setBackground(new Color(0xFFEEE3));
        empty84.setBackground(new Color(0xFFEEE3));
        empty85.setBackground(new Color(0xFFEEE3));
        empty86.setBackground(new Color(0xFFEEE3));
        empty87.setBackground(new Color(0xFFEEE3));
        empty88.setBackground(new Color(0xFFEEE3));

//space regis
        empty89.setPreferredSize(new Dimension(80, 10));
        empty90.setPreferredSize(new Dimension(765, 10));
//space username
        empty91.setPreferredSize(new Dimension(120, 10));
        empty92.setPreferredSize(new Dimension(390, 10));
//space password
        empty93.setPreferredSize(new Dimension(120, 10));
        empty94.setPreferredSize(new Dimension(390, 10));
//space confirm
        empty95.setPreferredSize(new Dimension(120, 10));
        empty96.setPreferredSize(new Dimension(390, 10));
//space button
        empty97.setPreferredSize(new Dimension(600, 10));

        empty89.setBackground(new Color(0xFFEEE3));
        empty90.setBackground(new Color(0xFFEEE3));
        empty91.setBackground(new Color(0xFFEEE3));
        empty92.setBackground(new Color(0xFFEEE3));
        empty93.setBackground(new Color(0xFFEEE3));
        empty94.setBackground(new Color(0xFFEEE3));
        empty95.setBackground(new Color(0xFFEEE3));
        empty96.setBackground(new Color(0xFFEEE3));
        empty97.setBackground(new Color(0xFFEEE3));

        circle_male.setBackground(new Color(0xFFEEE3));
        circle_female.setBackground(new Color(0xFFEEE3));
        circle_other.setBackground(new Color(0xFFEEE3));
        circle_male_pet.setBackground(new Color(0xFFEEE3));
        circle_pet_female .setBackground(new Color(0xFFEEE3));
        circle_idk.setBackground(new Color(0xFFEEE3));

        box_name.setPreferredSize(new Dimension(250, 25));
        box_lastname.setPreferredSize(new Dimension(250, 25));
        box_title.setPreferredSize(new Dimension(100, 25));
        box_ethnicity.setPreferredSize(new Dimension(150, 25));
        box_nation.setPreferredSize(new Dimension(150, 25));
        box_religion.setPreferredSize(new Dimension(150, 25));
        box_name_pet.setPreferredSize(new Dimension(250, 25));
        box_type.setPreferredSize(new Dimension(150, 25));
        box_species.setPreferredSize(new Dimension(150, 25));
        box_birthday.setPreferredSize(new Dimension(100, 25));
        box_disease.setPreferredSize(new Dimension(300, 25));
        box_ageyear.setPreferredSize(new Dimension(80, 25));
        box_agemonth.setPreferredSize(new Dimension(80, 25));
        box_weight.setPreferredSize(new Dimension(80, 25));
        box_raising.setPreferredSize(new Dimension(150, 25));
        box_place.setPreferredSize(new Dimension(150, 25));
        box_addres.setPreferredSize(new Dimension(600, 25));
        box_alley.setPreferredSize(new Dimension(150, 25));
        box_road.setPreferredSize(new Dimension(250, 25));
        box_no.setPreferredSize(new Dimension(70, 25));
        box_Sub_district.setPreferredSize(new Dimension(150, 25));
        box_District.setPreferredSize(new Dimension(150, 25));
        box_province.setPreferredSize(new Dimension(150, 25));
        box_postal.setPreferredSize(new Dimension(150, 25));
        box_phone.setPreferredSize(new Dimension(150, 25));
        box_email.setPreferredSize(new Dimension(250, 25));
        box_note.setPreferredSize(new Dimension(700, 25));
        box_user.setPreferredSize(new Dimension(355, 25));
        box_password.setPreferredSize(new Dimension(355, 25));
        box_confirm.setPreferredSize(new Dimension(300, 25));
        button_submit.setPreferredSize(new Dimension(100, 40));
        box_addres.setFont(new Font("Tahoma", Font.PLAIN, 13));

        button_submit.addActionListener(this);

        fr_register.add(panel_main);

        panel_main.setBackground(new Color(0xFFEEE3));
        fr_register.setSize(1000, 950);
        fr_register.setVisible(true);
        fr_register.setLocationRelativeTo(null);
        fr_register.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_submit){
            String sexP = "อื่นๆ";
            String sexPet = "ไม่ทราบ";
            if(this.circle_male.isSelected()) { sexP = "ชาย"; } 
            else if (this.circle_female.isSelected()) { sexP = "หญิง";}
            else if (this.circle_other.isSelected()) { sexP = "อื่นๆ"; }
            if (this.circle_male_pet.isSelected()) { sexPet = "ตัวผู้"; }
            else if (this.circle_pet_female.isSelected()) { sexPet = "ตัวเมีย"; }
            else if (this.circle_idk.isSelected()) { sexPet = "ไม่ทราบ"; }
            String password = new String(box_password.getPassword());
            String confirm = new String(box_confirm.getPassword());
            if (password.equals(confirm)) {
                System.out.println("Yes");
                RegisterBackend rb = new RegisterBackend(
                        this.box_title.getSelectedItem()+"",
                        this.box_name.getText(),
                        this.box_lastname.getText(),
                        this.box_ethnicity.getText(),
                        this.box_nation.getText(),
                        this.box_religion.getText(),
                        sexP,
                        this.box_name_pet.getText(),
                        this.box_type.getText(),
                        this.box_species.getText(),
                        sexPet,
                        box_birthday.getModel().getYear()+"-"+box_birthday.getModel().getMonth()+"-"+box_birthday.getModel().getDay()+"",
                        Double.parseDouble(this.box_weight.getText()),
                        this.box_disease.getText(),
                        Integer.parseInt(this.box_ageyear.getText()),
                        Integer.parseInt(this.box_agemonth.getText()),
                        this.box_raising.getText(),
                        this.box_place.getText(),
                        this.box_addres.getText(),
                        this.box_alley.getText(),
                        this.box_no.getText(),
                        this.box_road.getText(),
                        this.box_Sub_district.getText(),
                        this.box_District.getText(),
                        this.box_province.getText(),
                        this.box_postal.getText(),
                        this.box_phone.getText(),
                        this.box_email.getText(),
                        this.box_note.getText(),
                        this.box_user.getText(),
                        password
                );
                rb.writeDB();
                fr_register.dispose();
                new Login();
            } else {
                System.out.println("Password not match!");
            }
        }
    }
}
