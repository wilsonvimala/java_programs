import java.util.*;
public class mininumvalue
{

	public static void main(String[] args) 
	{
		int n,m;
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number");
		n=s.nextInt();
		int a[]=new int[5];
		for (int i=0;i<n;i++) 
		{
			System.out.print("enter value");
			a[i]=s.nextInt();
			
		}
		System.out.println("Array is:");
		System.out.println(Arrays.toString(a));
		m=a[0];
		for (int i=0;i<n;i++){
			if(m>a[i])
			{
				m=a[i];
			}
		}
		System.out.println("minium value is"+m );
	}

}
