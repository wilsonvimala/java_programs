
public class StrException 
{

	public static void main(String[] args)
	{ 
		String a="this is like chipping";
		try 
		{
			char c=a.charAt(24);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException");
			char s=a.charAt(10);
			System.out.println(s);
		}

	}

}
