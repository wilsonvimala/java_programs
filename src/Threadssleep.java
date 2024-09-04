import java.util.*;
public class Threadssleep extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Threadssleep.sleep(500);
			
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);		}
	}
public static void main(String[]args)
{
	Threadssleep t1=new Threadssleep();
	Threadssleep t2=new Threadssleep();
	t1.start();
	t2.start();
}
	
}
