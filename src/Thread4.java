import java.util.*;
class Threadpro1 implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("thread"+Thread.currentThread().getId()+"is working");
		}
		catch(Exception e)
		{
			System.out.println("exception is caught");
		}
	}
}
public class Thread4 
{
	public static void main(String[]args)
	{
		int n=8;
		for(int i=0;i<n;i++)
		{
			Thread object=new Thread(new Threadpro1());
			object.start();
		}
	}
}


