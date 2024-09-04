import java.util.*;
public class copyrangematrix 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		int data[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the value ");
			a[i]=s.nextInt();
			
		}
		data=Arrays.copyOfRange(a,1,4);
	    System.out.println("current Array is"+Arrays.toString(a));
	    System.out.println("copy array is:"+Arrays.toString(data));
	    
	}
}


