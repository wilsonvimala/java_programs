import java.util.*;
public class Thread5 
{
	

	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		System.out.println("current Thread is ="+t);
		t.setName("systech");
		System.out.println("after changing Name is ="+t);
		
		

	}

}
