
import java.awt.*;
import javax.swing.*;

public class Main_MDI {
    private JDesktopPane desktopPane;
    private main_admin internal_Main_admin;
    private JFrame frame;
    private details_admin_popup internal_deDetails_admin_popup;
    public Main_MDI(){
        desktopPane = new JDesktopPane();
        internal_Main_admin = new main_admin();
        internal_deDetails_admin_popup = new details_admin_popup();

        desktopPane.add(internal_Main_admin);
        desktopPane.add(internal_deDetails_admin_popup);

        desktopPane.setBackground(new Color(0xFFF5F5));

        frame = new JFrame("Animal-Waiting");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(desktopPane);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            e.printStackTrace();
            }
            SwingUtilities.invokeLater(() -> {
                Main_MDI fr = new Main_MDI();
            });
    }
}
