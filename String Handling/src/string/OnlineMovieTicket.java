package string;
import java.util.Scanner;
public class OnlineMovieTicket 
{	
	//NewUser n;
	String name;
	String number;
	int balance;
	Scanner s=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Welcome to Online Movie Ticket Booking");
		System.out.println("1.New User\n2.Existing User\n3.Exit");
		
		OnlineMovieTicket  o=new OnlineMovieTicket();
		
	}
	
	int firstOption(int choice)
	{
		switch(choice)
		{
		case 1:
			System.out.print("please enter your name : ");
			name=s.nextLine();
			System.out.print("please enter your mobile number : ");
			
			//n=new NewUser(name,balance,number);
			
		}
		return 0;
	}
	
	
	String phoneNumber()
	{
		
		number =s.next();
		return number;
		
	}
	
}
