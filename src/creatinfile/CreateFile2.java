package creatinfile;
import java.io.*;
public class CreateFile2 
{

	public static void main(String[] args)throws IOException
	
	{
		File x=new File("d:\\data1234.txt");
		if(x.createNewFile())
		{
			System.out.println("file create");
		}
		else
		{
			System.out.println("file not created ");
		}

	}

}
