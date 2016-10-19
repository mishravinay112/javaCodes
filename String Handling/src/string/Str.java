package string;

public class Str {
	public static void main(String args[]) throws Exception
	{
		String s="helloHii";
		String s1="hello".concat("Hii");
		System.out.println(s.equalsIgnoreCase(s1));
		String s2="hello"+"Hii";
		System.out.println(s==s1);
		System.out.println(s==s2);
		try 
		{	
			
			System.out.println("vinay");
		}
		finally
		{
			int i=1/0;
			System.out.println("mishra");
		}
	}

}
