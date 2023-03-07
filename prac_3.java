import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class prac_3 extends JFrame implements ListSelectionListener,ActionListener
{
	JPanel p1,p2;
	JList j1;
	JLabel l1,l2,l3,l4,l5,l6,l7; 
	JButton b1,b2,b3;
	int spen=100,spencil=150,spaper=150,seraser=75,ssharpener=75,sruler=120;
	double p,cart=0.0;
	String x;
	prac_3()
	{
		super("Stationary Shop");
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
		p1=new JPanel();
		p1.setBounds(0,0,500,1000);
		p1.setBackground(Color.yellow);
		p1.setVisible(true);
		p1.setLayout(null);
		add(p1);
		
		l5=new JLabel("Choose from the below cart ->");
		l5.setBounds(10, 10, 250, 100);
		l5.setFont(new Font("Serif", Font.PLAIN,20));
		p1.add(l5);
		
		String str[]= {"Pencil","Pen","Paper","Eraser","Sharpener","Ruler"};
		j1=new JList(str);
		//j1.setOpaque(false);
		j1.setBounds(10,110,100, 135);
		j1.setFont(new Font("Serif",Font.PLAIN,15));
		j1.setLayout(null);
		j1.addListSelectionListener(this);
		p1.add(j1);
		
		l1=new JLabel("Price of item:");
		l1.setBounds(10, 240, 180, 50);
		p1.add(l1);
		
		l2=new JLabel("Total cost: ");
		l2.setBounds(10, 280, 180, 50);
		p1.add(l2);
		
		l3=new JLabel("Available Stock:");
		l3.setBounds(10, 320, 150, 50);
		p1.add(l3);
		
		b1= new JButton("ADD");
		b1.setBounds(50, 380, 70, 50);
		p1.add(b1);
		b1.addActionListener(this);
		
		b2= new JButton("BUY");
		b2.setBounds(130, 380, 70, 50);
		p1.add(b2);
		b2.addActionListener(this);
		
		b3= new JButton("CLEAR");
		b3.setBounds(210, 380, 90, 50);
		p1.add(b3);
		b3.addActionListener(this);
		
		p2=new JPanel();
		p2.setBounds(500,0,500,1000);
		p2.setBackground(Color.CYAN);
		p2.setVisible(false);
		p2.setLayout(null);
		add(p2);
		
		l4=new JLabel("**INVOICE**");
		l4.setHorizontalAlignment(JLabel.CENTER);
		l4.setBounds(100, 30, 300, 50);
		l4.setFont(new Font("Serif", Font.BOLD,25));
		p2.add(l4);
		
		
	}
    @Override
	public void actionPerformed(ActionEvent e) 
	      {
	       // TODO Auto-generated method stub
		     if(e.getSource()==b1)
		     {
		    	 cart+=p;
		    	 l2.setText("Total cost: $"+String.format("%.2f",cart));
		    	 if(x=="Pencil")
		    	 {
		    		 spencil=spencil-1;
		    		 l3.setText("Available Stock: "+spencil);
		    	 }
		    	 else if(x=="Pen")
		    	 {
		    		 spen=spen-1;
		    		 l3.setText("Available Stock: "+spen);
		    	 }
		    		 
		    	 else if(x=="Paper")
		    	 {
		    		 spaper=spaper-1;
		    		 l3.setText("Available Stock: "+spaper);
		    	 }
		    	 
		    	 else if(x=="Eraser")
		    	 {
		    		 seraser=seraser-1;
		    		 l3.setText("Available Stock: "+seraser);
		    	 }
		    	 else if(x=="Sharpener")
		    	 {	
		    		 ssharpener=ssharpener-1;
		    		 l3.setText("Available Stock: "+ssharpener);
		    	 }
		    	 else
		    	 { 
		    		 sruler=sruler-1;
		    		 l3.setText("Available Stock: "+sruler);
		    	 }
		     }
		     else if(e.getSource()==b2)
		     {
		    	p2.setVisible(true);
		    	 
		    	l6=new JLabel("=========================================");
		 		//l6.setHorizontalAlignment(JLabel.CENTER);
		 		l6.setBounds(10, 90, 500, 50);
		 		l6.setFont(new Font("Serif", Font.PLAIN,20));
		 		p2.add(l6);
		     }
		     else
		     {
		    	 l1.setText("Price of item:");
		    	 l2.setText("Total cost: ");
		    	 l3.setText("Available Stock:");
		     }
	      }
	   @Override
	public void valueChanged(ListSelectionEvent e) 
	      {
	       // TODO Auto-generated method stub
		     x= (String) j1.getSelectedValue();
		     if(x=="Pencil")
		     {
		    	 l1.setText("Price of Pencil is $2.99");
		    	 p=2.99;
		     }
		     else if(x=="Pen")
		     {
		    	 l1.setText("Price of Pen is $9.99");
		    	 p=9.99;
		     }
		     if(x=="Paper")
		     {
		    	 l1.setText("Price of Paper is $4.99");
		    	 p=4.99;
		     }
		     if(x=="Eraser")
		     {
		    	 l1.setText("Price of Eraser is $2.99");
		    	 p=2.99;
		     }
		     if(x=="Sharpener")
		     {
		    	 l1.setText("Price of Sharpener is $3.99");
		    	 p= 3.99;
		     }
		     if(x=="Ruler")
		     {
		    	 l1.setText("Price of Ruler is $14.99");
		    	 p=14.99;
		     }
	      }
	public static void main(String[] args)
	      {
	        new prac_3();
	      }
	
}