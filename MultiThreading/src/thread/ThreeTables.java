package thread;

class ThreeTables
{
	

	public static void main(String args[])
	{	
		Table t=new Table();
		T2 t2=new T2(t);
		T3 t3=new T3(t);
		T4 t4=new T4(t);
		
		
		t2.start();
		t3.start();
		t4.start();
	}
}


class T2 extends  Thread
{
	Table t;
	T2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.two();
	}
	
}

class T3 extends Thread
{
	Table t;
	T3(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.three();
	}
}

class T4 extends Thread
{
	Table t;
	T4(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.four();
	}
}

class Table
{
	int turn=2;
	
	synchronized public void two()
	{
		for(int i=1;i<=10;i++)
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
			System.out.println("2*"+i+"="+(2*i));
			turn =3;
			notifyAll();
		}
	}
		
		
		synchronized public void three()
		{
			for(int i=1;i<=10;i++)
			{
				while(turn!=3)
				{
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("3*"+i+"="+(3*i));
				turn =4;
				notifyAll();
			}
		}
			
			synchronized public void four()
			{
				for(int i=1;i<=10;i++)
				{
					while(turn!=4)
					{
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("4*"+i+"="+(4*i));
					System.out.println("________________________________________________\n");
					turn =2;
					notifyAll();
				}
	}
}