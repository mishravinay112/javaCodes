package string;

import java.util.Scanner;

public class StringShift {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the input : ");
		String input = s.next();
		System.out.println("choose shift side -\n1.left \n2.right ");
		int choice = s.nextInt();
		char part[] = input.toCharArray();
		int i, j;
		char result[];
		switch (choice) {
		case 1:

			char partCopy[] = part;
			System.out.println("how many shift - ");
			int shift = s.nextInt();
			if (shift > part.length) {
				shift = shift % part.length;
			}
			s.close();

			result = new char[part.length];
			for (i = 0, j = shift; i < part.length; i++) {

				if (j >= part.length) {
					j = 0;
				}

				result[i] = partCopy[j];
				partCopy[j++] = part[i];

			}

			String result1 = new String(result);
			System.out.println("\n" + result1);

			break;

		case 2:

			result = new char[part.length];
			System.out.print("how many shifts : ");
			int n = s.nextInt();
			if (n > part.length) {
				n = n % part.length;
			}
			j = 0;
			for (i = part.length - n; j < part.length; i++, j++) {
				if (i >= part.length) {
					i = 0;
				}

				result[j] = part[i];
				System.out.print(result[j]);

			}
			break;

		default:
			System.out.println("wrong input");
		}

	}

}
