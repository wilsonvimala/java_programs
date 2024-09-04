package oops;
import java.util.Scanner;
class Fact1
{
	void factfn(int m)
	{
		int fac=1;
        for(int i=1;i<=m;i++)
        {
        	fac*=i;
        }
        System.out.println("factorial value is "+fac);
	}
}
public class Fact {

	public static void main(String[] args) {
		Fact1 f=new Fact1();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value:");
		int a=s.nextInt();
		f.factfn(a);
				

	}

}
