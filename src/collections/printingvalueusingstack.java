package collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class printingvalueusingstack {

	public static void main(String[] args) {
		Stack value =new Stack();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n:");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("enter the value:");
			int a=s.nextInt();
			value.push(a);
		}
		String b="Systech";
		value.add(b);
		  System.out.println(value);
				

	}

}
