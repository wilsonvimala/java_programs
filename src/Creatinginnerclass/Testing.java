package Creatinginnerclass;
 abstract class Mathsfn
 {
	 abstract void display();
 }

public class Testing

{
	public static void main(String[] args)
	{
		Mathsfn s=new Mathsfn()
				{
                   void display()			
			
                   {
                	   System.out.println("hello welcome");
                   }
				};
				s.display();

	}

}
