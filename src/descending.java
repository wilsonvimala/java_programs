import java.util.*;
public class descending {

	public static void main(String[] args) 
	{
		int n,t;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the value ");
			a[i]=s.nextInt();
			
		}
		System.out.print("array is");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]<a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			
		}

	}
	System.out.println("descending order ");
	System.out.print(Arrays.toString(a));
	}
}

