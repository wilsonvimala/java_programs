package inheritance;
import java.util.*;
public class Arithmetic2 extends Base4
{
	Arithmetic2(int x ,int y)
	{
		super(x,y);
}

	public static void main(String[] args)
	{
      Scanner s=new Scanner(System.in);	
      System.out.print("enter the first value");
      int a=s.nextInt();
      System.out.print("enter the second value");
      int b=s.nextInt();
      Arithmetic2 n=new Arithmetic2(a,b);
      n.add();
      n.sub();
      n.mul();

	}

}
