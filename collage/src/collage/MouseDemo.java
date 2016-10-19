package collage;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

public class MouseDemo extends Applet implements MouseListener,MouseMotionListener 
{
	int x, y;

	public void init() 
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		showStatus("mouse is clicked:" + x + "," + y + "");
	}

	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		showStatus("mouse is pressed:" + x + "," + y + "");
	}

	public void mouseReleased(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		showStatus("mouse is released:" + x + "," + y + "");
	}

	public void mouseEntered(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		showStatus("mouse is entered:" + x + "," + y + "");
	}

	public void mouseExited(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		showStatus("mouse is exited:" + x + "," + y + "");
	}

	public void mouseDragged(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		showStatus("mouse is dragged:" + x + "," + y + "");
	}

	public void mouseMoved(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		showStatus("mouse is moved : " + x + " , " + y + "");
	}
}
