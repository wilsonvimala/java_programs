package methods;
import java.util.*;
public class arthimeticoperations
{
	static int add(int x,int y)
	{
		int z;
		z=x+y;
		return z;
		
		  }
	static int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	static int mul(int x,int y)
	{
		int z;
		z=x*y;
		return z;
	}
	static int divide(int x,int y)
	{
		int z;
		z=x/y;
		return z;
	}
    
	public static void main(String[] args) 
	{
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int e=s.nextInt();
		System.out.print("enter the second value");
        int f=s.nextInt();
        a=add(e,f);
        b=sub(e,f);
        c=mul(a,b);
        d=divide(a,b);
        System.out.println("addition value"+a);
        System.out.println("subtraction value"+b);
        System.out.println("multiplication value "+c);
        System.out.println("division value "+d);
        
        

	}

}
