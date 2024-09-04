package collection;
import java.util.*;
public class particularvalueinhashmap {

	public static void main(String[] args) 
	{
		int x,t,key;
		LinkedHashMap<Integer,String> a=new LinkedHashMap<Integer,String>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the key");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.print("enter the key");
			key=s.nextInt();
			System.out.print("enter the value");
			String value=s.next();
			a.put(key, value);
			
		}
		for(Map.Entry<Integer,String>mapElement:a.entrySet())
		{
			Integer key2 = mapElement.getKey();
			String value =mapElement.getValue();
			System.out.println(key2+":"+a);
		}

	}

}
