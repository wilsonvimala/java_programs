package loop;
import java.util.*;
public class numberprogram01 
{

	public static void main(String[] args)
	{
		Scanner h=new Scanner(System.in);
	
		System.out.print("Enter the limit for natural numbers: ");
		 int limit = h.nextInt();
		 System.out.println("Natural numbers up to " + limit + ":");
	        for (int i = 1; i <= limit; i++) 
	        {
	            System.out.print(i +" ");
	        }
	        h.close();
	}
	
}