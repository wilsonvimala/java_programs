package queue;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
public class creatingnavigableset {

	public static void main(String[] args) 
	{
		NavigableSet<Integer>t=new  TreeSet <>();
		Scanner s=new Scanner(System.in);
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
    System.out.println("first number:"+start1);
    int lastn=t.last();
    System.out.println("last number"+lastn);
    int number1=t.pollFirst();
    System.out.println("removed first element"+number1);
    int number2=t.pollLast();
    System.out.println("removed last element"+number2);
	}
}
