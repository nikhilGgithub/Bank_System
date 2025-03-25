package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mini extends JFrame  implements ActionListener{
String pin;
JButton button;

	public Mini(String pin) {
		this.pin=pin;
		getContentPane().setBackground(new Color(255,204,204));
		setSize(400, 600);
		setLocation(20, 20);
		setLayout(null);
		
		JLabel lable1=new JLabel();
		lable1.setBounds(20, 140, 400, 200);
		add(lable1);
		

		JLabel lable2=new JLabel("Splender NIKHIL.G");
		lable2.setFont(new Font("System",Font.BOLD,15));
		lable2.setBounds(150, 20, 200, 20);
		add(lable2);
		
		

		JLabel lable3=new JLabel();
		lable3.setBounds(20, 80, 300, 20);
		add(lable3);
		
		

		JLabel lable4=new JLabel();
		lable4.setBounds(20, 400, 300, 20);
		add(lable4);
		
		
		try {
			
			Coon c=new Coon();
			ResultSet resultSet=c.statement.executeQuery("select *from login where pin ='"+pin+"'");
			
			while(resultSet.next()) {
				lable3.setText("Card Number :"+resultSet.getString("card_no").substring(0,4)+"XXXXXXXXXXXX"+resultSet.getString("card_no").substring(12));
			}
			
			
		}catch(Exception E) {
			E.printStackTrace();
		}
		
		try {
			
			int balance=0;
			
			Coon c=new Coon();

			ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='"+pin+"'");
		
			while(resultSet.next()) {
				lable1.setText(lable1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
			+resultSet.getString("amount")+"<br><br><html>");
				
			
			
				
				if(resultSet.getString("type").equals("Deposit")){
			
			balance+= Integer.parseInt(resultSet.getString("amount"));
			}
			
			else {
				balance-= Integer.parseInt(resultSet.getString("amount"));
			}
				
			}
			
			lable4.setText("Your Total Balance in Rs "+balance);
			
		}
		
	
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		button=new JButton("Exit");
		button.setBounds(20, 500, 100, 25);
		button.addActionListener(this);
		button.setBackground(Color.white);
		button.setForeground(Color.black);
		add(button);

		
		setVisible(true);
	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
	setVisible(false);
			
		}

	public static void main(String[] args) {
		new Mini("");

	}

}
