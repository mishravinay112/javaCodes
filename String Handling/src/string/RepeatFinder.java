package string;
import java.util.Scanner;
public class RepeatFinder 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String :- ");
		String input=s.next();
		s.close();
		String inputCopy=input;
		char in[]=inputCopy.toCharArray();
		for(int i=0;i<in.length;i++)
		{	int check=0;
			for(int j=i+1;j<in.length;j++)
			{
				if(in[i]==in[j] && check==0 && check(in,i)==true)
				{	check++;
					System.out.print(in[i]);
				}
			}
		}
	}
	
	
	
	static boolean check(char []in,int i)
	{
		if(i>0)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(in[i]==in[j])
				{
					return false;
				}
			}
			
		}
		return true;
	}
	
	
}
