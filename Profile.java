import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Profile implements ActionListener{
    private JButton prvBtn;
    private JButton logoutBtn;
    private JButton updBtn;
    private JLabel uName;
    private JTextField userTf;
    private ImageIcon i1;
	JFrame frame;

    public Profile(String user) {
		
		//create frame
		frame = new JFrame ("Profile");
		
        //construct components
        prvBtn = new JButton ("Previous");
        logoutBtn = new JButton ("Logout");
        updBtn = new JButton ("Update");
        uName = new JLabel ("Username:");
        userTf = new JTextField (user);
        i1 = new ImageIcon("download.png");

        uName.setForeground(new Color (230, 238, 250));
        uName.setFont(new Font("Default",Font.BOLD,17));

        //add components
        frame.add (prvBtn);
        frame.add (logoutBtn);
        frame.add (updBtn);
        frame.add (uName);
        frame.add (userTf);

        //set component bounds (only needed by Absolute Positioning)
        prvBtn.setBounds (320, 5, 90, 20);
        logoutBtn.setBounds (450, 5, 90, 20);
        updBtn.setBounds (170, 215, 140, 30);
        uName.setBounds (135, 125, 100, 25);
        userTf.setBounds (250, 125, 100, 25);
		
		//addActionListener
		logoutBtn.addActionListener(this);
		prvBtn.addActionListener(this);
		//updBtn.addActionListener(this);
		
		//frame properties
		//adjust size and set layout
        frame.setSize (600, 329);
		frame.setLocationRelativeTo(null);//to center screen gui
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color (1, 5, 77));
		frame.setIconImage(i1.getImage());
        frame.getContentPane();
        frame.setVisible (true); 
    }
	
	
	public void actionPerformed(ActionEvent e) {  
         
        if(e.getSource()==logoutBtn)
		{  
			new LogInPage();
			frame.setVisible(false);
			
        }  
		else if(e.getSource()==prvBtn)
		{
			new Dashboard(userTf.getText());
			frame.setVisible(false);
		}
		else if(e.getSource()==updBtn)
		{
			//write necessary codes to update user profile
		}
		
	}
	
	
}