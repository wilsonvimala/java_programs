package queue;
import java.util.PriorityQueue;
import java.util.Scanner;
public class creatingapriorityqueue {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> r=new PriorityQueue<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value");
		int d=s.nextInt();
		while(d!=1000)
		{
			r.add(d);
			System.out.print("enter the value");
			d=s.nextInt();
			
		}
		System.out.println("queue is"+r);
		System.out.println("top value is"+r.element());
		System.out.println("delet value is"+r.remove());
		System.out.println("updated queue is"+r);
		
				
	

	}

}
