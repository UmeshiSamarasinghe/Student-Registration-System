package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;



public class Addmin extends JFrame implements ActionListener {
    JTextField tfusername,tfname,tfemail,tfpassword;
    JButton submit,back;
    Addmin(){
         getContentPane().setBackground(new Color(153,153,153));
        
        setLayout(null);
        
        JLabel text = new JLabel("Admin");
        text.setBounds(10,0,200,50);
        text.setFont(new Font("tahoma",Font.BOLD,30));
        add(text);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/login1.png"));
       Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(170,40,200,200);
        add(image);
        
         JLabel username = new JLabel("Username");
        username.setBounds(100,270,100,30);
        username.setFont(new Font("tahoma",Font.PLAIN,20));
        add(username);
        
        tfusername  = new JTextField();
        tfusername.setBounds(200,270,200,30);
        add(tfusername);
        
         JLabel name = new JLabel("Name");
        name.setBounds(100,320,100,30);
        name.setFont(new Font("tahoma",Font.PLAIN,20));
        add(name);
        
        tfname  = new JTextField();
        tfname.setBounds(200,320,200,30);
        add(tfname);
        
        JLabel mail = new JLabel("Email");
        mail.setBounds(100,370,100,30);
        mail.setFont(new Font("tahoma",Font.PLAIN,20));
        add(mail);
        
        tfemail  = new JTextField();
        tfemail.setBounds(200,370,200,30);
        add(tfemail);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(100,420,100,30);
        pass.setFont(new Font("tahoma",Font.PLAIN,20));
        add(pass);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(200,420,200,30);
        add(tfpassword);
        
        
        submit = new JButton("Submit");
        submit.setBounds(150,490,90,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        
        back = new JButton("Back");
        back.setBounds(290,490,90,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select*from admin where username = 'username'");
            while(rs.next()){
                tfusername.setText(rs.getString("username"));
                tfname.setText(rs.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        setBounds(100,100,600,600);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String username = tfusername.getText();
            String name = tfname.getText();
            String email = tfemail.getText();
            String password = tfpassword.getText();
            
            try{
                conn c = new conn();
                String query = "insert into admin values('"+username+"','"+name+"','"+email+"','"+password+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Student Details Added Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            
            }
            
        
        }else{
            setVisible(false);
        }
    
    }
    
     public static void main(String[] args){
            new Addmin();
    }
    
}
