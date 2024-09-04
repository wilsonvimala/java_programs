package creatinfile;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;


public class InputStream {

	public static void main(String[] args) throws IOException
	{
	  FileInputStream f=new FileInputStream("d:\\myfile.txt");
	  int i=f.read();
	  System.out.println((char)i);
	  f.close();

	}

}

