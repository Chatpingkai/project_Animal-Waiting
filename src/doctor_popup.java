
import javax.swing.*;
import java.awt.*;

public class doctor_popup{
    private JFrame frame_Hospital_Medical_Expenses;
    private JLabel service, Medical_Supplies, Medical_Service, Home_Medication, medication_expenses, Physician_Evaluation, amount, pronounce;
    private JTextField box_Medical_Supplies, box_Medical_Service, box_Home_Medication, box_medication_expenses, box_Physician_Evaluation, box_amount, box_pronounce;
    private JPanel fr_service, fr_button, space_west, space_east, fr_main, space;
    private JButton button_sub;
    public doctor_popup(){
        frame_Hospital_Medical_Expenses = new JFrame("Hospital_Medical_Expenses");
        frame_Hospital_Medical_Expenses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_Hospital_Medical_Expenses.setLayout(new BorderLayout());

        service = new JLabel("  Service Charge");
        Medical_Supplies = new JLabel("            Medical Supplies");
        Medical_Service = new JLabel("            Medical Service");
        Home_Medication = new JLabel("            Home Medication");
        medication_expenses = new JLabel("            Medication Expenses");
        Physician_Evaluation = new JLabel("            Physician Evaluation");
        amount = new JLabel("            Amount");
        pronounce = new JLabel("            Amount (pronounce)");

        service.setFont(new Font("Jost", Font.BOLD, 25));
        Medical_Supplies.setFont(new Font("Jost", Font.PLAIN, 15));
        Medical_Service.setFont(new Font("Jost", Font.PLAIN, 15));
        Home_Medication.setFont(new Font("Jost", Font.PLAIN, 15));
        medication_expenses.setFont(new Font("Jost", Font.PLAIN, 15));
        Physician_Evaluation.setFont(new Font("Jost", Font.PLAIN, 15));
        amount.setFont(new Font("Jost", Font.PLAIN, 15));
        pronounce.setFont(new Font("Jost", Font.PLAIN, 15));

        box_Medical_Supplies = new JTextField();
        box_Medical_Service = new JTextField();
        box_Home_Medication = new JTextField();
        box_medication_expenses = new JTextField();
        box_Physician_Evaluation = new JTextField();
        box_amount = new JTextField();
        box_pronounce = new JTextField();

        button_sub = new JButton("Submit");
        button_sub.setBackground(Color.WHITE);
        button_sub.setPreferredSize(new Dimension(80, 30));
        button_sub.setFont(new Font("Jost", Font.PLAIN, 15));

        fr_service = new JPanel();
        fr_button = new JPanel();
        fr_main = new JPanel();
        space_east = new JPanel();
        space_west = new JPanel();
        space = new JPanel();

        fr_main.setLayout(new GridLayout(7, 2));
        fr_service.setLayout(new FlowLayout(FlowLayout.LEFT));
        fr_button.setLayout(new FlowLayout(FlowLayout.RIGHT));

        fr_button.add(button_sub);
        fr_button.add(space);

        fr_service.add(service);

        fr_main.add(Medical_Supplies);
        fr_main.add(box_Medical_Supplies);
        fr_main.add(Medical_Service);
        fr_main.add(box_Medical_Service);
        fr_main.add(Home_Medication);
        fr_main.add(box_Home_Medication);
        fr_main.add(medication_expenses);
        fr_main.add(box_medication_expenses);
        fr_main.add(Physician_Evaluation);
        fr_main.add(box_Physician_Evaluation);
        fr_main.add(amount);
        fr_main.add(box_amount);
        fr_main.add(pronounce);
        fr_main.add(box_pronounce);

        fr_button.setBackground(new Color(0xFFEEE3));
        fr_main.setBackground(new Color(0xFFEEE3));
        fr_service.setBackground(new Color(0xFFEEE3));
        space_east.setBackground(new Color(0xFFEEE3));
        space_west.setBackground(new Color(0xFFEEE3));
        frame_Hospital_Medical_Expenses.setBackground(new Color(0xFFEEE3));

        frame_Hospital_Medical_Expenses.add(fr_service, BorderLayout.NORTH);
        frame_Hospital_Medical_Expenses.add(fr_main, BorderLayout.CENTER);
        frame_Hospital_Medical_Expenses.add(fr_button, BorderLayout.SOUTH);
        frame_Hospital_Medical_Expenses.add(space_east, BorderLayout.EAST);
        frame_Hospital_Medical_Expenses.add(space_west, BorderLayout.WEST);

        space.setPreferredSize(new Dimension(1, 20));
        frame_Hospital_Medical_Expenses.setSize(500, 400);
        frame_Hospital_Medical_Expenses.setVisible(true);
        frame_Hospital_Medical_Expenses.setResizable(false);
    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            e.printStackTrace();
            }
            SwingUtilities.invokeLater(() -> { 
                doctor_popup frame = new doctor_popup();
            });
    }
    public JFrame getFrame(){
        return frame_Hospital_Medical_Expenses;
    }
}
