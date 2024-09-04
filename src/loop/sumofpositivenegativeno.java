package loop;
import java.util.*;
public class sumofpositivenegativeno

{

	public static void main(String[] args) 
	{
		int ps=0,ns=0,n,a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value");
		n=s.nextInt();
		for(int i=1;i<=n;i++);
		{
			System.out.print("enter the value");
			a=s.nextInt();
			if(a>0)
				
			{
				ps=ps+a;
			}
			else
			{
				ns=ns-a;
			}
		}
		System.out.println("positive sum is"+ps);
		System.out.println("negative sum is"+ -(ns));
		

	}

}
