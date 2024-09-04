package Creatinginnerclass;

public class Nclass1 
{
	static int data=30;
	static class Inner
	{
		void msg()
		{
			System.out.println("data is"+data);
		}
	}

	public static void main(String[] args)
	{
		Nclass1.Inner n=new Nclass1.Inner();
		n.msg();

	}

}
