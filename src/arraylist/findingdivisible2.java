package arraylist;
import java.util.*;
public class findingdivisible2 {

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
		System.out.println("list is"+data);
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)%3==0) {
				System.out.println(data.get(i)+"is divisible");
				
				
			}
			else
			{
				System.out.println(data.get(i)+" is not divisible ");
			}
		}
		
		

	}

}
