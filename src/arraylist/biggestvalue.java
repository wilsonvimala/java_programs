package arraylist;
import java.util.*;
public class biggestvalue 
{

	public static void main(String[] args)
	{
		int x,t;
		ArrayList<Integer>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		x=s.nextInt();
		for (int i=0;i<x;i++)
		{
			System.out.print("enter the value");
			t=s.nextInt();
			data.add(t);
		}
		int a=data.get(0);
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)>a)
				
               {
				a=data.get(i);
	
               }
		
		}
	
	System.out.println("biggest value is"+a);

}
}