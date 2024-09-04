package oops;
import java.util.Scanner;
 class addition4 {
	 int m,s,r;
	 public void add(int x,int y) {
		 m=x;
		 s=y;
		 r=m+s;
	 }
	 public void printing() {
		 System.out.println("addition value is"+r);
	 }
	

	public static void main(String[] args)
	{
		addition4 n=new addition4();
		Scanner s= new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		n.add(a,b);
		n.printing();

	}

}
