import java.util.*;
public class arraycopy 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the value");
			a[i]=s.nextInt();
		}
		System.out.println("result is:");
		for(int i=0;i<a.length;i++) {
			
			b[i]=a[i];
		}
		System.out.println("array a is"+Arrays.toString(a));
		System.out.println("array b is "+Arrays.toString(b));
		

	}

}
