package collections;
import java.util.Scanner;
import java.util.LinkedList;
public class deletingparticularvalue {

	public static void main(String[] args)
	{
		LinkedList<Integer>data=new LinkedList<Integer>();
		int h=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the data");
			int a=s.nextInt();
			data.add(a);
			
		}
		System.out.println("stack value is"+data);
		System.out.println("enter deleting value");
		int t=s.nextInt();
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)==t) {
				data.remove(i);
			}
		}
		System.out.println("linked list"+data);
		
		

	}

}
