package Lambdaexpression;
import java.util.Scanner;
interface modules
{
	int setValue(int a);
}
public class lambdamod {

	public static void main(String[] args) 
      {
		modules ad2=(int a)->{
			return (a%2);
					};
		int n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the number");
			a=sc.nextInt();
			int d=ad2.setValue(a);
			if(d%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
    	  
      }

	}

}
