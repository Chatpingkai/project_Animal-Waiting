import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class history_  extends JInternalFrame{
//    private JFrame frhis;
    private JPanel pa1,pa2;
    private JLabel janimalhis, jpeoplename, janimalname, jcateanimal, jtypeanimal,jage, jgender, jdisea,jconclu, jdate, jdocname, jsymptom, jdocdescrip, jcure,jdocopi,jmedi;
    private JTextField tpeoplename, tanimalname, tcateanimal, ttypeanimal,tage, tgender, tdisea,tdate, tdocname;
    private JTextArea txtamedi , txtadocdescrip, txtacure,txtadocopi,tsymptom;
    private JScrollPane meddi, symp, descrip, cure,opi,scrollPane, symto;
    private JTable table;
    public history_(){
        super("Animal-Waiting", false, true,false, true);
//        frhis = new JFrame("ประวัติ");
        pa1 = new JPanel(null);
        pa1.setBackground(new Color(0xFFEEE3));
        pa1.setPreferredSize(new Dimension(750, 750));
        
        scrollPane = new JScrollPane(pa1);
//        scrollPane.setPreferredSize(new Dimension(760, 700));
//        scrollPane.setViewportView(pa1);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        janimalhis = new JLabel("ประวัติสัตว์เลี้ยง");
        janimalhis.setBounds(40, 30, 200, 20);
        janimalhis.setFont(new Font("Tahoma", Font.PLAIN, 17));
        pa1.add(janimalhis);
        
        jpeoplename = new JLabel("ชื่อเจ้าของ");
        jpeoplename.setBounds(80, 65, 200, 20);
        jpeoplename.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jpeoplename);
        
        janimalname = new JLabel("ชื่อสัตว์เลี้ยง");
        janimalname.setBounds(400, 65, 200, 20);
        janimalname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(janimalname);
        
        jcateanimal = new JLabel("ประเภทสัตว์เลี้ยง");
        jcateanimal.setBounds(80, 95, 200, 20);
        jcateanimal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jcateanimal);
        
        jtypeanimal = new JLabel("สายพันธุ์");
        jtypeanimal.setBounds(400, 95, 200, 20);
        jtypeanimal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jtypeanimal);
        
        jage = new JLabel("อายุสัตว์เลี้ยง");
        jage.setBounds(80, 125, 200, 20);
        jage.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jage);
        
        jgender = new JLabel("เพศ");
        jgender.setBounds(400, 125, 200, 20);
        jgender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jgender);
        
        jdisea = new JLabel("โรคประจำตัว");
        jdisea.setBounds(80, 155, 200, 20);
        jdisea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jdisea);
        
        
        jconclu = new JLabel("ผลการรักษา");
        jconclu.setBounds(40, 190, 200, 20);
        jconclu.setFont(new Font("Tahoma", Font.PLAIN, 17));
        pa1.add(jconclu);
        
        
        jdate = new JLabel("วันที่รับการตรวจ");
        jdate.setBounds(80, 225, 200, 20);
        jdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jdate);
        
        jdocname = new JLabel("แพทย์ที่ทำการตรวจ");
        jdocname.setBounds(80, 255, 200, 20);
        jdocname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jdocname);
        
        jsymptom = new JLabel("อาการ");
        jsymptom.setBounds(80, 285, 200, 20);
        jsymptom.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jsymptom);
        
        jdocdescrip = new JLabel("การวินิจฉัย");
        jdocdescrip.setBounds(80, 355, 200, 20);
        jdocdescrip.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jdocdescrip);
        
        jcure = new JLabel("การรักษา");
        jcure.setBounds(80, 425, 200, 20);
        jcure.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jcure);
        
        jdocopi = new JLabel("ความเห็นของแพทย์");
        jdocopi.setBounds(80, 495, 200, 20);
        jdocopi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jdocopi);
        
        jmedi = new JLabel("ยา");
        jmedi.setBounds(80, 565, 200, 20);
        jmedi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pa1.add(jmedi);
        
        
        tpeoplename = new JTextField();
        tpeoplename.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tpeoplename.setBounds(190, 65, 200, 20);
        pa1.add(tpeoplename);
        
        
        tanimalname = new JTextField();
        tanimalname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tanimalname.setBounds(490, 65, 200, 20);
        pa1.add(tanimalname);
        
        
        tcateanimal = new JTextField();
        tcateanimal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tcateanimal.setBounds(190, 95, 200, 20);
        pa1.add(tcateanimal);
        
        
        ttypeanimal = new JTextField();
        ttypeanimal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ttypeanimal.setBounds(490, 95, 200, 20);
        pa1.add(ttypeanimal);
        
        
        tage = new JTextField();
        tage.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tage.setBounds(190, 125, 200, 20);
        pa1.add(tage);
        
        
        tgender = new JTextField();
        tgender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tgender.setBounds(490, 125, 200, 20);
        pa1.add(tgender);
        
        
        tdisea = new JTextField();
        tdisea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tdisea.setBounds(190, 155, 200, 20);
        pa1.add(tdisea);
        
        
        tdate = new JTextField();
        tdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tdate.setBounds(210, 225, 220, 20);
        pa1.add(tdate);
        
        
        tdocname = new JTextField();
        tdocname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tdocname.setBounds(210, 255, 220, 20);
        pa1.add(tdocname);
        
        
        tsymptom = new JTextArea();
        tsymptom.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tsymptom.setLineWrap(true);
        symto = new JScrollPane(tsymptom);
        symto.setBounds(210, 285, 480, 60);
        symto.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pa1.add(symto);
        
        
        txtadocdescrip = new JTextArea();
        txtadocdescrip.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtadocdescrip.setLineWrap(true);
        descrip = new JScrollPane(txtadocdescrip);
//        descrip.setViewportView(txtadocdescrip);
        descrip.setBounds(210, 355, 480, 60);
        descrip.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pa1.add(descrip);
        
        
        txtacure = new JTextArea(); 
        txtacure.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cure = new JScrollPane(txtacure);
//        cure.setViewportView(txtacure);
//        txtacure.setLineWrap(true);
        cure.setBounds(210, 425, 480, 60);
        cure.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pa1.add(cure);
        
        txtadocopi = new JTextArea();
        txtadocopi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        opi = new JScrollPane(txtadocopi);
//        opi.setViewportView(txtadocopi);
//        txtadocopi.setLineWrap(true);
        opi.setBounds(210, 495, 480, 60);
        opi.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pa1.add(opi);
        
        JTable table = new JTable();  
        Object[] columns = {"","ชื่อยา","จำนวน","ข้อบ่งใช้"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);
        
        meddi = new JScrollPane(table);
//        meddi.setViewportView(table);
        meddi.setBounds(210, 565, 500, 120);
        pa1.add(meddi);
//        meddi.setViewportView(table);


        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false); //tap can't move//
        table.setGridColor(new Color(0xFFE3A7)); //color of grid//
        
        
        Font defaultFont2 = table.getFont();
        Font font = defaultFont2.deriveFont(defaultFont2.getSize() + 1.5f); 
        table.setFont(font);
        table.getTableHeader().setFont(font);
        table.getColumnModel().getColumn(0).setPreferredWidth(1);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(10);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        
        //color of table//
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setBackground(new Color(0xFFE3A8));
        table.setDefaultRenderer(Object.class, renderer);
        
        //number of colum//
        for(int i=0; i <=50; i++){
            model.addRow(new Object[4]);
        }
        
         table.setDefaultEditor(Object.class, null);//un edit row//
        
//        txtamedi = new JTextArea();
//        meddi = new JScrollPane();
//        meddi.setViewportView(txtamedi);
////        txtadocopi.setLineWrap(true);
//        meddi.setBounds(210, 470, 480, 40);
//        meddi.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        frhis.getContentPane().add(meddi);
        
        getContentPane().add(scrollPane);
//        frhis.add(scrollPane);
        setSize(820, 700);
        setLocation(400, 200);
        setResizable(false);
//        frhis.setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            history_ frame = new history_();
        });
    }
}
