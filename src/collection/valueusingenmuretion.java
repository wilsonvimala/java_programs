package collection;
import java.util.*;
public class valueusingenmuretion {

	public static void main(String[] args) {
		Vector<String>x=new Vector<String>();
		Enumeration data;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			String m=s.next();
			x.add(m);
			i++;
			
		}
         data=x.elements();
         System.out.print("value is");
         while(data.hasMoreElements())
         {
        	 System.out.print(data.nextElement()+" ");
         }
	}

}
