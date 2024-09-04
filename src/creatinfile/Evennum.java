package creatinfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Evennum {

	public static void main(String[] args) throws FileNotFoundException
	{
		int n=0;
		File x=new File("d:\\myfile.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			int r=t.nextInt();
			if(r%2==0)
			{
				System.out.println(r+"is even");
			}
			else
			{
				System.out.println(r+" is odd");
			}
		}
		
		

	}

}
