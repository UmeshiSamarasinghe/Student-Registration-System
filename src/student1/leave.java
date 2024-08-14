package student1;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class leave extends JFrame implements ActionListener { 

    JTextField tfusername, tfPassword;
    JButton  leave, back;

    leave() {
        setSize(600, 600);
        setLocation(600, 600);
        setLayout(null);
        setBounds(100,100,600,500);
        getContentPane().setBackground(new Color(153, 153, 153));

        setLayout(null);

        JLabel text = new JLabel("Leave");
        text.setBounds(10, 0, 400, 50);
        text.setFont(new Font("Tahoma", Font.BOLD, 30)); 
        add(text);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/G.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(200, 50, 300, 150);
        add(image);

        JLabel user = new JLabel("UserName");
        user.setBounds(70, 240, 150, 30);
        user.setFont(new Font("Tahoma", Font.PLAIN, 20)); // Corrected font name
        add(user);

        tfusername = new JTextField();
        tfusername.setBounds(200, 240, 250, 30);
        add(tfusername);

        JLabel pass = new JLabel("Password");
        pass.setBounds(70, 300, 150, 30);
        pass.setFont(new Font("Tahoma", Font.PLAIN, 20)); // Corrected font name
        add(pass);

        tfPassword = new JTextField();
        tfPassword.setBounds(200, 300, 250, 30);
        add(tfPassword);

        leave = new JButton("Leave");
        leave.setBounds(200, 390, 90, 30);
        leave.setBackground(Color.BLACK);
        leave.setForeground(Color.WHITE);
        leave.addActionListener(this);
        add(leave);

        back = new JButton("Back");
        back.setBounds(350, 390, 90, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == leave) {
            String username = tfusername.getText();
            String password = tfPassword.getText();

            try {
                conn c = new conn();
               
                ResultSet rs = c.s.executeQuery("SELECT * FROM account WHERE username = '" + username + "'");
                if (rs.next()) {
                    String query = "DELETE FROM account WHERE username = '" + username + "' AND password = '" + password + "'";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Student Leave Confirmed");
                } else {
                    JOptionPane.showMessageDialog(null, "Student not found");
                }
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } else {
            setVisible(false);
            new student1();
        }
    }

    public static void main(String[] args) {
        new leave();
    }
}
