package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;


public class student1 extends JFrame implements ActionListener {
    JButton login,signup,forgot;
    JTextField tfusername, tfPassword;
    
    student1(){
        getContentPane().setBackground(new Color(153,153,153));
        //setLocation(600,600);
        setLayout(null);
        
        JLabel user = new JLabel("User Name");
        user.setBounds(100,270,100,30);
        user.setFont(new Font("tahoma",Font.PLAIN,20));
        add(user);
        
        tfusername  = new JTextField();
        tfusername.setBounds(230,270,200,30);
        add(tfusername);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(100,320,100,30);
        pass.setFont(new Font("tahoma",Font.PLAIN,20));
        add(pass);
        
        tfPassword = new JTextField();
        tfPassword.setBounds(230,320,200,30);
        add(tfPassword);
        
        login = new JButton("Login");
        login.setBounds(50,400,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        signup = new JButton("Signup");
        signup.setBounds(200,400,120,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        forgot  = new JButton("Forgot Passsword");
        forgot.setBounds(350,400,150,30);
        forgot.setBackground(Color.BLACK);
        forgot.setForeground(Color.WHITE);
        forgot.addActionListener(this);
        add(forgot);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/3.jpg"));
       Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(200,40,200,200);
        add(image);
        
        JLabel text = new JLabel("Login");
        text.setBounds(20,20,500,100);
        text.setFont(new Font("tahoma",Font.BOLD,50));
        add(text);
        
        
        
        setBounds(100,100,600,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            try{
                String username = tfusername.getText();
                String password = tfPassword.getText();
                
                String query = "select * from account where username ='"+username+"'AND password = '"+password+"'";
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new loading(username);
                
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                
                }
            
            }catch(Exception e){
                e.printStackTrace();
            
            }
        
        }else if(ae.getSource() == signup){
            setVisible(false);
            new signup();
        
        }else{
            setVisible(false);
            new forgotpassword();
        }
    
    }
    
    public static void main(String[] args){
            new student1();
    }
    
}
