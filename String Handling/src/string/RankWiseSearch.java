package string;

import java.util.Scanner;
import java.util.Arrays;
public class RankWiseSearch
{	
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("how many elements you want to enter : ");
		int elements=s.nextInt();
		int a[]=new int[elements];
		System.out.println("enter the elements-");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		s.close();
		System.out.println("in which order you want to arrange-\n1.increasing\n2.decreasing");
		int choice=s.nextInt();
		work(choice,a);
	
	}
	
	static void work(int choice,int a[])
	{
		switch(choice)
		{
		case 1:
			Arrays.sort(a);
			System.out.print("rank : ");
			int rank=s.nextInt();
			while(rank>a.length)
			{
				System.out.println("entered rank is greater than array size , try again");
				rank=s.nextInt();
			}
			System.out.println(a[a.length-rank]);
			
			break;
		case 2:
			Arrays.sort(a);
			System.out.print("rank : ");
			int rank1=s.nextInt();
			while(rank1>a.length)
			{
				System.out.println("entered rank is greater than array size , try again");
				rank1=s.nextInt();
			}
			System.out.println(a[rank1+1]);
			break;
		default:
			System.out.println("invalid choice try again");
			work(choice,a);
		}
	}
}
