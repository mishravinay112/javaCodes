package collage;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class MenuFrame extends Frame 
{
	String msg = "";
	CheckboxMenuItem debug, test;

	MenuFrame(String s) 
	{
		super(s);
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		Menu file = new Menu("file");
		MenuItem i1, i2, i3, i4, i5;
		file.add(i1 = new MenuItem("new"));
		file.add(i2 = new MenuItem("close"));
		file.add(i3 = new MenuItem("open"));
		file.add(i4 = new MenuItem("-"));
		file.add(i5 = new MenuItem("quit"));
		mbar.add(file);
		Menu edit = new Menu("Edit");
		MenuItem i6, i7, i8;
		edit.add(i6 = new MenuItem("cut"));
		edit.add(i7 = new MenuItem("copy"));
		edit.add(i8 = new MenuItem("paste"));
		Menu submenu = new Menu("special");
		MenuItem i9, i10, i11;
		submenu.add(i9 = new MenuItem("first"));
		submenu.add(i10 = new MenuItem("second"));
		submenu.add(i11 = new MenuItem("third"));
		edit.add(submenu);
		test = new CheckboxMenuItem("test");
		debug = new CheckboxMenuItem("debug");
		edit.add(test);
		edit.add(debug);
		mbar.add(edit);
		MyMenuHandler handler = new MyMenuHandler(this);
		i1.addActionListener(handler);
		i2.addActionListener(handler);
		i3.addActionListener(handler);
		i4.addActionListener(handler);
		i5.addActionListener(handler);
		i6.addActionListener(handler);
		i7.addActionListener(handler);
		i8.addActionListener(handler);
		i9.addActionListener(handler);
		i10.addActionListener(handler);
		i11.addActionListener(handler);
		test.addActionListener(handler);
		debug.addActionListener(handler);
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		addWindowListener(adapter);

	}

	public void paint(Graphics g) 
	{
		g.drawString(msg, 10, 200);
		if (debug.getState())
			g.drawString("Debug is on", 10, 220);
		else
			g.drawString("Debug is off", 10, 240);
		if (test.getState())
			g.drawString("test is on", 10, 260);
		else
			g.drawString("test is off", 10, 280);
	}
}

class MyWindowAdapter extends WindowAdapter 
{
	MenuFrame menuFrame;

	public MyWindowAdapter(MenuFrame menuFrame) 
	{
		this.menuFrame = menuFrame;
	}

	public void windowClosing(WindowEvent we) 
	{
		menuFrame.setVisible(false);
	}
}

class MyMenuHandler implements ActionListener, ItemListener 
{
	MenuFrame menuFrame;

	public MyMenuHandler(MenuFrame menuFrame) 
	{
		this.menuFrame = menuFrame;
	}

	public void actionPerformed(ActionEvent e) 
	{
		String msg = "You Selected......";
		String arg = (String) e.getActionCommand();
		if (arg.equals("new"))
			msg += "new......";
		else if (arg.equals("open"))
			msg += "open.....";
		else if (arg.equals("close"))
			msg += "close.....";
		else if (arg.equals("quit"))
			msg += "quit.....";
		else if (arg.equals("Edit"))
			msg += "edit.....";
		else if (arg.equals("cut"))
			msg += "cut.....";
		else if (arg.equals("copy"))
			msg += "copy.....";
		else if (arg.equals("paste"))
			msg += "paste.....";
		else if (arg.equals("first"))
			msg += "first.....";
		else if (arg.equals("second"))
			msg += "second.....";
		else if (arg.equals("third"))
			msg += "third.....";
		else if (arg.equals("debug"))
			msg += "debug.....";
		else if (arg.equals("test"))
			msg += "testing.....";
		menuFrame.msg = msg;
		menuFrame.repaint();

	}

	public void itemStateChanged(ItemEvent e) 
	{
		menuFrame.repaint();
	}
}

public class MenuDemo extends Applet 
{
	Frame f;

	public void init() 
	{
		f = new MenuFrame("menu demo");
		int width = Integer.parseInt(getParameter("width"));
		int height = Integer.parseInt(getParameter("height"));
		setSize(new Dimension(width, height));
		f.setSize(width, height);
		f.setVisible(true);
	}

	public void start() 
	{
		f.setVisible(true);
	}

	public void stop() 
	{
		f.setVisible(false);
	}
}
