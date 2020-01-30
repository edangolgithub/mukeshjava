package mukesh;


import java.util.*;
import java.util.Map.Entry;

public class Collect {

	public static void main(String[] args) {
		hset();
		 
	}
	
	public static void alist()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("mukesh");
		names.add("ramesh");
		names.add("krishna");
		names.add("hari");
		
		names.remove(0);
		for (String item : names) {
			System.out.println(item);
		}
	}
	
	public static void stack()
	{
		//LIFO
		
		Stack<Integer> st= new Stack<Integer>();
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.pop();
		st.pop();
		// foreach
		
		for(Integer item : st)
		{
			System.out.println(item);
		}
	}
	//fifo
	public static void q() {
		ArrayDeque<Integer> qu= new ArrayDeque<Integer>();
		qu.add(1);
		qu.add(2);
		qu.add(3);
		qu.add(4);
		qu.remove();
		for (Integer item : qu) {
			System.out.println(item);
		}
	}
	
	public static void hset()
	{
		HashMap<String, Integer> age= new HashMap<String, Integer>();
		
		age.put("mukes", 25);
		age.put("ram", 20);
		age.put("shyam", 35);
		age.put("hari", 15);
		age.put("mukes", 20);
		
		for (Entry<String, Integer> item : age.entrySet()) 
		{
		 System.out.println("Name is :"+item.getKey()+" and age is :"+item.getValue());	
		}
	}

}
