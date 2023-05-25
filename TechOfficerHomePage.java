package TechnicalOfficer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TechOfficerHomePage {
    private JPanel main;
    private JButton attendanceButton;
    private JButton profileButton;
    private JButton noticeButton;
    private JButton medicalButton;
    private JButton timetableButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("TechOfficerHomePage");
        frame.setContentPane(new TechOfficerHomePage().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public TechOfficerHomePage() {
    GoProfile();


    }

    public void GoProfile()
    {
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try
            {
               setVisible(false);
               TechOfficerProfilePage profile = new TechOfficerProfilePage();
               setVisible(true);
            }

            catch (Exception e1)
            {
                System.out.println(e1);
            }
            }
        });
    }

    private void setVisible(boolean b) {
    }

}
