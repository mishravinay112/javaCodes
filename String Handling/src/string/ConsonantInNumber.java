package string;
import java.util.Scanner;
public class ConsonantInNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("input : ");
		String input=s.next();
		s.close();
		if(input.length()<3)
		{
			System.out.println("input must contain atleast 3 characters ");
			System.exit(0);
		}
		for(int i=0;i<input.length()-2;i++)
		{
			String check=input.substring(i, i+3);
			char part[]=check.toCharArray();
			if(Character.isDigit(part[0]) && Character.isDigit(part[2]) && Character.isDigit(part[1])==false)
			{
				if(part[1]!='a' && part[1]!='e' && part[1]!='i' && part[1]!='o' && part[1]!='u' && part[1]!='A' && part[1]!='E' && part[1]!='I' && part[1]!='O' && part[1]!='U')
				{
					System.out.print(part[1]+" ");
				}
			}
		}
		
		
	}
}
