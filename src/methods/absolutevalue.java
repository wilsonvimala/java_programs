package methods;
import java.util.*;
public class absolutevalue 
{
  static int abs(int x) 
  {
	  if(x>0) 
	  {
		  return x;
	  }
	  else
	  {
		  return -(x);
	  }
	  
  }
  
	
	
	public static void main(String[] args) 
	{
		int n,t;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the numbers");
		n=s.nextInt();
		t=abs(n);
		System.out.println("absolute if "+n+" is "+t);
	}

}
