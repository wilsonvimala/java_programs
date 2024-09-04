package switchprogram;
import java.util.*;

public class logicaloperat 
{

	public static void main(String[] args)
	{
		int a,b,opt;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a");
		a=s.nextInt();
		System.out.println("enter b");
		
		b=s.nextInt();
		
		
		System.out.println("enter any option 1 or 2 ");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:
		System.out.println("and operation");
		if((a>=0)&&(b<=9))
		{
			System.out.println("both the values are positive ");
			
		}
		else
		{
			System.out.println("negative value ");
		}
		break;
	
		case 2:
			System.out.println("or operation");
			if((a>=0)||(b<=9))
			{
				System.out.println("both the values are positive ");
				
			}
			else
			{
				System.out.println("negative value ");
			}
			break;
		
			
			
		
		}
			
		

	}

}
