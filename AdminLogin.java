import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminLogin implements ActionListener
{
    JFrame frm;
    JTextField tf1;
    JPasswordField pf1;
    ImageIcon i1;
    JButton lgbtn, exbtn;
    JLabel label1, label2, header;

    User un1, un2, un3;
    User users[];


    AdminLogin() {

        // MUTIPAL USER
        un1 = new User("Safkat", "123");
        un2 = new User("ABCD", "456");
        un3 = new User("abcd", "789");
        users = new User[6];
        users[0] = un1;
        users[1] = un2;
        users[2] = un3;

        // Frame Layout
        frm = new JFrame("Admin Login Page");
        frm.setBounds(450, 80, 600, 650);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);
        frm.setVisible(true);

        // logo
        i1 = new ImageIcon("logo.png");

        // Log in button
        lgbtn = new JButton("Login  ➤");
        lgbtn.setBounds(170, 300, 200, 30);
        lgbtn.setForeground(Color.white);
        lgbtn.setBackground(Color.black);
        lgbtn.addActionListener(this);
        lgbtn.setFont(new Font("Default", Font.BOLD, 15));

        // Exit button
        exbtn = new JButton("Exit ✘");
        exbtn.setBounds(515, 3, 80, 30);
        exbtn.setBackground(Color.orange);
        exbtn.setForeground(Color.black);
        exbtn.addActionListener(this);
        exbtn.setFont(new Font("Default", Font.BOLD, 13));

        // user name label
        label1 = new JLabel("Username");
        label1.setBounds(170, 154, 150, 20);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Default", Font.BOLD, 17));

        // user password label
        label2 = new JLabel("Password");
        label2.setBounds(170, 223, 150, 20);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Default", Font.BOLD, 17));

        // textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(170, 180, 200, 30);

        // password field adding.
        pf1 = new JPasswordField();
        pf1.setBounds(170, 250, 200, 30);

        // Adding Part
        frm.add(tf1);
        frm.add(pf1);
        frm.add(lgbtn);
        frm.add(exbtn);
        frm.add(label1);
        frm.add(label2);
        frm.setIconImage(i1.getImage());
    }

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == lgbtn) {
                String user = tf1.getText();
                String pass = pf1.getText();
    
                int flag = 0;
    
                if (user.isEmpty() == false && pass.isEmpty() == false) {
                    for (int i = 0; i < users.length; i++) {
                        if (users[i] != null) {
                            if (user.equals(users[i].getUsername()) && pass.equals(users[i].getPassword())) {
                                flag = 1;
                                break;
    
                            }
                        }
                    }
                    if (flag == 1) {
                        frm.setVisible(false);
                    } else {
                        showMessageDialog(null, "Invalid Username or password!");
                    }
                } else {
                    showMessageDialog(null, "Fillup Every Field.");
                }
            }

            if (e.getSource() == lgbtn) {
                //new ;
                frm.setVisible(false);
            }
    
            else if (e.getSource() == exbtn) {
                System.exit(0);
            }
    }

}
