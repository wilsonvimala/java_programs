
public class NumberExcept2 {

	public static void main(String[] args) 
	{
		try
		{
			int[] a=new int[6];
			int i=a[6];
			System.out.println("array is"+i);
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("erroe"+ar);
		}
	

	}

}
