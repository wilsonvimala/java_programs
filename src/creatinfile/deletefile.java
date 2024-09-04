package creatinfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class deletefile {

	public static void main(String[] args)throws FileNotFoundException
	{
		File x=new File("d:\\myfile.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		x.delete();
		System.out.println(t.next());
		

	}

}
