package bank.management.system;

import javax.swing.*;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Singup2 extends JFrame implements ActionListener{
JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
	
JTextField textPan,textAadhar;
JRadioButton r1,r2,m1,m2;

JButton next;

	String formno;
	Singup2(String formno){
		
		super("APPLICATION FROM");
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank-8469480_1280.png"));
		Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);///scale image again convert to  imag icon
		JLabel image =new JLabel(i3);///help to display img help of label
		image.setBounds(150,5,100,100);//location
		add(image);
		this.formno=formno;
		
		JLabel l1=new JLabel("Page 2 :- ");
		l1.setFont(new Font("Ralway",Font.BOLD,22));
		l1.setBounds(300, 30, 600, 40);
		add(l1);
		
		JLabel l2=new JLabel("Additional Details");
		l2.setFont(new Font("Ralway",Font.BOLD,22));
		l2.setBounds(300, 60, 600, 40);
		add(l2);
		
		
		JLabel l3=new JLabel("Religion : ");
		l3.setFont(new Font("Ralway",Font.BOLD,18));
		l3.setBounds(100, 120, 100, 30);
		add(l3);
		
		
		String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
		combobox=new JComboBox(religion);
		combobox.setBackground(new Color(252,208,76));
		combobox.setFont(new Font("Ralway",Font.BOLD,14));
		combobox.setBounds(350, 120, 320, 30);
		add(combobox);
		
		
		JLabel l4=new JLabel("Category : ");
		l4.setFont(new Font("Ralway",Font.BOLD,18));
		l4.setBounds(100, 170, 100, 30);
		add(l4);
		
		String Category[]={"General","OBC","SC","ST","Other"};
		combobox2=new JComboBox(Category);
		combobox2.setBackground(new Color(252,208,76));
		combobox2.setFont(new Font("Ralway",Font.BOLD,14));
		combobox2.setBounds(350, 170, 320, 30);
		add(combobox2);
		
		

		JLabel l5=new JLabel("Income : ");
		l5.setFont(new Font("Ralway",Font.BOLD,18));
		l5.setBounds(100, 220, 100, 30);
		add(l5);
		
		String Income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
		combobox3=new JComboBox(Income);
		combobox3.setBackground(new Color(252,208,76));
		combobox3.setFont(new Font("Ralway",Font.BOLD,14));
		combobox3.setBounds(350, 220, 320, 30);
		add(combobox3);
		
		
		
		JLabel l6=new JLabel("Educational : ");
		l6.setFont(new Font("Ralway",Font.BOLD,18));
		l6.setBounds(100, 270, 150, 30);
		add(l6);
		
		String educational[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
		combobox4=new JComboBox(educational);
		combobox4.setBackground(new Color(252,208,76));
		combobox4.setFont(new Font("Ralway",Font.BOLD,14));
		combobox4.setBounds(350, 270, 320, 30);
		add(combobox4);
		
		
		JLabel l7=new JLabel("Occupation : ");
		l7.setFont(new Font("Ralway",Font.BOLD,18));
		l7.setBounds(100, 340, 150, 30);
		add(l7);
		
		String occupation[]={"Salaried","Self-Employed","Business","Student","Retired","Other"};
		combobox5=new JComboBox(occupation);
		combobox5.setBackground(new Color(252,208,76));
		combobox5.setFont(new Font("Ralway",Font.BOLD,14));
		combobox5.setBounds(350, 340, 320, 30);
		add(combobox5);
		
		
		JLabel l8=new JLabel("PAN Number : ");
		l8.setFont(new Font("Ralway",Font.BOLD,18));
		l8.setBounds(100, 390, 150, 30);
		add(l8);
		
	textPan=new JTextField();
	textPan.setFont(new Font("Ralway",Font.BOLD,18));
	textPan.setBounds(350, 390, 320, 30);
	add(textPan);
	
	
	JLabel l9=new JLabel("Aadhar Number : ");
	l9.setFont(new Font("Ralway",Font.BOLD,18));
	l9.setBounds(100, 440, 180, 30);
	add(l9);
	
	textAadhar=new JTextField();
	textAadhar.setFont(new Font("Ralway",Font.BOLD,18));
	textAadhar.setBounds(350, 440, 320, 30);
add(textAadhar);
	
	
	
JLabel l10=new JLabel("Senior Citizen : ");
l10.setFont(new Font("Ralway",Font.BOLD,18));
l10.setBounds(100, 490, 180, 30);
add(l10);

r1=new  JRadioButton("Yes");
r1.setFont(new Font("Ralway",Font.BOLD,14));
r1.setBackground(new Color(253,208,76));
r1.setBounds(350, 490, 100, 30);
add(r1);

r2=new  JRadioButton("No");
r2.setFont(new Font("Ralway",Font.BOLD,14));
r2.setBackground(new Color(253,208,76));
r2.setBounds(460, 490, 100, 30);
add(r2);

JLabel l11=new JLabel("Existing Account : ");
l11.setFont(new Font("Ralway",Font.BOLD,18));
l11.setBounds(100, 540, 180, 30);
add(l11);

m1=new  JRadioButton("Yes");
m1.setFont(new Font("Ralway",Font.BOLD,14));
m1.setBackground(new Color(253,208,76));
m1.setBounds(350, 540, 100, 30);
add(m1);

m2=new  JRadioButton("No");
m2.setFont(new Font("Ralway",Font.BOLD,14));
m2.setBackground(new Color(253,208,76));
m2.setBounds(460, 540, 100, 30);
add(m2);	

JLabel l12=new JLabel("Form No : ");
l12.setFont(new Font("Ralway",Font.BOLD,14));
l12.setBounds(700, 10, 100, 30);
add(l12);

JLabel l13=new JLabel(formno);////formno use to generate random form no took from singup class
l13.setFont(new Font("Ralway",Font.BOLD,14));
l13.setBounds(760, 10, 60, 30);
add(l13);


	next=new JButton("next");	
	next.setFont(new Font("Ralway",Font.BOLD,14));
	next.setBackground(Color.white);
	next.setForeground(Color.black);
	next.setBounds(570, 640, 100, 30);
	next.addActionListener(this);//active action listner
	add(next);
	
	
	
		
setLayout(null);
	setSize(850,750);
		setLocation(480,80);
		getContentPane().setBackground(new Color (252,208,76) );
		setVisible(true);
		
	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
			String rel=(String)combobox.getSelectedItem();
			String cate=(String)combobox2.getSelectedItem();
			String inc=(String)combobox3.getSelectedItem();
			String edu=(String)combobox4.getSelectedItem();
			String occu=(String)combobox5.getSelectedItem();
			
			String pan=textPan.getText();
			String aadhar=textAadhar.getText();
			
			String scitizen=" ";
			if(r1.isSelected()) {
				scitizen="Yes";
				
			}
			else if(r2.isSelected()) {
				scitizen="No";
				
			}
			
			String eAccount=" ";
			if(m1.isSelected()) {
				eAccount="Yes";
				
			}
			else if(m2.isSelected()) {
				eAccount="No";
				
			}
			
			
			try {
				
				if(textPan.getText().equals("")||textAadhar.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Fill all the field");
				}
				
				else {///Establish connection from Coon class
				Coon c1=new Coon();
				String q="insert into Singuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occu+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
					c1.statement.executeUpdate(q);
					new Singup3(formno);
					setVisible(false);
					}
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			
			
		}
	
	
public static void main(String args[]) {
	new Singup2("");
}

}
