import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class LogInPage extends JFrame implements ActionListener {
    JFrame frame;
    JLabel label1, label2,imgLabel;
    JTextField tf1;
    JPasswordField pf1;
    JButton lgbtn, fpbtn, sgbtn, exbtn;
    ImageIcon img,icon;
    JLabel imgLabel1, imgLabel2, imgLabel3;
    Font f1, f2, f3, f4, f5, f6;

    LogInPage() {
        // frame and title added.
        frame = new JFrame("LoginPage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // label1.
        label1 = new JLabel("Username :");
        label1.setBounds(590, 150, 150, 20);
        label1.setForeground(Color.black);
        label1.setFont(f1);
        // label2 
        label2 = new JLabel("Password :");
        label2.setBounds(590, 185, 150, 20);
        label2.setForeground(Color.black);
        label2.setFont(f6);

        // textfield adding.
        tf1 = new JTextField();
        tf1.setBounds(680, 150, 150, 20);
        tf1.setBackground(Color.lightGray);

        // password field adding.
        pf1 = new JPasswordField();
        pf1.setBounds(680, 185, 150, 20);
        pf1.setBackground(Color.lightGray);

        // Log in button
        lgbtn = new JButton("Login");
        lgbtn.setBounds(700, 240, 90, 30);
        lgbtn.setForeground(Color.blue);
        lgbtn.addActionListener(this);
       // lgbtn.addMouseListener(this);

        // Forget button
        fpbtn = new JButton("Forget Pass");
        fpbtn.setBounds(605, 300, 110, 30);
        fpbtn.setBackground(Color.orange);
        fpbtn.addActionListener(this);

        // Signup button
        sgbtn = new JButton("SignUp");
        sgbtn.setBounds(755, 300, 110, 30);
        sgbtn.setBackground(Color.orange);
        sgbtn.addActionListener(this);

        // Exit button
        exbtn = new JButton("Exit");
        exbtn.setBounds(825, 3, 60, 30);
        exbtn.setBackground(Color.orange);
        exbtn.addActionListener(this);
       // exbtn.addMouseListener(this);
		

        img = new ImageIcon("user.png");
        imgLabel1 = new JLabel(img);
        imgLabel1.setBounds(517, 111, 100, 100);

        img = new ImageIcon("lock.png");
        imgLabel2 = new JLabel(img);
        imgLabel2.setBounds(517, 142, 100, 100);

        img = new ImageIcon("wepik-photo-mode.png");
        imgLabel3 = new JLabel(img);
        imgLabel3.setBounds(0, 0, 500, 650);

        // Adding Function On Frame Part
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(400, 50, 900, 650);

        frame.add(label1);
        frame.add(label2);
        frame.add(tf1);
        frame.add(pf1);
        frame.add(lgbtn);
        frame.add(fpbtn);
        frame.add(sgbtn);
        frame.add(exbtn);
        frame.add(imgLabel1);
        frame.add(imgLabel2);
        frame.add(imgLabel3);
    }
/* 
//mouse action
public void mouseClicked(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me)
{
    if(me.getSource() == lgbtn)
    {
        lgbtn.setBackground(Color.BLUE);
        lgbtn.setForeground(Color.WHITE);
    }
    else if(me.getSource() == exbtn)
    {
        exbtn.setBackground(Color.BLUE);
        exbtn.setForeground(Color.WHITE);
    }
    else
    {
        
    }
}
*/

//mouse
public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == lgbtn)
		{
			lgbtn.setBackground(Color.GREEN);
			lgbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exbtn)
		{
			exbtn.setBackground(Color.RED);
			exbtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}


    // Action Part
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == lgbtn) {
            String user = tf1.getText();
            String pass = pf1.getText();

            if (user.equals("safkat") && pass.equals("123")) {
                frame.setVisible(false);
                new FirstDashBoard();
            } else {
                showMessageDialog(null, "Invalid Username and password!");
            }
        }

        if (e.getSource() == fpbtn) {
             new ForgetPass();
            frame.setVisible(false);
        }

        if (e.getSource() == exbtn) {
            System.exit(0);
        }

        if (e.getSource() == sgbtn) {
            // new SignUp();
            frame.setVisible(false);
        }

    }
}
