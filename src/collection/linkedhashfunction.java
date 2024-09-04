package collection;
import java.util.*;
public class linkedhashfunction {

	public static void main(String[] args) 
	{
		int x,t,key;
		LinkedHashMap<Integer,String>a=new LinkedHashMap<Integer,String>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		x=s.nextInt();
		for(int i=0;i<x;i++) {
			System.out.print("enter the key");
			key=s.nextInt();
			System.out.print("enter the value");
			String value=s.next();
			a.put(key,value);
		}	
			
		
		System.out.println("result is"+a);
		System.out.println(" size of tha map"+a.size());
		System.out.println("map is empty or not?"+a.isEmpty());
		System.out.print("enter value");
		int j=s.nextInt();
		System.out.println("contains key"+a.containsValue(j));
		
		

	}
}
		

