package staticPrograms;

public class Example1 {
static int i;
static void test()
{
	i=90;
	System.out.println("test");
	
}
public static
void main(String[] args) {
	int i=123;
	System.out.println(i);
	
	
	{
		int ci=80;
		System.out.println("SIB3");
		test();
	}
}
}
