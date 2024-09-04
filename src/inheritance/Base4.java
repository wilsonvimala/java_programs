package inheritance;
class Base4
{
	int m=30,s=50,r;
	Base4(int x,int y)
	{
		m=x;
		s=y;
	}
	public void add()
	{
		r=m+s;
		System.out.println("suttraction value is"+r);
	}
	public void sub()
	{
		r=m-s;
		System.out.println("subtraction value is"+r);
	}
	public void mul()
	{
		r=m*s;
		System.out.println("multiply value is"+r);
	}
}



