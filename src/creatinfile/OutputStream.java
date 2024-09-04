package creatinfile;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream f=new FileOutputStream("d:\\myfile.txt");
		f.write(67);
		f.close();
		

	}

}
