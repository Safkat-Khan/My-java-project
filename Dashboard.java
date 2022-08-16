import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import javax.swing.table.*;

public class Dashboard implements ActionListener{  

    //frame
	JFrame frame;

    //Buttons
	JButton insertBtn,deleteBtn,dispBtn,searchBtn,logoutBtn,lcUser,proceedInsert,proceedDelete,proceedDisplay,proceedSearch;

	//labels  
    JLabel lano,lbalance,opName;
	
	//textfields
    JTextField accNo,balance;

	//textarea
    JTextArea display;

	//imageIcon
	ImageIcon i1;

	//for table(s)
	JTable jt;

    //Accounts
    Account[] accounts = new Account[100];

//-------------Parameter Constractor--------------------------

    Dashboard(String user)
	{  
     //create frame
		frame = new JFrame ("Dashboard");
    //adjust size and set layout
    //frame.setBounds(350,90,900,650);
    frame.setBounds(10,10,800,650);
    frame.setLayout (null);
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.setResizable(false);
    frame.setVisible (true);  

		
     //construct components
        lano = new JLabel ("Account Number");
        lano.setForeground(new Color (230, 238, 250));
        
        lbalance = new JLabel ("Balance");
        lbalance.setForeground(new Color (230, 238, 250));
        
		opName = new JLabel ("Default!");
		opName.setForeground(new Color (230, 238, 250));
		
        accNo = new JTextField (5);
        balance = new JTextField (5);
		
		display = new JTextArea (5, 5);
		
        //Insert Button----------------------------------------------
		insertBtn = new JButton ("Insert");
        proceedInsert = new JButton("Proceed");
        frame.add (insertBtn);
        frame.add (proceedInsert);
        insertBtn.setBounds (35, 130, 120, 30);
        proceedInsert.setBounds(355, 110, 120, 30);
		proceedInsert.setVisible(false);
		insertBtn.addActionListener(this);
		proceedInsert.addActionListener(this);


        //-----------------Delete Button----------------
        deleteBtn = new JButton ("Delete");
        proceedDelete = new JButton("Proceed");
        frame.add (deleteBtn);
        frame.add (proceedDelete);
        deleteBtn.setBounds (35, 190, 120, 30);
		proceedDelete.setVisible(false);
		proceedDelete.addActionListener(this);
		deleteBtn.addActionListener(this);

        //------------------Display-------------
        dispBtn = new JButton ("Display");
        proceedDisplay = new JButton("Proceed");
        frame.add (dispBtn);
        frame.add (proceedDisplay);
        display.setBounds (35, 180, 380, 90);
        dispBtn.setBounds (35, 250, 120, 30);
        proceedDisplay.setBounds(355, 110, 120, 30);
		display.setVisible(false);
		proceedDisplay.setVisible(false);
		proceedDisplay.addActionListener(this);
        frame.add (display);

//-------------------Search----------------
        proceedSearch = new JButton("Proceed");
        searchBtn = new JButton ("Search");
        frame.add (searchBtn);
        frame.add (proceedSearch);
        proceedDelete.setBounds(355, 110, 120, 30);
        proceedSearch.setBounds(355, 110, 120, 30);
        searchBtn.setBounds (665, 2, 120, 30);
		proceedSearch.setVisible(false);


//-------------------Log Out ---------------
logoutBtn = new JButton ("Logout");
proceedSearch.setVisible(false);
frame.add (logoutBtn);
logoutBtn.setBounds (350, 450, 120, 30);
logoutBtn.addActionListener(this);


		lcUser = new JButton(user);

		i1 = new ImageIcon("logo.png");
        frame.setIconImage(i1.getImage());

		jt = new JTable();

      //add components  
      frame.add (lano);
      frame.add (lbalance);
      frame.add (accNo);
	  frame.add (opName);
      frame.add (balance);



      frame.add (lcUser);
      frame.add(jt);



    //Set Bounce
    lano.setBounds (65, 90, 100, 25);
    lbalance.setBounds (35, 130, 100, 25);
	opName.setBounds (365, 80, 140, 30);
    accNo.setBounds (155, 90, 100, 25);
    balance.setBounds (155, 130, 100, 25);


 


    lcUser.setBounds (300, 5, 100, 30);
	
//Set Method
	    lano.setVisible(false);
		lbalance.setVisible(false);
		opName.setVisible(false);
		accNo.setVisible(false);
		balance.setVisible(false);

		
		

		//addActionListener
		lcUser.addActionListener(this);
		dispBtn.addActionListener(this);
		searchBtn.addActionListener(this);


		
	//adjust size and set layout
    //frame.setBounds(350,90,900,650);
    frame.setBounds(10,10,800,650);
    frame.setLayout (null);
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	frame.setIconImage(i1.getImage());
    frame.setResizable(false);
    frame.setVisible (true);  

    }     

    //Accunt adding array
    public void addAccount(Account a)
    {
    	int count = 0;
    	
    	for(int i=0; i<accounts.length; i++)
    	{
    		if(accounts[i]==null)
    		{
    			accounts[i]=a;
    			count++;
    			break;
    		}
    	}
    	if(count==0)
    	{
    		display.setText("Account can not be added.");
    		display.setFont(new Font("Times New Roman",Font.BOLD,19));
    	}
    	else
    	{
    		display.setText("Account added successfully.");
    		display.setFont(new Font("Times New Roman",Font.BOLD,19));
    	}
    }
    
    public Account searchAccount(String accNo)//function for searching an account
    {
    	Account a = null;
    	
    	for(int i=0; i<accounts.length; i++)
    	{
    		if(accounts[i]!=null)
    		{
    			if(accounts[i].getAccNo().equals(accNo))
        		{
        			a = accounts[i];
        			break;
        		}
    		}
    	}
    	return a;
    }
    
    public boolean deleteAccount(String accNo)//deleting an account
    {
    	boolean test = false;
    	
    	for(int i=0; i<accounts.length; i++)
    	{
    		if(accounts[i]!=null)
    		{
    			if(accounts[i].getAccNo().equals(accNo))
        		{
    				accounts[i]=null;
        			test=true;
        			break;
        		}
    		}
    	}
    	return test;
    }
    
    public void actionPerformed(ActionEvent e) {  
        
        if(e.getSource()==logoutBtn)
			{  
				new LogInPage();
				frame.setVisible(false);
				//System.exit(0);
        	}  
			else if(e.getSource() == lcUser)
			{
				String user = lcUser.getText();
				new Profile(user);
				frame.setVisible(false);
			}
			else if(e.getSource() == insertBtn)
			{
				lano.setVisible(true);
				lbalance.setVisible(true);
				opName.setText("Operation: Insert");
				opName.setVisible(true);
				accNo.setVisible(true);
				accNo.setText(null);
				balance.setVisible(true);
				balance.setText(null);
				display.setText(null);
				display.setVisible(true);
				proceedInsert.setVisible(true);
				proceedDelete.setVisible(false);
				proceedDisplay.setVisible(false);
				proceedSearch.setVisible(false);
		}
		   else if(e.getSource() == deleteBtn)
			{
				lano.setVisible(true);
				accNo.setVisible(true);
				accNo.setText(null);
				display.setVisible(true);
				display.setText(null);
				proceedInsert.setVisible(false);
				proceedDelete.setVisible(true);
				proceedDisplay.setVisible(false);
				proceedSearch.setVisible(false);
			
				opName.setText("Operation: Delete");
				opName.setVisible(true);
			
				lbalance.setVisible(false);
				balance.setVisible(false);
			}
			else if(e.getSource() == dispBtn)
			{
				lano.setVisible(true);
				accNo.setVisible(true);
				accNo.setText(null);
				display.setVisible(true);
				display.setText(null);
				proceedInsert.setVisible(false);
				proceedDelete.setVisible(false);
				proceedDisplay.setVisible(true);
				proceedSearch.setVisible(false);
			
				opName.setText("Operation: Display");
				opName.setVisible(true);
			
				lbalance.setVisible(false);
				balance.setVisible(false);
			}
			else if(e.getSource() == searchBtn)
			{
				lano.setVisible(true);
				accNo.setVisible(true);
				accNo.setText(null);
				display.setVisible(true);
				display.setText(null);
				proceedInsert.setVisible(false);
				proceedDelete.setVisible(false);
				proceedDisplay.setVisible(false);
				proceedSearch.setVisible(true);
			
				opName.setText("Operation: Search");
				opName.setVisible(true);
			
				lbalance.setVisible(false);
				balance.setVisible(false);
			}
        
			if(e.getSource()==proceedInsert)
			{
			
				String accNum = accNo.getText();
				String bal = balance.getText();
			
				if(accNum.isEmpty()==false && bal.isEmpty()==false )
				{
					if(searchAccount(accNum)==null)
					{
						Account a = new Account(accNum,bal);
						this.addAccount(a);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"An account already exists with that Account No. "+accNum+". Try again");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter valid information in the fields");
				}
			
			}
			if(e.getSource()==proceedDelete)
			{
				String test = accNo.getText();
			
				boolean isDeleted = this.deleteAccount(test);
			
				if(isDeleted == true)
				{
					display.setText("Account deleted successfully.");
					display.setFont(new Font("Times New Roman",Font.BOLD,19));
				}
				else
				{
					display.setText("Account could not be deleted.");
					display.setFont(new Font("Times New Roman",Font.BOLD,19));
				}
			}
			if(e.getSource()==proceedDisplay)
			{
				String test = accNo.getText();
			
				accNo.setText(null);
				
				if(test.isEmpty()==false)
				{
					Account a = searchAccount(test);
				
					if(a!=null)
					{
						String column[] = {"AccNo.","Balance"};
						String data[][] = {{"Account No.","Balance (taka)"},{a.getAccNo(),a.balance()}};//NOT the recommended way
						DefaultTableModel model =new DefaultTableModel(data,column);
					
						jt.setModel(model);
						jt.setFont(new Font("Serif", Font.BOLD, 17));
						jt.setBounds(35, 180, 380, 90);
					
						frame.add(jt);
					
						jt.setVisible(true);
						display.setVisible(false);
					}
					else
					{
						display.setVisible(true);
						display.setText("Account could not be found nor displayed");
						display.setFont(new Font("Times New Roman",Font.BOLD,19));
					}
				}
			}
			if(e.getSource()==proceedSearch)
			{
				String test = accNo.getText();
				
				Account a = this.searchAccount(test);
			
				if(a!=null)
				{
					display.setText("Account found!!");
					display.setFont(new Font("Times New Roman",Font.BOLD,19));
				}
				else
				{
					display.setText("Sorry. Account could not be found");
					display.setFont(new Font("Times New Roman",Font.BOLD,19));
				}
			}
   	}
}	
