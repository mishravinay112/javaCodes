package collage;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Applet implements ActionListener,MouseListener 
{
	Checkbox a, b, c, d;
	Button b1, b2;
	Panel OSCard;
	CardLayout cl;

	public void init() 
	{
		a = new Checkbox("WINDOW XP", null, true);
		b = new Checkbox("WINDOW NT", null, false);
		c = new Checkbox("Linux", null, false);
		d = new Checkbox("MACOS", null, false);
		b1 = new Button("window");
		b2 = new Button("other");
		add(b1);
		add(b2);
		cl = new CardLayout();
		OSCard = new Panel();
		OSCard.setLayout(cl);
		Panel Win = new Panel();
		Win.add(a);
		Win.add(b);
		Panel other = new Panel();
		other.add(c);
		other.add(d);
		OSCard.add(Win, "Window");
		OSCard.add(other, "Other");
		add(OSCard);
		b1.addActionListener(this);
		b2.addActionListener(this);
		addMouseListener(this);
	}

	public void MousePressed(MouseEvent me) 
	{
		cl.next(OSCard);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource() == b1) {
			cl.show(OSCard, "Window");
		} else {
			cl.show(OSCard, "Other");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}
}

