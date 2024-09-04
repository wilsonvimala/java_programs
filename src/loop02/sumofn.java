package loop02;
import java.util.*;
public class sumofn 
{

	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print(" enter the n number");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			sum=sum+i;
			i=i+1;
		}
        System.out.print(" sum of n number is "+sum);
	}

}
