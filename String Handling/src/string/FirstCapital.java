package string;

import java.util.Scanner;

public class FirstCapital {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String[] words = input.split(" ");
		s.close();
		for (int i = 0; i < words.length; i++) 
		{
			char part[] = words[i].toCharArray();
			part[0]=Character.toUpperCase(part[0]);
			System.out.print(new String(part)+" ");
		}
	}
}
