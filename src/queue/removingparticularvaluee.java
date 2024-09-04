package queue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class removingparticularvaluee {

	public static void main(String[] args) {
		Set<Integer>t=new HashSet<Integer>();
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.print("enter the value");
			int x=s.nextInt();
			t.add(x);
		}
		System.out.println("Hashset is"+t);
		System.out.print("enter deleting value");
		int k=s.nextInt();
		Iterator<Integer>it=t.iterator();
		while(it.hasNext())
		{
			if(it.next()==k)
			{
				t.remove(k);
				break;
			}
		}
		System.out.println("HAshset is"+t);

	}

}
