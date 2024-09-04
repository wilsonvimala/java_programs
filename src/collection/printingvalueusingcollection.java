package collection;
import java.util.*;

public class printingvalueusingcollection
{

	public static void main(String[] args) 
	{
		Vector<String>x=new Vector<String>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int d=s.nextInt();
		System.out.println("vector ");
		int i=1;
		while(i<=d) {
			System.out.print("enter the value");
			String m=s.next();
			x.add(m);
			i++;
			
		}
		System.out.println("collection arraylist");
		Collection c=new ArrayList<Integer>();
		for(int j=0;j<d;j++)
			
		{
			System.out.print("enter the value");
			int t=s.nextInt();
			c.add(t);
		}
		System.out.println("vector value is"+x);
		System.out.println("collection arraylist"+c);
		x.addAll(c);
		System.out.println("final Vector is"+x);
		
		
				
				
				
				
				
				
				
				

	}

}
