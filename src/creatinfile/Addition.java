package creatinfile;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args)throws IOException
	{
		int n=0;
		File x=new File("d:\\myfile.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			n=n+t.nextInt();
		}
		System.out.println(n);
		

	}

}
