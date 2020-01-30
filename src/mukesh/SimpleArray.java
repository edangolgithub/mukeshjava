package mukesh;

import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		int[] arr= new int[5];//{1,2,334,}
		Scanner scan= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter a number");
			arr[i]=scan.nextInt();
		}
		System.out.println("you entered");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			
		}
  
	}

}
