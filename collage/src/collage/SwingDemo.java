package collage;

import javax.swing.JApplet;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SwingDemo extends JApplet implements ActionListener 
{
	JTextField t1;

	public void init() 
	{
		try 
		{
			SwingUtilities.invokeAndWait(new Runnable() 
			{
				public void run() 
				{
					makeGUI();
				}
			}
		);
		} 
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

	private void makeGUI() 
	{
		setLayout(new FlowLayout());
		t1 = new JTextField(15);
		JLabel l1 = new JLabel("Name         ");
		JLabel l2 = new JLabel("Father's Name");
		JLabel l3 = new JLabel("Stream");
		JButton b1 = new JButton("Save");
		JButton b2 = new JButton("Cancel");
		JTextField t2 = new JTextField(15);
		JRadioButton r1 = new JRadioButton("Science");
		JRadioButton r2 = new JRadioButton("Medical");
		JRadioButton r3 = new JRadioButton("arts");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(r1);
		add(r2);
		add(r3);
		add(b1);
		add(b2);
		t1.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t2.addActionListener(this);
		r2.addActionListener(this);
		r1.addActionListener(this);
		r3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
