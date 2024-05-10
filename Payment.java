
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

public class Payment extends JFrame implements ActionListener{ 

    JFrame frame1;
    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup bg1;
    ImageIcon img,i1;
    JLabel text1,imgLabel,imgLabel2,imgLabel3,imgLabel4,lab7;
    JButton nxbtn,prvbtn,exbtn;
    int a;

    Payment() {
        //Creating Frame
        frame1 = new JFrame("Payment");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);

        // logo
        i1 = new ImageIcon("logo.png");


        //Text Added
        text1 = new JLabel("Your Bill is : ");
        text1.setBounds(50, 300, 200, 20);
        text1.setFont(new Font("Default", Font.BOLD, 15));



        //Bkash Image Added
        img = new ImageIcon("Bkash.jpg");
        imgLabel2 = new JLabel(img);
        imgLabel2.setBounds(40, 100, 150, 150);

        //Bkash CheckBox
        JCheckBox checkBox1 = new JCheckBox("Bkash");
        checkBox1.setBounds(70, 280, 100, 30);
        checkBox1.setFont(new Font("Default", Font.BOLD, 15));

        //Nogod Image Added
        img = new ImageIcon("nogod.jpg");
        imgLabel3 = new JLabel(img);
        imgLabel3.setBounds(220, 100, 150, 150);

        //Nogod CheckBox
        JCheckBox checkBox2 = new JCheckBox("Nogod");
        checkBox2.setBounds(260, 280, 100, 30);
        checkBox2.setFont(new Font("Default", Font.BOLD, 15));

        //MasterCard Image Added
        img = new ImageIcon("MasterCard.jpg");
        imgLabel4 = new JLabel(img);
        imgLabel4.setBounds(400, 100, 150, 150);

        //MasterCard CheckBox
        JCheckBox checkBox3 = new JCheckBox("MasterCard");
        checkBox3.setBounds(420, 280, 150, 30);
        checkBox3.setFont(new Font("Default", Font.BOLD, 15));

        //Bill Text 
        text1 = new JLabel("Your Bill is : ");
        text1.setBounds(50, 350, 200, 20);
        text1.setFont(new Font("Default", Font.BOLD, 15));

        //Img Added
        img = new ImageIcon("Logo.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(170, 100, 250, 250);


        // To get a number for payment
        Random rand = new Random();
        int a = rand.nextInt(400) + 101;


        // Payment Number
        lab7 = new JLabel();
        lab7.setText("       "+ a + " ");
        lab7.setBounds(170, 345, 75, 30);
        lab7.setFont(new Font("Default",Font.BOLD,15));
        lab7.setForeground(Color.red);
        lab7.setBackground(Color.white);
        lab7.setOpaque(true);
        

        //Previous Button
        prvbtn=new JButton("Back");
        prvbtn.setBounds(0, 0, 100, 25);
        prvbtn.setBackground(Color.orange);
        prvbtn.addActionListener(this);

        //NextButton
        nxbtn = new JButton("Pay");
        nxbtn.setBounds(250, 550, 100, 25);
        nxbtn.setBackground(Color.yellow);
        nxbtn.setForeground(Color.black);
        nxbtn.addActionListener(this);
        
        //Exit Button
        exbtn=new JButton("Exit");
        exbtn.setBounds(500, 0, 100, 25);
        exbtn.setBackground(Color.orange);
        exbtn.addActionListener(this);
        //Button Group
        bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
        bg1.add(rb4);
		//ALL Component Added
        frame1.add(checkBox1);
        frame1.add(checkBox2);
        frame1.add(checkBox3);
       // frame1.add(rb1);
       // frame1.add(rb2);
       // frame1.add(rb3);
       // frame1.add(rb4);

        frame1.add(lab7);
        frame1.add(text1);
        frame1.add(nxbtn);
        frame1.add(exbtn);
        frame1.add(prvbtn);
        frame1.add(imgLabel2);
        frame1.add(imgLabel3);  
        frame1.add(imgLabel4);
        frame1.setIconImage(i1.getImage());
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setBounds(450,  80, 600, 650);
    }
    //Button Action Perform
        public void actionPerformed(ActionEvent e) {
        // prvbtn action performed
        if(e.getSource()==prvbtn)
		{  
			new UserdashBoard();
			frame1.setVisible(false);
        }  
        if (e.getSource() == nxbtn) {
            frame1.setVisible(false);
            JOptionPane.showMessageDialog(null, "Your Payment is Successful, Thank You");
        }        
                if(e.getSource()==exbtn)
                {
                    System.exit(0);
                }

                
        int result = 0;
        if (result != (a)) {
            JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);}
                }

    }
