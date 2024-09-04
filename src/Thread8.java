import java.util.*;
public class Thread8 
{
	public static  void main(String[]args)
	{System.out.println("start"); 
	   A a=new A();
	   B b=new B();
	   C c=new C();
	   a.start();
	   b.start();
	   c.start();
	   System.out.println("completed !!!");
		
	
	}
	
}