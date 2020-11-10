class A
{
	void m1()
	{
		System.out.println("m1 of A");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("m1 of B");
	}
}
class C extends A
{
	void m1()
	{
		System.out.println("m1 of c");
	}
}

public class RuntimeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj1;
obj1=new B();
obj1.m1();
	}

}
