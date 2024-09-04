import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mergefile {

	public static void main(String[] args) throws IOException {
		File x = new File("d:\\myfile.txt");
		File m = new File("d:\\text1.txt");
		File k = new File("d:\\merge.txt");
		FileWriter p = new FileWriter("d:\\merge.txt");
		Scanner t = new Scanner(x);
		while (t.hasNext()) {
			p.write(String.valueOf(t.nextInt()));
			p.write("\n");
		}
		Scanner t1 = new Scanner(m);
		while (t1.hasNext())
			
		{
			p.write(t1.next());
			p.write("\n");
		}
		System.out.println("process completed");
		p.close();

	}

}
