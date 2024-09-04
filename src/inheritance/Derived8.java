package inheritance;
import java.util.Scanner;
public class Derived8 extends Base8_1
{

	public static void main(String[] args)
	{
		Derived8 v=new Derived8();
        Scanner s=new Scanner(System.in);
        System.out.print("enter the first value");
        int d=s.nextInt();
        System.out.print("enter the second value");
        int e=s.nextInt();
        int k=v.add(d, e);
        int r=v.sub(d, e);
        System.out.println("adding 2 value:"+k);
        System.out.println("subtracting 2 value"+r);
	}

}
