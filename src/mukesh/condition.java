package mukesh;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) 
	{
	
		
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter a number");
		
		String data=scan.nextLine();
		
		int num=Integer.parseInt(data);
		
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		
		
		
		
		
		
		


	}

}
