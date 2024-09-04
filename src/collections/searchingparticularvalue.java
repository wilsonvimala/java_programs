package collections;
import java.util.Scanner;
import java.util.Stack;
public class searchingparticularvalue {

	public static void main(String[] args) 
	{
		Stack<Integer>data=new Stack<Integer>();
		int h=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the data");
			int a=s.nextInt();
			data.push(a);
		}
		System.out.println("Stack value is"+data);
		System.out.println("enter finding value");
		int t=s.nextInt();
		int k=data.search(t);
		if(k>0)
		{
			System.out.println("available");
			
		}
		else
		{
			System.out.println("not available");
		}
		

	}

}
