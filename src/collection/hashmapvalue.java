package collection;
import java.util.*;
public class hashmapvalue {

	public static void main(String[] args) {
		int x,t,key;
		HashMap<Integer,String>a=new HashMap<>();
		Scanner s=new Scanner(System.in);
		System.out.print(" enter the n");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.print("enter the key");
			key=s.nextInt();
			System.out.print("enter the value");
			String value=s.next();
            a.put(key, value);
		}
		for(Integer key1 :a.keySet())
		{
			System.out.println(key1);
			System.out.println(a.get(key1));
		}
		

	}

}
