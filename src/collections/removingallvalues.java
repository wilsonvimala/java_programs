package collections;
import java.util.Scanner;
import java.util.Stack;



public class removingallvalues {

	public static void main(String[] args) 
	{
		Stack<Integer>file=new Stack<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the file");
			int a=s.nextInt();
			file.add(a);
		}
		System.out.println("stack value is"+file);
		file.removeAll(file);
		System.out.println("stack is"+file);
				
		

	}

}
