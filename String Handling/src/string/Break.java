package string;
import java.util.Scanner;
public class Break 
{	
	static int arrays=1;
	static int[] array;
	static int size;
	static int newArray[];
	static int insert=0;
	static int result[]=new int[2];
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the numeric string - ");
		String numericString=s.next();
		s.close();
		char check[]=numericString.toCharArray();
		array=new int[check.length];
		for(int i=0;i<check.length;i++)
		{	
			if(Character.isDigit(check[i]))
			{
				array[i]=Character.getNumericValue(check[i]);
			}
			else
			{
				System.out.println("you can't enter character in this String");
				System.exit(0);
			}
		}
		
		
		for(int i=0;i<array.length;i++)
		{	size++;
			if(i!=array.length-1)
			{
				if(array[i]>array[i+1])
				{	
					newArray=new int[size];
					
					for(int j=0;j<newArray.length;j++)
					{	
						newArray[j]=array[insert];
						System.out.print(newArray[j]+"  ");
						insert++;
					}
					if(size>result[0])
					{
						result[0]=size;
						result[1]=newArray[0];
					}
					System.out.println();
					
					arrays++;
					size=0;
				}
			}
			if(i==array.length-1)
			{	
				for(int k=insert;k<array.length;k++)
				if(insert!=array.length)
				if(array[insert-1]>array[insert])
				{	
					
					newArray=new int[size];
					for(int j=0;j<newArray.length;j++)
					{
						newArray[j]=array[insert];
						System.out.print(newArray[j]+"  ");
						insert++;
					}
					if(size>result[0])
					{
						result[0]=size;
						result[1]=newArray[0];
					}
					System.out.println();
				}
			}
			
		}
		System.out.println("total arrays--------->"+arrays);
		System.out.println("maximum size array in total arrays----->"+result[0]+"(size)");
		System.out.println("smallest element of this array--------->"+result[1]);
		
	}
}
	
	

