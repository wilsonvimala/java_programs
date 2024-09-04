package Creatinginnerclass;
abstract class Person
{
	abstract void eat();
}
public class Anclass1
{
	public static void main(String[]args)
	{
	Person p=new Person() 
	{
		@Override
		void eat()
		{
			System.out.print("hello");
		}
			
			
	};
	    p.eat();

}
}
