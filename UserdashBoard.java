
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class UserdashBoard extends JFrame implements ActionListener{ 

    JFrame frame1;
    JComboBox combo1,combo2,combo3;
    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup bg1;
    ImageIcon img,i1;
    JLabel text1,imgLabel,imgLabel2,imgLabel3,imgLabel4;
    JButton nxbtn,prvbtn,exbtn;

    UserdashBoard() {
        //Creating Frame
        frame1 = new JFrame("DashBoard");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);

        // logo
        i1 = new ImageIcon("logo.png");

        //Burger Image Added
        img = new ImageIcon("Burger.jpg");
        imgLabel2 = new JLabel(img);
        imgLabel2.setBounds(50, 50, 150, 150);

        //Burger CheckBox
        JCheckBox checkBox1 = new JCheckBox("Burger");
        checkBox1.setBounds(80, 200, 100, 30);
        checkBox1.setFont(new Font("Default", Font.BOLD, 15));

        //Pizza Image Added
        img = new ImageIcon("Pizza.jpg");
        imgLabel3 = new JLabel(img);
        imgLabel3.setBounds(230, 50, 150, 150);

        //Pizza CheckBox
        JCheckBox checkBox2 = new JCheckBox("Pizza");
        checkBox2.setBounds(270, 200, 100, 30);
        checkBox2.setFont(new Font("Default", Font.BOLD, 15));

        //Sandwish Image Added
        img = new ImageIcon("SandWitch.jpg");
        imgLabel4 = new JLabel(img);
        imgLabel4.setBounds(410, 50, 150, 150);

        //Sandwish CheckBox
        JCheckBox checkBox3 = new JCheckBox("Sandwish");
        checkBox3.setBounds(430, 200, 100, 30);
        checkBox3.setFont(new Font("Default", Font.BOLD, 15));


        //Burger Combo Box
        String items[] = { "1", "2", "3", "4", "5" };
        combo1 = new JComboBox(items);
        combo1.setBounds(70, 230, 100, 30);
        combo1.setFont(new Font("Default", Font.BOLD, 10));

        //Burger Combo Box
        String item[] = { "1", "2", "3", "4", "5" };
        combo2 = new JComboBox(item);
        combo2.setBounds(250, 230, 100, 30);
        combo2.setFont(new Font("Default", Font.BOLD, 10));

        //Burger Combo Box
        String ite[] = { "1", "2", "3", "4", "5" };
        combo3 = new JComboBox(ite);
        combo3.setBounds(430, 230, 100, 30);
        combo3.setFont(new Font("Default", Font.BOLD, 10));


        //Text Added
        text1 = new JLabel("Select Your Drink");
        text1.setBounds(50, 300, 200, 20);
        text1.setFont(new Font("Default", Font.BOLD, 15));

        //Radio Button
        rb1 = new JRadioButton("Water");
		rb1.setBounds(60, 330, 100, 20);
        rb1.setFont(new Font("Default", Font.BOLD, 15));

        rb2 = new JRadioButton("Pepsi");
		rb2.setBounds(60, 365, 100, 20);
        rb2.setFont(new Font("Default", Font.BOLD, 15));

        rb3 = new JRadioButton("7up");
		rb3.setBounds(60, 395, 100, 20);
        rb3.setFont(new Font("Default", Font.BOLD, 15));
        
        rb4 = new JRadioButton("CoCaCola");
        rb4.setBounds(60, 425, 100, 20);
        rb4.setFont(new Font("Default", Font.BOLD, 15));

        //Img Added
        img = new ImageIcon("Logo.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(170, 100, 250, 250);

        //Previous Button
        prvbtn=new JButton("Previous");
        prvbtn.setBounds(0, 0, 100, 25);
        prvbtn.setBackground(Color.orange);
        prvbtn.addActionListener(this);

        //NextButton
        nxbtn = new JButton("Next");
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
        frame1.add(combo1);
        frame1.add(combo2);
        frame1.add(combo3);
        frame1.add(rb1);
        frame1.add(rb2);
        frame1.add(rb3);
        frame1.add(rb4);
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
        if(e.getSource()==prvbtn)
		{  
			new LogInPage();
			frame1.setVisible(false);
        }  
            if(e.getSource()==nxbtn)
            {  
               new Payment() ;
               frame1.setVisible(false);
            } 
                if(e.getSource()==exbtn)
                {
                    System.exit(0);
                }
                }
    }
