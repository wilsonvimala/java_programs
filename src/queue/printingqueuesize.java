package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class printingqueuesize {

	public static void main(String[] args) {
		Queue<Integer>q=new LinkedList<>();
		Scanner s=new Scanner(System.in);
        System.out.print("enter the values");
        int d=s.nextInt();
        while(d!=1000)
        {
        	q.add(d);
        	System.out.print("enter the value");
        	d=s.nextInt();
        	
        }
        System.out.println("Queue is"+q);
        System.out.println("size of queue"+q.size());

	}

}
