package oops;

import java.util.*;
import java.util.Scanner;

class Arearect {

	int m, s, r;

	public void area(int x, int y) {
		m = x;
		s = y;
		r = m * s;
		System.out.println("area of rectangle" + r);
	}
}

public class Rectangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the l value");
		int a = s.nextInt();
		System.out.print("enter the b value");
		int b = s.nextInt();
		new Arearect().area(a, b);
	}
}
