package thread;

public class ProducerConsumerProblem 
{
	public static void main(String args[]) 
	{
		Resource r=new Resource();
		Producer p=new Producer(r);
		Consumer c=new Consumer(r);
		
	
		p.start();
		c.start();
	}
}

 class Resource
{
	 	boolean mutex=false;
		int shared=0;
		
		synchronized public void produce() throws InterruptedException
		{for(;;)
			{while(mutex==true)
			{
				wait();
			}
			++shared;
			System.out.println("Produce Produced Value "+shared);
			Thread.sleep(500);
			mutex=true;
			notify();
		}}

		synchronized public void consumer() throws InterruptedException
		{	for(;;)
			{while(mutex==false)
			{
				wait();
			}
			System.out.println("Consumer Consumes "+shared);
			Thread.sleep(500);
			mutex=false;
			notify();
		}}
		
}
 
 class Producer extends Thread
 {
	 Resource r;
	 Producer(Resource r)
	 {
		 this.r=r;
	 }
	 
	 public void run()
	 {
		 while(true)
		 {
			 try 
			 {
				r.produce();
			 } 
			 catch (InterruptedException e)
			 {
				
				System.out.println("exception in producer");
			 }
		 }
	 }
 }
 
 class Consumer extends Thread
 {
	 Resource r;
	 Consumer(Resource r)
	 {
		 this.r=r;
	 }
	 public void run()
	 {
		 while(true)
		 {
			 try 
			 {
				r.consumer();
			 } 
			 catch (InterruptedException e) 
			 {
				
				System.out.println("exception in consumer");
			 }
		 }
	 }
 }

