import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Signup {
    JFrame frm;
    JLabel label1,label2,label3,label4,label5,header,imgLabel1;
    JTextField tf1,tf2,tf3;
    JPasswordField jp1,jp2;
    ImageIcon img,i1;

Signup(){

           // Frame Layout
        frm = new JFrame("Signup page");
        frm.setBounds(450, 80, 600, 650);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);
        frm.setVisible(true);
        frm.setForeground(Color.GRAY);

        //logo
        i1 = new ImageIcon("logo.png");

        //Header
        header = new JLabel("Sign Up");
        header.setBounds(80, 50, 300, 100);
        header.setForeground(Color.black);
        header.setFont(new Font("Default",Font.BOLD,27));


         // User Name
        label1 = new JLabel("Name");
        label1.setBounds(100, 147, 150, 70);
        label1.setFont(new Font("Default",Font.BOLD,15));

         // User Password
        label2 = new JLabel("Password");
        label2.setBounds(100, 205, 100, 50);
        label2.setFont(new Font("Default",Font.BOLD,15));

        // User password comform
        label3 = new JLabel("Re-type Password");
        label3.setBounds(100, 250, 200, 50);
        label3.setFont(new Font("Default",Font.BOLD,15));

        // User Email account
        label4 = new JLabel("Email Account");
        label4.setBounds(100, 300, 200, 50);
        label4.setFont(new Font("Default",Font.BOLD,15));

        // User Phone
        label5 = new JLabel("Phone Number");
        label5.setBounds(100, 352, 200, 50);
        label5.setFont(new Font("Default",Font.BOLD,15));

        // User name textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(280, 170, 150, 20);

        //Email textfield adding.
        tf2 = new JTextField();
        tf2.setBounds(280, 315, 150, 20);
        

        // Phone Number textfield adding.
        tf3 = new JTextField();
        tf3.setBounds(280, 370, 150, 20);

        //USER SIDE IMG
        img = new ImageIcon("background.jpg");
        imgLabel1 = new JLabel(img);
        imgLabel1.setBounds(0, 0, 600, 650);


//Adding Part
frm.add(header);
frm.add(label1);
frm.add(label2);
frm.add(label3);
frm.add(label4);
frm.add(label5);
//frm.add(imgLabel1);
frm.add(tf1);
frm.add(tf2);
frm.add(tf3);
frm.setIconImage(i1.getImage());

}

}