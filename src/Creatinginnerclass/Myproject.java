package Creatinginnerclass;
class Data
{
	int x=20;
	void display()
	{
		System.out.println("the value is"+x);
	}
	class Data2
	{
		void display2()
		{
			System.out.println("welcome");
		}
		
	}
}
public class Myproject {

	public static void main(String[] args) 
	{
		Data s=new Data();
		s.display();
		Data.Data2 n=s.new Data2();
		n.display2();
		

	}

}
