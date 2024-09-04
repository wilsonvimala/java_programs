package Creatinginnerclass;
import java.util.Scanner;
public class Arith1 
  {
public void add()
		{
			int x,y,z;
			Scanner s=new Scanner(System.in);
			System.out.println("enter x");
			x=s.nextInt();
			System.out.println("enter y");
			y=s.nextInt();
			z=x+y;
			System.out.println("addition value is0"+z);
		}
static class Subtract 
        {
        	public void sub()
        	{
        		int x,y,z;
        		Scanner s=new Scanner(System.in);
        		System.out.println("enter x");
        		x=s.nextInt();
        		System.out.println("enter y");
        		y=s.nextInt();
        		z=x-y;
        		System.out.println("subtraction value is"+z);
        	}
        }
        
}
