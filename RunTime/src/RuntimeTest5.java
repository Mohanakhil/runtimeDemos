abstract class Vehicle
{
	private String name;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return this.name;
	}
	abstract void move();
}
class Honda extends Vehicle
{ void move()
	{
	System.out.println(this.getName()+"honda is moving");
	}
	
}
class Bus extends Vehicle
{
	void move()
	{
		System.out.println(this.getName()+" bus is moving");
	}
}
class Game
{
	static void m(Vehicle v)
	{v.move();
	}
}
public class RuntimeTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Honda h1=new Honda();
h1.setName("hydcar");
Game.m(h1);
Bus b1=new Bus();
b1.setName("hydbus");
Game.m(b1);
	}

}
