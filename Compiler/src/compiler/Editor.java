package compiler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Editor 
{	
	private static Editor editor=null;
	private Editor() throws IOException 
	{
		Scanner s=new Scanner(System.in);
		boolean codeFinish=false;
		String code="";
		System.out.println("please enter the code below when finished write \"done\" in new LINE- ");
		
		while(codeFinish==false)
		{
			String line=s.nextLine();
			if(line.equals("done"))
			{
				codeFinish=true;
			}
			else
			{
				code=code+" "+line;
			}
		}
		
		System.out.println("please enter the class name where MAIN method presents ");
		String clas=s.next();
		String className=clas+".java";
		PrintWriter save=new PrintWriter(className);
		save.println(code);
		save.close();
		Runtime r=Runtime.getRuntime();
		//r.exec("notepad");
		r.exec("javac "+className);
		Process p=r.exec("java "+clas);
		 InputStream is=System.in;
		int b=is.read();
		System.out.println(b);
		
	InputStream isi=	p.getInputStream();
	
	BufferedReader br=new BufferedReader(new InputStreamReader(isi));
	
	String s1=null;
	while((s1=br.readLine())!=null)
	{
		System.out.println(s);
	}
		
	}
	
	public static Editor access() throws IOException
	{
		if(editor==null)
		{
			return new Editor();
		}
		else
		{
			return editor;
		}
	}
}
