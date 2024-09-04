
public class Nestedexcept2
{
	static void test(int a)
	{
		try
		{
			if(a==1)
				a=a*a;
			System.out.println(" square "+a);
			if(a==2)
			{
				int c[]= {10000};
				c[0]=100;
			}
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println(" Array index: " +e);
		}
	}
	public static void main(String[] args)
	{
		try
		{
			int a=args.length;
			int b=10/a;
			System.out.println("a="+a);
			test(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0:"+ e);
		}
		
	}

	
		

	

}
