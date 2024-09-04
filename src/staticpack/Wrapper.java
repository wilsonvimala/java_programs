package staticpack;
import java.util.Scanner;
public class Wrapper {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value ");
		int x=s.nextInt();
		Integer m=Integer.valueOf(x);
		System.out.println("Autoboxing "+m);
		

	}

}
