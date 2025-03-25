package bank.management.system;

import bank.management.system.*;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

import java.awt.Color; // Import missing class
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Singup extends JFrame implements ActionListener {
	JRadioButton r1,r2,r3,m1,m2,m3;
	
	JButton next;
	
	JTextField textName,textFname,textEmail,textAdd,textCity,textPin,textState;
JDateChooser dateChooser;
	
	Random ran =new Random();
	long first4=(ran.nextLong()%9000L)+1000L;
	String first=" "+Math.abs(first4);
	
	
	Singup(){
		super("APPLICATION FORM");
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank-8469480_1280.png"));
		Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);///scale image again convert to  imag icon
		JLabel image =new JLabel(i3);///help to display img help of label
		image.setBounds(25,10,100,100);//location
		add(image);
		
		
		JLabel label1=new JLabel("APPLICATION FORM NO."+ first4);
	label1.setBounds(160, 20, 600, 40);
	label1.setFont(new Font("Raleway",Font.BOLD,38));
	add(label1);
		
	
	JLabel lable2=new JLabel("Page 1");
	lable2.setFont(new Font( "Raleway",Font.BOLD,22));
		lable2.setBounds(330, 70, 600, 30);
		add(lable2);
		
		
		JLabel lable3=new JLabel("Personal Details");
		lable3.setFont(new Font( "Raleway",Font.BOLD,22));
		lable3.setBounds(290, 90, 600, 30);
		add(lable3);
		
		
		JLabel  lableName=new JLabel("Name : ");
		lableName.setFont(new Font( "Raleway",Font.BOLD,20));
		lableName.setBounds(100, 190, 400, 30);
		add(lableName);
		
		textName=new JTextField();
		textName.setFont(new Font( "Raleway",Font.BOLD,14));
		textName.setBounds(300, 190, 250, 30);
		add(textName);
		
		

		JLabel  lablefName=new JLabel("Father's Name : ");
		lablefName.setFont(new Font( "Raleway",Font.BOLD,20));
		lablefName.setBounds(100, 240, 400, 30);
		add(lablefName);
		
		textFname=new JTextField();
		textFname.setFont(new Font( "Raleway",Font.BOLD,14));
		textFname.setBounds(300, 240, 250, 30);
		add(textFname);
		
		
		JLabel  DOB=new JLabel("Date of Birth : ");
		DOB.setFont(new Font( "Raleway",Font.BOLD,20));
		DOB.setBounds(100, 340, 200, 30);
		add(DOB);
		
		dateChooser=new JDateChooser();
		dateChooser.setForeground(new Color(105,105,105));
		dateChooser.setBounds(300, 340, 250, 30);
		add(dateChooser);

		JLabel lableG=new JLabel("Gender : ");
		lableG.setFont(new Font( "Raleway",Font.BOLD,20));
		lableG.setBounds(100, 290, 200, 30);
		add(lableG);
		
		r1=new JRadioButton("Male");
		r1.setFont(new Font( "Raleway",Font.BOLD,14));
		r1.setBackground(new Color(222,255,228));
		r1.setBounds(300, 290, 60, 30);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setFont(new Font( "Raleway",Font.BOLD,14));
		r2.setBackground(new Color(222,255,228));
		r2.setBounds(450, 290, 90, 30);
		add(r2);
		
		r3=new JRadioButton("Other");
		r3.setFont(new Font( "Raleway",Font.BOLD,14));
		r3.setBackground(new Color(222,255,228));
		r3.setBounds(635, 290, 90, 30);
		add(r3);
		
		ButtonGroup buttonGroup=new ButtonGroup();///at a time only one select
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		buttonGroup.add(r3);
		
		
		JLabel lableEmail=new JLabel("Email address : ");
		lableEmail.setFont(new Font( "Raleway",Font.BOLD,20));
		lableEmail.setBounds(100, 390, 200, 30);
		add(lableEmail);
		
		
		textEmail=new JTextField();
		textEmail.setFont(new Font( "Raleway",Font.BOLD,14));
		textEmail.setBounds(300, 390, 250, 30);
		add(textEmail);
		
		

		JLabel lableMs=new JLabel("Marital Status : ");
		lableMs.setFont(new Font( "Raleway",Font.BOLD,20));
		lableMs.setBounds(100, 440, 200, 30);
		add(lableMs);
		
		m1=new JRadioButton("Married");
		m1.setFont(new Font( "Raleway",Font.BOLD,14));
		m1.setBackground(new Color(222,255,228));
		m1.setBounds(300, 440, 100, 30);
		add(m1);
		
		m2=new JRadioButton("Unmarried");
		m2.setFont(new Font( "Raleway",Font.BOLD,14));
		m2.setBackground(new Color(222,255,228));
		m2.setBounds(450, 440, 100, 30);
		add(m2);
		
		m3=new JRadioButton("Other");
		m3.setFont(new Font( "Raleway",Font.BOLD,14));
		m3.setBackground(new Color(222,255,228));
		m3.setBounds(635, 440, 100, 30);
		add(m3);
		
		ButtonGroup buttonGroup1=new ButtonGroup();///at a time only one select
		buttonGroup1.add(m1);
		buttonGroup1.add(m2);
		buttonGroup1.add(m3);
		
		
		
		JLabel lableAdd=new JLabel("Address : ");
		lableAdd.setFont(new Font( "Raleway",Font.BOLD,20));
		lableAdd.setBounds(100, 490, 200, 30);
		add(lableAdd);
		
		
		textAdd=new JTextField();
		textAdd.setFont(new Font( "Raleway",Font.BOLD,14));
		textAdd.setBounds(300, 490, 250, 30);
		add(textAdd);
		
		
		JLabel lableCity=new JLabel("City : ");
		lableCity.setFont(new Font( "Raleway",Font.BOLD,20));
		lableCity.setBounds(100, 540, 200, 30);
		add(lableCity);
		
		
		textCity=new JTextField();
		textCity.setFont(new Font( "Raleway",Font.BOLD,14));
		textCity.setBounds(300, 540, 250, 30);
		add(textCity);
		
		
		

		JLabel lablePin=new JLabel("Pin Code : ");
		lablePin.setFont(new Font( "Raleway",Font.BOLD,20));
		lablePin.setBounds(100, 590, 200, 30);
		add(lablePin);
		
		
		textPin=new JTextField();
		textPin.setFont(new Font( "Raleway",Font.BOLD,14));
		textPin.setBounds(300, 590, 250, 30);
		add(textPin);
		
		

		JLabel lableState=new JLabel("State : ");
		lableState.setFont(new Font( "Raleway",Font.BOLD,20));
		lableState.setBounds(100, 640, 200, 30);
		add(lableState);
		
		
		textState=new JTextField();
		textState.setFont(new Font( "Raleway",Font.BOLD,14));
		textState.setBounds(300, 640, 250, 30);
		add(textState);
		
		
		next=new JButton("Next");
		next.setFont(new Font("Railway",Font.BOLD,14));
		next.setBackground(Color.white);
		next.setForeground(Color.black);
		next.setBounds(620, 710, 80, 30);
		
		next.addActionListener(this);
		add(next);
		
		
		
		getContentPane().setBackground(new Color(222,255,228));

		setLayout(null);
		setSize(850,800);
		setLocation(360, 40);
		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {///ActionListner must be override
		// TODO Auto-generated method stub
		String formno=first;
		String name=textName.getText();
		String fname=textFname.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();////coz we import jar file for dob
		String gender=null;
		if(r1.isSelected()) {
			gender="Male";
			
		}
		else if(r2.isSelected()) {
			gender="Female";
		}
		else if(r3.isSelected()) {
			gender="Other";
		}
		
		String email=textEmail.getText();
		
		String marital=null;
		if(m1.isSelected()) {
			gender="Married";
			
		}
		else if(m2.isSelected()) {
			gender="Unmarried";
		}
		else if(m3.isSelected()){
			gender="Other";
		}
		
		
		String address=textAdd.getText();
		String city=textCity.getText();
		String  pincode=textPin.getText();
		String state=textState.getText();
		
		try {
			if(textName.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");//if name null use will not enter
			}
			else {
				Coon coon1=new Coon();
				String q="insert into singup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
				coon1.statement.executeUpdate(q);
				
				new Singup2(formno);///random form no.
				setVisible(false);
			}
			
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Singup();
}
}


