package arraylist;
import java.util.*;
public class reversetheorder {

	public static void main(String[] args) {
		 int x,t;
		 ArrayList<Integer>a=new ArrayList<>();
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the n:");
		 x=s.nextInt();
		 for(int i=0;i<x;i++)
		 {
		 t=s.nextInt();
		 a.add(t);}
		 for (int i=a.size()-1;i>=0;i--)
		 {
		 System.out.println(a.get(i));
		 }
		 
		 

	}

}
