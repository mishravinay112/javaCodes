package SIB_pROGRAMS;

class Example5_1 {
	static {
		System.out.println("SIB in 5_1");
	}

	{
		System.out.println("IIB in 5_1");
	}

	Example5_1()  {
		System.out.println("Example5_1()");
	}
}

class Example5_2 extends Example5_1 {
	static {
		System.out.println("SIB in 5_2");
	}

	{
		System.out.println("IIB in 5_2");
	}

	Example5_2() {
		System.out.println("Example5_2()");
	}
}

class Example5_3 extends Example5_2{
	static {
		System.out.println("SIB in 5_3");
	}

	{
		System.out.println("IIB in 5_3");
	}

	Example5_3() {
		System.out.println("Example5_3()");
	}
}


public class Exaample5
{
	public static void main(String[] args) {
		System.out.println("main");
		Example5_1 e5_1=new Example5_1();
		System.out.println("--------------");
		Example5_2 e5_2=new Example5_2();
		System.out.println("--------------");
		Example5_3 e5_3=new Example5_3();
		
	}
}