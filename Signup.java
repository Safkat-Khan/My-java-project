import javax.swing.*;
import java.awt.*;


public class signup extends JFrame 
{
    JFrame frm;
    JLabel label1,label2,label3,label4,label5;
    JTextField tf1,tf2,tf3;
    JPasswordField jp1,jp2;


    signup(){
           // Frame Layout
        frm = new JFrame("Signup page");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);
        frm.setVisible(true);
       // frm.setBounds(10, 60, 900, 650);
        frm.setBounds(400, 50, 900, 650);

         // User Name
        label1 = new JLabel("Enter Your Name :");
        label1.setBounds(150, 50, 500, 50);

         // User Password
        label2 = new JLabel("Enter Your Password :");
        label2.setBounds(150, 100, 500, 50);

        // User password comform
        label3 = new JLabel("Conform Your Password :");
        label3.setBounds(150, 150, 500, 50);

        // User Email account
        label4 = new JLabel("Enter Your Email Acount :");
        label4.setBounds(150, 200, 500, 50);

        // User Phone
        label5 = new JLabel("Enter Your Phone Number :");
        label5.setBounds(150, 250, 500, 50);

        // User name textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(580, 150, 150, 20);
        tf1.setBackground(Color.lightGray);

        //Email textfield adding.
        tf2 = new JTextField();
        tf2.setBounds(580, 200, 150, 20);
        tf2.setBackground(Color.lightGray);

        // Phone Number textfield adding.
        tf3 = new JTextField();
        tf3.setBounds(580, 250, 150, 20);
        tf3.setBackground(Color.lightGray);

//Adding Part
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