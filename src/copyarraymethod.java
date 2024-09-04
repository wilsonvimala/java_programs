import java.util.*;
public class copyarraymethod 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		int data[]=new int [n];	
	
	for(int i=0;i<n;i++)
	{
		System.out.print("enter value");
		a[i]=s.nextInt();
	}
	System.arraycopy(a,0 , data, 0, a.length);
	System.out.println(" current array is:"+Arrays.toString(a));
	System.out.println("copy Array is:"+Arrays.toString(data));
	}
}	

