
public class Except4 {

	public static void main(String[] args) 
	{
		try
		{
			int a=args.length;
			System.out.println(a);
			int x=45;
			int z=x/a;
			System.out.println(z);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("wrong value");
		}
	

	}

}
