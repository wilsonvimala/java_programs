package collections;
import java.util.LinkedList;
import java.util.Scanner;


public class pritingvalue {

	public static void main(String[] args) 
	{
		LinkedList<Integer>data=new LinkedList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n:");
        int d=s.nextInt();
        int i=1;
        while(i<=d)
        {
        	System.out.print("enter the value");
        	int m=s.nextInt();
        	data.add(m);
        	i++;
        }
        System.out.println("Linked list");
        for(int j=0;j<data.size();j++)
        {
        	System.out.print(data.get(j)+" ");
        }

	}

}
