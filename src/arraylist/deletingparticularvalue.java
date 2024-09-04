package arraylist;
import java.util.*;
public class deletingparticularvalue {

	public static void main(String[] args) {
		int x,t;
		ArrayList<Integer>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			t=s.nextInt();
			data.add(t);
		}
		System.out.println("ArrayList"+data);
		System.out.println("enter the address");
		int b=s.nextInt();
		data.remove(b);
		System.out.println("current Array List"+data);

	}

}
