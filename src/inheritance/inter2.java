package inheritance;

public interface inter2  extends inter1{
	default public void mul(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println("multiplication is"+z);
	}
	

}
