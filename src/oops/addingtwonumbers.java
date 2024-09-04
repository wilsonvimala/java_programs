package oops;
import java.util.*;
public class addingtwonumbers {
	int m=100,s=200,r;
	public void add(int x,int y) {
		r=m+s;
		System.out.println("addition value is"+r);
	}

	public static void main(String[] args) 
	{
		addingtwonumbers n=new addingtwonumbers();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		n.add(a,b);
		
		

	}

}
