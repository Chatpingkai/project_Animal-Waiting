import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class CancelQ {
    private JFrame frcan;
    private JPanel pa1;
    private JLabel txt_his;
    private JButton butcan;
    private JScrollPane scroll;
    private JTable table;
    public CancelQ(){
        frcan = new JFrame("ยกเลิกการจอง");
        pa1 = new JPanel(null);
        pa1.setBackground(new Color(0xFFEEE3));
        
        txt_his = new JLabel("ประวัติการจอง");
        txt_his.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txt_his.setBounds(30, 20, 200, 20);
        pa1.add(txt_his);
        
        butcan = new JButton("ยกเลิก");
        butcan.setFont(new Font("Tahoma", Font.PLAIN, 15));
        butcan.setBounds(150, 205, 90, 25);
        pa1.add(butcan);
        
        JTable table = new JTable();  
        Object[] columns = {"วันที่","เวลา"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        scroll = new JScrollPane();
        scroll.setViewportView(table);
        scroll.setBounds(50, 55, 320, 130);
        frcan.getContentPane().add(scroll);
        scroll.setViewportView(table);
        table.getColumnModel().getColumn(0).setPreferredWidth(20);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);

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
        
        frcan.add(pa1);
        frcan.setSize(420, 300);
        frcan.setResizable(false);
        frcan.setLocationRelativeTo(null); // Center the frame on the screen
        frcan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frcan.setVisible(true);
        
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            CancelQ frame = new CancelQ();
        });
    }
}
