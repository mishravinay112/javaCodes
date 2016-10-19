package SIB_pROGRAMS;

class Example4_1
{
	Example4_1()
	{
		
	}
}
public class Example4 extends Example4_1
{
Example4()
{
	System.out.println("Example4()");
}
Example4(int i)

{
	System.out.println("Example4(int)");
}

public static void main(String[] args) {
	Example4_1 d1=new Example4_1();
	System.out.println("----------------");
	Example4 d=new Example4();
	System.out.println("----------------");
	Example4 d2=new Example4(10);
}
}
