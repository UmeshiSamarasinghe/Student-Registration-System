package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;


public class first extends JFrame implements ActionListener {
    first(){
    
        //setSize(700,500);
        //setLocation(700,500);
        setBounds(100,100,700,500);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/123.jpg"));
       Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,500);
        add(image);
        
        JLabel Text = new JLabel("We Are Here For You...");
        Text.setBounds(50,10,600,50);
        Text.setFont(new Font("tahoma",Font.BOLD,40));
        image.add(Text);
        
        JLabel text4 = new JLabel("Free And Better Education For All ");
        text4.setBounds(20,400,450,50);
        text4.setFont(new Font("tahoma",Font.BOLD,25));
        text4.setForeground(Color.BLACK);
        image.add(text4);
        
        
        JButton next = new JButton("Next");
        next.setBounds(500,410,150,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setFont(new Font("tahoma",Font.BOLD,20));
        image.add(next);
        
        
        setVisible(true);
        
        while(true){
            Text.setVisible(false);
            try{
                Thread.sleep(1000);
            
            }catch(Exception e){
                e.printStackTrace();
            
            }
            Text.setVisible(true);
            try{
                Thread.sleep(1000);
            
            }catch(Exception e){
                e.printStackTrace();
            
            }
        }
        
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new student1();
        
    
    
    }
    public static void main(String[] args){
            new first();
    }
    
}

