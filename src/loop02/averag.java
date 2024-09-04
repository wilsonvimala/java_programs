package loop02;
import java.util.*;
public class averag 
{

	public static void main(String[] args) 
	{
		int n,sum=0,x;
		float avg=0f;
		Scanner s= new Scanner(System.in);
		System.out.print("enter the n");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print("enter the value ");
			x=s.nextInt();
			sum=sum+x;
			
			i=i+1;
		}
		avg=sum/n;
		System.out.print("avg"+avg);

	}
	

}
