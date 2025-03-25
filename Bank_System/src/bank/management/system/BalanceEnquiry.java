package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
public class BalanceEnquiry extends JFrame implements ActionListener{
	
	String pin;
	
	JLabel lable2;
	JButton b1;
	
	public BalanceEnquiry(String pin) {
		this.pin=pin;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
	JLabel l3=new  JLabel(i3);
	l3.setBounds(0, 0, 1550, 830);
	add(l3);
	
	
	JLabel lable1=new JLabel("Your Current Balance in Rs. ");
	lable1.setForeground(Color.white);
	lable1.setFont(new Font("System",Font.BOLD,16));
	lable1.setBounds(430, 180, 700, 35);
	l3.add(lable1);////label should be print on bank screen
	
	 lable2=new JLabel();///i declare this globally coz i get balance from database store in lable2
	lable2.setForeground(Color.white);
	lable2.setFont(new Font("System",Font.BOLD,16));
	lable2.setBounds(430, 220, 700, 35);
	l3.add(lable2);////label should be print on bank screen
	
	b1=new JButton("Back");
	b1.setBounds(700, 406, 150, 35);
	b1.setBackground(new Color(65,125,128));
	b1.setForeground(Color.WHITE);
	b1.addActionListener(this);
	l3.add(b1);
	
	int balance=0;
	try {
		Coon c=new Coon();
		ResultSet resultSet=c.statement.executeQuery("select * from bank where pin ='"+pin+"'");///get data from database
		while(resultSet.next()) {////resultSet check data come from table or not
			if(resultSet.getString("type").equals("Deposit")) {
			balance +=Integer.parseInt(resultSet.getString("amount"));
		}
			else {
				balance-=Integer.parseInt(resultSet.getString("amount"));
			}
		}
		
	}
	catch(Exception E) {
		E.printStackTrace();
		
	}
	
	lable2.setText(""+balance);//coz integer type
	
		setLayout(null);
		setSize(1550, 1080);
		setLocation(0,0);
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new main_Class(pin);
		
	}
	

	public static void main(String[] args) {
		new BalanceEnquiry("");

	}

}
