import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class Patient_history extends JInternalFrame{
//    private JFrame frpatient;
    private JScrollPane scroll;
    private JTable table;
    private JPanel pa1;
    public Patient_history(){
        super("Animal-Waiting", false, true, true, true);
//        frpatient = new JFrame("เวชระเบียนคนไข้");
        pa1 = new JPanel();
        pa1.setLayout(null);
        scroll = new JScrollPane();
        
        scroll.setBounds(40, 30, 1200, 590);
        pa1.add(scroll);
//        frpatient.add(pa1);
        
        
        
        JTable table = new JTable(); 
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"ชื่อสัตว์เลี้ยง","ชื่อเจ้าของ", "ชนิด","สายพันธุ์"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        scroll.setViewportView(table);
        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false); //tap can't move//
        table.setGridColor(new Color(0xFFE3A7)); //color of grid//
        
        
        Font defaultFont2 = table.getFont();
        Font font = defaultFont2.deriveFont(defaultFont2.getSize() + 2.5f); 
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
        
        Color backgroundColor = new Color(0xFFEEE3);
        pa1.setBackground(backgroundColor);
 
        getContentPane().add(pa1);
        setSize(800, 600); // Initial size
//        frpatient.setLocationRelativeTo(null); // Center the frame on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            Patient_history frame = new Patient_history();
        });
    }
}
