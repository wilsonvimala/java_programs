package inheritance;

public interface inter1 {
	default public void add(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("addition is"+z);
	}
}
