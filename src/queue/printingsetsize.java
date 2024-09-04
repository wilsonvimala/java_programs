package queue;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class printingsetsize {

	public static void main(String[] args) {
		Set<Integer>t=new HashSet<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n:");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.print("enter the value");
			int x=s.nextInt();
			t.add(x);
		}
		System.out.println("hashsey size is"+t.size());

	}

}
