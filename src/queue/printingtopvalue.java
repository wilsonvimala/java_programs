package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class printingtopvalue {

	public static void main(String[] args) 
	{
	Queue<Integer>q=new LinkedList<>();
	Scanner s=new Scanner(System.in);
	System.out.print("enter the n");
	int d=s.nextInt();
	for(int i=0;i<d;i++)
	{
		System.out.print("enter the value");
		int x=s.nextInt();
		q.add(x);
	}
	System.out.println("queue is"+q);
	int data=q.peek();
	System.out.println("top value is"+data);

	}

}
