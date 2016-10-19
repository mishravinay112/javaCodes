package string;
import java.util.Scanner;
public class Finder2 
{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("input = ");
		String input=s.next();
		s.close();
		char []word=input.toCharArray();
		for(int i=0;i<word.length;i++)
		{
			for(int j=i+1;j<word.length;j++)
			{	
				
					
					if(word[i]==word[j] && check(word,i)==true )
					{	
						System.out.print(word[i]+" ");
						break;
					}
				
			}
		}
	}
	
	static boolean check(char[] word,int i)
	{	
		
		if(i>0)
		for(int j=i-1;j>=0;j--)
		{
			if(word[j]==word[i])
			{
				return false;
			}
		}
		return true;
	}
}
