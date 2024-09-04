package functional;
import java.util.Scanner;
import java.util.function.Predicate;
public class Predic4if {

	public static void main(String[] args) 
	{
		String x,y;
		Scanner s=new Scanner(System.in);
		Predicate<String>user=a->a.equals("admin");
		Predicate<String>password=a->a.equals("123");
		System.out.println("enter the username: ");
		x=s.next();
		System.out.println("enter the password:  ");
		y=s.next();
		if(user.test(x)&&password.test(y))
		{
			System.out.println("login successfully");
			
		}
		else
		{
			System.out.println("user name or password incorrect");
		}
		

	}

}
