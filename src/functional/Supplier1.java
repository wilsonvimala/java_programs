package functional;
import java.util.function.Supplier;
public class Supplier1 
{

	public static void main(String[] args) 
	{
		Supplier<Double>S=()->Math.random();
		System.out.println(S.get());
		

	}

}
