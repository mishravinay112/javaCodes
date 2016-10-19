package army;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Commander 
{	
	static String city[] = { "1#2", "1#4", "4#5", "5#6", "6#7", "2#3", "3#4","4#8", "5#7", "8#9", "9#10", "10#11", "8#11" };
	static ArrayList<String> cities=new ArrayList<String>();
	static ArrayList<String> result=new ArrayList<String>();
	static ArrayList<String> resultCopy=new ArrayList<String>();
	
	public static void main(String[] args) 
	{
		citiesInList();
		
		for(int i=0;i<city.length;i++)
		{
			String place[]=city[i].split("#");
			if(i==0)
			{
				result.add(place[0]);
				result.add(place[1]);
			}
			
		}
		
		
	}
	
	static void citiesInList()
	{
		for(int i=0;i<city.length;i++)
		{
			String place[]=city[i].split("#");
			if(check(cities.size(),place[0])==true)
			{
				cities.add(place[0]);
			}
			if(check(cities.size(),place[1])==true)
			{
				cities.add(place[1]);
			}
			
		}
		
		
		for(int i=0;i<cities.size();i++)
		{
			System.out.print(cities.get(i)+ " ");
		}
		
		
	}
	
	
	
	public static boolean check(int i,String place)
	{
		if(i>0)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(place.equals(cities.get(j)))
				{
					return false;
				}
			}
		}
		return true;
	}
}
