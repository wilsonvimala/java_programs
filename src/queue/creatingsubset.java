package queue;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class creatingsubset {

	public static void main(String[] args) {
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
		Set<Integer>p= new HashSet<Integer>();
		System.out.print("enter the n");
		int a=s.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.print("enter the value");
			int x=s.nextInt();
			p.add(x);
		}
		System.out.println("hashset1"+t);
		System.out.println("hashset2"+p);
		boolean result=t.containsAll(p);
		if(result)
		{
			System.out.println("set2 is subset of set1");
		}
		else
		{
			System.out.println("set2 is not subset of set1");
		}
	result=p.containsAll(t);
		if(result)
		{
			System.out.println("set2 is subset of set1");
		}
		else
		{
			System.out.println("set2 is not subset of set1");
		}

	}

}
