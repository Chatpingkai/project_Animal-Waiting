package Font;


import back.Customer;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main_MDI{
    private JDesktopPane desktopPane;
    private main_admin internal_Main_admin;
    private JFrame frame;
    private AddMedicine internal_AddMedicine;
    private Medicinehome internal_Medicinehome;
    private Patient_history internal_Patient_history;
    private history_ internal_history;
    private Usage_history internal_Usage_history;
    private Customer customer;
    private static int lookid;
    
    public Main_MDI() {
        this(null);
    }
    public Main_MDI(Customer customer){
        //send data
        this.customer = customer;
        lookid = customer.getId();
        //====================
        desktopPane = new JDesktopPane();
        internal_Main_admin = new main_admin();
        internal_AddMedicine = new AddMedicine();
        internal_Medicinehome = new Medicinehome();
        internal_Patient_history = new Patient_history();
        internal_history = new history_();
        internal_Usage_history = new Usage_history();

        desktopPane.add(internal_Main_admin);
        desktopPane.add(internal_AddMedicine);
        desktopPane.add(internal_Medicinehome);
        desktopPane.add(internal_Patient_history);
        desktopPane.add(internal_history);
        desktopPane.add(internal_Usage_history);

        internal_Medicinehome.setVisible(false);
        internal_AddMedicine.setVisible(false);
        internal_Patient_history.setVisible(false);
        internal_history.setVisible(false);
        internal_Usage_history.setVisible(false);

        desktopPane.setBackground(new Color(0xFFF5F5));
        frame = new JFrame("MDI Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(desktopPane);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
