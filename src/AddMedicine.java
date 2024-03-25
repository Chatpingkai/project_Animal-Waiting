import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class AddMedicine {
    private JFrame fraddmed;
    private JTextField Tcommon_name, Ttrade_name, Ttypandsize, Thowtoeat, Tnum_date, Tall_capsule, Tprice, Thowtouse, Trecommend ;
    private JLabel Lcommon_name, Ltrade_name, Ltypandsize, Lhowtoeat, Lnum_date, Lall_capsule, Lprice, Lhowtouse, Lrecommend, Lmedorcapsule, Ltime, Lmedorcapsule2, Lbaht;
    private JButton submit, update, delete, add;
    private JPanel pa1;
    private JScrollPane scroll;
    private JTable table;
    public AddMedicine(){
        //pop up//
        fraddmed = new JFrame("เพิ่มยา");
        pa1 = new JPanel();
        pa1.setLayout(null);
        pa1.setBackground(new Color(0xFFEEE3));
        
        Tcommon_name = new JTextField();
        Tcommon_name.setBounds(130, 30, 300, 20);
        pa1.add(Tcommon_name);
       
        Ttrade_name = new JTextField();
        Ttrade_name.setBounds(130, 60, 300, 20);
        pa1.add(Ttrade_name);
        
        Ttypandsize = new JTextField();
        Ttypandsize.setBounds(130, 90, 300, 40);
        pa1.add(Ttypandsize);
        
//        Thowtoeat = new JTextField();
//        Thowtoeat.setBounds(130, 140, 70, 20);
//        pa1.add(Thowtoeat);
//        
//        Tnum_date = new JTextField();
//        Tnum_date.setBounds(320, 140, 70, 20);
//        pa1.add(Tnum_date);
        
        Tall_capsule = new JTextField();
        Tall_capsule.setBounds(130, 140, 70, 20);
        pa1.add(Tall_capsule);
        
        Tprice = new JTextField();
        Tprice.setBounds(320, 140, 70, 20);
        pa1.add(Tprice);
        
        Thowtouse = new JTextField();
        Thowtouse.setBounds(60, 200, 370, 40);
        pa1.add(Thowtouse);
        
        Trecommend = new JTextField();
        Trecommend.setBounds(60, 275, 370, 40);
        pa1.add(Trecommend);
        
        
        
        
        Lcommon_name = new JLabel("ชื่อสามัญทางยา:");
        pa1.add(Lcommon_name);
        Lcommon_name.setBounds(40, 30, 200, 20);
//        Lcommon_name.setFont(Lcommon_name.getFont().deriveFont(Lcommon_name.getFont().getSize() + 2.5f));
        
        Ltrade_name = new JLabel("ชื่อทางการค้า:");
        Ltrade_name.setBounds(40, 60, 200, 20);
        pa1.add(Ltrade_name);
        
        Ltypandsize = new JLabel("รูปแบบและขนาด:");
        Ltypandsize.setBounds(40, 90, 200, 40);
        pa1.add(Ltypandsize);
        
//        Lhowtoeat = new JLabel("รับประทานครั้งละ:");
//        Lhowtoeat.setBounds(40, 140, 200, 20);
//        pa1.add(Lhowtoeat);
//        
//        Lmedorcapsule = new JLabel("เม็ด/แคปซูล");
//        Lmedorcapsule.setBounds(210, 140, 200, 20);
//        pa1.add(Lmedorcapsule);
//        
//        Lnum_date = new JLabel("วันละ:");
//        Lnum_date.setBounds(280, 140, 200, 20);
//        pa1.add(Lnum_date);
//        
//        Ltime = new JLabel("ครั้ง");
//        Ltime.setBounds(400, 140, 200, 20);
//        pa1.add(Ltime);
        
        Lall_capsule = new JLabel("จำนวน:");
        Lall_capsule.setBounds(40, 140, 200, 20);
        pa1.add(Lall_capsule);
        
        Lmedorcapsule2 = new JLabel("เม็ด/แคปซูล");
        Lmedorcapsule2.setBounds(210, 140, 200, 20);
        pa1.add(Lmedorcapsule2);
        
        Lprice = new JLabel("ราคา:");
        Lprice.setBounds(280, 140, 200, 20);
        pa1.add(Lprice);
        
        Lbaht = new JLabel("บาท");
        Lbaht.setBounds(400, 140, 200, 20);
        pa1.add(Lbaht);
        
        Lhowtouse = new JLabel("ข้อบ่งใช้:");
        Lhowtouse.setBounds(40, 170, 200, 20);
        pa1.add(Lhowtouse);
        
        Lrecommend = new JLabel("คำแนะนำ:");
        Lrecommend.setBounds(40, 240, 200, 40);
        pa1.add(Lrecommend);
        
        submit = new JButton("submit");
        submit.setBounds(350, 560, 100, 25);
        pa1.add(submit);
        submit.setFont(new Font("Jost", Font.PLAIN, 15));
        
        update = new JButton("update");
        update.setBounds(75, 500, 100, 25);
        pa1.add(update);
        update.setFont(new Font("Jost", Font.PLAIN, 15));
        
        delete = new JButton("delete");
        delete.setBounds(180, 500, 100, 25);
        pa1.add(delete);
        delete.setFont(new Font("Jost", Font.PLAIN, 15));
        
        add = new JButton("add");
        add.setBounds(285, 500, 100, 25);
        pa1.add(add);
        add.setFont(new Font("Jost", Font.PLAIN, 15));
        
        JTable table = new JTable();  
        Object[] columns = {"ชื่อสามัญทางยา","ชื่อทางการค้า"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        scroll = new JScrollPane();
        scroll.setViewportView(table);
        scroll.setBounds(40, 340, 400, 130);
        fraddmed.getContentPane().add(scroll);
        scroll.setViewportView(table);

        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false); //tap can't move//
        table.setGridColor(new Color(0xFFE3A7)); //color of grid//
        
        
        Font defaultFont2 = table.getFont();
        Font font = defaultFont2.deriveFont(defaultFont2.getSize() + 1.5f); 
        table.setFont(font);
        table.getTableHeader().setFont(font);
        
        //color of table//
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setBackground(new Color(0xFFE3A8));
        table.setDefaultRenderer(Object.class, renderer);
        
        //number of colum//
        for(int i=0; i <=50; i++){
            model.addRow(new Object[0]);
        }
        
         table.setDefaultEditor(Object.class, null);//un edit row//
        
        
        fraddmed.add(pa1);
        fraddmed.setSize(500, 650); // Initial size
        fraddmed.setResizable(false);
        fraddmed.setLocationRelativeTo(null); // Center the frame on the screen
        fraddmed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fraddmed.setVisible(true);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            AddMedicine frame = new AddMedicine();
        });
    }
}
