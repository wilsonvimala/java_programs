import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Evensum 
{

	public static void main(String[] args) throws IOException 
	{
		int esum=0,oddsum=0;
		File x=new File("d:\\myfile.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			int r=t.nextInt();
			if(r%2==0)
			{
				System.out.println(r+"is even");
				esum=esum+r;
			}
			else
			{
				System.out.println(r+"is odd");
				oddsum=oddsum+r;
			}
		}
		File m=new File("d:\\myfile1.txt");
		File K=new File("d:\\myfile2.txt");
		

	}

}
