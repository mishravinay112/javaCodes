package prectice;

public class Example8 {

	public static void main(String[] args) {
		Example7 f = new Example7();
		test();
		Example7.test();
		f.test();
		System.out.println("i am in main()");

	}

	public static void test() {
		System.out.println("i am in test()");
	}

}
