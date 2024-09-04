package loop02;
import java.util.*;
public class breakk 
{

	public static void main(String[] args) 
	{
	 int start,end,k;
	 Scanner s=new Scanner(System.in);
	 System.out.print("enter starting value ");
	 start=s.nextInt();
	 System.out.print("enter the ending value");
	 end=s.nextInt();
	 System.out.print("searching a number");
	 k=s.nextInt();
	 int i=start;
	 do 
	 {
		 if(i==k)
		 {
			 break;
		 }
		 System.out.println(i);
		 i=i+1;
	 } while(i<=end);
	 

	}

}
