vpackage collection;
import java.util.*;
public class printingvalueusingforeachloop {

	public static void main(String[] args) {
		Vector<Integer> x=new Vector<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			System.out.print("enter the value");
			Integer m=s.nextInt();
			x.add(m);
			i++;
		}
		System.out.print("vector value");
		for(int p:x)
		{
			System.out.print(p+" ");
		}
				

	}

}
