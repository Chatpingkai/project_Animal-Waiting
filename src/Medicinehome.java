import back.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Medicinehome extends JInternalFrame{
//    private JFrame fr;
    private JButton addmed;
//    private JDesktopPane des;
    private JPanel pa1;
    private JScrollPane scroll;
    private JTable table;
    private Connec_table table_db;
    private DefaultTableModel model;

    public Medicinehome() {
        super("Animal-Waiting", false, true, false, true);
//        fr = new JFrame("คลังยา");
        pa1 = new JPanel(null);
        addmed = new JButton("เพิ่มยา");
        addmed.setBounds(820, 30, 100, 30);
        addmed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openInternalFrame(new AddMedicine());
                addmed.setEnabled(false);
            }
        });
//        addmed.repaint();
        Font defaultFont = addmed.getFont();
        Font font1 = defaultFont.deriveFont(defaultFont.getSize() + 2f); 
        addmed.setFont(font1);

        pa1.add(addmed);

        scroll = new JScrollPane();
        scroll.setBounds(40, 80, 880, 550);
        getContentPane().add(scroll);
        
        
        
        table = new JTable(); 
        // create a table model and set a Column Identifiers to this model 
        String sql = "SELECT * FROM Med";
        try {
            setTable(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Medicinehome.class.getName()).log(Level.SEVERE, null, ex);
        }
        // set the model to the table
        
        scroll.setViewportView(table);
        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false); //tap can't move//
        table.setGridColor(new Color(0xFFE3A7)); //color of grid//
        pa1.add(scroll);
        
        
        Font defaultFont2 = table.getFont();
        Font font = defaultFont2.deriveFont(defaultFont2.getSize() + 2f); 
        table.setFont(font);
        table.getTableHeader().setFont(font);
        
        //color of table//
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setBackground(new Color(0xFFE3A8));
        table.setDefaultRenderer(Object.class, renderer);
        
        //number of colum//
//        for(int i=0; i <=50; i++){
//            model.addRow(new Object[0]);
//        }
        
         table.setDefaultEditor(Object.class, null);//un edit row//
        
        
        // Set background color for JDesktopPane
        Color backgroundColor = new Color(0xFFEEE3);
        pa1.setBackground(backgroundColor);
//        fr.add(des); 
        
        getContentPane().add(pa1);
        setSize(980, 700); // Initial size
//        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
        
        
    }
    public void setTable(String sql) throws SQLException{
        table_db = new Connec_table();
        ResultSet rs = table_db.getData(sql);
        Object[] columns = {"ชื่อสามัญทางยา","ชื่อทางการค้า","รูปแบบ/ขนาด","ราคา","จำนวน","เหลือ","คำแนะนำ"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        int i =0;
        while(rs.next()){
            i++;
            String full_name = rs.getString("Full_Name");
            String name = rs.getString("Name");
            String type = rs.getString("Type");
            String amount = rs.getString("Amount");
            String price = rs.getString("price");
            String how = rs.getString("How");
            String recom = rs.getString("Recom");
            String[] row = {full_name, name, type, price, amount, how, recom};
            model.addRow(row);
    }
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table_db.Discon();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            Medicinehome frame = new Medicinehome();
        });
    }
    private void openInternalFrame(JInternalFrame internalFrame) {
        internalFrame.setVisible(true);
        getParent().add(internalFrame);
    }
}


