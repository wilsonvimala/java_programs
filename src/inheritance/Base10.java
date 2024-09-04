package inheritance;

public class Base10
{
	int m=30,s=50,r;
	Base10(int x,int y)
	{
		m=x;
		s=y;
		
	}
	public void add()
	{
		r=m+s;
		System.out.println("addition value is"+r);
		
	}
	public void sub()
	{
		r=m-s;
		System.out.println("subtraction value is"+r);
	}

}
