package Creatinginnerclass;

public class Innerclass extends Base1{

	public static void main(String[] args) 
	{
		Base1 s=new Base1();
		Base1.Myclass m=s.new Myclass();
		m.display();

	}

}
