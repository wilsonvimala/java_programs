package switchprogram;
import java.util.*;

public class arithematic 
{

	public static void main(String[] args) 
	
	{
		System.out.println("enter any one option 1 or 2  or 3 or 4");
		int a,b,c,opt;
		Scanner y=new Scanner(System.in);
		opt=y.nextInt();
		System.out.println("enter no a");
		a=y.nextInt();
		System.out.println("enter no b");
		b=y.nextInt();
		
		switch(opt)
		{
		case 1:
			c=a+b;
			System.out.println("enter the result c:"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("enter the result c:"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("enter the result c:"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("enter the result c:"+c);
			break;
		default:
			System.out.println("error");
			break;
			
			
		 
		
		
		
	
		}
		
		
			
		
		
		
		
		

	}

}
