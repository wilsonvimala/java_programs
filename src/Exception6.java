class Testing extends Exception
{
	public Testing (String s)
	{
		System.out.println(s);
	}
}
public class Exception6 {

	public static void main(String[] args)
	{
		try
		{
			throw new Testing("value Sent");
		}
		catch(Exception t)
		{
			System.out.println("error");
			System.out.println(t.getMessage());
		}
		

	}

}
