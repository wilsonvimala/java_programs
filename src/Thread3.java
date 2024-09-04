import java.util.*;
public class Thread3 implements Runnable
{
	public void run()
	{
		System.out.println("thread created");
		
	}
	public static void main(String[]args)
	{
		Thread1 t=new Thread1();
		Thread ob=new Thread(t);
		t.start();
		System.out.println("thread completed");
	}
}



