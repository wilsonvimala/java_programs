package inheritance;
class Base2
{
	int x=100;
	int y=300;
	int z=0;
	public void Adding()
	{
		z=x+y;
		System.out.println("Sum of two numbers:"+z);
	}
}
public class Adding extends Base2{

	public static void main(String[] args) 
	{
		Adding a=new Adding();
		a.Adding();
		

	}

}
