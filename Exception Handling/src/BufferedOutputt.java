

	

import java.io.BufferedOutputStream;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.IOException;
public class BufferedOutputt {

	public static void main(String[] args) throws IOException
	{
	   FileOutputStream f=new FileOutputStream("d:\\myfile1.txt");
	   BufferedOutputStream b=new BufferedOutputStream(f);
	   String s="java programming";
	   byte c[]=s.getBytes();
	   b.write(c);
	  
	   b.close();
	   f.close();
	}
}
