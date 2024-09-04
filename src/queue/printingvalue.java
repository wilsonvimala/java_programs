package queue;
import java.util.*;
public class printingvalue {

	public static void main(String[] args)
	{
		
		Set<Integer>t=new HashSet<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.print("enter the value");
			int x=s.nextInt();
			t.add(x);
		}
		Iterator<Integer> it=t.iterator();
		System.out.print("hashset using iterator");
		while(it.hasNext())
		{
			System.out.print(it.next());
			System.out.print(",");
		}
		
	}
}

