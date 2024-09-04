package array;
import java.util.*;
public class reverseorder 
{

	public static void main(String[] args) 
	{
		int n;
		int a[]=new int[5];
	 Scanner u=new Scanner(System.in);
	 System.out.println("enter the n number ");
	 n=u.nextInt();
	 for(int i=0;i<n;i++)
	 {
		 System.out.println("enter value ");
		 a[i]=u.nextInt();
	 }
	 System.out.println("result is:");
	 for(int i=a.length-1;i>=0;i--)
	 {
		 System.out.println(a[i]);
	 }
	 
	 

	}

}
