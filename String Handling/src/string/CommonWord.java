package string;
import java.util.*;
public class CommonWord 
{	
	static ArrayList <String> storeCommon=new ArrayList<String>();
	static ArrayList <Integer> count=new ArrayList<Integer>();
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		s.close();
		String[] words=input.split(" ");
		
		for(int i=0;i<words.length;i++)
		{	
			int check=0;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]) && check==0 && check(words,i))
				{	
					check++;
					storeCommon.add(words[i]);
					
				}
			}
		}
		
		for(int i=0;i<storeCommon.size();i++)
		{	
			int check=0;
			for(int j=0;j<words.length;j++)
			{
				if(storeCommon.get(i).equals(words[j]))
				{
					check++;
				}
			}
			count.add(check);
			
		}
		
		
		System.out.println(storeCommon);
		System.out.println(count);
		
	}
	
	static boolean check(String[] word,int i)
	{	
		
		if(i>0)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(word[j].equals(word[i]))
				{
					return false;
				}
			}
		}
		return true;
	}
}
