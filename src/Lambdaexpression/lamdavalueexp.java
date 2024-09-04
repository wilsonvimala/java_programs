package Lambdaexpression;
import java.util.Scanner;
interface Expressionvalue
{
	int setValue(int f,int g,int h,int j);
}
public class lamdavalueexp {

	public static void main(String[] args) 
	{
		Expressionvalue ad2=(int f,int g,int h,int j)->{
			return(f+g-h*j);
		};
		System.out.println("result of the expression:"+ad2.setValue(1, 2, 3, 4));
		

	}

}
