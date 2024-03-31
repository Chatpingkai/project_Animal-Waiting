import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import back.*;
import java.sql.*;
import java.util.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
public class User_history_J implements MouseListener{
    private JFrame frused;
    private JScrollPane scroll;
    private JTable table;
    private JPanel pa1;
    private Connec_table con_table;
    private ArrayList<String> data;
    private ArrayList<String> date_data;
    private int id;
    private int introw, intcol;
    public User_history_J(){
        this.id = 0;
        data = new ArrayList<String>();
        date_data = new ArrayList<String>();
        frused = new JFrame("ประวัติการใช้บริการ");
        pa1 = new JPanel();
        pa1.setLayout(null);
        scroll = new JScrollPane();
        
        scroll.setBounds(40, 30, 1200, 590);
        pa1.add(scroll);
        frused.add(pa1);
        setTable();
        
        Color backgroundColor = new Color(0xFFEEE3);
        pa1.setBackground(backgroundColor);
 
        frused.setSize(1300, 700);
        frused.setLocation(200, 200);
        frused.setVisible(true);
        frused.setResizable(false);
    }
    public User_history_J(int id){
//        super("Animal-Waiting", false, true, false, true);
        this.id = id;
        data = new ArrayList<String>();
        date_data = new ArrayList<String>();
        frused = new JFrame("ประวัติการใช้บริการ");
        pa1 = new JPanel();
        pa1.setLayout(null);
        scroll = new JScrollPane();
        
        scroll.setBounds(40, 30, 1200, 590);
        pa1.add(scroll);
        frused.add(pa1);
        setTable();
        
        Color backgroundColor = new Color(0xFFEEE3);
        pa1.setBackground(backgroundColor);
 
//        frused.getContentPane().add(pa1);
        frused.setSize(1300, 700);
        frused.setLocation(200, 200);
        frused.setVisible(true);
        frused.setResizable(false);
        frused.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            User_history_J frame = new User_history_J();
        });
    }

    private void setTable() {
        table = new JTable(); 
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
        con_table = new Connec_table();
        String sql = String.format("select * from History where id = '%d'",id);
        ResultSet rs = con_table.getData(sql);
        try {
            while (rs.next()) {
                String date = rs.getString("Date");
                String detail = rs.getString("Detail");
                String type = rs.getString("Type");
                String[] row = {date, type ,detail};
                data.add(rs.getString("Type_Code"));
                date_data.add(date);
                model.addRow(row);
            }
        } catch (SQLException ex) {
        }
        con_table.Discon();
        table.setDefaultEditor(Object.class, null);//un edit row//}
        table.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            introw = table.rowAtPoint(e.getPoint());
            intcol = 1;
            String selectedData = (String) table.getValueAt(introw, intcol);
            Customer customer = new Customer(id);
            if(selectedData.equals("Cure")){
                CureReipt cure_r = new CureReipt(customer, data.get(introw), date_data.get(introw));
                new TrCosts(cure_r);
            }else{
                GroomReipt groom_r = new GroomReipt(customer, data.get(introw), date_data.get(introw));
                new BatheAndCutHair(groom_r);
            }
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
