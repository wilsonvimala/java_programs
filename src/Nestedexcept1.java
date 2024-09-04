
public class Nestedexcept1 {

	public static void main(String[] args)
	{
		try
		{
			int a=args.length;
			int b=10/a;
			System.out.println(" a="+a);
			try
			{
				if(a==1)
					a=a*a;
				System.out.println("a=" +a);
				if(a==2)
				{
					int c[]= {1000};
					c[10]=100;
				}
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index:"+ e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("error"+e);
		}
		
		
		

	}

}
