package queue;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class setdifference {

	public static void main(String[] args) 
	{
		Set<Integer>t=new HashSet<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			
			System.out.print("enter the n:");
			int x=s.nextInt();
			t.add(x);
		}
			{
				
				System.out.print("hashset1 is"+t);
				Set<Integer>p=new HashSet<Integer>();
				System.out.print("enter the n");
				int a=s.nextInt();
				for(int i=0;i<a;i++)
				{
					System.out.print("enter the value");
					int x=s.nextInt();
					p.add(x);
				}
				System.out.println("hashset2 is"+p);
				t.removeAll(p);
				System.out.println("difference of 2 set is"+t);
			}
			
		}

}

