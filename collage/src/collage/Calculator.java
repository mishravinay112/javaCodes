package collage;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener 
{
	Button b[] = new Button[10];
	TextField t1;
	String s = "";
	char OP;
	int num1, num2;
	int result = 0;

	public void init() 
	{
		t1 = new TextField(10);
		
		for (int i = 0; i <= 9; i++) 
		{
			b[i] = new Button("" + i);
		}
		
		Button add = new Button("+");
		Button sub = new Button("-");
		Button mul = new Button("*");
		Button div = new Button("/");
		Button mod = new Button("%");
		Button equal = new Button("=");
		Button clr = new Button("clr");
		add(t1);
		t1.addActionListener(this);
		
		for (int i = 0; i <= 9; i++) 
		{
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clr);
		add(equal);
		
		for (int i = 0; i <= 9; i++) 
		{
			b[i].addActionListener(this);
		}
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		equal.addActionListener(this);
		clr.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s = e.getActionCommand();
		char t = s.charAt(0);
		if (Character.isDigit(t)) 
		{
			t1.setText(t1.getText() + s);
		}
		if (s.equals("+")) 
		{
			num1 = Integer.parseInt(t1.getText());
			OP = '+';
			t1.setText("");
		}
		if (s.equals("-")) {
			num1 = Integer.parseInt(t1.getText());
			OP = '-';
			t1.setText("");
		}
		if (s.equals("*")) 
		{
			num1 = Integer.parseInt(t1.getText());
			OP = '*';
			t1.setText("");
		}
		if (s.equals("/")) 
		{
			num1 = Integer.parseInt(t1.getText());
			OP = '/';
			t1.setText("");
		}
		if (s.equals("%")) 
		{
			num1 = Integer.parseInt(t1.getText());
			OP = '%';
			t1.setText("");
		}
		if (s.equals("=")) 
		{
			num2 = Integer.parseInt(t1.getText());
			if (OP == '+') 
			{
				result = num1 + num2;
			} else if (OP == '-')
			{
				result = num1 - num2;
			} else if (OP == '*') 
			{
				result = num1 * num2;
			} else if (OP == '/') {
				result = num1 / num2;
			} else if (OP == '%') 
			{
				result = num1 % num2;
			}
			t1.setText("" + result);
		}
		
		if (s.equals("clr")) 
		{
			t1.setText("");
		}
	}
}
