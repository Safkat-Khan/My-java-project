import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminLogin // implements ActionListener
{
    JFrame frm;
    JTextField tf1;
    JPasswordField pf1;
    ImageIcon i1;
    JButton lgbtn, exbtn;
    JLabel label1, label2, header;

    AdminLogin() {

        // Frame Layout
        frm = new JFrame("Admin Login Page");
        frm.setBounds(450, 80, 600, 650);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);
        frm.setVisible(true);

        // logo
        i1 = new ImageIcon("logo.png");

        // Log in button
        lgbtn = new JButton("Login");
        lgbtn.setBounds(270, 260, 90, 40);
        lgbtn.setForeground(Color.blue);
        // lgbtn.addActionListener(this);
        lgbtn.setFont(new Font("Default", Font.BOLD, 13));

        // Exit button
        exbtn = new JButton("Exit");
        exbtn.setBounds(527, 3, 60, 30);
        exbtn.setBackground(Color.orange);
        exbtn.setForeground(Color.red);
        // exbtn.addActionListener(this);
        exbtn.setFont(new Font("Default", Font.BOLD, 13));

        // user name label
        label1 = new JLabel("Username :");
        label1.setBounds(150, 150, 150, 20);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Default", Font.BOLD, 17));

        // user password label
        label2 = new JLabel("Password :");
        label2.setBounds(150, 200, 150, 20);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Default", Font.BOLD, 17));

        // textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(250, 145, 150, 30);

        // password field adding.
        pf1 = new JPasswordField();
        pf1.setBounds(250, 200, 150, 30);

        // Adding Part
        frm.add(tf1);
        frm.add(pf1);
        frm.add(lgbtn);
        frm.add(exbtn);
        frm.add(label1);
        frm.add(label2);
        frm.setIconImage(i1.getImage());

        // Action Part
        // public void actionPerformed(ActionEvent e) {

        // }
    }

}
