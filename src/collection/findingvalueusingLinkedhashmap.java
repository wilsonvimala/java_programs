package collection;
import java.util.*;
public class findingvalueusingLinkedhashmap
{

	public static void main(String[] args)
	{
		int x,t,key;
		LinkedHashMap<Integer,String>a=new LinkedHashMap<Integer,String>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.print("enter the key  ");
			key=s.nextInt();
			System.out.print("enter the value");
			String value=s.next();
			a.put(key, value);
		}
		System.out.println("result is"+a);
		System.out.print("enter the particular key value  ");
		int n=s.nextInt();
		System.out.println("enter the change value");
		String k=s.next();
		a.put(n, k);
		System.out.println("updated result is"+a);
	
			
		
		
			
				
				
				
				
				
				

	}

}
