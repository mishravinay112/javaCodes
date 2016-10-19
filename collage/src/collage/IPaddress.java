package collage;

import java.util.*;

 class BinaryToDecimal {
	 
    public int getDecimalFromBinary(int binary)
    {
         
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0)
            {
                break;
            }
            else
            {
                int tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
     
    public static void main(String a[]){
        BinaryToDecimal bd = new BinaryToDecimal();
        System.out.println("11 ===> "+bd.getDecimalFromBinary(11));
        System.out.println("110 ===> "+bd.getDecimalFromBinary(110));
        System.out.println("100110 ===> "+bd.getDecimalFromBinary(100110));
    }
}

 class IPaddress 
 {
	public static void main(String ar[]) 
	{
		String s = new String();
		Scanner sc = new Scanner(System.in);
		s = sc.next();

		String[] parts = s.split("\\.");

		String part1 = parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		String part4 = parts[3];
		
		int y = Integer.parseInt(part1);
		int a = Integer.parseInt(part2);
		int b = Integer.parseInt(part3);
		int c = Integer.parseInt(part4);
		
		BinaryToDecimal b2d=new BinaryToDecimal();
		
		y=b2d.getDecimalFromBinary(y);
		a=b2d.getDecimalFromBinary(a);
		b=b2d.getDecimalFromBinary(b);
		c=b2d.getDecimalFromBinary(c);
		
		if (a < 255 && b < 255 && c < 255)
		{

			if (0 < y)
			{
				if (y <= 127) 
				{
					System.out.println(" class A ");
				}
			}
			
			if (128 < y) 
			{
				if (y <= 191) 
				{
					System.out.println(" class B ");
				}
			}

			if (191 < y) 
			{
				if (y <= 223) 
				{
					System.out.println(" class C ");
				}
			}
			
			if (223 < y) 
			{
				if (y <= 239) 
				{
					System.out.println(" class D ");
				}
			}
			if (239 < y) 
			{
				if (y <= 247) 
				{
					System.out.println(" class E   Reserved ");
				}
			}
		} 
	
		else 
		{
			System.out.println("IP not allowed");
		}

	}

}
