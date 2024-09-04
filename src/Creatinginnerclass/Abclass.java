package Creatinginnerclass;

public class Abclass extends Dataclass
{

	public static void main(String[] args)
	{
		Abclass s=new Abclass();
		s.display();
		s.printing();
		s.entry();
		
	}
	@Override
	void display()
	{
		System.out.println("Display function");
	}
	@Override
	void printing()
	{
		System.out.println("printing function");
	}

	

}
