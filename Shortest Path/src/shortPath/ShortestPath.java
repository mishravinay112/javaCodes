package shortPath;

import java.util.ArrayList;

public class ShortestPath {
	static String paths[][];
	static int shortestPath;
	static int path[][];
	static ArrayList<Integer> route;
	static int priviousX=0,priviousY=0;

	public static void main(String args[]) {

		String givenPath[] = { "2#1#1#6", "1#1#6#3", "6#2#4#1", "9#1#1#5" };
		getPath(paths, givenPath);// here we got paths in our 2D array
		path = new int[givenPath.length][givenPath.length];
		stringToIntPath();//here String path converted in Integer.We can also implement Serializable here
		
				check1(0,0);
		
		
		// Here finding Shortest Path.

	}

	
	
	
	
	




	private static boolean check1(int i, int j) {
		int temp,x,y;
		if(j==0)
		{	
			
			if(i==0)
			{	
				temp=path[i][j+1];
				x=i;
				y=j+1;
				if(path[i+1][j+1]<temp)
				{
					temp=path[i+1][j+1];
					x=i+1;
					y=j+1;
					
				}
				if(path[i+1][j]<temp)
				{
					temp=path[i+1][j];
					x=i+1;
					y=j;
				}
				
				System.out.println("here your traversing starts");
				System.out.println("value at "+"("+0+","+0+") : "+path[0][0]);
				System.out.print("value at "+"("+x+","+y+") : ");
				System.out.println(temp);
				check1(x,y);
				
				
			}
			else if(i==path.length-1)
			{

				temp=path[i-1][j+1];
				x=i-1;
				y=j+1;
				
				if(path[i][j+1]<temp)
				{
					temp=path[i][j+1];
					x=i;
					y=j+1;
				}
				System.out.print("value at "+"("+x+","+y+") : ");
				System.out.println(temp);
				check1(x,y);
			}
			else
			{	
				temp=path[i-1][j+1];
				x=i-1;
				y=j+1;
				
				if(path[i][j+1]<temp)
				{
					temp=path[i][j+1];
					x=i;
					y=j+1;
				}
				if(path[i+1][j+1]<temp)
				{
					temp=path[i+1][j+1];
					x=i+1;
					y=j+1;
				}
				if(path[i+1][j]<temp)
				{
					temp=path[i+1][j];
					x=i+1;
					y=j;
				}
				System.out.print("value at "+"("+x+","+y+") : ");
				System.out.println(temp);
				check1(x,y);
			}
		}
		else if(j==path.length-1)
		{
			if(i==0)
			{
				temp=path[i+1][j];
				x=i+1;
				y=j;
				System.out.print("value at "+"("+x+","+y+") : ");
				System.out.println(temp);
				check1(x,y);
			}
			else if(i==path.length-1)
			{
				System.out.println("you have reached to destination");
				return true;
			}
			else
			{
				temp=path[i+1][j];
				x=i+1;
				y=j;
				System.out.print("value at "+"("+x+","+y+") : ");
				System.out.println(temp);
				check1(x,y);
			}
		}
		else{
			if(i==0)
			{	
				temp=path[i][j+1];
				x=i;
				y=j+1;
				if(path[i+1][j+1]<temp)
				{
					temp=path[i+1][j+1];
					x=i+1;
					y=j+1;
					
				}
				if(path[i+1][j]<temp)
				{
					temp=path[i+1][j];
					x=i+1;
					y=j;
				}
				
				System.out.print("value at "+"("+x+","+y+") : ");
				System.out.println(temp);
				check1(x,y);
				
				
			}
			else if(i==path.length-1)
			{

				temp=path[i-1][j+1];
				x=i-1;
				y=j+1;
				
				if(path[i][j+1]<temp)
				{
					temp=path[i][j+1];
					x=i;
					y=j+1;
				}
				System.out.println(temp);
				check1(x,y);
			}
			else
			{	
				temp=path[i-1][j+1];
				x=i-1;
				y=j+1;
				
				if(path[i][j+1]<temp)
				{
					temp=path[i][j+1];
					x=i;
					y=j+1;
				}
				if(path[i+1][j+1]<temp)
				{
					temp=path[i+1][j+1];
					x=i+1;
					y=j+1;
				}
				if(path[i+1][j]<temp)
				{
					temp=path[i+1][j];
					x=i+1;
					y=j;
				}
				System.out.print("value at "+"("+x+","+y+") : ");
				System.out.println(temp);
				check1(x,y);
			}

		}
		
		return false;
	}





	private static void stringToIntPath() {
		
		
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path.length; j++) {
				path[i][j] = Integer.parseInt(paths[i][j]);
			}
		}
		
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path.length; j++) {
				System.out.print(path[i][j]+"\t");
			}
			System.out.println();
		}

	}

	private static void getPath(String[][] paths2, String[] givenPath) {
		paths = new String[givenPath.length][givenPath.length];
		for (int i = 0; i < givenPath.length; i++) {
			String path[] = givenPath[i].split("#");

			for (int j2 = 0; j2 < path.length; j2++) {
				paths[i][j2] = path[j2];

			}

		}

	}
}
