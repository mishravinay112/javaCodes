package string;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


 public class Serialization1 
 {	
	 public static void main(String args[]) throws IOException, ClassNotFoundException
	 {
		 
		 File f=new File("C:\\Users\\Black Pearl\\Desktop\\vinay.ser");
		 FileInputStream fos=new FileInputStream(f);
		 ObjectInputStream oos=new ObjectInputStream(fos);
		 Object o=oos.readObject();
		 
		 System.out.println(o);
		 Class c=o.getClass();
		 System.out.println(c.getName());
		 System.out.println(c.getModifiers());
		 oos.close();
		 fos.close();
		 System.out.println("object retrieve");
	 }
 }