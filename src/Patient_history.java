import back.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.*;
public class Patient_history extends JInternalFrame implements MouseListener{
//    private JFrame frpatient;
    private JScrollPane scroll;
    private JTable table;
    private JPanel pa1;
    private ArrayList<Integer> id_list;
    private Connec_table table_db;
    private DefaultTableModel model;
    private int introw;
    public Patient_history(){
        super("Animal-Waiting", false, true, false, true);
//        frpatient = new JFrame("เวชระเบียนคนไข้");
        id_list = new ArrayList<Integer>();
        pa1 = new JPanel();
        pa1.setLayout(null);
        scroll = new JScrollPane();
        
        scroll.setBounds(40, 30, 870, 590);
        pa1.add(scroll);
//        frpatient.add(pa1);
        
        
        
        table = new JTable();
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"ชื่อสัตว์เลี้ยง","ชื่อเจ้าของ", "ชนิด","สายพันธุ์"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        setTable();
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
        table.addMouseListener(this);
        
        
        Color backgroundColor = new Color(0xFFEEE3);
        pa1.setBackground(backgroundColor);
 
        getContentPane().add(pa1);
        setSize(980, 700);
        setLocation(700, 200);
        setVisible(true);
    }
    private void setTable(){
        table_db = new Connec_table();
        String sql = String.format("select * from Pet");
        ResultSet rs = table_db.getData(sql);
        ResultSet rs2;
        try {
            while (rs.next()) {
                int id = rs.getInt("ID");
                id_list.add(id);
                String name = rs.getString("Name");
                String type = rs.getString("Type");
                String spicies = rs.getString("Spicies");
                sql = String.format("select Name from User_Profile Where ID = '%d'", id);
                rs2 = table_db.getData(sql);
                String author_name = rs.getString("Name");
                String[] row = {name, author_name, type, spicies};
                model.addRow(row);
            }
        } catch (SQLException e) {
        }
        table_db.Discon();
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
    private void openInternalFrame(JInternalFrame internalFrame) {
        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
        @Override
        public void internalFrameClosing(InternalFrameEvent e) {
            }
        });
        getParent().add(internalFrame);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            introw = table.rowAtPoint(e.getPoint());
            table_db = new Connec_table();
            openInternalFrame(new Usage_history(id_list.get(introw)));
        }
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
