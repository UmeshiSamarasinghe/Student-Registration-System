package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Home extends JFrame implements ActionListener {
    String username;
    JButton addstudent,updateprofile,admin,show,showA,about,leave,exit;
    Home(String username){
        this.username = username;
    
    getContentPane().setBackground(new Color(153,153,153));
        
        setLayout(null);
        
        JLabel text = new JLabel("Home");
        text.setBounds(0,0,100,50);
        text.setFont(new Font("tahoma",Font.BOLD,30));
        add(text);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/4.PNG"));
       Image i5 = i4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(145,40,100,100);
        add(image);
        
        JLabel Text = new JLabel("Student Registration");
        Text.setBounds(255,40,500,50);
        Text.setFont(new Font("tahoma",Font.BOLD,30));
        add(Text);
        
        JLabel Text1 = new JLabel("System");
        Text1.setBounds(345,70,200,50);
        Text1.setFont(new Font("tahoma",Font.BOLD,30));
        add(Text1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/5.PNG"));
       Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imagee = new JLabel(i3);
        imagee.setBounds(50,200,100,100);
        add(imagee);
        
        addstudent = new JButton("Add Student");
        addstudent.setBounds(40,300,125,30);
        addstudent.setBackground(Color.BLACK);
        addstudent.setForeground(Color.WHITE);
        addstudent.addActionListener(this);
        add(addstudent);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("images/6.PNG"));
       Image i21 = i11.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i21);
        JLabel image1 = new JLabel(i31);
        image1.setBounds(230,200,100,100);
        add(image1);
        
        updateprofile = new JButton("Update Profile");
        updateprofile.setBounds(225,300,120,30);
        updateprofile.setBackground(Color.BLACK);
        updateprofile.setForeground(Color.WHITE);
        updateprofile.addActionListener(this);
        add(updateprofile);
        
        ImageIcon i12 = new ImageIcon(ClassLoader.getSystemResource("images/7.PNG"));
        Image i22 = i12.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i32 = new ImageIcon(i22);
        JLabel image2 = new JLabel(i32);
        image2.setBounds(400,200,100,100);
        add(image2);
        
        show = new JButton("Show Students");
        show.setBounds(400,300,120,30);
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        show.addActionListener(this);
        add(show);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("images/G.jpg"));
        Image i8 = i7.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image6 = new JLabel(i9);
        image6.setBounds(590,200,100,100);
        add(image6);
        
        leave = new JButton("Leave");
        leave.setBounds(580,300,120,30);
        leave.setBackground(Color.BLACK);
        leave.setForeground(Color.WHITE);
        leave.addActionListener(this);
        add(leave);
        
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("images/8.PNG"));
        Image i23 = i13.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i23);
        JLabel image3 = new JLabel(i33);
        image3.setBounds(50,390,100,100);
        add(image3);
        
        admin = new JButton("Add Admin");
        admin.setBounds(40,490,125,30);
        admin.setBackground(Color.BLACK);
        admin.setForeground(Color.WHITE);
        admin.addActionListener(this);
        add(admin);
        
        
        
        ImageIcon i15 = new ImageIcon(ClassLoader.getSystemResource("images/10.PNG"));
        Image i25 = i15.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i35 = new ImageIcon(i25);
        JLabel image5 = new JLabel(i35);
        image5.setBounds(235,390,100,100);
        add(image5);
        
        showA = new JButton("Show Admins");
        showA.setBounds(225,490,120,30);
        showA.setBackground(Color.BLACK);
        showA.setForeground(Color.WHITE);
        showA.addActionListener(this);
        add(showA);
        
        ImageIcon i71 = new ImageIcon(ClassLoader.getSystemResource("images/12.jpg"));
        Image i81 = i71.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i91 = new ImageIcon(i81);
        JLabel image61 = new JLabel(i91);
        image61.setBounds(410,390,100,100);
        add(image61);
        
        about = new JButton("About");
        about.setBounds(400,490,120,30);
        about.setBackground(Color.BLACK);
        about.setForeground(Color.WHITE);
        about.addActionListener(this);
        add(about);
        
        ImageIcon i72 = new ImageIcon(ClassLoader.getSystemResource("images/A.jpg"));
        Image i82 = i72.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i92 = new ImageIcon(i82);
        JLabel image62 = new JLabel(i92);
        image62.setBounds(590,390,100,100);
        add(image62);
        
        exit = new JButton("Exit");
        exit.setBounds(580,490,120,30);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        
        setBounds(100,100,750,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addstudent){
            new Addstudent();
        }else if(ae.getSource()==updateprofile){
            new student("");
        }else if(ae.getSource()==admin){
            new Addmin();
        }else if(ae.getSource()==show){
            new studentdetails("");
        }else if(ae.getSource()==showA){
            new admindetails("");
        }else if(ae.getSource()==about){
            new about();
        }else if(ae.getSource()==leave){
            new leave();
        }else if(ae.getSource()==exit){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new Home("");

}    
}
