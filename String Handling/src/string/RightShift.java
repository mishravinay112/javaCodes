package string;
import java.util.Scanner;
public class RightShift 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		char part[]=input.toCharArray();
		char result[]=new char[part.length];
		System.out.print("how many shifts : ");
		int n=s.nextInt();
		s.close();
		if(n>part.length)
		{
			n=n%part.length;
		}
		int j=0;
		for(int i=part.length-n;j<part.length;i++,j++)
		{
			if(i>=part.length)
			{
				i=0;
			}
			
			result[j]=part[i];
			System.out.print(result[j]);
			
			
		}
	}
}
