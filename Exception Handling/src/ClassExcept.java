
public class ClassExcept {

	public static void main(String[] args) 
	{
		try
		{
			
			Class.forName("test");
		}
		catch(ClassNotFoundExeption e)
		{
			System.out.println(e);
			System.out.println("class not found");
		}
	
		

	}

}
