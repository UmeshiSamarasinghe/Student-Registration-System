package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;



public class about extends JFrame implements ActionListener  {
    JButton back;
    about(){
        //setSize(700,500);
        //setLocation(700,500);
        setBounds(100,100,700,500);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/F.png"));
       Image i2 = i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,500);
        add(image);
        
        JLabel text = new JLabel("About Us");
        text.setBounds(10,0,500,60);
        text.setFont(new Font("tahoma",Font.BOLD,40));
        image.add(text);
        
        TextArea area = new TextArea("A student registration system is a software application  or platform designed to manage the enrollment and registration process for students in educational institutions such  as schools, colleges, universities, or training centers. It streamlines the entire registration process, making it more efficient and less error-prone. Here are the key features and components typically found in a student registration system.",10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(60,80,450,300);
        area.setFont(new Font("tahoma",Font.PLAIN,20));
        image.add(area);
        
        back = new JButton("Back");
        back.setBounds(250,400,90,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args){
            new about ();
    
    
    }
    
}
