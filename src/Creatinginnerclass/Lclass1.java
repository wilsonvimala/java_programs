package Creatinginnerclass;

public class Lclass1 {
	private int data=30;
	private void display()
	{
		class Local
		{
			void msg()
			{
				System.out.println(data);
			}
		}
		Local l=new Local();
		l.msg();
	
	}
	public static void main(String[]args)
	{
		Lclass1 l=new Lclass1();
		l.display();
	}

}
