import java.util.*;

public class Userdefinepriority extends Thread
{
	

	public void run()
	{
		System.out.println("running");
	}

	public static void main(String[] args) 
	{
		Userdefinepriority t1=new Userdefinepriority ();
		Userdefinepriority t2=new  Userdefinepriority();
		t1.setPriority(4);
		t2.setPriority(7);
		System.out.println("priority of Thread t1 is "+t1.getPriority());
		System.out.println(" priority of Thread t2 is"+t2.getPriority());
	}



}
