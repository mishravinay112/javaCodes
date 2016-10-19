package array;

import java.util.Scanner;

class DynamicArray<T>
{	
	T[] array;
	int i=0;
	int capacity;
	final int loadFactor=80;
	public DynamicArray() 
	{
		array=(T[])new Object[5];
		capacity=array.length;
	}
	
	 boolean add(T value)
	 {
		if(i<array.length)
		{
			array[i]=value;
			System.out.print(array[i++]+"  ");
			return true;
		}
		else
		{	
			System.out.println("\narray is full,increasing size with 80% next values are-");
			int size=(capacity)+((capacity*loadFactor)/100);
			T[] newArray=(T[])new Object[size];
			for(int i=0;i<array.length;i++)
			{
				newArray[i]=array[i];
			}
			array=newArray;
			return add(value);
		}
	 }
	 
	 
	 void seeAll()
	 {	
		 System.out.println("total elements in array - ");
		 for(int i=0;i<array.length;i++)
		 {	
			 try{
			 if(array[i].equals(null))
			 {
				 break;
			 }
			 System.out.print(array[i]+" ");
			 }
			 catch(Exception e)
			 {
				 
			 }
		 }
	 }
}










public class Array 
{
	
	public static void main(String[] args) throws ClassNotFoundException 
	{	
		Scanner s=new Scanner(System.in);
		System.out.print("please input the type : ");
		String type=s.next();
		Class c=Class.forName(type);
		DynamicArray<Integer> d=new DynamicArray<Integer>();
		d.add(10);
		d.add(2);
		d.add(1);
		d.add(1);
		d.add(23);
		d.add(1);
		d.seeAll();
		
	}

}
