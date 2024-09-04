import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Evenfiles {

	public static void main(String[] args)throws IOException
	{
		File x=new File("d:\\myfile.txt");
		File m=new File("d:\\even.txt");
		File k=new File("d:\\odd.txt");
		FileWriter p=new FileWriter("d:\\even.txt");
		FileWriter q=new FileWriter("d:\\odd.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			int r=t.nextInt();
			if(r%2==0)
			{
				System.out.println(r+"is even");
				p.write(String.valueOf(r));
				p.write("\n");
			}
			else
			{
				System.out.println(r+"is odd");
				q.write(String.valueOf(r));
				q.write("\n");
			}
		}
		p.close();
		q.close();
		

	}

}
