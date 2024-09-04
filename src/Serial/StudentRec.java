package Serial;
import java.io.*;
public class StudentRec  implements Serializable
{
	public String Stud_name;
	public String Stud_Addr;
	public int Stud_Id;
	
	

	public static void main(String[] args)
	{
		StudentRec s=new StudentRec();
		s.Stud_name=" Sam Niklaus";
		s.Stud_Addr=" Abc,xyz";
		s.Stud_Id=1;
		try
		{
			FileOutputStream fileout=new FileOutputStream("s.txt");
			ObjectOutputStream out =new ObjectOutputStream(fileout);
			out.writeObject(s);
			out.close();
			fileout.close();
			System.out.printf("object Serialized and saved in s.txt");
		}
		catch(IOException i)
		
		{
			i.printStackTrace();
		}
	

	}

}
