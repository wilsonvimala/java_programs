package creatinfile;
import java.io.*;
public class Createfile {

	public static void main(String[] args)throws IOException
	{
		File x=new File(" abc.txt");
		if(x.createNewFile())
		{
			System.out.print("file create");
		}
		else
		{
			System.out.println("file not create");
		}
					
		
		

	}

}
