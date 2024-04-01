package Font;


import back.Customer;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main_MDI{
    private JDesktopPane desktopPane;
    private main_admin internal_Main_admin;
    private JFrame frame;
    
    public Main_MDI(){
        desktopPane = new JDesktopPane();
        internal_Main_admin = new main_admin();

        desktopPane.add(internal_Main_admin);


        desktopPane.setBackground(new Color(0xFFF5F5));
        frame = new JFrame("MDI Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(desktopPane);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
