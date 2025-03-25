package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Pin extends JFrame implements ActionListener{
JButton b1,b2;
JPasswordField p1,p2;
String pin;
	public Pin(String pin) {
		this.pin=pin;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
	JLabel l3=new  JLabel(i3);
	l3.setBounds(0, 0, 1550, 830);
	add(l3);
	
	
	JLabel lable1=new JLabel("CHANGE YOUR PIN");
	lable1.setForeground(Color.white);
	lable1.setFont(new Font("System",Font.BOLD,16));
	lable1.setBounds(430, 180, 400, 35);
	l3.add(lable1);////label should be print on bank screen
	
	
	JLabel lable2=new JLabel("NEW  PIN");
	lable2.setForeground(Color.white);
	lable2.setFont(new Font("System",Font.BOLD,16));
	lable2.setBounds(430, 220, 150, 35);
	l3.add(lable2);
	
	p1=new JPasswordField();
	p1.setBounds(600, 220, 180, 25);
	p1.setBackground(new Color(65,125,128));
	p1.setForeground(Color.white);
	p1.setFont(new Font("Raleway",Font.BOLD,22));
	l3.add(p1);
	
	
	JLabel lable3=new JLabel("Re-Enter New Pin");
	lable3.setForeground(Color.white);
	lable3.setFont(new Font("System",Font.BOLD,16));
	lable3.setBounds(430, 250, 400, 35);
	l3.add(lable3);
	
	
	p2=new JPasswordField();
	p2.setBounds(600, 255, 180, 25);
	p2.setBackground(new Color(65,125,128));
	p2.setForeground(Color.white);
	p2.setFont(new Font("Raleway",Font.BOLD,22));
	l3.add(p2);
	
		
	
	b1=new JButton("CHANGE");
	b1.setBounds(700, 362, 150, 35);
	b1.setBackground(new Color(65,125,128));
	b1.setForeground(Color.WHITE);
	b1.addActionListener(this);
	l3.add(b1);
	
	
	b2=new JButton("BACK");
	b2.setBounds(700, 406, 150, 35);
	b2.setBackground(new Color(65,125,128));
	b2.setForeground(Color.WHITE);
	b2.addActionListener(this);
	l3.add(b2);
		
		setSize(1550, 1080);
		setLayout(null);
		setLocation(0, 0);
		setVisible(true);
		
	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
		try {
			String pin1 = new String(p1.getPassword());  // ✅ Correct
			String pin2 = new String(p2.getPassword());


		
			
			if(!pin1.equals(pin2)) {
				JOptionPane.showMessageDialog(null, "Entered PIN does not match");
			return;
			
			}
			
			if(e.getSource()==b1) {
				if (p1.getPassword().length == 0) {  // ✅ Check if password field is empty
				    JOptionPane.showMessageDialog(null, "Enter New PIN");
				    return;
				}

				if (p2.getPassword().length == 0) {
				    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
				    return;
				}
				
				Coon c=new Coon();
				String q1="update bank set pin='"+pin1+"' where pin='"+pin+"'";
			String q2="update login set pin='"+pin1+"' where pin='"+pin+"'";
			String q3="update singupthree set pin='"+pin1+"' where pin='"+pin+"'";
			
			c.statement.executeUpdate(q1);
			c.statement.executeUpdate(q2);
			c.statement.executeUpdate(q3);
			
			JOptionPane.showMessageDialog(null, "PIN changed Successfully");
			setVisible(false);
			new main_Class(pin);
			
			}
			
			else if(e.getSource()==b2) {
				new main_Class(pin);
				setVisible(false);
			}
		}
		
		catch (Exception E) {
			E.printStackTrace();
		}
			
			
		}

	public static void main(String[] args) {
		new Pin("");

	}

}
