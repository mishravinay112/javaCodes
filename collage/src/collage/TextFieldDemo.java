package collage;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Applet implements ActionListener 
{
	TextField na, pa;

	public void init() 
	{
		Label l1, l2;
		l1 = new Label("NAME", Label.RIGHT);
		l2 = new Label("PASSWORD", Label.RIGHT);
		na = new TextField(12);
		pa = new TextField(8);
		pa.setEchoChar('*');
		add(l1);
		add(na);
		add(l2);
		add(pa);
		na.addActionListener(this);
		pa.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		repaint();
	}

	public void paint(Graphics g) 
	{
		g.drawString("NAME:" + na.getText(), 6, 100);
		g.drawString("PASSWORD:" + pa.getText(), 6, 120);
		g.drawString("SELECTED TEXT:" + na.getSelectedText(), 6, 140);
	}
}
