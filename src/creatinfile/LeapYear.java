package creatinfile;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class LeapYear
{

	public static void main(String[] args)throws FileNotFoundException
	{
		int n=0;
		File x=new File("d:\\myfile.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			int r=t.nextInt();
			System.out.print(r);
			if(r%4==0)
			{
				System.out.println(r+"is leap year");
			}
			else
			{
				System.out.println(r+"is not leap yaer");
			}
		}
		

	}

}
