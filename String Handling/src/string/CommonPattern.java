package string;
import java.util.Scanner;
public class CommonPattern 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the string : ");
		String input=s.next();
		s.close();
		int check1=0;
		for(int i=1;i<=input.length();i++)
		{
			String sub=input.substring(0, i);
			int length=sub.length();
			boolean check=false;
			if(input.length()%length==0)
			{
				for(int j=length;j<input.length();j=j+length)
				{
					if(sub.equals(input.substring(j, j+length)))
					{
						check=true;
					}
					else
					{
						check=false;
					}
				}
			}
			if(check==true)
			{
				System.out.println(sub);
				check1=1;
				break;
			}
		}
		if(check1==0)
		{
			System.out.println(input);
		}
		
		
	}
}
