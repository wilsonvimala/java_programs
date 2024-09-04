import java.util.Scanner;
public class duplicate 
{

	public static void main(String[] args) 
	{
		int n;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		
		System.out.print("enter the n number");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter value");
			a[i]=s.nextInt();
		}
        System.out.println("result is");
        for(int i=0;i<a.length-1;i++)	                   
        {
        	
        	for (int j=i+1;j<a.length-1;i++)
        	{
        		if (a[i]==a[j])
        		{
        			System.out.println("duplicate is"+a[i]);
        		}
        	}
        	
        }
			

	}

}
