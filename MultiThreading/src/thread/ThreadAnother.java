package thread;

class Thread13 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=10 ; i++) {
			
			System.out.println(i);
		}
		System.out.println("thread 13 completes");
	}
	
}
class Thread12 extends Thread
{
	Thread13 t;
	
	public Thread12(Thread13 t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread 12 start but waiting for 13 thread");
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 11; i <21; i++) {
		System.out.println(i);	
		}
		System.out.println("thread12 finish");
	}
}


public class ThreadAnother {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread13 t13=new Thread13();
		
		Thread12 t12=new Thread12(t13);
		
		t13.start();
		t12.start();
		
		t12.join();
		
		for (int i = 21; i < 31; i++) {
			System.out.println(i);
		}
	}

}
