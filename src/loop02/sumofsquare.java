package loop02;
import java.util.*;
public class sumofsquare
{

	public static void main(String[] args) 
	{
		int n,sum=0,x;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number");
		n=s.nextInt();
		int i=1;
		while(i<=n) {
			x=i*i;
			sum=sum+x;
			i=i+1;
		}
		{
		System.out.print("sum of square"+sum);
		}
		

	}

}
