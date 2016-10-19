package string;

import java.util.Scanner;

public class shiftLogic {
	
	///THIS PROGRAM IS FOR LEFT SHIFT.
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		char part[]=input.toCharArray();
		char partCopy[]=part;
		System.out.println("how many shift - ");
		int shift=s.nextInt();
		if(shift>part.length)
		{
			shift=shift%part.length;
		}
		s.close();
		int i,j;
		char[] result=new char[part.length];
		for(i=0,j=shift;i<part.length;i++)
		{	
			
				if(j>=part.length)
				{
					j=0;
				}
				
				//System.out.print(partCopy[j]);
				result[i]=partCopy[j];
				partCopy[j++]=part[i];
				
				
				
			
			
		}
		
	String result1=new String(result);
		System.out.println("\n"+result1);
		
	}
}
