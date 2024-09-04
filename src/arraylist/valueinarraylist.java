package arraylist;
import java.util.*;
public class valueinarraylist {

	public static void main(String[] args) 
	{
		int x,t;
		ArrayList<Integer>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.print("enter the value");
			t=s.nextInt();
			data.add(t);
		}
		System.out.println("list is"+data);
		System.out.print("enter the value");
		int a=s.nextInt();
		System.out.print("enter the latest value");
		int b=s.nextInt();
		    for (int i=0;i<data.size();i++)
		    {
		    	if(data.get(i)==a)
		    	{
		    		data.set(i, b);
		    	}
		    }
		    System.out.println(" updated list is"+data);
		

	}

}
