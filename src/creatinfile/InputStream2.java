package creatinfile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
public class InputStream2 {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream f=new FileInputStream("d:\\myfile.txt");
		int i=0;
		while((i=f.read())!=-1)
		{
			System.out.println((char)i);
		}
		f.close();

	}

}
