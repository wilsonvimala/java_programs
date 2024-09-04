import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInput {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("d:\\myfile1.txt");
		BufferedInputStream b = new BufferedInputStream(f);
		int i;
		while ((i = b.read()) != -1) {
			System.out.print((char) i);

		}
		b.close();
		f.close();

	}

}
