
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Profile implements ActionListener {
    public JButton prvBtn,logoutBtn,updBtn;
    public JLabel uName;
    public JTextField userTf;
    public ImageIcon i1;
    
    JFrame frame;

    public Profile(String user) {

        // create frame
        frame = new JFrame("Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(300, 100, 600, 650);

        //*---------Icon-------------- */
        i1 = new ImageIcon("logo.png");

        // construct components
        prvBtn = new JButton("Previous");
        prvBtn.setBackground(Color.decode("#fcf51e"));
        prvBtn.addActionListener(this);
        prvBtn.setForeground(Color.BLACK);

        logoutBtn = new JButton("Logout ");
        logoutBtn.setBackground(Color.decode("#d14434"));
        logoutBtn.setForeground(Color.BLACK);

        updBtn = new JButton("Update Profile");
        updBtn.setBackground(Color.decode("#29a3cc")); 
        updBtn.addActionListener(this);

        uName = new JLabel("Username:");
        uName.setForeground(Color.black);
        uName.setFont(new Font("Default", Font.BOLD, 17));

        userTf = new JTextField(user);
        
        //Logo
        i1 = new ImageIcon("logo.png");

        // add components
        frame.add(prvBtn);
        frame.add(logoutBtn);
        frame.add(updBtn);
        frame.add(uName);
        frame.add(userTf);

        // set component bounds (only needed by Absolute Positioning)
        prvBtn.setBounds(1, 1, 100, 30);
        logoutBtn.setBounds(495, 1, 90, 30);
        updBtn.setBounds(200, 215, 140, 30);
        uName.setBounds(135, 125, 100, 25);
        userTf.setBounds(250, 125, 150, 30);

        // addActionListener
        logoutBtn.addActionListener(this);
        prvBtn.addActionListener(this);

        // adjust size and set layout
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(i1.getImage());
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == updBtn) {
            JOptionPane.showMessageDialog(null, "Profile Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (e.getSource() == logoutBtn) {
            new LogInPage();
            frame.setVisible(false);
        } 

        else if (e.getSource() == prvBtn) {
            frame.setVisible(false);
            new AdminDashboard(userTf.getText());
        }  
    }

}