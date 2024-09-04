import java.util.*;
public class positiveandnegative {

	public static void main(String[] args) 
	{
		int n,pc=0,nc=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
				System.out.print("enter value");
				a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0) {
				pc++;
			}
			else
			{
				nc++;
			}
		}
		System.out.println("positive count is"+pc);
		System.out.println("negative count is "+nc);
				
		
				

	}

}
