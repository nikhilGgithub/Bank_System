package bank.management.system;
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
public class Login extends JFrame implements ActionListener {
	JLabel lable1,lable2,lable3;//Globally declare
	JTextField textField2;
	JPasswordField passwordField3;
	JButton button1,button2,button3;
	
	Login(){
		super("Bank Management System");//title
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank-8469480_1280.png"));
		Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);///scale image again convert to  imag icon
		JLabel image =new JLabel(i3);///help to display img help of label
		image.setBounds(350,10,100,100);//location
		add(image);
		
		
		ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.jpg"));
		Image ii2=ii1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
		ImageIcon ii3=new ImageIcon(ii2);///image to frame visible
		JLabel iimage =new JLabel(ii3);///help to display img
		iimage.setBounds(630,350,100,100);
		add(iimage);
		
		
	
		lable1=new JLabel("WELCOME TO ATM");
		lable1.setForeground(Color.black);///text color black
		lable1.setFont(new Font("AvantGrade",Font.BOLD,38));
		lable1.setBounds(230, 125, 450, 40);
		add(lable1);
		
		
		lable2=new JLabel("Card No:");
		lable2.setFont(new Font("Ralway",Font.BOLD,28));
		lable2.setForeground(Color.BLACK);
		lable2.setBounds(150, 190, 375, 30);
		add(lable2);
		
		textField2=new JTextField(15);
		textField2.setBounds(325, 190, 230, 30);
		textField2.setFont(new Font("Arial",Font.BOLD,14));
		add(textField2);
		
		
		lable3=new  JLabel("Pin No:");
		lable3.setFont(new Font("Railway",Font.BOLD,28));
		lable3.setForeground(Color.BLACK);
		lable3.setBounds(150, 250, 375, 30);
		add(lable3);
		
		
		passwordField3=new JPasswordField(15);
		passwordField3.setBounds(325, 250, 230, 30);
		passwordField3.setFont(new Font("Arial",Font.BOLD,14));
		add(passwordField3);
		
		
		button1=new JButton("Log IN");
		button1.setFont(new Font("Arial",Font.BOLD,14));
		button1.setForeground(Color.black);
		button1.setBounds(320, 300, 100, 30);
		button1.addActionListener(this);///Apply event
		add(button1);
		
		
		
		button2=new JButton("Clear");
		button2.setFont(new Font("Arial",Font.BOLD,14));
		button2.setForeground(Color.black);
		button2.setBounds(450, 300, 100, 30);
		button2.addActionListener(this);
		add(button2);
		
		button3=new JButton("SING UP");
		button3.setFont(new Font("Arial",Font.BOLD,14));
		button3.setForeground(Color.black);
		button3.setBounds(320, 350, 230, 30);
		button3.addActionListener(this);
		add(button3);
		
		
		
		
		
		
		
		ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpg"));
		Image iii2=iii1.getImage().getScaledInstance(850, 480,Image.SCALE_DEFAULT);
		ImageIcon iii3=new ImageIcon(iii2);///image to frame visible
		JLabel iiimage =new JLabel(iii3);///help to display img
		iiimage.setBounds(0,0,850,480);
		add(iiimage);
		
		
		setLayout(null);//because we set according to us
	setSize(800,480);
	setLocation(450,200);//x axis ,y axis
	///Bydefault visibility is hidden 
	setVisible(true);	///setvisibility always below add(image)
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	try {
		if(e.getSource()==button1) {
			
			Coon c=new Coon();
			String  cardno=textField2.getText();////when use enter pin and card no. that data will store in these strings

			//	String  pin=passwordField3.getText();////this is  Deprecated due to security risk
	
			char[] pinArray = passwordField3.getPassword(); 
			String pin = new String(pinArray); 
			
			String q="select* from login where card_no = '"+cardno+"' and pin='"+pin+"'";///get data from table
	ResultSet resultSet=c.statement.executeQuery(q);////get value use executeQuery
	
	if(resultSet.next()) {
		setVisible(false);
		new main_Class(pin);
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
	}
	
		}
		
		else if(e.getSource()==button2) {
			textField2.setText("");
			passwordField3.setText("");
		}
		
		else if(e.getSource()==button3) {
			
			new Singup();//redirect to Singup page
			setVisible(false);
			
			
		}
		
		
		
	}
	catch(Exception E) {
		E.printStackTrace();
	}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Login();
	}

}
