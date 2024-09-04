package exercise;

import java.util.Scanner;


public class ExamResult {

	public static void main(String[] args) 
	{


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner scn=new Scanner(System.in);
		
		int rno=0;
		String sname=null;
		double m1=0, m2=0, total=0, avg=0;
		boolean result=false;
		
		try {
			System.out.print("Enter Roll no.:\t");
			rno=scn.nextInt();
		} catch (Exception e) {
			System.out.println("err.: " + e.getMessage());
			rno=0;
		}
		
		try {
			System.out.print("Enter Student name:\t");
			sname=scn.next();
		} catch (Exception e) {
			System.out.println("err.: " + e.getMessage());
			sname=null;
		}

		try {
			System.out.print("Enter Mark-1:\t");
			m1=scn.nextDouble();
		} catch (Exception e) {
			System.out.println("err.: " + e.getMessage());
			m1=0;
		}
		
		try {
			System.out.print("Enter Mark-2:\t");
			m2=scn.nextDouble();
		} catch (Exception e) {
			System.out.println("err.: " + e.getMessage());
			m2=0;
		}
		
		total=m1 + m2;
		avg=total / 2;
		result=m1 > 34.4 && m2 > 34.4;

		System.out.println("Roll no.:\t" + rno);
		
		System.out.println("Name:\t" + sname);
		System.out.println("Mark-1:\t" + m1);
		System.out.println("Mark-2:\t" + m2);

	
		System.out.println("Total:\t" + total);
		System.out.println("Average:\t" + avg);
		System.out.println("Result:\t" + (result ? "Pass" : "Fail"));
	}
}

/*
output-1:
Enter Roll no.:	1001
Enter Student name:	raj
Enter Mark-1:	54.5
Enter Mark-2:	63

Roll no.:	1001
Name:	raj
Mark-1:	54.5
Mark-2:	63.0
Total:	117.5
Average:	58.75
Result:	Pass

output-2:
Enter Roll no.:	2002
Enter Student name:	xx
Enter Mark-1:	98
Enter Mark-2:	20

Roll no.:	2002
Name:	xx
Mark-1:	98.0
Mark-2:	20.0

Total:	118.0
Average:	59.0
Result:	Fail
*/
