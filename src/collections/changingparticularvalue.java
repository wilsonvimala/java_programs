package collections;
import java.util.LinkedList;
import java.util.Scanner;
public class changingparticularvalue {

	public static void main(String[] args) 
	{
		LinkedList<Integer>data=new LinkedList<Integer>();
		int h;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the data");
			int a=s.nextInt();
			data.add(a);
		}
		System.out.println("stack value is "+data);
		System.out.println("enter finding value");
		int t=s.nextInt();
		System.out.println("enter the latest vale");
		h=s.nextInt();
		for(int i=0;i<data.size();i++) {
			if(data.get(i)==t)
			{data.set(i,h);
					
		}
			System.out.println("updated linked list"+data);
				
		}
	}
}
