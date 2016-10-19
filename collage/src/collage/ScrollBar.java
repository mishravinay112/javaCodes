package collage;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ScrollBar extends Applet implements AdjustmentListener,MouseMotionListener 
{
	Scrollbar h1, v1;
	String msg = " ";

	public void init() 
	{
		int width = Integer.parseInt(getParameter("width"));
		int height = Integer.parseInt(getParameter("height"));
		h1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 10, width);
		v1 = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
		add(h1);
		add(v1);
		h1.addAdjustmentListener(this);
		v1.addAdjustmentListener(this);
		addMouseMotionListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae) 
	{
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{

	}

	public void mouseDragged(MouseEvent me) 
	{
		int x = me.getX();
		int y = me.getY();
		h1.setValue(x);
		v1.setValue(y);
		repaint();
	}

	public void paint(Graphics g) 
	{
		msg = " Vertical : " + v1.getValue() + "         Horizontal : " + h1.getValue();
		g.drawString(msg, 8, 100);
		g.drawString("*", h1.getValue(), v1.getValue());
	}
}
