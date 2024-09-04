package inheritance;
import java.util.Scanner;
public class Arithmetic3 extends Base5
{

	
	
	   Arithmetic3(int x,int y)
	   {
		   super(x,y);
		   
	   }
	   public static void main(String[]args)
	   {
		   Scanner s=new Scanner(System.in);
		   System.out.print("enter the first value");
		   int a=s.nextInt();
		   System.out.print("enter the second value");
		   int b=s.nextInt();
		   Arithmetic3 n=new Arithmetic3(a,b);
		   int t=n.add();
		   int u=n.sub();
		   System.out.println("addition value is"+t);
		   System.out.println("subtraction value is"+u);		   
	   }

	}


