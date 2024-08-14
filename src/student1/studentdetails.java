package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;



public class studentdetails extends JFrame implements ActionListener {
    JTextField tfusername, tfname,tfgender,tfdob,tfaddress,tfcontact,tfgrade,tfparents;
    JButton search, back;
    
    studentdetails(String username){
        getContentPane().setBackground(new Color(153,153,153));
        setLayout(null);
        
        JLabel text = new JLabel("Student Details");
        text.setBounds(10,0,400,50);
        text.setFont(new Font("tahoma",Font.BOLD,30));
        add(text);
        
        
        JLabel labelusername = new JLabel("User Name");
        labelusername.setBounds(100,60,100,30);
        labelusername.setFont(new Font("tahoma",Font.PLAIN,20));
        add(labelusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(260,60,150,30);
        add(tfusername);
        
        search = new JButton("Search");
        search.setBounds(470,60,90,30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        add(search);
        
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(100,110,150,30);
        labelname.setFont(new Font("tahoma",Font.PLAIN,20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(260,110,150,30);
        add(tfname);
        
        
        JLabel gender = new JLabel("Gender");
        gender.setBounds(100,160,150,30);
        gender.setFont(new Font("tahoma",Font.PLAIN,20));
        add(gender);
        
        tfgender = new JTextField();
        tfgender.setBounds(260,160,150,30);
        add(tfgender);
        
        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(100,210,150,30);
        dob.setFont(new Font("tahoma",Font.PLAIN,20));
        add(dob);
        
        tfdob = new JTextField();
        tfdob.setBounds(260,210,150,30);
        add(tfdob);
        
        JLabel address = new JLabel("Address");
        address.setBounds(100,260,150,30);
        address.setFont(new Font("tahoma",Font.PLAIN,20));
        add(address);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(260,260,150,30);
        add(tfaddress);
        
        JLabel contact = new JLabel("Contact Number");
        contact.setBounds(100,310,150,30);
        contact.setFont(new Font("tahoma",Font.PLAIN,20));
        add(contact);
        
        tfcontact = new JTextField();
        tfcontact.setBounds(260,310,150,30);
        add(tfcontact);
        
        JLabel grade = new JLabel("Grade");
        grade.setBounds(100,360,150,30);
        grade.setFont(new Font("tahoma",Font.PLAIN,20));
        add(grade);
        
        tfgrade = new JTextField();
        tfgrade.setBounds(260,360,150,30);
        add(tfgrade);
        
        JLabel parents = new JLabel("Parents Name");
        parents.setBounds(100,410,150,30);
        parents.setFont(new Font("tahoma",Font.PLAIN,20));
        add(parents);
        
        tfparents = new JTextField();
        tfparents.setBounds(260,410,150,30);
        add(tfparents);
        
        back = new JButton("Back");
        back.setBounds(250,460,90,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
      
       
        setBounds(100,100,600,550);
        setVisible(true);
        
    }
   public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            try{
                String query = "select*from student where username ='"+tfusername.getText()+"'";
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                tfname.setText(rs.getString("name"));
                tfgender.setText(rs.getString("gender"));
                tfdob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfcontact.setText(rs.getString("contact"));
                tfgrade.setText(rs.getString("grade"));
                tfparents.setText(rs.getString("parents"));
                
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        
        }else{
            setVisible(false);
            
        
        }
    
    }
    public static void main(String[] args){
            new studentdetails("");
    }
   
    
}
