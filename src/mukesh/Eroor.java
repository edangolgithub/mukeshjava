package mukesh;

import java.util.Scanner;

public class Eroor {

	public static void main(String[] args)  {
		// syntax runtime logical
		//exception
		
		//divide by zero   numberformatexception nullpointer  arrayoutofbounds
        
		//a.speak();		Animal a= null; //new Animal();
		
		////int[] arr= {1,2,3,4,5};
		//System.out.println(arr[411]);
		
		// try catch throw finally
		
		
		//System.out.println(1/0);
		try {
		int a=5;
		if(a==5)
		{
			throw new MukeshException("mukesh exception thrown");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
