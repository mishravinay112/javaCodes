package employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class EmployeeSorting 
{	
	static Scanner s=new Scanner(System.in);
	static Employee[] emp;
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome........ ");
		System.out.print("enter the number of employees : ");
		int employees=s.nextInt();
		 emp=new Employee[employees];
		for(int i=0;i<employees;i++)
		{	
			System.out.println("please enter the details of employee "+(i+1));
			int id=takeId();
			String name=takeName();
			float salary=takeSalary();
			
			emp[i]=new Employee(id, salary, name);
			System.out.println();
		}
		
		
		/*for(Employee e : emp)
		{
			System.out.println(e.id+"  "+e.name+"  "+e.salary);
		}*/
		
		while(true)
		{
			basis();
		}
	}
	
	static int takeId()
	{
		System.out.print("please enter the id : ");
		return s.nextInt();
	}
	static int takeSalary()
	{
		System.out.print("please enter the salary : ");
		return s.nextInt();
	}
	static String takeName()
	{
		System.out.print("please enter the name : ");
		return s.next();
	}
	
	static void basis()
	{	
		System.out.println("in which basis you want to sort -\n1.name\n2.salary\n3.id");
		int choice=s.nextInt();
		System.out.println("In which order you want to sort-\n1.ascending\n2.descending ");
		int order=s.nextInt();
		switch(choice)
		{
		case 1:
			Arrays.sort(emp, new SortingLogic("vinay",order));
			for(int i=0;i<emp.length;i++)
			{
				System.out.println(emp[i].id+"\t"+emp[i].name+"\t"+emp[i].salary);
			}
			break;
		case 2:
			Arrays.sort(emp, new SortingLogic(0.0f,order));
			for(int i=0;i<emp.length;i++)
			{
				System.out.println(emp[i].id+"\t"+emp[i].name+"\t"+emp[i].salary);
			}
			break;
		case 3:
			Arrays.sort(emp, new SortingLogic(1,order));
			for(int i=0;i<emp.length;i++)
			{
				System.out.println(emp[i].id+"\t"+emp[i].name+"\t"+emp[i].salary);
			}
			break;
			default:
				System.out.println("wrong input");
				break;
				
		}
	}
}


class Employee
{
	int id;
	float salary;
	String name;
	Employee(int id,float salary,String name)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}


class SortingLogic implements Comparator
{	
	int id;
	float salary;
	String name;
	int order;
	public SortingLogic(int id,int order) 
	{
		this.id=id;
		this.order=order;
		salary=-1;
		name="noName";
	}
	public SortingLogic(float salary,int order) 
	{
		this.salary=salary;
		this.order=order;
		id=-1;
		name="noName";
		
		
	}
	public SortingLogic(String name,int order) 
	{
		this.name=name;
		this.order=order;
		id=-1;
		salary=-1;
	}
	
	
	public int compare(Object o1, Object o2) 
	{	
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		if(id>0)
		{
			if(order==1)
			{
				return (e1.id-e2.id);
			}
			return (e2.id-e1.id);
			
		}
		if(salary>0)
		{
			if(order==1)
			{
				return (int) (e1.salary-e2.salary);
			}
			return (int) (e2.salary-e1.salary);
			
		}
		
		if(!name.equals("noName"))
		{
			if(order==1)
			{
				return (this.name.compareTo(this.name));
			}
			return (int) (e2.salary-e1.salary);
			
		}
		System.out.println("wrong input");
		return 0;
	}
	
	
}