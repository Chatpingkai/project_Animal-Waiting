import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class history_  extends JInternalFrame{
//    private JFrame frhis;
    private JPanel pa1,pa2;
    private JLabel janimalhis, jpeoplename, janimalname, jcateanimal, jtypeanimal,jage, jgender, jdisea,jconclu, jdate, jdocname, jsymptom, jdocdescrip, jcure,jdocopi,jmedi;
    private JTextField tpeoplename, tanimalname, tcateanimal, ttypeanimal,tage, tgender, tdisea,tdate, tdocname,tsymptom;
    private JTextArea txtamedi , txtadocdescrip, txtacure,txtadocopi;
    private JScrollPane meddi, symp, descrip, cure, opi, scrollPane;
    private JTable table;
    public history_(){
        super("Animal-Waiting", false, true,false, true);
//        frhis = new JFrame("ประวัติ");
        pa1 = new JPanel(null);
        pa1.setBackground(new Color(0xFFEEE3));
        pa1.setPreferredSize(new Dimension(760, 800));
        
        scrollPane = new JScrollPane(pa1);
//        scrollPane.setPreferredSize(new Dimension(760, 700));
//        scrollPane.setViewportView(pa1);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        janimalhis = new JLabel("ประวัติสัตว์เลี้ยง");
        janimalhis.setBounds(40, 30, 200, 20);
        janimalhis.setFont(janimalhis.getFont().deriveFont(janimalhis.getFont().getSize() + 5.5f));
        pa1.add(janimalhis);
        
        jpeoplename = new JLabel("ชื่อเจ้าของ");
        jpeoplename.setBounds(80, 60, 200, 20);
        jpeoplename.setFont(jpeoplename.getFont().deriveFont(jpeoplename.getFont().getSize() + 3f));
        pa1.add(jpeoplename);
        
        janimalname = new JLabel("ชื่อสัตว์เลี้ยง");
        janimalname.setBounds(400, 60, 200, 20);
        janimalname.setFont(janimalname.getFont().deriveFont(janimalname.getFont().getSize() + 3f));
        pa1.add(janimalname);
        
        jcateanimal = new JLabel("ประเภทสัตว์เลี้ยง");
        jcateanimal.setBounds(80, 90, 200, 20);
        jcateanimal.setFont(jcateanimal.getFont().deriveFont(jcateanimal.getFont().getSize() + 3f));
        pa1.add(jcateanimal);
        
        jtypeanimal = new JLabel("สายพันธุ์");
        jtypeanimal.setBounds(400, 90, 200, 20);
        jtypeanimal.setFont(jtypeanimal.getFont().deriveFont(jtypeanimal.getFont().getSize() + 3f));
        pa1.add(jtypeanimal);
        
        jage = new JLabel("อายุสัตว์เลี้ยง");
        jage.setBounds(80, 120, 200, 20);
        jage.setFont(jage.getFont().deriveFont(jage.getFont().getSize() + 3f));
        pa1.add(jage);
        
        jgender = new JLabel("เพศ");
        jgender.setBounds(400, 120, 200, 20);
        jgender.setFont(jgender.getFont().deriveFont(jgender.getFont().getSize() + 3f));
        pa1.add(jgender);
        
        jdisea = new JLabel("โรคประจำตัว");
        jdisea.setBounds(80, 150, 200, 20);
        jdisea.setFont(jdisea.getFont().deriveFont(jdisea.getFont().getSize() + 3f));
        pa1.add(jdisea);
        
        
        jconclu = new JLabel("ผลการรักษา");
        jconclu.setBounds(40, 180, 200, 20);
        jconclu.setFont(jconclu.getFont().deriveFont(jconclu.getFont().getSize() + 5.5f));
        pa1.add(jconclu);
        
        
        jdate = new JLabel("วันที่รับการตรวจ");
        jdate.setBounds(80, 210, 200, 20);
        jdate.setFont(jdate.getFont().deriveFont(jdate.getFont().getSize() + 3f));
        pa1.add(jdate);
        
        jdocname = new JLabel("แพทย์ที่ทำการตรวจ");
        jdocname.setBounds(80, 240, 200, 20);
        jdocname.setFont(jdocname.getFont().deriveFont(jdocname.getFont().getSize() + 3f));
        pa1.add(jdocname);
        
        jsymptom = new JLabel("อาการ");
        jsymptom.setBounds(80, 270, 200, 20);
        jsymptom.setFont(jsymptom.getFont().deriveFont(jsymptom.getFont().getSize() + 3f));
        pa1.add(jsymptom);
        
        jdocdescrip = new JLabel("การวินิจฉัย");
        jdocdescrip.setBounds(80, 320, 200, 20);
        jdocdescrip.setFont(jdocdescrip.getFont().deriveFont(jdocdescrip.getFont().getSize() + 3f));
        pa1.add(jdocdescrip);
        
        jcure = new JLabel("การรักษา");
        jcure.setBounds(80, 370, 200, 20);
        jcure.setFont(jcure.getFont().deriveFont(jcure.getFont().getSize() + 3f));
        pa1.add(jcure);
        
        jdocopi = new JLabel("ความเห็นของแพทย์");
        jdocopi.setBounds(80, 420, 200, 20);
        jdocopi.setFont(jdocopi.getFont().deriveFont(jdocopi.getFont().getSize() + 3f));
        pa1.add(jdocopi);
        
        jmedi = new JLabel("ยา");
        jmedi.setBounds(80, 470, 200, 20);
        jmedi.setFont(jmedi.getFont().deriveFont(jmedi.getFont().getSize() + 3f));
        pa1.add(jmedi);
        
        
        tpeoplename = new JTextField();
        tpeoplename.setBounds(190, 60, 200, 20);
        pa1.add(tpeoplename);
        
        tanimalname = new JTextField();
        tanimalname.setBounds(490, 60, 200, 20);
        pa1.add(tanimalname);
        
        tcateanimal = new JTextField();
        tcateanimal.setBounds(190, 90, 200, 20);
        pa1.add(tcateanimal);
        
        ttypeanimal = new JTextField();
        ttypeanimal.setBounds(490, 90, 200, 20);
        pa1.add(ttypeanimal);
        
        tage = new JTextField();
        tage.setBounds(190, 120, 200, 20);
        pa1.add(tage);
        
        tgender = new JTextField();
        tgender.setBounds(490, 120, 200, 20);
        pa1.add(tgender);
        
        tdisea = new JTextField();
        tdisea.setBounds(190, 150, 200, 20);
        pa1.add(tdisea);
        
        tdate = new JTextField();
        tdate.setBounds(210, 210, 220, 20);
        pa1.add(tdate);
        
        tdocname = new JTextField();
        tdocname.setBounds(210, 240, 220, 20);
        pa1.add(tdocname);
        
        tsymptom = new JTextField();
        tsymptom.setBounds(210, 270, 480, 40);
        pa1.add(tsymptom);
        

        txtadocdescrip = new JTextArea();
        txtadocdescrip.setLineWrap(true);
        descrip = new JScrollPane(txtadocdescrip);
//        descrip.setViewportView(txtadocdescrip);
        descrip.setBounds(210, 320, 480, 40);
        descrip.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pa1.add(descrip);
        
        txtacure = new JTextArea(); 
        cure = new JScrollPane(txtacure);
//        cure.setViewportView(txtacure);
        txtacure.setLineWrap(true);
        cure.setBounds(210, 370, 480, 40);
        cure.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pa1.add(cure);
        
        txtadocopi = new JTextArea();
        opi = new JScrollPane(txtadocopi);
//        opi.setViewportView(txtadocopi);
        txtadocopi.setLineWrap(true);
        opi.setBounds(210, 420, 480, 40);
        opi.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pa1.add(opi);
        
        JTable table = new JTable();  
        Object[] columns = {"","ชื่อยา","จำนวน","ข้อบ่งใช้"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);
        
        meddi = new JScrollPane(table);
//        meddi.setViewportView(table);
        meddi.setBounds(210, 470, 500, 120);
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
