import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Medicinehome implements ActionListener {
    private JFrame fr;
    private JButton addmed;
    private JDesktopPane des;
    private JScrollPane scroll;
    private JTable table;

    public Medicinehome() {
        fr = new JFrame("คลังยา");
        des = new JDesktopPane();
        addmed = new JButton("เพิ่มยา");
        addmed.setBounds(1140, 30, 100, 30); 
        addmed.addActionListener(this);
//        addmed.repaint();
        Font defaultFont = addmed.getFont();
        Font font1 = defaultFont.deriveFont(defaultFont.getSize() + 2f); 
        addmed.setFont(font1);

        fr.add(addmed);

        scroll = new JScrollPane();
        scroll.setBounds(40, 80, 1200, 550);
        fr.getContentPane().add(scroll);
        
        
        JTable table = new JTable(); 
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"ชื่อสามัญทางยา","ชื่อทางการค้า","รูปแบบ/ขนาด","ราคา","จำนวน","เหลือ","คำแนะนำ"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        scroll.setViewportView(table);
        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false); //tap can't move//
        table.setGridColor(new Color(0xFFE3A7)); //color of grid//
        
        
        Font defaultFont2 = table.getFont();
        Font font = defaultFont2.deriveFont(defaultFont2.getSize() + 2f); 
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
        
        
        // Set background color for JDesktopPane
        Color backgroundColor = new Color(0xFFEEE3);
        des.setBackground(backgroundColor);
        fr.add(des); 

        // Set background color for title bar
//        Color titleBarColor = new Color(0xFFEEE3A8);
//        fr.getRootPane().setBackground(titleBarColor);
        
        fr.setSize(800, 600); // Initial size
        fr.setLocationRelativeTo(null); // Center the frame on the screen
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addmed) {
        AddMedicine addMedicineFrame = new AddMedicine();
    }
}
}

