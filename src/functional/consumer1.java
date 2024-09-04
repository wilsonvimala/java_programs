package functional;
import java.util.Scanner;
import java.util.function.Consumer;
public class consumer1 
{

	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the age");
	   int x=s.nextInt();
       Base1 b=new Base1();
       Consumer<Base1>n=t->t.setAge(x);
       n.accept(b);
       System.out.println(b.getAge());
			   
			   

	}

}
