package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class collection3 {

	public static void main(String[] args) 
	{
		LinkedList<Integer>q=new LinkedList<>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			q.add(i);
		}
		System.out.println("queue is:"+q);
		
		

	}

}
