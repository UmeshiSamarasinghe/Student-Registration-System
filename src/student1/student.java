package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;


public class student extends JFrame implements ActionListener {
    
    JTextField tfusername,tfname, tfgender,tfdob,tfaddress,tfcontact,tfgrade,tfparents;
    JButton Update,Back;
    
    student(String username){
        
        getContentPane().setBackground(new Color(153,153,153));
        
        setLayout(null);
        
        JLabel text = new JLabel("Update Student Details");
        text.setBounds(10,0,400,50);
        text.setFont(new Font("tahoma",Font.BOLD,30));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,60,100,30);
        lblusername.setFont(new Font("tahoma",Font.PLAIN,20));
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(200,60,200,30);
        add(tfusername);
        
        
        JLabel name = new JLabel("Name");
        name.setBounds(40,110,100,30);
        name.setFont(new Font("tahoma",Font.PLAIN,20));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(200,110,200,30);
        add(tfname);
        
        JLabel gender = new JLabel("Gender");
        gender.setBounds(40,160,100,30);
        gender.setFont(new Font("tahoma",Font.PLAIN,20));
        add(gender);
        
        tfgender  = new JTextField();
        tfgender.setBounds(200,160,200,30);
        add(tfgender);
        
        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(40,210,150,30);
        dob.setFont(new Font("tahoma",Font.PLAIN,20));
        add(dob);
        
        tfdob  = new JTextField();
        tfdob.setBounds(200,210,200,30);
        add(tfdob);
        
        JLabel address = new JLabel("Address");
        address.setBounds(40,260,100,30);
        address.setFont(new Font("tahoma",Font.PLAIN,20));
        add(address);
        
        tfaddress  = new JTextField();
        tfaddress.setBounds(200,260,200,30);
        add(tfaddress);
        
        JLabel contact = new JLabel("Contact Number");
        contact.setBounds(40,310,150,30);
        contact.setFont(new Font("tahoma",Font.PLAIN,20));
        add(contact);
        
        tfcontact  = new JTextField();
        tfcontact.setBounds(200,310,200,30);
        add(tfcontact);
        
        JLabel grade = new JLabel("Grade");
        grade.setBounds(40,360,150,30);
        grade.setFont(new Font("tahoma",Font.PLAIN,20));
        add(grade);
        
        tfgrade  = new JTextField();
        tfgrade.setBounds(200,360,200,30);
        add(tfgrade);
        
        JLabel parents = new JLabel("Parents Name");
        parents.setBounds(40,410,150,30);
        parents.setFont(new Font("tahoma",Font.PLAIN,20));
        add(parents);
        
        tfparents  = new JTextField();
        tfparents.setBounds(200,410,200,30);
        add(tfparents);
        
        Update = new JButton("Update");
        Update.setBounds(130,490,90,30);
        Update.setBackground(Color.BLACK);
        Update.setForeground(Color.WHITE);
        Update.addActionListener(this);
        add(Update);
        
        Back = new JButton("Back");
        Back.setBounds(290,490,90,30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student where username = '"+username+"' ");
            while(rs.next()){
                tfusername.setText(rs.getString("username"));
                tfname.setText(rs.getString("name"));
                tfgender.setText(rs.getString("gender"));
                tfdob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfcontact.setText(rs.getString("contact"));
                tfgrade.setText(rs.getString("grade"));
                tfparents.setText(rs.getString("parents"));
            
            }
            }catch(Exception e){
            e.printStackTrace();
        
        }
        setBounds(100,100,600,600);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Update) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String gender = tfgender.getText();
            String dob = tfdob.getText();
            String address = tfaddress.getText();
            String contact = tfcontact.getText();
            String grade = tfgrade.getText();
            String parents = tfparents.getText();

            try {
                conn c = new conn();
               
                String query = "update student set name = '" + name + "', gender = '" + gender + "', dob = '" + dob
                        + "', address = '" + address + "', contact = '" + contact + "', grade = '" + grade
                        + "', parents = '" + parents + "' WHERE username = '" + username + "'";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Student Details Updated Successfully");
                setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new student("");
    }
}
