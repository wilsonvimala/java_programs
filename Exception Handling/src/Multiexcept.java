
public class Multiexcept
{

	public static void main(String[] args) 
	{
		try
		{
			int a=args.length;
			System.out.println("a="+a);
			int b=10/a;
			int c[]= {10};
			c[10]=100;
		}
		catch(ArithmeticException e)
		{
			System.out.println("error: "+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index Error"+e);
		}

	}

}
