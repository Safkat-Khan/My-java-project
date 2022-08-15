import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class ForgetPass {
    JLabel l;
    ImageIcon i1;
    JLabel label1,label2;
    JButton svbtn;
    JTextField tf1,tf2;



    ForgetPass(){  
        JFrame fp= new JFrame(); 
		l = new JLabel("Forget Password");
        l.setFont(new Font("Default",Font.BOLD,19));
        
		l.setBounds(50,50,350,40); 
		fp.add(l);
        //Frame Size
        fp.setSize(400,400);  
        fp.setLayout(null);  
        fp.setVisible(true);  
        fp.setBounds(450,  80, 600, 650);


    }         
    
}
