package loop;
import java.util.*;

 public class cubevalue 
{

	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter n number");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*i*i;
			
		}
		System.out.println("square of n number is "+sum);
		

	}

}
