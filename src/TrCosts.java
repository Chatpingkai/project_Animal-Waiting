import java.awt.*;
import static java.awt.Color.*;
import javax.swing.*;

public class TrCosts {
    private JFrame frame;
    private JPanel panelAll, panelAllHistory, panelAllTreatmen, panelHistory_t, panelTreatment_t, panelHistory, panelHistory1, panelHistory2, panelTreatment, panelTreatment1, panelTreatment2,
    panelNameOw, panelNameAn, panelTypeA, panelSpecies, panelAgeA, panelGenderA, panelChronicDisease, panelnameOW_A, panelTS, panelAG, panelTreatment2_1, panelTreatment2_2,
    panelDateOfTreatment, panelDoctor, panelSymptom, panelDiagnosis, panelTreatmentt, panelDoctorOpinion;
    private JLabel historyA_t, treatment_t, nameOw, nameAn, typeA, species, ageA, genderA, chronicDisease,
    dateOfTreatment, doctor, symptom, diagnosis, treatmentt, doctorOpinion;
    private JTextField textNameOw, textNameAn, textTypeA, textSpecies, textAgeA, textGenderA, textChronicDisease,
    textDateOfTreatment, textDoctor;
    private JTextArea textSymptom, textDiagnosis, textTreatmentt, textDoctorOpinion;
    public static void main(String[] args) {
        new TrCosts();
    }
    public TrCosts(){
        frame = new JFrame("สรุป");
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
        frame.add(panelAll);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
    }
}
