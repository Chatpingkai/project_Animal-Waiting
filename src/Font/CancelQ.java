package Font;

import back.Customer;
import java.awt.*;
import java.awt.event.*;
import back.*;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.table.*;
public class CancelQ implements ActionListener,MouseListener{
    private JFrame frcan;
    private JPanel pa1;
    private JLabel txt_his;
    private JButton butcan;
    private JScrollPane scroll;
    private JTable table;
    private Customer customer;
    private static int lookid;
    private DefaultTableModel model ;
    private int introw;
    
    public CancelQ(Customer customer){
        
        //set data
        this.customer = customer;
        this.lookid = customer.getId();
        
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
        butcan.addActionListener(this);
        
        table = new JTable(); 
        setTable();
        
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
        table.addMouseListener(this);
        
        //number of colum//

        
        table.setDefaultEditor(Object.class, null);//un edit row//
        
        frcan.add(pa1);
        frcan.setSize(420, 300);
        frcan.setResizable(false);
        frcan.setLocationRelativeTo(null); // Center the frame on the screen
        frcan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frcan.setVisible(true);
        
    }
    public void setTable(){
        model = new DefaultTableModel();
        Object[] columns = {"วันที่","เวลา"};
        model.setColumnIdentifiers(columns);
        Connec_table tabledb = new Connec_table();
        String sql = String.format("select * from Reserve where ID = '%s'", customer.getId());
        ResultSet rs = tabledb.getData(sql);
        try {
            while (rs.next()) {
                String date = rs.getString("Date");
                String time = rs.getString("Time");
                String[] s = {date, time};
                model.addRow(s);
            }
        } catch (SQLException ex) {
        }
        tabledb.Discon();
        table.setDefaultEditor(Object.class, null);
        table.setModel(model);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == butcan){
            String selectedDate = (String) table.getValueAt(introw, 0);
            String selectedTime = (String) table.getValueAt(introw, 1);
            Connec_table tabledb = new Connec_table();
            String sql = String.format("DELETE FROM Reserve WHERE ID = '%s' and Date = '%s' and Time = '%s'", customer.getId(),selectedDate,selectedTime);
            tabledb.UpdateData(sql);
            tabledb.Discon();
            setTable();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        introw = table.rowAtPoint(e.getPoint());
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
