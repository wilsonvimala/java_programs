package test;

import java.util.Scanner;
import java.util.*;
public class evenorodd {

	public static void main(String[] args) {
		int x ,odd,even;
		Scanner h=new Scanner(System.in);
		System.out.println("enter a value x:");
		x=h.nextInt();
	
		
		if(x%2==0)
		{
			x=x+5;
			System.out.println("even"+x);
		}
			
		else
		{
			
		
		x=x+10;
		System.out.println("even  -"
				  +x);
		}
		
		
	}
}
	