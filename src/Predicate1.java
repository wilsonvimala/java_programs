import java.util.function.Predicate;
public class Predicate1 {

	public static void main(String[] args) 
	{
		Predicate<String>data=a->a.length()>6;
		System.out.println(data.test("V"));
       }

}
