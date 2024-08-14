package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;




public class EP extends JFrame {
    EP(){
        
        //setSize(700,500);
        //setLocation(700,500);
        setBounds(100,100,700,500);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/J.jpg"));
       Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,500);
        add(image);
        
        JLabel text = new JLabel("Exit");
        text.setBounds(10,0,200,50);
        text.setFont(new Font("tahoma",Font.BOLD,30));
        image.add(text);
        
        JLabel text1 = new JLabel("Exceptional");
        text1.setBounds(120,30,400,50);
        text1.setFont(new Font("tahoma",Font.BOLD,50));
        text1.setForeground(Color.WHITE);
        image.add(text1);
        
        JLabel text2 = new JLabel("Programmers");
        text2.setBounds(190,80,500,70);
        text2.setFont(new Font("tahoma",Font.BOLD,50));
        text2.setForeground(Color.WHITE);
        image.add(text2);
        
        JLabel text3 = new JLabel("We Are Here For You");
        text3.setBounds(120,200,500,50);
        text3.setFont(new Font("tahoma",Font.PLAIN,40));
        text3.setForeground(Color.WHITE);
        image.add(text3);
        
        JLabel text4 = new JLabel("Free And Better Education For ");
        text4.setBounds(50,250,600,50);
        text4.setFont(new Font("tahoma",Font.PLAIN,40));
        text4.setForeground(Color.WHITE);
        image.add(text4);
        
        JLabel text5 = new JLabel("All.... ");
        text5.setBounds(250,300,600,50);
        text5.setFont(new Font("tahoma",Font.PLAIN,40));
        text5.setForeground(Color.WHITE);
        image.add(text5);
        
        
        setVisible(true);
        
    }
     public static void main(String[] args){
            new EP();
    }
    
    
    
}
