import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;
import javax.swing.*;

public class BatheAndCutHair implements ActionListener{
    private JFrame frame;
    private JPanel panelAll, panelAllHistory, panelHistory_t, panelHistory, panelHistory1, panelHistory2, panelAllExpenses, panelExpenses_t, panelExpenses,
    panelNameOw, panelNameAn, panelTypeA, panelSpecies, panelAgeA, panelGenderA, panelChronicDisease, panelnameOW_A, panelTS, panelAG, panelShower, panelCutHair,
    panelbutton, paneladdButton;
    private JLabel historyA_t, nameOw, nameAn, typeA, species, ageA, genderA, chronicDisease, expenses, shower, cutHair;
    private JTextField textNameOw, textNameAn, textTypeA, textSpecies, textAgeA, textGenderA, textChronicDisease, textshower, textcutHair;
    private JButton Treatment;
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        SwingUtilities.invokeLater(() -> {
            new BatheAndCutHair();
        });
        
    }
    public BatheAndCutHair(){
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

        //Jbutton
        panelbutton = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelbutton.setBackground(new Color(0xFFEEE3));
        Treatment = new JButton("ค่ารักษา");
        Treatment.setPreferredSize(new Dimension(100, 30));
        panelbutton.add(Treatment);
        
        historyA_t = new JLabel("      ประวัติสัตว์เลี้ยง");
        panelHistory_t.setPreferredSize(new Dimension(200, 50));
        panelHistory_t.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(25, -1, -1, -1), 
            BorderFactory.createLineBorder(Color.BLACK, -1) 
        ));
        historyA_t.setFont(new Font(historyA_t.getFont().getName(), Font.PLAIN, 15));
        nameOw = new JLabel("           ชื่อเจ้าของ  ");
        nameAn = new JLabel("        ชื่อสัตว์เลี้ยง  ");
        typeA = new JLabel("           ประเภทสัตว์เลี้ยง  ");
        species = new JLabel("                  สายพันธุ์  ");
        ageA = new JLabel("           อายุสัตว์เลี้ยง  ");
        genderA = new JLabel("                                เพศ  ");
        chronicDisease = new JLabel("           โรคประจำตัว  ");
        textNameOw = new JTextField("", 20);
        textNameAn = new JTextField("", 12);
        textTypeA = new JTextField("", 13);
        textSpecies = new JTextField("", 13);
        textAgeA = new JTextField("", 10);
        textGenderA = new JTextField("", 8);
        textChronicDisease = new JTextField("", 31);
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

        panelAllExpenses = new JPanel(new BorderLayout() );
        panelExpenses_t = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelExpenses = new JPanel(new BorderLayout());
        panelAllExpenses.setBackground(new Color(0xFFEEE3));
        panelExpenses_t.setBackground(new Color(0xFFEEE3));
        panelExpenses.setBackground(new Color(0xFFEEE3));
        expenses = new JLabel("      ค่าใช้จ่าย");
        expenses.setFont(new Font(expenses.getFont().getName(), Font.PLAIN, 15));
        panelShower = new JPanel(new FlowLayout((FlowLayout.LEFT)));
        panelShower.setBackground(new Color(0xFFEEE3));
        panelCutHair = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCutHair.setBackground(new Color(0xFFEEE3));
        shower = new JLabel("            อาบน้ำ   ");
        cutHair = new JLabel("            ตัดขน    ");
        textshower = new JTextField("", 30);
        textcutHair = new JTextField("", 30);
        textshower.setBackground(white);
        textshower.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textshower.setBackground(white);
        textcutHair.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelExpenses_t.add(expenses);
        panelShower.add(shower); panelShower.add(textshower);
        panelCutHair.add(cutHair); panelCutHair.add(textcutHair);
        panelExpenses.add(panelShower, BorderLayout.NORTH); panelExpenses.add(panelCutHair, BorderLayout.CENTER);
        panelAllExpenses.add(panelExpenses_t, BorderLayout.NORTH); panelAllExpenses.add(panelExpenses, BorderLayout.CENTER);

        paneladdButton = new JPanel(new BorderLayout());
        paneladdButton.add(panelAllExpenses, BorderLayout.NORTH); paneladdButton.add(panelbutton, BorderLayout.CENTER);

        

        panelAll.add(panelAllHistory, BorderLayout.NORTH); panelAll.add(paneladdButton, BorderLayout.CENTER);
        frame.add(panelAll);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        Treatment.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(Treatment)) {
            new Treatment();
        }
    }

}
