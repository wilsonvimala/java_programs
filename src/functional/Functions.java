package functional;
import java.util.Scanner;
import java.util.function.Function;
public class Functions 
{

	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		System.out.print("enter the value");
		int x=m.nextInt();
		Function<Integer,String>s=t->t*10+"value";
		System.out.println(s.apply(x));
	
			
		
		

	}

}
