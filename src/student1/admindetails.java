package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;


public class admindetails extends JFrame implements ActionListener  {
    JTextField tfusername,tfname,tfemail,tfpassword;
    JButton search, back;
    admindetails(String username){
        getContentPane().setBackground(new Color(153,153,153));
        setLayout(null);
        
        JLabel text = new JLabel("Admin Details");
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
        labelname.setBounds(100,110,100,30);
        labelname.setFont(new Font("tahoma",Font.PLAIN,20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(260,110,150,30);
        add(tfname);
        
        
        JLabel email = new JLabel("email");
        email.setBounds(100,160,100,30);
        email.setFont(new Font("tahoma",Font.PLAIN,20));
        add(email);
        
        tfemail = new JTextField();
        tfemail.setBounds(260,160,150,30);
        add(tfemail);
        
        JLabel password = new JLabel("Password");
        password.setBounds(100,210,150,30);
        password.setFont(new Font("tahoma",Font.PLAIN,20));
        add(password);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(260,210,150,30);
        add(tfpassword);
        
        back = new JButton("Back");
        back.setBounds(250,350,90,30);
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
                String query = "select*from admin where username ='"+tfusername.getText()+"'";
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                tfname.setText(rs.getString("name"));
                tfemail.setText(rs.getString("email"));
                tfpassword.setText(rs.getString("password"));
                
                
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        
        }else{
            setVisible(false);
            
        
        }
    
    }
      
        
    public static void main(String[] args){
            new admindetails("username");
    }
        
    
    }
    

