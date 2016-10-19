package thread;

public class ConcurrencyMaintain 
{	
	
	public static void main(String args[])
	{
		Account a=new Account(123,"Vinay",10000);
		Bank b=new Bank(a);
		Atm atm=new Atm(a);
		Watch w=new Watch(atm,b,a); 
		b.start();
		atm.start();
		w.start();
		//System.out.println("Finally account Balance = "+a.Balance);
	}
}


class Account
{	
	static int wait=0;
	int number;
	String name;
	int Balance;
	int deposite;
	int withdraw;
	Account(int number,String name,int Balance)
	{
		this.name=name;
		this.number=number;
		this.Balance=Balance;
		System.out.println("Name = "+name);
		System.out.println("Account No = "+number);
		System.out.println("Balance = "+ Balance);
	}
	
	
	public int deposite(int amount) 
	{
		if(amount>0)
		{	deposite=amount;
			System.out.println("amount of "+amount+" deposite");
			int local=Balance;
			local=local+amount;
			Balance=local;
			return Balance;
		}
		return 0;
	}
	
	
	public int withdraw(int amount)
	{	
		
		if(Balance>amount)
		{	withdraw=amount;
			System.out.println("amount of "+amount+" withdraw");
			int local=Balance;
			local=local-amount;
			Balance=local;
			return Balance;
		}
		return 0;
	}
	
	
	public int enquiry()
	{	
		System.out.println(Balance);
		return Balance;
	}
}


class Bank extends Thread
{
	Account a;
	Bank(Account a)
	{
		this.a=a;
	}
	
	public void run()
	{	
		System.out.println("In BANK----------------`");
		a.enquiry();
		a.deposite(5000);
		a.enquiry();
	}
}

class Atm extends Thread
{
	Account a;
	Atm(Account a)
	{
		this.a=a;
	}
	public void run()
	{	System.out.println("In ATM---------------");
		a.enquiry();
		a.withdraw(2000);
		a.enquiry();
	}
}


class Watch extends Thread
{	
	Atm a;
	Bank b;
	Account acc;
	Watch(Atm a,Bank b,Account acc)
	{
		this.a=a;
		this.b=b;
		this.acc=acc;
	}
	
	int balance=acc.Balance;
	int deposite=b.a.deposite;
	int withdraw=a.a.withdraw;
	
	
	
	
}
