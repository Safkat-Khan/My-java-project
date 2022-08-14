import javax.swing.*;
import java.awt.*;


public class signup extends JFrame {
    JFrame frm;
    JLabel label1,label2,label3,label4,label5,header;
    JTextField tf1,tf2,tf3;
    JPasswordField jp1,jp2;


signup(){

           // Frame Layout
        frm = new JFrame("Signup page");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);
        frm.setVisible(true);
        frm.setBounds(450, 80, 600, 650);


        //Header
        header = new JLabel("header");
        header.setBounds(100, 100, 100, 100);

         // User Name
        label1 = new JLabel("Name");
        label1.setBounds(100, 150, 150, 70);

         // User Password
        label2 = new JLabel("Password");
        label2.setBounds(100, 220, 100, 50);

        // User password comform
        label3 = new JLabel("Re-type Password");
        label3.setBounds(100, 270, 150, 50);

        // User Email account
        label4 = new JLabel("Email Account");
        label4.setBounds(100, 320, 100, 50);

        // User Phone
        label5 = new JLabel("Phone Number");
        label5.setBounds(100, 370, 100, 50);

        // User name textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(280, 170, 150, 20);
       // tf1.setBackground(Color.lightGray);

        //Email textfield adding.
        tf2 = new JTextField();
        tf2.setBounds(280, 300, 150, 20);
        //tf2.setBackground(Color.lightGray);

        // Phone Number textfield adding.
        tf3 = new JTextField();
        tf3.setBounds(380, 350, 150, 20);
        //tf3.setBackground(Color.lightGray);

//Adding Part
frm.add(header);
frm.add(label1);
frm.add(label2);
frm.add(label3);
frm.add(label4);
frm.add(label5);
frm.add(tf1);
frm.add(tf2);
frm.add(tf3);

}

}