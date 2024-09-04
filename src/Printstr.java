import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Printstr 
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream f=new FileOutputStream("d:\\myfile1.txt");
		PrintStream p=new PrintStream(f);
		p.print(2016);
		p.print("welcome");
		f.close();
		p.close();
		

	}

}
