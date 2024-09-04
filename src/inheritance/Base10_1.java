package inheritance;

public class Base10_1 extends Base10
{
	int m=5;
	int s=8;
	Base10_1(int x,int y)
	{
		super(x,y);
	}
	public void rect() {
		r=super.m*super.s;
		System.out.println(" rectangle value is"+r);
	}
	public void square()
	{
		r=super.m*super.m;
		System.out.println("square value is:"+r);
	}
}
