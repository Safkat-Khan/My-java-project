import javax.swing.*; 
public class ForgetPass {
    JLabel l;
    ForgetPass(){  
        JFrame fp= new JFrame(); 
		l = new JLabel("Coming Soon.....");
		l.setBounds(20,50,150,20); 
		fp.add(l);
        fp.setSize(400,400);  
        fp.setLayout(null);  
        fp.setVisible(true);  
        fp.setBounds(400,  50, 900, 650);
    }         
    
}
