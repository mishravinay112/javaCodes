package string;

public class Common {

	public static void main(String[] args)
	{
		String s="vinayvinayvinay";
		int size=s.length();
		//System.out.println(size);
		for(int i=1;i<=size;i++)
		{
			String sub=s.substring(0, i);
			//System.out.println(sub);
			int length=sub.length();
			//System.out.println(length);
			boolean check=false;
			if(size%length==0)
			{
				for(int j=length;j<size;j=j+length)
				{	
					//if(j<s.length())
					//System.out.print(sub2);
					if(sub.equals(s.substring(j,j+length)))
					{
						check=true;
					}
					else
					{
						check=false;
					}
				}
			}
			if(check==true)
			{
				System.out.println(sub);
			}
			
		}
		
	}

}
