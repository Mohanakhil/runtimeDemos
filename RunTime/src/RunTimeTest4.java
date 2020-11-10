abstract class Flight
{
	private int no;
	void setNo(int no)
	{
		this.no=no;
	}
	int getNo()
	{
		return this.no;
	}
	abstract void reserve();
}
class Indigo extends Flight
{ void reserve()
	{ System.out.println("indigo flight is booked");
	
}}
class SpiceJet extends Flight
{
	void reserve()
	{System.out.println("spicejet flight is booked");
}}
class FlightReservation
{ static void reservation(Flight f)
	{f.reserve();
	}
}
public class RunTimeTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Indigo i1=new Indigo();
FlightReservation.reservation(i1);
SpiceJet s1=new SpiceJet();
FlightReservation.reservation(s1);
	}

}
