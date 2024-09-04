package inheritance;
import java.util.Scanner;
public class Child4 extends Base12{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int d=s.nextInt();
		System.out.print("enter the second value");
		int e=s.nextInt();
		Child4 t=new Child4();
		t.sub(d,e);
				

	}

}
