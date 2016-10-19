package test;

public class Test1 {
public static void main(String[] args) {
	 String a = "jklmn489pjro635ops";

	    int sum = 0;

	    String num = "";

	    boolean notFirst = false;

	    for (char c : a.toCharArray()) {

	        if (Character.isDigit(c)) {
	            sum = sum + Character.getNumericValue(c);
	            System.out.print((notFirst? " + " : "") + c);
	            notFirst = true;
	        }
	    }

	    System.out.println(" = " + sum);
}
}
