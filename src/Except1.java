
public class Except1 {

	public static void main(String[] args) 
	{try
	{
		int a=10;
		int c=a/0;
		System.out.println(c);
	}
	catch (Exception e)
	{
		System.out.println("erroe"+e);
	}
	System.out.println("completed");
		

	}

}
