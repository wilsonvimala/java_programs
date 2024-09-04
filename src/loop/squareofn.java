package loop;
import java.util.Scanner;


public class squareofn 
{

	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner k=new Scanner(System.in);
		System.out.println("enter the n");
		n=k.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*i;
			
		}
		System.out.println("the square og n no is"+sum);
		
		
		

	}

}
