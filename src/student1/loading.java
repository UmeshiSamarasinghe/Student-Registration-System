package student1;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


public class loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar bar;
    String username;
    public void run(){
        try{
            for (int i=1; i<=101; i++){
                int max = bar.getMaximum();
                int value = bar.getValue();
                
                if(value < max){ //101<100
                    bar.setValue(bar.getValue()+1);
                
                }else{
                    setVisible(false);
                    new Home(username);
                }
                Thread.sleep(50);
            
            }
        
        }catch (Exception e){
            e.printStackTrace();
        
        }
    
    }
    loading(String username){
        this.username = username;
        t = new Thread(this);
        
        getContentPane().setBackground(new Color(153,153,153));
        
        setLayout(null);
        
        JLabel text5 = new JLabel("Student Registration System ");
        text5.setBounds(50,20,600,50);
        text5.setFont(new Font("tahoma",Font.BOLD,30));
        add(text5);
        
        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading Please Wait.... ");
        loading.setBounds(200,140,500,30);
        loading.setForeground(Color.RED);
        loading.setFont(new Font("tahoma",Font.BOLD,20));
        add(loading);
        
        JLabel lblusername = new JLabel("Welcome"+username);
        lblusername.setBounds(20,310,400,50);
        lblusername.setForeground(Color.RED);
        lblusername.setFont(new Font("tahoma",Font.BOLD,20));
        add(lblusername);
        
        t.start();
        
        
          setBounds(100,100,600,400);
        setVisible(true);
        
    }
     public static void main(String[] args){
            new loading("");
    
    
    }
    
}
