package pack2;

public class Duck extends Animal implements Egglayble
{
	public void speak()
	{
		System.out.println("kwak kwak");
	}

	@Override
	public void layegg() {
		// TODO Auto-generated method stub
		System.out.println("i lay kwak kwak egg");
	}
}
