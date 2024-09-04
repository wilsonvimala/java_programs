package oops;
class PConst1
{
	int m=30,s=50,r;
	PConst1()
	{
		m=100;
		s=200;
		System.out.println("values are"+m+" "+s);
		
	}
	PConst1(int x,int y)
	{
		m=x;
		s=y;
		System.out.println("values are"+m+" "+s);
		
	}
	PConst1(int x,int y,int z)
	{
		m=x;
		s=y;
		r=z;
		System.out.println("values are"+m+" "+s+" "+r);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args)
	{
		PConst1 n1=new PConst1();
		PConst1 n2=new PConst1(1000,2000);
		PConst1 n3=new PConst1(20,400,5000);
		
		

	}

}
