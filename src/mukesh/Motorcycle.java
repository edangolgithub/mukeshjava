package mukesh;

public class Motorcycle extends Vehicle
{
Engine motorengine;

public void showengine()
{
	System.out.println(motorengine.country);
	System.out.println(motorengine.price);
	System.out.println(motorengine.name);
}
public void run()
{
	  System.out.println("motorcycle is running");
}
}
