package queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class removingparticularvalue {

	public static void main(String[] args) {
		Queue<Integer>q=new LinkedList<>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value");
		int d=s.nextInt();
		for(int i=0;i<d;i++) {
			System.out.print("enter the value");
			int x=s.nextInt();
			q.add(x);
			
		}
		System.out.println("queue is "+q);
		int data=q.remove();
		System.out.println("updated queue is"+q);
	}

}
