package string;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmyCommander {
	public static void main(String[] args) {
		String city[] = { "1#2", "1#4", "4#5", "5#6", "6#7", "2#3", "3#4",
							"4#8", "5#7", "8#9", "9#10", "10#11", "8#11" };
		ArrayList <String>cities=new ArrayList<String>();
		for(int i=0;i<city.length;i++)
		{	
			int increment=0;
			String place1[]=city[i].split("#");
			//String previous1=place1[0];
			String next1=place1[1];
			//System.out.println(next1);
			for(int j=0;j<city.length;j++)
			{	
				System.out.println(i);
				String place2[]=city[i].split("#");
				String previous2=place2[0];
				//System.out.print(previous2+" ");
				//String next2=place2[2];
				if(place1[0].equals(place2[0]) && place1[1].equals(place2[1]))
				{
					break;
				}
				if(previous2.equals(next1))
				{
					place1=place2;
					System.out.print((increment++)+" ");
				}
			}
			//continue;
			
			
		}
		
	}
	

}
