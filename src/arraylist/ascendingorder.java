package arraylist;
import java.util.*;
public class ascendingorder {

	public static void main(String[] args) {
		int x,t;
		ArrayList<Integer>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			t=s.nextInt();
			data.add(t);
		}
		System.out.println("ArrayList:"+data);
		data.sort(Comparator.naturalOrder());
		System.out.println("ArrayList sorting:"+data);
		
				

	}

}
