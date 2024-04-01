package Font;


import javax.swing.*;
import java.awt.*;
import back.*;
import java.awt.event.*;

public class doctor_popup implements ActionListener{
    private JFrame frame_Hospital_Medical_Expenses;
    private JLabel service, Medical_Supplies, Medical_Service, Home_Medication, 
medication_expenses, Physician_Evaluation, amount;
    private JTextField box_Medical_Supplies, box_Medical_Service, box_Home_Medication, 
box_medication_expenses, box_Physician_Evaluation, box_amount;
    private JPanel fr_service, fr_button, space_west, space_east, fr_main, space;
    private JButton button_sub;
    private CureReipt cur_r;
    public doctor_popup(CureReipt cur_r){
        this.cur_r = cur_r;
        frame_Hospital_Medical_Expenses = new JFrame("Hospital_Medical_Expenses");
        frame_Hospital_Medical_Expenses.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame_Hospital_Medical_Expenses.setLayout(new BorderLayout());

        service = new JLabel("  ค่าบริการ");
        Medical_Supplies = new JLabel("            ค่าอุปกรณ์ทางการแพทย์");
        Medical_Service = new JLabel("            ค่าบริการพยาบาล");
        Home_Medication = new JLabel("            ค่ายานำกลับบ้าน");
        medication_expenses = new JLabel("            ค่ายารักษาโรค");
        Physician_Evaluation = new JLabel("            ค่าตรวจรักษา");
        amount = new JLabel("            ยอดสุทธิ");

        service.setFont(new Font("Tahoma", Font.BOLD, 25));
        Medical_Supplies.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Medical_Service.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Home_Medication.setFont(new Font("Tahoma", Font.PLAIN, 15));
        medication_expenses.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Physician_Evaluation.setFont(new Font("Tahoma", Font.PLAIN, 15));
        amount.setFont(new Font("Tahoma", Font.PLAIN, 15));

        box_Medical_Supplies = new JTextField();
        box_Medical_Service = new JTextField();
        box_Home_Medication = new JTextField();
        box_medication_expenses = new JTextField();
        box_Physician_Evaluation = new JTextField();
        box_amount = new JTextField();

        button_sub = new JButton("Submit");
        button_sub.setBackground(Color.WHITE);
        button_sub.setPreferredSize(new Dimension(80, 30));
        button_sub.setFont(new Font("Jost", Font.PLAIN, 15));
        button_sub.addActionListener(this);
        
        fr_service = new JPanel();
        fr_button = new JPanel();
        fr_main = new JPanel();
        space_east = new JPanel();
        space_west = new JPanel();
        space = new JPanel();

        fr_main.setLayout(new GridLayout(6, 2));
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
//        fr_main.add(amount);
//        fr_main.add(box_amount);

        box_Medical_Supplies.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_Medical_Service.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_Home_Medication.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_medication_expenses.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_Physician_Evaluation.setFont(new Font("Tahoma", Font.PLAIN, 13));
        box_amount.setFont(new Font("Tahoma", Font.PLAIN, 13));

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
        setText();
        
        space.setPreferredSize(new Dimension(1, 20));
        frame_Hospital_Medical_Expenses.setSize(500, 400);
        frame_Hospital_Medical_Expenses.setVisible(true);
        frame_Hospital_Medical_Expenses.setLocationRelativeTo(null);
        frame_Hospital_Medical_Expenses.setResizable(false);
    }
    public JFrame getFrame(){
        return frame_Hospital_Medical_Expenses;
    }
    public void setText(){
        box_Home_Medication.setText(cur_r.getP_med()+"");
        box_Home_Medication.setEditable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        cur_r.setP_veter(Double.parseDouble(box_Medical_Supplies.getText()));
        cur_r.setP_help(Double.parseDouble(box_Medical_Service.getText()));
        cur_r.setP_disease(Double.parseDouble(box_medication_expenses.getText()));
        cur_r.setP_cure(Double.parseDouble(box_Physician_Evaluation.getText()));
        cur_r.updatedb();
        frame_Hospital_Medical_Expenses.dispose();
    }
}
