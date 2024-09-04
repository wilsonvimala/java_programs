import java.util.*;
public class Thread1 extends Thread
 {
	 public void Sum()
	 {
		 System.out.println("tread craeted ");
	 }
 


public static void main(String[] args)
{
	{
		Thread1 thread =new Thread1();
		
	     thread.start();
		System.out.println("thread completed");
		

	}
}
 }

