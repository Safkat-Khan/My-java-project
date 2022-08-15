import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminLogin implements ActionListener{
    JFrame frm;
    JTextField tf1;
    JPasswordField jp1;
    ImageIcon i1;
    JButton lgbtn,exbtn;

    User nun1, nun2;
	User users[];

AdminLogin(){

    // Frame Layout
    frm = new JFrame("Admin Login Page");
    frm.setBounds(450, 80, 600, 650);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setResizable(false);
    frm.setVisible(true);

    //logo
    i1 = new ImageIcon("logo.png");

    // Log in button
    lgbtn = new JButton("Login");
    lgbtn.setBounds(170, 150, 90, 40);
    lgbtn.setForeground(Color.blue);
    lgbtn.addActionListener(this);
    lgbtn.setFont(new Font("Default", Font.BOLD, 13));

    // Exit button
    exbtn = new JButton("Exit");
    exbtn.setBounds(825, 3, 60, 30);
    exbtn.setBackground(Color.orange);
    exbtn.setForeground(Color.red);
    exbtn.addActionListener(this);
    exbtn.setFont(new Font("Default", Font.BOLD, 13));



     //Adding Part
    //frm.add(lgbtn);
    //frm.add(exbtn);
    frm.setIconImage(i1.getImage());


 // Action Part
        public void actionPerformed(ActionEvent e) {

        }
    }














}
