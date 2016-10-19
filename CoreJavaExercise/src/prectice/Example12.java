package prectice;

public class Example12 {
	
	static int test(int m)
	{
		m=100;
		return m;
	}
	
public static void main(String[] args) {
	int i=10;
	System.out.println(i);
	i=test(i);
	System.out.println(i);
}
}
