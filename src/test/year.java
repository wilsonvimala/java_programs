package test;
import java.util.*;
public class year {

	public static void main(String[] args)
	{
		int year;
		Scanner u=new Scanner(System.in);
		System.out.println("enter the year:");
		year=u.nextInt();
		if(year>=1901&&year<1999)
		{
			System.out.println("19th centuary");
		}
		else if(year>2000&&year<=2024)
		{
			System.out.println("20th centuary");
			
		}
			
		
		

	}

}
