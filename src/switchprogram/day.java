package switchprogram;
import java.util.*;

public class day
{

	public static void main(String[] args) 
	{
		Scanner u=new Scanner(System.in);
		int a;
		String day;
		System.out.println("enter no a:");
		a=u.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
	default:
		System.out.println("error");
		
		
		}
		
		
		

	}

}
