package SIB_pROGRAMS;

public class Example3 {
	final int i;
	
	{	i=10;
		System.out.println("IIB");
	}
	static {	
		System.out.println("SIB");
	}

	Example3() { 
		System.out.println("hello1");
	}

	Example3(int i) {
		System.out.println("hello2");
	}

	Example3(int i, int j) {
		System.out.println("hello3");
	}

	public static void main(String[] args) {

		System.out.println("main");
		Example3 e1 = new Example3();
		Example3 e2 = new Example3(10);
		Example3 e3 = new Example3(10, 20);

	}

}
