abstract class Employees
{
	private int empno;
	private String ename;
	void setEmployees(int empno,String ename)
	{
		this.empno=empno;
		this.ename=ename;
	}
	int  getEmpno()
	{return this.empno;
	}
	String getEname()
	{
		return this.ename;
	}
	abstract float findSalary();
}
class Workers extends Employees
{private float wage;
private int days;
void setWorkers(float wage,int days)
{
	this.wage=wage;
	this.days=days;
}
float findSalary()
{ return this.wage*this.days;
}	
}
class CommEmployees extends Employees
{ private float sales;
void setSales(float sales)
{
	this.sales=sales;
}
float findSalary()
{
return (float)((this.sales)*1.15);	
}}
public class AbstractTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Workers w1=new Workers();
w1.setEmployees(101, "akhil");
w1.setWorkers(500f,30);
System.out.println(w1.getEmpno()+" "+w1.getEname()+" "+w1.findSalary());
CommEmployees c1=new CommEmployees();
c1.setEmployees(102, "rama");
c1.setSales(1000f);
System.out.println(c1.getEmpno()+" "+c1.getEname()+" "+c1.findSalary());
	}

}
