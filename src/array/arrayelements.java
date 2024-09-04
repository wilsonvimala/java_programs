package array;
import java.util.*;
public class arrayelements 
{

	public static void main(String[] args) 
	{
		int n,sum=0;
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("enter value");
			a[i]=s.nextInt();}
		
		{
			System.out.println("array is");
			System.out.println(Arrays.toString(a));}
	
		
			for(int i=0;i<n;i++)
			{
				sum=sum+a[i];
				
			}
			System.out.println("sum of array "+sum);
		}

	}
