package collage;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class ListDemo extends Applet implements ItemListener
{
   String msg=" ";
   List os,br;
    public void init() 
    {
      os=new List(3,true);
      br=new List(3);
    os.add("Windows XP");
      os.add("Linux");
      os.add("MacOS");
      br.add("Internet Explorer");
      br.add("Mozilla");
      br.add("Edge");
      add(os);
      add(br);
      os.addItemListener(this);
      br.addItemListener(this);
    }

      public void itemStateChanged(ItemEvent e) {
       repaint();
    }
    public void paint(Graphics g)
    {
       int idx[];
       msg="Selected OS   ";
       idx=os.getSelectedIndexes();
       for(int i=0;i<idx.length;i++)
       {
        msg+=os.getItem(idx[i]);
         g.drawString(msg,6,110);
       }
       msg="Selected Browser    ";
       msg+=br.getSelectedItem(); 
       g.drawString(msg,6,130);
     }}

