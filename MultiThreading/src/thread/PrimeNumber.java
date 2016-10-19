package thread;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		Prime p=new Prime();
		Input i=new Input(p);
		Output o=new Output(p);
		
		i.start();
		o.start();

	}
	

}



class Input extends Thread 
{
	Prime p;
	Input(Prime p)
	{
		this.p=p;
	}
	public void run()
	{
		p.input();
	}
}

class Output extends Thread
{
	Prime p;
	Output(Prime p)
	{
		this.p=p;
	}
	public void run()
	{
		p.output();
	}
}


class Prime 
{	
	int count=0;
	int input =0;
	int turn=1;
	synchronized public void input()
	{
		for(;;)
		{
		while(turn!=1)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(++input);
		/*try {
			//Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		count=0;
		turn=2;
		notifyAll();
		}
		
		
	}
	
	synchronized public void output()
	{	
		for(;;)
		{
			while(turn!=2)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		for(int i=2;i<input;i++)
		{
			if(input%i==0)
			{
				count=1;
				
			}
		}
		if(count==1)
		{
			System.out.println(" not prime");
		}
		else{
				System.out.println("prime");
		}
		/*try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		turn=1;
		notifyAll();
	}}
}