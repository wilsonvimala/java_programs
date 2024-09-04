import java.util.*;
public class mapoperationlist 
{

	public static void main(String[] args) 
	{
		int n,m;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter value ");
			a[i]=s.nextInt();
		}
		System.out.println("array is");
		System.out.print(Arrays.toString(a));
		m=a[0];
		for (int i=0;i<n;i++)
		{
			if(m<a[i])
			{
		        m=a[i];
		        
			}
			System.out.println("maximum value is "+m);
		}

	}

}
