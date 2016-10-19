package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Details implements Serializable
{
	int id;
	String name;
	int salary;
	Details(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void show()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("salary = "+salary);
	}
}

 public class Serialization 
 {	
	 public static void main(String args[]) throws IOException
	 {
		 Details d=new Details(101,"vinay",500000); 
		 File f=new File("C:\\Users\\Black Pearl\\Desktop\\vinay.ser");
		 FileOutputStream fos=new FileOutputStream(f);
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(d);
		 oos.close();
		 fos.close();
		 System.out.println("object saved");
	 }
 }