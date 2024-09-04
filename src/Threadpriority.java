import java.util.*;
public class Threadpriority extends Thread
{
	public void run()
	{
		System.out.println("priority is"+Thread.currentThread().getPriority());
	}
	

	
	public static void main(String[] args) 
	{
		Threadpriority t1=new Threadpriority();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		

	}

}
