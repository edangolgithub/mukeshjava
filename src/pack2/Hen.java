package pack2;

public class Hen extends Animal implements Egglayble
{
	public void speak()
	{
		System.out.println("kukhuri kaaaa");
	
	}

	@Override
	public void layegg() {
		// TODO Auto-generated method stub
		System.out.println("i lay kukhuri kaa egg");
	}
}
