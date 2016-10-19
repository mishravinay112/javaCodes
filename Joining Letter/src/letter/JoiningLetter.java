package letter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JoiningLetter 
{	
	static String name;
	static String post;
	static String cts;
	static String doj;
	static int place=0;
	static String[] details;
	public static void main(String[] args) throws IOException
	{	
		Scanner s=new Scanner(System.in);
		details=new String[4];
		System.out.print("enter the employee name : ");
		name=s.nextLine();
		details[0]=name;
		System.out.print("enter the designation : ");
		post=s.nextLine();
		details[1]=post;
		System.out.print("enter the CTS : ");
		cts=s.next();
		details[2]=cts;
		System.out.print("date of joining : ");
		doj=s.next();
		details[3]=doj;
		
		FileReader fr=new FileReader("C:\\Users\\Black Pearl\\Desktop\\Appointment.txt");
		BufferedReader br=new BufferedReader(fr);
		
		
		//String letter="";
		
		while(br.readLine()!=null)
		{
			String line=br.readLine();
			System.out.println(line);
			String[] words=line.split("\\s+");
			
			for (int i = 0; i < words.length; i++) 
			{	
				
				if(words[i].equals("________________") && place<4)
				{
					words[i]=details[place++];
					
					
				}
			}
			
			line="";
			
			
			for (int i = 0; i < words.length; i++) 
			{
				line=line+" "+words[i];
			}
			//System.out.println(line);
			//letter=letter+line;
		}
		//System.out.println(letter);
	}
}
