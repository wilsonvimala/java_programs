package collections;
import java.util.LinkedList;
import java.util.Scanner;

public class findingtheparticularvalue {

	public static void main(String[] args) 
	{
		LinkedList<Integer>data=new LinkedList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the data");
			int a=s.nextInt();
			data.add(a);
		}
		System.out.println("stack value is"+data);
		System.out.println("enter finding value");
		int t=s.nextInt();
		for(int i=0;i<data.size();i++)
		{
			if(data.size()==t) {
				System.out.println(i+"available");
			}
			else
			{
				System.out.println(i+"not available");
			}
		}
	}

}
