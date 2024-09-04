package collection;
import java.util.*;
public class creatingvector {

	public static void main(String[] args) 
	{
		Vector<String>x=new Vector<String>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter n ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			System.out.print("enter the value");
			String m=s.next();
			x.add(m);
			i++;
		}
		System.out.print("vector is"+x);
		

	}

}
