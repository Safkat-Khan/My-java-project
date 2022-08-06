import javax.swing.*;  ;  
public class Signup {
	JLabel l1;
    Signup(){  
		        // frame and title added.
			JFrame fr1= new JFrame(); 
			fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fr1.setResizable(false);
			fr1.setSize(400,400);  
			fr1.setLayout(null);  
			fr1.setVisible(true);  
			fr1.setBounds(400,  50, 900, 650);


			

		//label adding
		l1 = new JLabel("Input Your User name :");
		l1.setBounds(20,50,150,20); 



		//Function adding
		fr1.add(l1);


    }         

}

