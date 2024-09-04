package oops;
import java.util.Scanner;

class Swcase 
{  
	void oper (int x,int y ,int z)
	{
		int result;
		  switch(z) {
		  case 1:
			  result=x+y;
		  System.out.println("result is"+result);
		  break;
		  case 2:
			  result=x-y;
			  System.out.println("result is"+result);
			  break;
		  case 3:
			  result=x*y;
			  System.out.println("result is"+result);
		  case 4:
			  result=x/y;
			  System.out.println("result is"+result);
			  break;
		}
	}
}


public class Switchcasee{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		System.out.print("enter the thrid value");
		int c=s.nextInt();
		Swcase c1=new Swcase();
		c1.oper(a,b,c);		
	}
}
