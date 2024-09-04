package inheritance;

public interface Addition 
{
	default public void add(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("addition is"+z);
	}
	default public void sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("subtraction is"+z);
	}

}
