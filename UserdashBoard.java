import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;



public class UserdashBoard implements ActionListener {
    

    //frame
	JFrame frame;

    //Buttons
	JButton lgBtn,edpfBtn,item1,item2,item3,item4;

    ImageIcon img1,img2,img3,img4,icon;

    JLabel label1;
    ImageIcon i1;


    UserdashBoard(String user){

        // frame and title added.
        frame = new JFrame("UserDashBoard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // logo
        i1 = new ImageIcon("logo.png");



         // Forget button
        lgBtn = new JButton("⬅ Logout");
        lgBtn.setBounds(170, 120, 140, 40);
        lgBtn.setBackground(Color.orange);
        lgBtn.addActionListener(this);
        lgBtn.setFont(new Font("Default", Font.BOLD, 13));


        // Forget button
        edpfBtn = new JButton("Edit Profile");
        edpfBtn.setBounds(270, 220, 140, 40);
        edpfBtn.setBackground(Color.orange);
        edpfBtn.addActionListener(this);
        edpfBtn.setFont(new Font("Default", Font.BOLD, 13));

        
        // Forget button
        item1 = new JButton("item1");
        item1.setBounds(370, 320, 140, 40);
        item1.setBackground(Color.orange);
        item1.addActionListener(this);
        item1.setFont(new Font("Default", Font.BOLD, 13));


        // Forget button
        item2 = new JButton("item2");
        item2.setBounds(470, 420, 140, 40);
        item2.setBackground(Color.orange);
        item2.addActionListener(this);
        item2.setFont(new Font("Default", Font.BOLD, 13));

        // Forget button
        item3 = new JButton("item3");
        item3.setBounds(570, 520, 140, 40);
        item3.setBackground(Color.orange);
        item3.addActionListener(this);
        item3.setFont(new Font("Default", Font.BOLD, 13));

        // Forget button
        item4 = new JButton("item4");
        item4.setBounds(570, 320, 140, 40);
        item4.setBackground(Color.orange);
        item4.addActionListener(this);
        item4.setFont(new Font("Default", Font.BOLD, 13));
    
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(350, 90, 900, 650);


       // ADDING FRAME
       frame.add(label1);
       frame.add(lgBtn);
       frame.add(edpfBtn);
       frame.add(item1);
       frame.add(item2);
       frame.add(item3);
       frame.add(item4);
       frame.add(item1);
       frame.setIconImage(i1.getImage());
       

    }


        // Action Part
        public void actionPerformed(ActionEvent e) {

            
        if (e.getSource() == lgBtn) {
            new LogInPage();
            frame.setVisible(false);
        }

        
        if (e.getSource() == edpfBtn) {
            new Editprofile();
            frame.setVisible(false);
        }

        
        if (e.getSource() == item1) {
            new item1();
            frame.setVisible(false);
        }

        
        if (e.getSource() == item2) {
            //new item2();
            frame.setVisible(false);
        }

        
        if (e.getSource() == item3) {
            //new item3();
            frame.setVisible(false);
        }

        
        if (e.getSource() == item4) {
           // new item4();
            frame.setVisible(false);
        }


        }
}
