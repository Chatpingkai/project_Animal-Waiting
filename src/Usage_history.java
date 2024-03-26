import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class Usage_history {
    private JFrame frused;
    private JScrollPane scroll;
    private JTable table;
    private JPanel pa1;
    public Usage_history(){
        frused = new JFrame("ประวัติการใช้บริการ");
        pa1 = new JPanel();
        pa1.setLayout(null);
        scroll = new JScrollPane();
        
        scroll.setBounds(40, 30, 1200, 590);
        pa1.add(scroll);
        frused.add(pa1);
        
        JTable table = new JTable(); 
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"วันที่","ประเภทการใช้บริการ","รายละเอียด"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        scroll.setViewportView(table);
        
//        table = new JTable();
//        table.setPreferredScrollableViewportSize(new Dimension(1200, 550));
//        scroll.setViewportView(table);
//        DefaultTableModel model = (DefaultTableModel)table.getModel();
//        model.addColumn("วันที่");
//        model.addColumn("ประเภทการใช้บริการ");
//        model.addColumn("ลายละเอียด");
        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false); //tap can't move//
        table.setGridColor(new Color(0xFFE3A7)); //color of grid//
        
        
        Font defaultFont2 = table.getFont();
        Font font = defaultFont2.deriveFont(defaultFont2.getSize() + 2.5f); 
        table.setFont(font);
        table.getTableHeader().setFont(font);
        table.getColumnModel().getColumn(0).setPreferredWidth(20);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        
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
 
         
        frused.setSize(1300, 700); // Initial size
        frused.setLocationRelativeTo(null); // Center the frame on the screen
        frused.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frused.setVisible(true);
        frused.setResizable(false);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            Usage_history frame = new Usage_history();
        });
    }
    
}
