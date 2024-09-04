package switchprogram;
import java.util.*;
public class test 
{
	public static void main(String[]args) 
	{
		int opt;
		Scanner y=new Scanner(System.in);
		System.out.println("enter any one option 1 or 2 or 3 or 4");
		opt=y.nextInt();
		switch(opt)
		{case 1:
			System.out.println("hai welcome");
			break;
		case 2:
			System.out.println("good morning to all");
			break;
		case 3:
			System.out.println("thankyou");
			break;
		case 4:
			System.out.println("good ni8");
			break;
		default:
			System.out.println("error");
			break;
		
			
			
			
		}
	
	}

}
