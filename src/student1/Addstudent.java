package student1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;


public class Addstudent extends JFrame implements ActionListener {
    JTextField tfusername,tfname,tfgender,tfdob,tfaddress,tfcontact,tfgrade,tfparents;
    JButton submit,cancel;
    
    Addstudent(){
        
        getContentPane().setBackground(new Color(153,153,153));
        
        setLayout(null);
        
        JLabel text = new JLabel("Add Student");
        text.setBounds(10,0,200,50);
        text.setFont(new Font("tahoma",Font.BOLD,30));
        add(text);
        
        JLabel username = new JLabel("Username");
        username.setBounds(100,60,100,30);
        username.setFont(new Font("tahoma",Font.PLAIN,20));
        add(username);
        
        tfusername  = new JTextField();
        tfusername.setBounds(260,60,200,30);
        add(tfusername);
        
        
        JLabel name = new JLabel("Name");
        name.setBounds(100,110,100,30);
        name.setFont(new Font("tahoma",Font.PLAIN,20));
        add(name);
        
        tfname  = new JTextField();
        tfname.setBounds(260,110,200,30);
        add(tfname);
        
        JLabel gender = new JLabel("Gender");
        gender.setBounds(100,160,100,30);
        gender.setFont(new Font("tahoma",Font.PLAIN,20));
        add(gender);
        
        tfgender  = new JTextField();
        tfgender.setBounds(260,160,200,30);
        add(tfgender);
        
        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(100,210,150,30);
        dob.setFont(new Font("tahoma",Font.PLAIN,20));
        add(dob);
        
        tfdob  = new JTextField();
        tfdob.setBounds(260,210,200,30);
        add(tfdob);
        
        JLabel address = new JLabel("Address");
        address.setBounds(100,260,100,30);
        address.setFont(new Font("tahoma",Font.PLAIN,20));
        add(address);
        
        tfaddress  = new JTextField();
        tfaddress.setBounds(260,260,200,30);
        add(tfaddress);
        
        JLabel contact = new JLabel("Contact Number");
        contact.setBounds(100,310,150,30);
        contact.setFont(new Font("tahoma",Font.PLAIN,20));
        add(contact);
        
        tfcontact  = new JTextField();
        tfcontact.setBounds(260,310,200,30);
        add(tfcontact);
        
        JLabel grade = new JLabel("Grade");
        grade.setBounds(100,360,150,30);
        grade.setFont(new Font("tahoma",Font.PLAIN,20));
        add(grade);
        
        tfgrade  = new JTextField();
        tfgrade.setBounds(260,360,200,30);
        add(tfgrade);
        
        JLabel parents = new JLabel("Parents Name");
        parents.setBounds(100,410,150,30);
        parents.setFont(new Font("tahoma",Font.PLAIN,20));
        add(parents);
        
        tfparents  = new JTextField();
        tfparents.setBounds(260,410,200,30);
        add(tfparents);
        
        
        submit = new JButton("Submit");
        submit.setBounds(153,490,90,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel = new JButton("Back");
        cancel.setBounds(305,490,90,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select*from account where username = 'username'");
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
            String gender = tfgender.getText();
            String dob = tfdob.getText();
            String address = tfaddress.getText();
            String contact = tfcontact.getText();
            String grade = tfgrade.getText();
            String parents = tfparents.getText();
            
            try{
                conn c = new conn();
                String query = "insert into student values('"+username+"','"+name+"','"+gender+"','"+dob+"','"+address+"','"+contact+"','"+grade+"','"+parents+"')";
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
        new  Addstudent ();

}    
    
}
