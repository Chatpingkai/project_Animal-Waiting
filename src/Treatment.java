import java.awt.*;
import static java.awt.Color.*;
import java.text.*;
import javax.swing.*;

import java.util.*;
public class Treatment{
    private JFrame frame;
    private JPanel panel1, panel2, panelreceipt, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12, panel9_1, panelsumPureAmountTH, 
    panelpureAmount, panelsumPureAmount, panel13, panel14, panel15, paneldescription, panelamount, paneldescriptionData, panelamountData, panelnameO, 
    panelnameA, paneltype, paneladdress, panelpayee, panelsignature, ppanelthereceipt;
    private JLabel pureAmount, description, amount, sumPureAmountTH, nameO, nameA, type, 
    address, payee, signature, receipt, thenameO, theNameA, theType, theAddrass, thePayee,  sumPureAmount;
    private JTextArea descriptionData, amountData;
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        SwingUtilities.invokeLater(() -> {
            new Treatment();
        });
    }
    public Treatment(){
        frame = new JFrame("สรุป");
        panel1 = new JPanel(new BorderLayout());
        panel2 = new JPanel(new BorderLayout()); 
        panelreceipt = new JPanel(new FlowLayout());
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
        nameO = new JLabel("ชื่อเจ้าของ :");
        nameA = new JLabel("ชื่อสัตว์เลี้ยง :");
        type = new JLabel("ชนิดสัตว์ :");
        address = new JLabel("ที่อยู่ :");
        thenameO = new JLabel("");
        theNameA = new JLabel("");
        theType = new JLabel("");
        theAddrass = new JLabel("");
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
        descriptionData.setEditable(false);
        descriptionData.setFont(new Font("Angsana New", Font.PLAIN, 16));
        descriptionData.setPreferredSize(new Dimension(350, 200));
        amount = new JLabel("จำนวนเงิน (Amount)");

        amountData = new JTextArea("");
        amountData.setEditable(false);
        amountData.setFont(new Font("Angsana New", Font.PLAIN, 16));
        amountData.setPreferredSize(new Dimension(170, 200));
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
        pureAmount = new JLabel("                                                                      ยอดเงินบริสุทธิ์");
        //
        //เงินรวม
        //
        //ที่ต้องแก้ sumPureAmount sumPureAmountTH
        sumPureAmount = new JLabel("");
        // sumPureAmount.setEditable(false);
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
        panelreceipt.setPreferredSize(new Dimension(20, 73));
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
        payee = new JLabel("        ผู้รับเงิน :");
        signature = new JLabel("                               ลายเว็นผู้รับเงิน : ..................");
        thePayee = new JLabel("");
        panelpayee.add(payee); panelpayee.add(thePayee);
        panelsignature.add(signature);
        panel4.add(a1); panel4.add(a2);
        panel4.add(panelpayee); panel4.add(panelsignature);

        // ช่องreceip
        receipt = new JLabel("ใบเสร็จรับเงิน (Receipt)");
        receipt.setFont(new Font(receipt.getFont().getName(), Font.PLAIN, 17));
        receipt.setHorizontalAlignment(SwingConstants.CENTER);
        panelreceipt.add(receipt);
        //time
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        StringBuilder thereceipt = new StringBuilder();
        JTextArea empty = new JTextArea("", 1, 50);
        empty.setEditable(false);
        ppanelthereceipt = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ppanelthereceipt.setBackground(white);
        thereceipt.append("วันที่ออกใบเสร็จ (Date): ").append(dateFormat.format(date)).append("\n");
        JLabel receipt = new JLabel("                                                                                                                        "+thereceipt.toString());
        receipt.setFont(new Font(receipt.getFont().getName(), Font.PLAIN, 9));
        ppanelthereceipt.add(receipt);
        panelreceipt.add(empty); panelreceipt.add(ppanelthereceipt);

        

        panel2.setPreferredSize(new Dimension(500, 530));
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

        frame.add(panel1, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(650, 550);
        frame.setLocationRelativeTo(null);
    }
}

