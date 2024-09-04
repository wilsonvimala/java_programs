package Lambdaexpression;
interface sqaurvalue
{
	int square(int a);
}
public class SqaureValueExample {

	public static void main(String[] args)
	{
		sqaurvalue ad2=(int a)->{
			return (a*2);
		};
		System.out.println(ad2.square(5));
		System.out.println(ad2.square(6));
		

	}

}
