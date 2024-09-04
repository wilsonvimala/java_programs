import java.io.*;
import java.util.Scanner;
public class Sumofnum 
{

	public static void main(String[] args) throws IOException
	{
		int n=0;
		File x=new File("d:\\myfile1.txt");
		File m=new File("d:\\sum.txt");
		FileWriter p=new FileWriter("d:\\myfile2.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			n=n+t.nextInt();
			
		}
         System.out.println(n);
         p.write(Integer.valueOf(n));
         p.close();
	}

}
