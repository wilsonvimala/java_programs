package queue;
import java.util.*;
public class creatingasortedset {

	public static void main(String[] args) 
	{
		SortedSet<Integer>t=new TreeSet<>();
		Scanner s=new Scanner(System.in );
		System.out.print("enter the n");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.print("enter the value");
			int x=s.nextInt();
			t.add(x);
			
		}
		System.out.println("treeset is"+t);
		int start1=t.first();
		System.out.println("First number"+start1);
		int lastn=t.last();
		System.out.println("last number "+lastn);

	}

}
