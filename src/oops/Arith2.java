package oops;
import java.util.Scanner;

 class Arith2 {
	 int m=30,s=50,r;
	 Arith2()
	 {
		 System.out.println("addition value is");
	 }
	 public void add(int x,int y) {
		 r=m+s;
		 System.out.println(r);
	 }
	 public class Addition3
	 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		Arith2 n=new Arith2();
		n.add(a, b);

	}
	 }
	 
	 
 }
