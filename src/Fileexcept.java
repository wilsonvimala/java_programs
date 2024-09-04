import java.io.*;
public class Fileexcept {

	public static void main(String[] args)
	{
		try
		{
			
			File file=new File("d://file123.txt");
			FileReader fr=new FileReader(file);
			System.out.println("file available");
		}
		catch(FileNotFoundException e) {
			System.out.println("file does not exist");
		}

	}

}
