package collection;
import java.util.*;
public class indexofparticularvalue {

	public static void main(String[] args) 
	{
		Vector<Integer>x=new Vector<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter n");
		int d=s.nextInt();
		int i=1;
		while(i<=d) 
		{
			System.out.print("enter the value");
			int m=s.nextInt();
			x.add(m);
			i++;
			
			
		}
		System.out.println("vector value"+x);
		System.out.print("enter the particular value");
		int w=s.nextInt();
		for(int q=0;q<x.size();q++)
			
		{
			if(x.get(q)==w)
			{
				System.out.println("Index is"+q);
			}
		}
		

	}

}
