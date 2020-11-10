class Animal
{
	void eat()
	{
		System.out.println("animal eats");
	}
	void run()
	{
		System.out.println("animal runs");
	}
	
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("dog eats");
	}
	void run()
	{
		System.out.println("dog runs");
	}
}
class Cow extends Animal
{
	void eat()
	{
		System.out.println("cow eats");
	}
	void milk()
	{
		System.out.println("cow gives milk");
	}
}
public class RunTimeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a;
a=new Dog();
a.eat();
a.run();
	}

}
