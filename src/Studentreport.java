import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Studentreport {

	public static void main(String[] args)throws IOException
	{
		File x=new File("d:\\Studentdata.txt");
	    FileWriter p=new FileWriter("d:\\Studentdata.txt");
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter n number");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	System.out.println("enter student name");
	    	String name=s.next();
	    	System.out.println("enter the Subject1");
	    	int m1=s.nextInt();
	    	System.out.println("enter the Subject2");
	    	int m2=s.nextInt();
	    	System.out.println("enter the Subject3");
	    	int m3=s.nextInt();
	    	int total=m1+m2+m3;
	    	System.out.println("hi,"+name+"your mark is"+total);
	    	p.write(String.valueOf(name));
	    	p.write("\t");
	    	p.write(String.valueOf(total));
	    	p.write("\n");
	    	
	    }
	    p.close();

	}

}
