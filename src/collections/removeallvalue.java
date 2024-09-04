package collections;
import java.util.Scanner;
import java.util.Stack;
public class removeallvalue {

	public static void main(String[] args) 
	{
	   Stack<Integer>data=new Stack<Integer>();
	   Scanner s=new Scanner(System.in);
	   System.out.print("enter the n");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the data");
			int a=s.nextInt();
			data.push(a);
		}
		System.out.println("stack value is"+data);
		data.removeAllElements();
        System.out.println("stack is"+data);
	}

}
