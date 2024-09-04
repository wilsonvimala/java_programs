package Lambdaexpression;
import java.util.Scanner;
interface oddoreven
{ int setValue(int a);
	
}
public class oddorevenlambda {

	public static void main(String[] args)
	{ oddoreven ad2=(int a)->{
		return(a*a*a);
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
			System.out.println("even number="+d);
		}
		else
		{
			System.out.println("odd number ="+d);
		}
	}
		

	}

}
