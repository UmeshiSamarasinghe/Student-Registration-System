package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;



public class forgotpassword extends JFrame implements ActionListener  {
    JTextField tfusername,tfName,tfPassword;
    JButton search,back;
    
    
    forgotpassword(){
        getContentPane().setBackground(new Color(153,153,153));
        
        setLayout(null);
        
         JLabel text = new JLabel("Forgot Password");
        text.setBounds(10,0,400,50);
        text.setFont(new Font("tahoma",Font.BOLD,30));
        add(text);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/forgot.jpg"));
       Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(200,70,200,150);
        add(image);
        
        
        JLabel user = new JLabel("UserName");
        user.setBounds(70,270,150,30);
        user.setFont(new Font("tahoma",Font.PLAIN,20));
        add(user);
        
        tfusername  = new JTextField();
        tfusername.setBounds(200,270,250,30);
        add(tfusername);
        
        search = new JButton("Search");
        search.setBounds(470,270,90,30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        add(search);
        
        
        JLabel name = new JLabel("Name");
        name.setBounds(70,320,150,30);
        name.setFont(new Font("tahoma",Font.PLAIN,20));
        add(name);
        
        tfName  = new JTextField();
        tfName.setBounds(200,320,250,30);
        add(tfName);
        
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(70,370,150,30);
        pass.setFont(new Font("tahoma",Font.PLAIN,20));
        add(pass);
        
        tfPassword = new JTextField();
        tfPassword.setBounds(200,370,250,30);
        add(tfPassword);
        
        back = new JButton("Back");
        back.setBounds(250,450,90,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setBounds(100,100,600,600);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            try{
                String query = "select*from account where username ='"+tfusername.getText()+"'";
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tfName.setText(rs.getString("name"));
                    tfPassword.setText(rs.getString("password"));
                
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        
        }else{
            setVisible(false);
            new student1();
        
        }
    
    }
     public static void main(String[] args){
            new forgotpassword ();
    
    
    }
    
}
