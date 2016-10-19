package test;
import java.util.Scanner;
public class TestImmutability {
	public static void main(String[] args) {
		
		int age;
		String name;
		System.out.print("enter  name : ");
		name=new Scanner(System.in).next();
		System.out.println("enter age : ");
		age=new Scanner(System.in).nextInt();
		Immutable i=new Immutable(name, age);
		name.concat(" indian ");
		System.out.println(name);
		name=name.concat("mishra");
		System.out.println();
		
	}
}
