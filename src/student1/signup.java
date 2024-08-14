package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener {
    JButton create,back;
    JTextField tfname,tfusername,tfPassword;
   
    signup(){
    
         getContentPane().setBackground(new Color(153,153,153));
        
        setLayout(null);
        
         JLabel text = new JLabel("Signup");
        text.setBounds(10,0,200,50);
        text.setFont(new Font("tahoma",Font.BOLD,30));
        add(text);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/download.png"));
       Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(170,40,200,200);
        add(image);
        
        
        JLabel user = new JLabel("UserName");
        user.setBounds(70,270,150,30);
        user.setFont(new Font("tahoma",Font.PLAIN,20));
        add(user);
        
        tfusername  = new JTextField();
        tfusername.setBounds(200,270,250,30);
        add(tfusername);
        
        JLabel name = new JLabel("Name");
        name.setBounds(70,320,150,30);
        name.setFont(new Font("tahoma",Font.PLAIN,20));
        add(name);
        
        tfname  = new JTextField();
        tfname.setBounds(200,320,250,30);
        add(tfname);
        
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(70,370,150,30);
        pass.setFont(new Font("tahoma",Font.PLAIN,20));
        add(pass);
        
        tfPassword = new JTextField();
        tfPassword.setBounds(200,370,250,30);
        add(tfPassword);
        
        create = new JButton("Create");
        create.setBounds(153,430,90,30);
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.addActionListener(this);
        add(create);
        
        back = new JButton("Back");
        back.setBounds(300,430,90,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setBounds(100,100,600,520);
        setVisible(true);
        
    } 
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String Password = tfPassword.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+Password+"')";
            try{
                conn c = new conn();
                 c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
                new student1();
            
            }catch (Exception e){
                e.printStackTrace();
            
            }
            
        
        }else if(ae.getSource() == back){
            setVisible(false);
            new student1();
        
        }
    }
    
     public static void main(String[] args){
            new signup();
    
    }
    
}
