
import java.awt.*;
import javax.swing.*;

public class Main_MDI {
    private JDesktopPane desktopPane;
    private main_admin internal_Main_admin;
    private JFrame frame;
    private AddMedicine internal_AddMedicine;
    private Medicinehome internal_Medicinehome;
    private Patient_history internal_Patient_history;
    private history_ internal_history_;
    private Usage_history internal_Usage_history;
    public Main_MDI(){
        desktopPane = new JDesktopPane();
        internal_Main_admin = new main_admin();
        internal_AddMedicine = new AddMedicine();
        internal_Medicinehome = new Medicinehome();
        internal_Patient_history = new Patient_history();
        internal_history_ = new history_();
        internal_Usage_history = new Usage_history();
        
        desktopPane.add(internal_Main_admin);
        desktopPane.add(internal_AddMedicine);
        desktopPane.add(internal_Medicinehome);
        desktopPane.add(internal_Patient_history);
        desktopPane.add(internal_history_);
        desktopPane.add(internal_Usage_history);

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
