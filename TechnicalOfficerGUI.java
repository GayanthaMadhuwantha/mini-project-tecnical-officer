import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TechnicalOfficerGUI extends JFrame implements ActionListener {
    private JButton profileButton, attendanceButton, medicalButton, noticeButton, timetableButton;
    private JLabel titleLabel;
    private JPanel panel;

    public TechnicalOfficerGUI() {
        // Set up the frame
        setTitle("TechnicOfficer");
        setSize(800, 00);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the components
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        // Create the components
        titleLabel = new JLabel("Technical Officer");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        profileButton = new JButton("Update Profile");
        attendanceButton = new JButton("Manage Attendance");
        medicalButton = new JButton("Manage Medical Records");
        noticeButton = new JButton("View Notices");
        timetableButton = new JButton("View Timetable");

        // Add the components to the panel
        panel.add(titleLabel);
        panel.add(profileButton);
        panel.add(attendanceButton);
        panel.add(medicalButton);
        panel.add(noticeButton);
        panel.add(timetableButton);

        // Add action listeners to the buttons
        profileButton.addActionListener(this);
        attendanceButton.addActionListener(this);
        medicalButton.addActionListener(this);
        noticeButton.addActionListener(this);
        timetableButton.addActionListener(this);

        // Add the panel to the frame
        add(panel);

        // Show the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == profileButton) {
            // Handle updating the profile
            JOptionPane.showMessageDialog(this, "Update Profile");
        } else if (e.getSource() == attendanceButton) {
            // Handle managing attendance
            JOptionPane.showMessageDialog(this, "Manage Attendance");
        } else if (e.getSource() == medicalButton) {
            // Handle managing medical records
            JOptionPane.showMessageDialog(this, "Manage Medical Records");
        } else if (e.getSource() == noticeButton) {
            // Handle viewing notices
            JOptionPane.showMessageDialog(this, "View Notices");
        } else if (e.getSource() == timetableButton) {
            // Handle viewing timetable
            JOptionPane.showMessageDialog(this, "View Timetable");
        }
    }

    public static void main(String[] args) {
        TechnicalOfficerGUI gui = new TechnicalOfficerGUI();
    }
}