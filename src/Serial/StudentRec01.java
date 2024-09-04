package Serial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class StudentRec01 implements Serializable 
{
	public String Stud_Name;
	public String Stud_Addr;
	public int Stud_Id;

	public static void main(String[] args)
	{
		StudentRec01 s=new StudentRec01();
		s.Stud_Name="sam";
		s.Stud_Addr=" ABC,XYZ";
		s.Stud_Id=1;
		try
		{
			FileOutputStream fileout=new FileOutputStream("s.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileout);
			out.writeObject(s);
			out.close();
			fileout.close();
			System.out.printf("Object Serialized and saved in s.txt");
			FileInputStream fileIn= new FileInputStream("s.txt");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			s=(StudentRec01)in.readObject();
			in.close();
			fileIn.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("student class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("\nDeserislized Student");
		System.out.println("name"+s.Stud_Name);
		System.out.println(" Address:"+s.Stud_Addr);
		System.out.println("number: "+s.Stud_Id);
		
		

	}

}
