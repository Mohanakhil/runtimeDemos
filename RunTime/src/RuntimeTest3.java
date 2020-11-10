class Employee
{
	private String name;
	private int id;
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	void print()
	{
		System.out.println("name= "+name+" id= "+id);
	}
}
class SalariedEmployee extends Employee
{ private float salary;
SalariedEmployee(String name,int id,float salary)
{super(name,id);
this.salary=salary;
}
void print()
{ super.print();
System.out.println("salary= "+this.salary);	
}
}
class Worker extends Employee
{ private float wage;
Worker(String name,int id,float wage)
{ super(name,id);
	this.wage=wage;
}
void print()
{ super.print();
System.out.println("wage= "+this.wage);
}
}
class Printer
{
	static void print(Employee e)
	{
		e.print();
	}
}
public class RuntimeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SalariedEmployee s1=new SalariedEmployee("rama",2020,50000f);
Printer.print(s1);
Worker w1=new Worker("sai",101,500f);
Printer.print(w1);
	}

}
