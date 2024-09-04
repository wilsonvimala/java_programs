package Lambdaexpression;
import java.util.Scanner;
interface addable
{
	int square(int a);
}
public class squareadd
{

	public static void main(String[] args) 
	{
		addable ad2=(int a)->{
			return (a*a);
		};
		int n,a,m=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        	System.out.println("enter the number");
        	a=sc.nextInt();
        	int d=ad2.square(a);
        	m=m+d;
        }
        System.out.println(m);
		

	}

}
