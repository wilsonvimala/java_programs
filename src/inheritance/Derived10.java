package inheritance;

public class Derived10 extends Base10_1
{
	Derived10(int x,int y)
	{
		super(x,y);
	}

	public static void main(String[] args) 
	{
		Derived10 d=new Derived10(30,60);
		d.add();
		d.sub();
		d.square();
		d.rect();

	}

}
