package mukesh;

public class Ary {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		// arraname[index]
  System.out.println(a[5]);
  //a[3]=90;
  
  for(int i=0;i<=9;i++)
  {
	  System.out.println(a[i]);
  }
  int sum=0;
  for(int i=0;i<=9;i++)
  {
	  sum=sum+a[i];
  }
  
  System.out.println(sum);
  
	}

}
