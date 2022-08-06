import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
public class Signup extends JFrame{
	    JLabel l1;
    	ImageIcon icon, logo;
    	JLabel label1, imgLabel;
    	Font f1, f2, f3, f4, f5, f6;
    	JTextField tf1, tf2, tf4, tf5;
    	JComboBox securityQsn;
    	JButton btn1, btn2, btn3, btn4, nBtn;
    	JPasswordField tf3;
    	Cursor cursor;
    	int a, b;


    Signup(){  
		        // frame and title added.
			JFrame fr1= new JFrame(); 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setSize(400,400);  
			this.setLayout(null);  
			this.setVisible(true);  
			this.setBounds(400,  50, 900, 650);
			//this.setBackground(Color.decode("51-153-255"));

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

		//label adding
		l1 = new JLabel("Input Your User name :");
		l1.setBounds(20,50,150,20); 



		//Function adding
		fr1.add(l1);


    }         

}

