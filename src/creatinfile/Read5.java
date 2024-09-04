package creatinfile;
import java.io.File;
public class Read5 {

	public static void main(String[] args)
	{
		File x=new File("d:\\myfile.txt");
		if(x.exists()) 
		{
			System.out.println("file name is"+x.getName());
			System.out.println("file Location is"+x.getPath());
			System.out.println("File Read Permission"+x.canRead());
			System.out.println("file write permission"+x.canWrite());
			System.out.println("file size"+x.length());
			
			
		}
		else
		{
			System.out.println("error");
		}
			
	

	}

}
