package arraylist;
import java.util.*;
public class countingword {

	public static void main(String[] args) {
		int x,g=0;
		String t;
		ArrayList<String>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n");
		x=s.nextInt();
		for(int i=0;i<x;i++) {
			System.out.print("enter the word");
			t=s.next();
			data.add(t);
			
		}
		System.out.println("list is"+data);
		System.out.print("enter the word");
		String a=s.next();
		    for(int i=0;i<data.size();i++) {
		    	if(a.equals(data.get(i)))
		    	{
		    		g=g+1;
		    	}
		    }
		    System.out.println("count is"+g);
		

	}

}
