package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Withdrawl extends JFrame implements ActionListener{
	
	String pin;
	TextField textField;
	JButton b1,b2;
	
	public Withdrawl(String pin) {
		this.pin=pin;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
	JLabel l3=new  JLabel(i3);
	l3.setBounds(0, 0, 1550, 830);
	add(l3);
	
	
	JLabel lable1=new JLabel("MAXIMUM WITHDRAWL IS 10,000");
	lable1.setForeground(Color.white);
	lable1.setFont(new Font("System",Font.BOLD,16));
	lable1.setBounds(460, 180, 700, 35);
	l3.add(lable1);////label should be print on bank screen
	
	JLabel lable2=new JLabel("PLEASE ENTER YOUR AMOUNT");
	lable2.setForeground(Color.white);
	lable2.setFont(new Font("System",Font.BOLD,16));
	lable2.setBounds(460, 220, 700, 35);
	l3.add(lable2);////label should be print on bank screen
	
	
	textField=new TextField();
	textField.setBounds(460, 260, 320, 25);
	textField.setBackground(new Color(65,125,128));
	textField.setForeground(Color.white);
	textField.setFont(new Font("Raleway",Font.BOLD,22));
	l3.add(textField);
	

	b1=new JButton("WITHDRAWL");
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
	
	
	
			
		setLayout(null);
		setSize(1550, 1080);
		setLocation(0,0);
		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
		try {
			String amount=textField.getText();
			Date date=new Date();
			
			if(textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdrawl");
			}
			
			else {
				Coon c=new Coon();
				ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
			int balance =0;
			
			while(resultSet.next()) {////resultSet check data come from table or not
				if(resultSet.getString("type").equals("Deposit")) {
				balance +=Integer.parseInt(resultSet.getString("amount"));
			}
				else {
					balance-=Integer.parseInt(resultSet.getString("amount"));
				}
			}
			
			if(balance<Integer.parseInt(amount)) {
				JOptionPane.showMessageDialog(null, "insuffient Balance");
				return;
			}
			
			c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");///here amount is withdraw amount
			JOptionPane.showMessageDialog(null, "Rs. "+amount+"Debeted Successfully");
			setVisible(false);
			new main_Class(pin);
			}
			
			
		}catch (Exception E) {
			E.printStackTrace();
		}}
		
		else if(e.getSource()==b2) {
			setVisible(false);
			new main_Class(pin);
			
		}
		
	}
		
		
	

	public static void main(String[] args) {
		new  Withdrawl("");

	}

}
