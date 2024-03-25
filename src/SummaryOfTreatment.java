import java.awt.*;
import java.awt.event.ActionListener;
import static java.awt.Color.*;
import java.awt.event.ActionEvent;
import java.text.*;
import javax.swing.*;
import java.util.*;

public class SummaryOfTreatment implements ActionListener{
    private JFrame frame;
    private JPanel panelTreatment_M, panelTrCost, panel1, panel2, panelreceipt, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12, panel9_1, panelsumPureAmountTH, 
    panelpureAmount, panelsumPureAmount, panel13, panel14, panel15, paneldescription, panelamount, paneldescriptionData, panelamountData, panelnameO, 
    panelnameA, paneltype, paneladdress, panelpayee, panelsignature, panelAll, panelAllHistory, panelAllTreatmen, panelHistory_t, panelTreatment_t, 
    panelHistory, panelHistory1, panelHistory2, panelTreatment, panelTreatment1, panelTreatment2,panelNameOw, panelNameAn, panelTypeA, panelSpecies,
    panelAgeA, panelGenderA, panelChronicDisease, panelnameOW_A, panelTS, panelAG, panelTreatment2_1, panelTreatment2_2,panelDateOfTreatment, panelDoctor,
    panelSymptom, panelDiagnosis, panelTreatmentt, panelDoctorOpinion;
    private JMenuBar menuBar;
    private JMenu treatment, trCosts;
    private JLabel pureAmount, description, amount, sumPureAmountTH, nameO, nameA, type, address, payee, signature, receipt, historyA_t, treatment_t, 
    nameOw, nameAn, typeA, species, ageA, genderA, chronicDisease,dateOfTreatment, doctor, symptom, diagnosis, treatmentt, doctorOpinion;
    private JTextArea descriptionData, amountData, sumPureAmount, thenameO, theNameA, theType, theAddrass, thePayee,  textSymptom, textDiagnosis, textTreatmentt, textDoctorOpinion;
    private JTextField textNameOw, textNameAn, textTypeA, textSpecies, textAgeA, textGenderA, textChronicDisease,
    textDateOfTreatment, textDoctor;
    public static void main(String[] args) {
        new SummaryOfTreatment();
    }
    public SummaryOfTreatment(){
        frame = new JFrame("สรุป");

        //
        //
        //การรักษา
        //
        //
        panelTreatment_M = new JPanel(new BorderLayout());
        panel1 = new JPanel(new BorderLayout());
        panel2 = new JPanel(new BorderLayout()); 
        panelreceipt = new JPanel();
        panel4 = new JPanel(new GridLayout(2,2));
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel(new BorderLayout());

        //in panel7
        panel8 = new JPanel(new GridLayout(4,1));
        panel9 = new JPanel(new BorderLayout());
        panel10 = new JPanel();
        panel11 = new JPanel();
        panel12 = new JPanel(new BorderLayout());
        panel8.setBackground(white);
        panel8.setPreferredSize(new Dimension(20, 95));
        panel7.add(panel8, BorderLayout.NORTH);
        panel9.setBackground(white);
        panel9.setPreferredSize(new Dimension(20, 60));
        panel7.add(panel9, BorderLayout.SOUTH);
        panel10.setBackground(white);
        panel10.setPreferredSize(new Dimension(-1, -1));
        panel7.add(panel10, BorderLayout.EAST);
        panel11.setBackground(white);
        panel11.setPreferredSize(new Dimension(-1, -1));
        panel7.add(panel11, BorderLayout.WEST);
        panel12.setBackground(white);
        panel12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel7.add(panel12);

        //in panel8
        panelnameO = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelnameA = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        paneltype = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        paneladdress = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panel8.setBackground(white); panelnameO .setBackground(white);
        panelnameA.setBackground(white); paneltype.setBackground(white);
        paneladdress.setBackground(white);
        nameO = new JLabel("ชื่อเจ้าของ : ");
        nameA = new JLabel("ชื่อสัตว์เลี้ยง : ");
        type = new JLabel("ชนิดสัตว์ : ");
        address = new JLabel("ที่อยู่ : ");
        thenameO = new JTextArea("");
        theNameA = new JTextArea("");
        theType = new JTextArea("");
        theAddrass = new JTextArea("");
        thenameO.setEditable(false); theNameA.setEditable(false);
        theType.setEditable(false); theAddrass.setEditable(false);
        panelnameO.add(nameO); panelnameO.add(thenameO); 
        panelnameA.add(nameA); panelnameA.add(theNameA);
        paneltype.add(type); paneltype.add(theType);
        paneladdress.add(address); paneladdress.add(theAddrass); 
        panel8.add(panelnameO); 
        panel8.add(panelnameA);
        panel8.add(paneltype); panel8.add(paneladdress);

        //ช่อง description และ amount
        panel13 = new JPanel(new BorderLayout());
        panel14 = new JPanel(new BorderLayout());
        panel15 = new JPanel(new BorderLayout());
        paneldescription = new JPanel();
        panelamount = new JPanel();
        panelamount.setPreferredSize(new Dimension(170,30));
        paneldescriptionData = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelamountData = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelamountData.setPreferredSize(new Dimension(170,90));
        panel13.setBackground(white); panel14.setBackground(white); panel15.setBackground(white);
        paneldescription.setBackground(white); panelamount.setBackground(white); paneldescriptionData.setBackground(white); panelamountData.setBackground(white);
        description = new JLabel("รายละเอียด (Description)");
        descriptionData = new JTextArea("");
        descriptionData.setSize(170, 30);
        descriptionData.setEditable(false);
        amount = new JLabel("จำนวนเงิน (Amount)");

        amountData = new JTextArea("");
        amountData.setSize(170, 30);
        amountData.setEditable(false);
        amountData.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        paneldescription.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(-1, -1, -1, 1),
            BorderFactory.createLineBorder(Color.BLACK, 1)
        ));
        paneldescriptionData.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(1, -1, -1, 1),
            BorderFactory.createLineBorder(Color.BLACK, 1)
        ));
        panelamountData.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(1, -1, -1, -1),
            BorderFactory.createLineBorder(Color.BLACK, 1)
        ));
        paneldescription.add(description);
        panelamount.add(amount);
        paneldescriptionData.add(descriptionData);
        panelamountData.add(amountData);
        panel14.add(paneldescription, BorderLayout.CENTER);
        panel14.add(panelamount, BorderLayout.EAST);
        panel15.add(paneldescriptionData, BorderLayout.CENTER);
        panel15.add(panelamountData, BorderLayout.EAST);
        panel12.add(panel14, BorderLayout.NORTH);
        panel12.add(panel15, BorderLayout.CENTER);

        //in panel9 ยอดเงิน
        panel9_1 = new JPanel(new BorderLayout());
        panel9_1.setPreferredSize(new Dimension(500,29));
        panelpureAmount = new JPanel();
        panelsumPureAmount = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelpureAmount.setBackground(white);
        panelsumPureAmount.setBackground(white);
        panelsumPureAmount.setPreferredSize(new Dimension(170,30));
        panelsumPureAmountTH = new JPanel(new BorderLayout());
        panelsumPureAmountTH.setPreferredSize(new Dimension(20,30));
        panelsumPureAmountTH.setBackground(white);
        panel9_1.setBackground(white);
        panel9_1.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(-1, -1, -1, -1), 
            BorderFactory.createLineBorder(Color.BLACK, 1) 
        ));
        panelsumPureAmountTH.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(1, -1, -1, -1),
            BorderFactory.createLineBorder(Color.BLACK, 1)
        ));
        panelpureAmount.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(-1, -1, -1, 1),
            BorderFactory.createLineBorder(Color.BLACK, 1)
        ));
        pureAmount = new JLabel("                                        ยอดเงินบริสุทธิ์");
        //
        //เงินรวม
        //
        //ที่ต้องแก้ sumPureAmount sumPureAmountTH
        sumPureAmount = new JTextArea("");
        sumPureAmount.setEditable(false);
        sumPureAmountTH = new JLabel(" " + "");
        panelpureAmount.add(pureAmount);
        panelsumPureAmount.add(sumPureAmount);
        panel9_1.add(panelsumPureAmount, BorderLayout.EAST);
        panel9_1.add(panelpureAmount, BorderLayout.CENTER);
        panelsumPureAmountTH.add(sumPureAmountTH);
        panel9.add(panel9_1, BorderLayout.NORTH);
        panel9.add(panelsumPureAmountTH);

        //in panel2
        panelreceipt.setBackground(white);
        panelreceipt.setPreferredSize(new Dimension(20, 60));
        panel2.add(panelreceipt, BorderLayout.NORTH);
        panel4.setBackground(white);
        panel4.setPreferredSize(new Dimension(20, 60));
        panel2.add(panel4, BorderLayout.SOUTH);
        panel5.setBackground(white);
        panel2.add(panel5, BorderLayout.EAST);
        panel6.setBackground(white);
        panel2.add(panel6, BorderLayout.WEST);
        panel7.setBackground(white);
        panel7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.add(panel7);

        //in panel4 ช่องล่างสุดผู้รับเงิน ลายเซ็น
        panelpayee = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelsignature = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextArea a1 = new JTextArea(); JTextArea a2 = new JTextArea();
        a1.setEditable(false); a2.setEditable(false);
        panelpayee.setBackground(white); panelsignature.setBackground(white);
        payee = new JLabel("   ผู้รับเงิน : ");
        signature = new JLabel("      ลายเว็นผู้รับเงิน : ..................");
        thePayee = new JTextArea("");
        thePayee.setEditable(false);
        panelpayee.add(payee); panelpayee.add(thePayee);
        panelsignature.add(signature);
        panel4.add(a1); panel4.add(a2);
        panel4.add(panelpayee); panel4.add(panelsignature);

        // ช่องreceip
        receipt = new JLabel("ใบเสร็จรับเงิน (Receipt)");
        receipt.setFont(new Font(receipt.getFont().getName(), Font.PLAIN, 17));
        receipt.setHorizontalAlignment(SwingConstants.CENTER);
        panelreceipt.add(receipt, BorderLayout.NORTH);
        //time
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        StringBuilder thereceipt = new StringBuilder();
        thereceipt.append("วันที่ออกใบเสร็(Date): ").append(dateFormat.format(date)).append("\n");
        JTextArea receiptTextArea = new JTextArea("\n\n                                                                                                                                                               "+thereceipt.toString());
        receiptTextArea.setEditable(false);
        receiptTextArea.setFont(new Font(receiptTextArea.getFont().getName(), Font.PLAIN, 7));
        panelreceipt.add(receiptTextArea, BorderLayout.CENTER);

        panel2.setPreferredSize(new Dimension(500, 550));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBackground(white);

        //in panel1 สีส้มพื้นหลัง
        JPanel panel1_2 = new JPanel();
        panel1_2.setBackground(new Color(0xFFEEE3));
        JPanel panel1_3 = new JPanel(new GridLayout(2,2));
        panel1_3.setBackground(new Color(0xFFEEE3));
        JPanel panel1_4 = new JPanel();
        panel1_4.setBackground(new Color(0xFFEEE3));
        JPanel panel1_5 = new JPanel();
        panel1_5.setBackground(new Color(0xFFEEE3));
        panel1_2.setPreferredSize(new Dimension(20, 20));
        panel1.add(panel1_2, BorderLayout.NORTH);
        panel1_3.setPreferredSize(new Dimension(20, 20));
        panel1.add(panel1_3, BorderLayout.SOUTH);
        panel1_4.setPreferredSize(new Dimension(40, 20));
        panel1.add(panel1_4, BorderLayout.EAST);
        panel1_5.setPreferredSize(new Dimension(40, 20));
        panel1.add(panel1_5, BorderLayout.WEST);
        panel1.add(panel2);
        panel1.setBackground(new Color(0xFFEEE3));
        panelTreatment_M.add(panel1, BorderLayout.CENTER);

        //
        //
        //ค่ารักษา
        //
        //
        panelTrCost = new JPanel();
        panelAll = new JPanel(new BorderLayout());
        panelAllHistory = new JPanel(new BorderLayout());
        panelHistory_t = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelHistory = new JPanel(new BorderLayout());
        panelHistory1 = new JPanel(new GridLayout(3,1));
        panelHistory2 = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelNameOw = new JPanel(new FlowLayout());
        panelNameAn = new JPanel(new FlowLayout());
        panelTypeA = new JPanel(new FlowLayout());
        panelSpecies = new JPanel(new FlowLayout());
        panelAgeA = new JPanel(new FlowLayout());
        panelGenderA = new JPanel(new FlowLayout());
        panelChronicDisease = new JPanel(new FlowLayout());
        panelAllHistory.setBackground(new Color(0xFFEEE3));
        panelHistory_t.setBackground(new Color(0xFFEEE3));
        panelHistory.setBackground(new Color(0xFFEEE3));
        panelHistory1.setBackground(new Color(0xFFEEE3));
        panelHistory2.setBackground(new Color(0xFFEEE3));
        panelNameOw.setBackground(new Color(0xFFEEE3));
        panelNameAn.setBackground(new Color(0xFFEEE3));
        panelTypeA.setBackground(new Color(0xFFEEE3));
        panelSpecies.setBackground(new Color(0xFFEEE3));
        panelAgeA.setBackground(new Color(0xFFEEE3));
        panelGenderA.setBackground(new Color(0xFFEEE3));
        panelChronicDisease.setBackground(new Color(0xFFEEE3));
        historyA_t = new JLabel("      ประวัติสัตว์เลี้ยง");
        panelHistory_t.setPreferredSize(new Dimension(200, 50));
        panelHistory_t.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(25, -1, -1, -1), 
            BorderFactory.createLineBorder(Color.BLACK, -1) 
        ));
        historyA_t.setFont(new Font(historyA_t.getFont().getName(), Font.PLAIN, 15));
        nameOw = new JLabel("           ชื่อเจ้าของ  ");
        nameAn = new JLabel("  ชื่อสัตว์เลี้ยง  ");
        typeA = new JLabel("           ประเภทสัตว์เลี้ยง  ");
        species = new JLabel("       สายพันธุ์  ");
        ageA = new JLabel("           อายุสัตว์เลี้ยง  ");
        genderA = new JLabel("                     เพศ  ");
        chronicDisease = new JLabel("           โรคประจำตัว  ");
        textNameOw = new JTextField("", 20);
        textNameAn = new JTextField("", 12);
        textTypeA = new JTextField("", 13);
        textSpecies = new JTextField("", 13);
        textAgeA = new JTextField("", 10);
        textGenderA = new JTextField("", 8);
        textChronicDisease = new JTextField("", 30);
        textNameOw.setBackground(white);
        textNameAn.setBackground(white);
        textTypeA.setBackground(white);
        textSpecies.setBackground(white);
        textAgeA.setBackground(white);
        textGenderA.setBackground(white);
        textChronicDisease.setBackground(white);
        textNameOw.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textNameAn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textTypeA.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textSpecies.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textAgeA.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textGenderA.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textChronicDisease.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelHistory_t.add(historyA_t);
        panelNameOw.add(nameOw); panelNameOw.add(textNameOw);
        panelNameAn.add(nameAn); panelNameAn.add(textNameAn);
        panelTypeA.add(typeA); panelTypeA.add(textTypeA);
        panelSpecies.add(species); panelSpecies.add(textSpecies);
        panelAgeA.add(ageA); panelAgeA.add(textAgeA); 
        panelGenderA.add(genderA); panelGenderA.add(textGenderA);
        panelChronicDisease.add(chronicDisease); panelChronicDisease.add(textChronicDisease);
        panelnameOW_A = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelTS = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelAG = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelnameOW_A.setBackground(new Color(0xFFEEE3));
        panelTS.setBackground(new Color(0xFFEEE3));
        panelAG.setBackground(new Color(0xFFEEE3));
        panelnameOW_A.add(panelNameOw); panelnameOW_A.add(panelNameAn);
        panelTS.add(panelTypeA); panelTS.add(panelSpecies);
        panelAG.add(panelAgeA); panelAG.add(panelGenderA);
        panelHistory1.add(panelnameOW_A); panelHistory1.add(panelTS); panelHistory1.add(panelAG);
        panelHistory2.add(panelChronicDisease);
        panelHistory.add(panelHistory1, BorderLayout.CENTER); panelHistory.add(panelHistory2, BorderLayout.SOUTH);
        panelAllHistory.add(panelHistory_t, BorderLayout.NORTH);
        panelAllHistory.add(panelHistory, BorderLayout.CENTER);

        panelAllTreatmen = new JPanel(new BorderLayout());
        panelTreatment_t = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelTreatment = new JPanel(new BorderLayout());
        panelTreatment1 = new JPanel(new GridLayout(2,1));
        panelTreatment2 = new JPanel(new BorderLayout());
        panelDateOfTreatment = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelDoctor = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelSymptom = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelDiagnosis = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelTreatmentt = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelDoctorOpinion = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelAllTreatmen.setBackground(new Color(0xFFEEE3));
        panelTreatment_t.setBackground(new Color(0xFFEEE3));
        panelTreatment.setBackground(new Color(0xFFEEE3));
        panelTreatment1.setBackground(new Color(0xFFEEE3));
        panelTreatment2.setBackground(new Color(0xFFEEE3));
        panelDateOfTreatment.setBackground(new Color(0xFFEEE3));
        panelDoctor.setBackground(new Color(0xFFEEE3));
        panelSymptom.setBackground(new Color(0xFFEEE3));
        panelDiagnosis.setBackground(new Color(0xFFEEE3));
        panelTreatmentt.setBackground(new Color(0xFFEEE3));
        panelDoctorOpinion.setBackground(new Color(0xFFEEE3));
        treatment_t = new JLabel("       ผลการรักษา");
        panelTreatment_t .setPreferredSize(new Dimension(200, 25));
        panelTreatment_t.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(1, -1, -1, -1), 
            BorderFactory.createLineBorder(Color.BLACK, -1) 
        ));
        treatment_t.setFont(new Font(treatment_t.getFont().getName(), Font.PLAIN, 15));
        dateOfTreatment = new JLabel("            วันที่รับการตรวจ  ");
        doctor = new JLabel("            แพทย์ที่ทำการตรวจ  ");
        symptom = new JLabel("            อาการ  ");
        diagnosis = new JLabel("            การวินิจฉัย   ");
        treatmentt = new JLabel("             การรักษา   ");
        doctorOpinion = new JLabel("             ความเห็นของแพทย์  ");
        textDateOfTreatment = new JTextField("", 30);
        textDoctor = new JTextField("", 20);
        textSymptom = new JTextArea("", 2,58);
        textDiagnosis = new JTextArea("", 2,51);
        textTreatmentt = new JTextArea("", 2,54);
        textDoctorOpinion = new JTextArea("", 2,46);

        textDateOfTreatment.setBackground(white);
        textDoctor.setBackground(white);
        textSymptom.setBackground(white);
        textDiagnosis.setBackground(white);
        textTreatmentt.setBackground(white);
        textDoctorOpinion.setBackground(white);
        textDateOfTreatment.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textDoctor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textSymptom.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textDiagnosis.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textTreatmentt.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textDoctorOpinion.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panelTreatment_t.add(treatment_t);
        panelDateOfTreatment.add(dateOfTreatment); panelDateOfTreatment.add(textDateOfTreatment);
        panelDoctor.add(doctor); panelDoctor.add(textDoctor);
        panelTreatment1.add(panelDateOfTreatment); panelTreatment1.add(panelDoctor);
        panelSymptom.add(symptom); panelSymptom.add(textSymptom);
        panelDiagnosis.add(diagnosis); panelDiagnosis.add(textDiagnosis);
        panelTreatmentt.add(treatmentt); panelTreatmentt.add(textTreatmentt);
        panelDoctorOpinion.add(doctorOpinion); panelDoctorOpinion.add(textDoctorOpinion);
        panelTreatment2_1 = new JPanel(new BorderLayout());
        panelTreatment2_2 = new JPanel(new BorderLayout());
        panelTreatment2_1.add(panelSymptom, BorderLayout.NORTH);
        panelTreatment2_1.add(panelDiagnosis, BorderLayout.CENTER);
        panelTreatment2_2.add(panelTreatmentt, BorderLayout.NORTH);
        panelTreatment2_2.add(panelDoctorOpinion, BorderLayout.CENTER);
        panelTreatment2.add(panelTreatment2_1, BorderLayout.NORTH);
        panelTreatment2.add(panelTreatment2_2, BorderLayout.CENTER);

        // panelTreatment2.add(panelSymptom); panelTreatment2.add(panelDiagnosis); panelTreatment2.add(panelTreatmentt); panelTreatment2.add(panelDoctorOpinion);
        panelTreatment.add(panelTreatment1, BorderLayout.NORTH); panelTreatment.add(panelTreatment2, BorderLayout.CENTER);
        panelAllTreatmen.add(panelTreatment_t, BorderLayout.NORTH); panelAllTreatmen.add(panelTreatment, BorderLayout.CENTER);

        panelAll.add(panelAllHistory, BorderLayout.NORTH); panelAll.add(panelAllTreatmen, BorderLayout.CENTER);
        panelTrCost.add(panelAll);

        //menu
        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(0xFFE3A8));
        treatment = new JMenu("การรักษา");
        trCosts = new JMenu("ค่ารักษา");
        menuBar.add(treatment);
        menuBar.add(trCosts);
        
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);

        treatment.addActionListener(this);
        trCosts.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(treatment)) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(panelTreatment_M);
            frame.revalidate();
            frame.repaint();

        } else if (ev.getSource().equals(trCosts)) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(panelTrCost);
            frame.revalidate();
            frame.repaint();
        }
    }

}

