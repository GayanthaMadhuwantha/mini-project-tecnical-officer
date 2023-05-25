package TechnicalOfficer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TechOfficerProfilePage {
    private JPanel main;
    private JTextField textFieldOfficeId;
    private JTextField textFieldName;
    private JTextField textFieldAge;
    private JTextField textFieldGender;
    private JTextField textFieldDept;
    private JTextField textFieldAddress;
    private JTextField textFieldQualification;
    private JButton deleteButton;
    private JButton clearButton;
    private JButton updateButton;
    private JButton addButton;

    Connection connection;
    PreparedStatement pst;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TechOfficerProfilePage");
        frame.setContentPane(new TechOfficerProfilePage().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public TechOfficerProfilePage() {
        DBConnection();
        addOption();
        deleteOption();
        clearOption();
        updateOption();

}

    public void DBConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project","root","1234");
            System.out.println("success");
        }

        catch (SQLException | ClassNotFoundException e1)
        {
            e1.printStackTrace();
        }

    }

        public void addOption()
        {
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String officeId , name , age , gender , department , address , qualification;


                    address = textFieldAddress.getText();
                    officeId = textFieldOfficeId.getText();
                    name = textFieldName.getText();
                    age = textFieldAge.getText();
                    gender = textFieldGender.getText();
                    qualification = textFieldQualification.getText();
                    department = textFieldDept.getText();

                    try {
                        pst = connection.prepareStatement("insert into Tec_Officer ( t_id, t_name , age , gender , Department , address , qualification) values (? , ? , ?,?,?,?,?)");
                        pst.setString(1, officeId);
                        pst.setString(2, name);
                        pst.setString(3, age);
                        pst.setString(4, gender);
                        pst.setString(5, department);
                        pst.setString(6, address);
                        pst.setString(7, qualification);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null , "Record Addedddddd......");

                        textFieldAddress.setText("");
                        textFieldOfficeId.setText("");
                        textFieldName.setText("");
                        textFieldAge.setText("");
                        textFieldGender.setText("");
                        textFieldQualification.setText("");
                        textFieldDept.setText("");


                    } catch (SQLException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }

    public void deleteOption()
    {

    }

    public void clearOption()
    {

    }

    public void updateOption()
    {
        /*try
        {
            String productId = textFieldProductId.getText();
            String productName = textFieldProductName.getText();
            String price = textFieldPrice.getText();
            String quantity = textFieldQuantity.getText();

            pst = connection.prepareStatement("update products set price = ? , quantity = ? , p_name = ? where p_id = ?");
            pst.setString(1,price);
            pst.setString(2,quantity);
            pst.setString(3,productName);
            pst.setString(4,productId);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Updated...");

            textFieldProductId.setText("");
            textFieldQuantity.setText("");
            textFieldPrice.setText("");
            textFieldProductName.setText("");
        }

        catch (SQLException e4)
        {
            e4.printStackTrace();
        }*/
    }
}
