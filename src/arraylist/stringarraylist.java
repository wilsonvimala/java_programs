package arraylist;
import java.util.*;
public class stringarraylist {

	public static void main(String[] args) 
	{
		int x;
		String t;
		ArrayList<String>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n" );
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			t=s.next();
			data.add(t);
		}
		System.out.print("ArrayList:"+data);
				
		
		

	}

}
