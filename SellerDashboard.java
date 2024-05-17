import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SellerDashboard implements ActionListener {

	//---------frame------
	JFrame frame;

	//------ Buttons--------
	JButton insertBtn, deleteBtn, dispBtn, 
	searchBtn, logoutBtn, lcUser, proceedInsert,
	proceedDelete, proceedDisplay,proceedSearch;

	// --------labels---------
	JLabel lano, lbalance, opName;

	// ------textfields--------
	JTextField accNo, balance;

	// ------textarea----------
	JTextArea display;

	// --------imageIcon-----------
	ImageIcon i1;

	// -----for table----
	JTable jt;

	// ------Accounts------
	Account[] accounts = new Account[100];


	// -------------Parameter Constractor--------------------------

	SellerDashboard() {
		
		// create frame
		frame = new JFrame("Seller Dashboard");

		//---------------- adjust size and set layout----------------------
		frame.setBounds(350, 90, 900, 650);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

		//Icon ADDED
        i1 = new ImageIcon("logo.png");

		//------- construct components-------------
		lano = new JLabel("Product Name");
		lano.setForeground(Color.BLACK);

		lbalance = new JLabel("Price");
		lbalance.setForeground(Color.BLACK);

		opName = new JLabel("Default!");
		opName.setForeground(Color.BLACK);

		accNo = new JTextField(10);
		balance = new JTextField(10);

		display = new JTextArea(10,10);

		//------------Insert Button----------------
		insertBtn = new JButton("Add Product");
		proceedInsert = new JButton("Add ");
		frame.add(insertBtn);
		frame.add(proceedInsert);
		insertBtn.setBounds(250, 70, 120, 30);
		insertBtn.setBackground(Color.decode("#f5f5f5"));
		insertBtn.setForeground(Color.decode("#030202"));
		insertBtn.addActionListener(this);

		//------------------------Add opertion button--------------------
		proceedInsert.setBounds(350, 300, 120, 30);
		proceedInsert.setBackground(Color.decode("#5b7ccf"));
		proceedInsert.setForeground(Color.white);
		proceedInsert.setVisible(false);
		proceedInsert.addActionListener(this);

		// -----------------Delete Button----------------
		deleteBtn = new JButton("Delete Product");
		deleteBtn.setBounds(450, 70, 120, 30);
		deleteBtn.setBackground(Color.WHITE);
		deleteBtn.setForeground(Color.BLACK);
		deleteBtn.addActionListener(this);

		//-----------------Delet Operation button------------
		proceedDelete = new JButton("Delete");
		proceedDelete.setVisible(false);
		proceedDelete.addActionListener(this);
		proceedDelete.setBackground(Color.decode("#5b7ccf"));
		proceedDelete.setBounds(350, 300, 120, 30);
		proceedDelete.setForeground(Color.white);

		// ------------------Display-------------
		display.setBounds(300, 400, 250, 30);
		display.setVisible(false);

		// -------------------Log Out ---------------
		logoutBtn = new JButton(" Logout");
		logoutBtn.setBounds(350, 500, 120, 30);
		logoutBtn.addActionListener(this);
		logoutBtn.setBackground(Color.decode("#f53131"));
		logoutBtn.setForeground(Color.black);

		//------- table--------------
		jt = new JTable();

		//--------add components------------
		frame.add(lano);
		frame.add(lbalance);
		frame.add(accNo);
		frame.add(opName);
		frame.add(balance);
		frame.add(deleteBtn);
		frame.add(proceedDelete);
		frame.add(display);
		frame.add(logoutBtn);
		frame.add(jt);
        frame.setIconImage(i1.getImage());

		//---------- Set Bounce----------
		lano.setBounds(200, 200, 150, 25);
		lano.setFont(new Font("Default", Font.BOLD, 15));
		lbalance.setBounds(200, 250, 100, 25);
		lbalance.setFont(new Font("Default", Font.BOLD, 15));
		accNo.setBounds(320, 200, 200, 30);
		balance.setBounds(320, 250, 200, 30);

		// Set Method
		lano.setVisible(false);
		lbalance.setVisible(false);
		opName.setVisible(false);
		accNo.setVisible(false);
		balance.setVisible(false);

		// addActionListener
		lcUser.addActionListener(this);
		searchBtn.addActionListener(this);

		// adjust size and set layout
		frame.setBounds(350, 90, 800, 650);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(i1.getImage());
		frame.setResizable(false);
		frame.setVisible(true);
	}

	//---------------Accunt adding array-------------
	public void addAccount(Account a) {
		int count = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = a;
				count++;
				break;
			}
		}
		if (count == 0) {
			display.setText(" Product can not added.");
			display.setFont(new Font("Default", Font.BOLD, 20));
		} else {
			display.setText(" Product added. ");
			display.setFont(new Font("Default", Font.BOLD, 20));
		}
	}

	//searching a product
	public Account searchAccount(String accNo)
	{
		Account a = null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccNo().equals(accNo)) {
					a = accounts[i];
					break;
				}
			}
		}
		return a;
	}

	//-*--------deleting a product------------
	public boolean deleteAccount(String accNo)
	{
		boolean test = false;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccNo().equals(accNo)) {
					accounts[i] = null;
					test = true;
					break;
				}
			}
		}
		return test;
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == logoutBtn) {
			new LogInPage();
			frame.setVisible(false);
			System.exit(0);
		} else if (e.getSource() == lcUser) {
			String user = lcUser.getText();
			new Profile(user);
			frame.setVisible(false);
		} else if (e.getSource() == insertBtn) {
			lano.setVisible(true);
			lbalance.setVisible(true);
			opName.setText("Operation: Update");
			opName.setVisible(true);
			accNo.setVisible(true);
			accNo.setText(null);
			balance.setVisible(true);
			balance.setText(null);
			display.setText(null);
			display.setVisible(true);
			proceedInsert.setVisible(true);
			proceedDelete.setVisible(false);
			proceedSearch.setVisible(false);
		} 
		
		else if (e.getSource() == deleteBtn) 
		{
			lano.setVisible(true);
			accNo.setVisible(true);
			accNo.setText(null);
			display.setVisible(true);
			display.setText(null);
			proceedInsert.setVisible(false);
			proceedDelete.setVisible(true);
			proceedSearch.setVisible(false);
			opName.setText("Operation: Delete");
			opName.setVisible(true);
			lbalance.setVisible(false);
			balance.setVisible(false);
		} 

		if (e.getSource() == proceedInsert) {

			String accNum = accNo.getText();
			String bal = balance.getText();

			if (accNum.isEmpty() == false && bal.isEmpty() == false) {
				if (searchAccount(accNum) == null) {
					Account a = new Account(accNum, bal);
					this.addAccount(a);
				} else {
					JOptionPane.showMessageDialog(null,
							"A Product already exists with that Product No. " + accNum + ". Try again");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Please enter valid information in the fields");
			}

		}
		if (e.getSource() == proceedDelete) {
			String test = accNo.getText();

			boolean isDeleted = this.deleteAccount(test);

			if (isDeleted == true) {
				display.setText("Product deleted successfully.");
				display.setFont(new Font("Default", Font.BOLD, 17));
			} else {
				display.setText("Product could not be deleted.");
				display.setFont(new Font("Default", Font.BOLD, 17));
			}
		}
		if (e.getSource() == proceedSearch) {
			String test = accNo.getText();

			Account a = this.searchAccount(test);

			if (a != null) {
				display.setText("Product found!!");
				display.setFont(new Font("Default", Font.BOLD, 17));
			} else {
				display.setText("Sorry. Product could not be found");
				display.setFont(new Font("Default", Font.BOLD, 17));
			}
		}
	}
}
