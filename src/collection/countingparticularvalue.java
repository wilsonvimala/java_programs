package collection;
import java.util.*;
public class countingparticularvalue {

	public static void main(String[] args) 
	{
		Vector<Integer>x=new Vector<Integer>();
		Enumeration data;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int d=s.nextInt();
		int h=0;
		int i=1;
		while(i<=d) {
			Integer m=s.nextInt();
			x.add(m);
			i++;
		}
		data=x.elements();
		System.out.print("enter the particular value");
		Integer m=s.nextInt();
		while(data.hasMoreElements())
		{
			if( (data.nextElement()==m))
					
			{
				h=h+1;
						
			}
		}
		System.out.print("count is"+h);

	}

}
