package string;

import java.util.Scanner;

public class StringPalindrom
{
	public static void main(String[] args) {
		System.out.print("please give some input : ");
		Scanner s=new Scanner(System.in);
		String input=s.next();
		s.close();
		
		for(int i=input.length();i>=0;i--)
		{
			StringBuffer sb=new StringBuffer(input.substring(0, i));
			for(int j=i;j>=0;j--)
			{
				StringBuffer sb1=new StringBuffer(sb.substring(j, i));
				String s1=new String(sb1);
				sb1.reverse();
				String s2=new String(sb1);
				//System.out.println(sbCopy);
				if(s1.equals(s2) && sb1.length()>1  )
				{
					System.out.print(sb1+" ");
					break;
					
				}
			}
			
		}
	}
}
