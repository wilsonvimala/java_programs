
public class Except6 
{

	public static void agecalc(int age) 
	{
		if(age>30)
		{
			throw new ArithmeticException("this person not eligible");
			
		}
		else
		{
			System.out.println("eligible");
		}

	}
	public static void main(String[] args)
	{
		agecalc(25);
	}

}
