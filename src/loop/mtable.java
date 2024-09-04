package loop;
import java.util.*;
public class mtable
{

	public static void main(String[] args)
	{
		int number;
		Scanner k=new Scanner(System.in);
		System.out.print("enter a given ");
        number=k.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i)); 
        }   
        k.close();
            	
            
            
	}

}
