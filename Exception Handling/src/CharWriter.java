import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CharWriter {

	public static void main(String[] args) throws IOException
	{
		CharArrayWriter c=new CharArrayWriter();
		c.write("java programming");
		FileWriter f1=new FileWriter("d:\\myfile1.txt");
		FileWriter f2=new FileWriter("d:\\myfile2.txt")	;
		FileWriter f3=new FileWriter("d:\\myfile3.txt");
        c.writeTo(f1);
        c.writeTo(f2);
        c.writeTo(f3);
        f1.close();
        f2.close();
        f3.close();
	}

}
