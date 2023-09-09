import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	JList j1,j2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18; 
	JLabel t1,t2,t3,t4,t5,t6;
	JButton b1,b2,b3;
	int spen=100,spencil=150,spaper=150,seraser=75,ssharpener=75,sruler=120;
	int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
	double p,cart=0.0;
	String x;
	prac_3()
	{
		super("ABC Stationary Shop");
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
	       //TODO Auto-generated method stub
		     if(e.getSource()==b1)
		     {
		    	 cart+=p;
		    	 l2.setText("Total cost: $"+String.format("%.2f",cart));
		    	 if(x=="Pencil")
		    	 {
		    		 spencil=spencil-1;
		    		 l3.setText("Available Stock: "+spencil);
					 c1++;
		    	 }
		    	 else if(x=="Pen")
		    	 {
		    		 spen=spen-1;
		    		 l3.setText("Available Stock: "+spen);
					 c2++;
		    	 }		    		 
		    	 else if(x=="Paper")
		    	 {
		    		 spaper=spaper-1;
		    		 l3.setText("Available Stock: "+spaper);
					 c3++;
		    	 }
		    	 
		    	 else if(x=="Eraser")
		    	 {
		    		 seraser=seraser-1;
		    		 l3.setText("Available Stock: "+seraser);
					 c4++;
		    	 }
		    	 else if(x=="Sharpener")
		    	 {	
		    		 ssharpener=ssharpener-1;
		    		 l3.setText("Available Stock: "+ssharpener);
					 c5++;
		    	 }
		    	 else
		    	 { 
		    		 sruler=sruler-1;
		    		 l3.setText("Available Stock: "+sruler);
					 c6++;
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

				l8=new JLabel("Item");
				l8.setBounds(20, 120, 50, 50);
				l8.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l8);

				l9=new JLabel("Quantity");
				l9.setBounds(210, 120, 60, 50);
				l9.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l9);

				l10=new JLabel("Total");
				l10.setBounds(410, 120, 50, 50);
				l10.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l10);

				String str[]= {"Pencil","Pen","Paper","Eraser","Sharpener","Ruler"};
				j2=new JList(str);
				j2.setBounds(20,170,100, 135);
				j2.setFont(new Font("Serif",Font.BOLD,15));
				j2.setLayout(null);
				j2.setBackground(Color.cyan);
				j2.setEnabled(false);
				j2.addListSelectionListener(this);
				p2.add(j2);

				l11=new JLabel();
				l11.setText(Integer.toString(c1));
				l11.setBounds(210, 158, 50, 50);
				l11.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l11);

				l12=new JLabel();
				l12.setText(Integer.toString(c2));
				l12.setBounds(210, 180, 50, 50);
				l12.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l12);
				
				l13=new JLabel();
				l13.setText(Integer.toString(c3));
				l13.setBounds(210, 200, 50, 50);
				l13.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l13);

				l14=new JLabel();
				l14.setText(Integer.toString(c4));
				l14.setBounds(210, 222, 50, 50);
				l14.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l14);

				l15=new JLabel();
				l15.setText(Integer.toString(c5));
				l15.setBounds(210, 243, 50, 50);
				l15.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l15);

				l16=new JLabel();
				l16.setText(Integer.toString(c6));
				l16.setBounds(210, 265, 50, 50);
				l16.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(l16);

				t1=new JLabel();
				t1.setText(Float.toString((float) (c1*2.99)));
				t1.setBounds(410, 158, 50, 50);
				t1.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(t1);

				t2=new JLabel();
				t2.setText(Float.toString((float) (c2*9.99)));
				t2.setBounds(410, 180, 50, 50);
				t2.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(t2);

				t3=new JLabel();
				t3.setText(Float.toString((float) (c3*4.99)));
				t3.setBounds(410, 200, 50, 50);
				t3.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(t3);

				t4=new JLabel();
				t4.setText(Float.toString((float) (c4*2.99)));
				t4.setBounds(410, 222, 50, 50);
				t4.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(t4);

				t5=new JLabel();
				t5.setText(Float.toString((float) (c5*3.99)));
				t5.setBounds(410, 243, 50, 50);
				t5.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(t5);

				t6=new JLabel();
				t6.setText(Float.toString((float) (c6*14.99)));
				t6.setBounds(410, 265, 50, 50);
				t6.setFont(new Font("Serif", Font.PLAIN,16));
				p2.add(t6);

				l16=new JLabel("=========================================");
		 		l16.setBounds(10, 300, 500, 50);
		 		l16.setFont(new Font("Serif", Font.PLAIN,20));
		 		p2.add(l16);

				l17=new JLabel("Total cost: $"+String.format("%.2f",cart));
		 		l17.setBounds(10, 360, 200, 50);
		 		l17.setFont(new Font("Serif", Font.BOLD,20));
		 		p2.add(l17);
		     }
		     else
		     {
		    	 l1.setText("Price of item:");
		    	 l2.setText("Total cost: ");
		    	 l3.setText("Available Stock:");
				 p2.setVisible(false);
				 l11.setText("");
				 l12.setText("");
				 l13.setText("");
				 l14.setText("");
				 l15.setText("");
				 l16.setText("");
				 l17.setText("");
				 t1.setText("");
				 t2.setText("");
				 t3.setText("");
				 t4.setText("");
				 t5.setText("");
				 t6.setText("");
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
				 l8.setText("");
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