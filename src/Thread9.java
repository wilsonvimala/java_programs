import java.util.*;
class A1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("thread A="+i);
		}
		System.out.println("end of thread A.");
	}
}
class B1 extends Thread
{
	public void run()
	{
		for (int j=1;j<=10;j++)
		{
			System.out.println("thread B ="+j);
		}
		System.out.println("end of Thread B.");
	}
}
public class Thread9 
{
	public static void main(String[]args)
	{
		A1 a=new A1();
		B1 b=new B1();
		a.setPriority(Thread.MAX_PRIORITY - 2);
		b.setPriority(Thread.MIN_PRIORITY +2);
		a.start();
		b.start();
		System.out.println("end of main Thread.");
	}

}
