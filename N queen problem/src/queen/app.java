package queen;
import java.util.Scanner;

public class app 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the num of queens : ");
		QueensProblem q=new QueensProblem(s.nextInt());
		System.out.println();
		q.solveQueensProblem();
	} 
}
