package SIB_pROGRAMS;

///////after JDK 1.5 CLASS MUST  HAVE 




public class Example2 {
	static
	{
		System.out.println("SIB in Example2");
	}
	public static void main(String[] args) {
		System.out.println("main");
	
	}

}

class Example2_1
{
	static
	{
		System.out.println("SIB in Example2_1");
	}
}

 class Example extends Example2_1
{
	static 
	{
		System.out.println("SIB in Example");
	}
}