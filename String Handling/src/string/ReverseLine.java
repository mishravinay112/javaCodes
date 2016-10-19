package string;

import java.util.Scanner;

public class ReverseLine {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the line-");
		String line=s.nextLine();
		s.close();
		String splits[]=line.split(" ");
		for(int i=splits.length-1;i>=0;i--)
		{
			System.out.print(splits[i]+" ");
		}
		
	}
}
