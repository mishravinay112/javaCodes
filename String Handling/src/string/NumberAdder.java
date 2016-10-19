package string;
import java.util.Scanner;
public class NumberAdder 
{
	public static void main(String args[])
	{	
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the string :- ");
		String enter=s.next();
		s.close();
		char in[]=enter.toCharArray();
		for(int i=0;i<in.length;i++)
		{
			if( Character.isDigit(in[i]) )
			{	
				
				int add=Character.getNumericValue(in[i]);
				sum+=add;
			}
		}
		System.out.println("sum = "+sum);
	}
	
}
