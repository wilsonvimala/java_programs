
public class NullException1 {

	public static void main(String[] args) 
	{
		try {
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("null value error");
		}
		finally
		{
			String b="systech";
			System.out.println(b.length());
		}
	
	

	}

}
