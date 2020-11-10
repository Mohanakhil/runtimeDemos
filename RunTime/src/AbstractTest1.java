abstract class Animals
{
	void sleep()
	{ 
		System.out.println("animal sleeps");
	}
	abstract void eat();
	
}
class Dogs extends Animals
{ 
	void eat()
	{
		System.out.println("dog eats");
	}
}
class Ox extends Animals
{ void eat()
	{
	System.out.println("cow eats");
	}
	
}
public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animals a;
a=new Ox();
a.eat();
a.sleep();
a=new Dogs();
a.eat();
a.sleep();
	}

}
