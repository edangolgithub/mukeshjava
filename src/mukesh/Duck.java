package mukesh;

public class Duck extends Animal implements Egglayable
{
	public void speak()
	{
		System.out.println("kwak kwak");
	}

	@Override
	public void layegg() {
		System.out.println("i lay duck eggs");	
		
	}

	
}
