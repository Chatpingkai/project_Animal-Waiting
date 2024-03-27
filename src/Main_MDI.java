
import java.awt.*;
import javax.swing.*;

public class Main_MDI {
    private JDesktopPane desktopPane;
    private main_admin internal_Main_admin;
    private JFrame frame;
    private AddMedicine internal_AddMedicine;
    public Main_MDI(){
        desktopPane = new JDesktopPane();
        internal_Main_admin = new main_admin();
        internal_AddMedicine = new AddMedicine();

        desktopPane.add(internal_Main_admin);
        desktopPane.add(internal_AddMedicine);

        desktopPane.setBackground(new Color(0xFFF5F5));

        frame = new JFrame("MDI Example");
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
