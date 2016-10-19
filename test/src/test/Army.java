package test;

public class Army
{
	public static void main(String[] args) 
	{
		String city[] = { "1#2", "1#4", "4#5", "5#6", "6#7", "2#3", "3#4",
				"4#8", "5#7", "8#9", "9#10", "10#11", "8#11" };
		
		boolean pass=false;
		
		int[][] teritory=new int[city.length][city.length];
		for(int i=0;i<city.length;i++)
		{	
			String place[]=city[i].split("#");
			for(int j=0;j<city.length;j++)
			{	
				if(pass==false)
				{
					teritory[i][j]=Integer.valueOf(place[0]);
					pass=true;
				}
				else
				{
					teritory[i][j]=Integer.valueOf(place[1]);
					pass=false;
				}
			}
		}
		
		
		for(int i=0;i<city.length;i++)
		{
			for(int j=0;j<city.length;j++)
			{	
				if(teritory[i][j]!=1)
				{
					teritory[i][j]=0;
				}
				System.out.print(teritory[i][j]+"     ");
			}
			System.out.println();
		}
	}
}
