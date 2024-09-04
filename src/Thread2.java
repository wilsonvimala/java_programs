import java.util.*;
class Threadingpro extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("thread"+Thread.currentThread().getId()+"working");
		}
		catch(Exception e)
		{
			System.out.println("exception is caught");
		}
	}
}
public class Thread2
{
	public static void main (String[]args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			Threadingpro s=new Threadingpro();
			s.start();
		}
	}
	

}
