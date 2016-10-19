package prectice;

import java.util.Scanner;

public class Example22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value");
		String st = s.nextLine();
		if (st.equals("abc")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
