package prectice;

public class Example10 {

	public static void test1() {
		System.out.println("hello");
	}

	public static void test2() {
		System.out.println("begin test2()");
		test1();
		System.out.println("end test2()");
	}

	public static void main(String args[]) {
		test2();
	}
}
