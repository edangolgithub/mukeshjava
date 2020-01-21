package pack2;
import java.util.ArrayList;



public class Program 
{
   

   
    public static void main(String[] args)
    {
    	Duck d1= new Duck(); 
    	Duck d2= new Duck(); 
    	Duck d3= new Duck(); 
    	Duck d4= new Duck(); 
    	Hen h1= new Hen();
    	Cat c1= new Cat();
    	Cat c2= new Cat();
    	Dog d= new Dog();
    	
    	ArrayList<Animal> alist= new ArrayList<Animal>();
    	alist.add(d1);
    	alist.add(d2);
    	alist.add(d3);
    	alist.add(d4);
    	alist.add(h1);
    	alist.add(c1);
    	alist.add(c2);
    	alist.add(d);
    	int count=0;
    	for (Animal animal : alist) {
			if(animal instanceof Egglayble )
			{
				count++;
			}
		}
    	System.out.println("there are "+count+" animals that lay egg");
    }
}