package mukesh;

public class Person 
{
   String name;
   String address;
   int age;
   int phone;
   
   
   public Person()
   {
	   System.out.println("constructor called");
   }

public Person(String name, String address, int age, int phone) 
{
	
	this.name = name;
	this.address = address;
	this.age = age;
	this.phone = phone;
}
public void add(int x, int y)
{
	System.out.println(x+y);
}


}

  
