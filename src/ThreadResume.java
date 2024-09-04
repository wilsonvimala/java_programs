import java.util.*;
public class ThreadResume extends Thread 
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			try
			{
				sleep(500);
				System.out.println(Thread.currentThread().getName());
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
			
		}
	}
	public static void main(String args[])
	{
		ThreadResume t1=new ThreadResume ();
		ThreadResume t2=new ThreadResume ();
		ThreadResume t3=new ThreadResume ();
		t1.start();
		t2.start();
		t2.suspend();
		t3.start();
		t2.suspend();
	}
	

}
