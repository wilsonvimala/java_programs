package Lambdaexpression;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
class filtereven
{
	int x;
	public filtereven(int x)
	{
		super();
		this.x=x;
	}
}
public class filterevennum 
{

	public static void main(String[] args) 
	{
		int n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the n value");
	    n=sc.nextInt();
	    List<filtereven>list=new ArrayList<filtereven>();
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("enter the number");
	    	int x=sc.nextInt();
	    	list.add(new filtereven(x));
	    }
Stream<filtereven>filtered_evennum=list.stream().filter(p->p.x%2==0);
filtered_evennum.forEach(filtereven->System.out.println(filtereven.x));
	    
	    
			
		

	}

}
