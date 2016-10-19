package thread;






/// this program is not correct












public class OneAfterAnother 
{	
	
	static Thread2 t2;
	public static void main(String args[]) throws InterruptedException
	{
		Print p=new Print();
		Thread1 t1=new Thread1(p);
		Thread2 t2=new Thread2(p);
		
		t1.start();
		thread2(t2);
		t1.join();
		
		t2.start();
		
		
		
		p.third();
	}
	
	static void thread2(Thread t)
	{
		t2=(Thread2) t;
	}
}

class Thread1 extends Thread
{
	Print p;
	OneAfterAnother o;
	Thread1(Print p)
	{
		this.p=p;
	}
	public void run()
	{
		Thread t=o.t2;
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.second();
	}
}

class Thread2 extends Thread
{
	Print p;
	Thread2(Print p)
	{
		this.p=p;
	}
	public void run()
	{
		p.second();
	}
}

class Print
{	
	
	public void first()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	public void second()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println(i);
		}
	}
	
	public void third()
	{
		for(int i=21;i<=30;i++)
		{
			System.out.println(i);
		}
	}
}