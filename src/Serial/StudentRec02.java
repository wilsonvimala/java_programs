package Serial;
import java.io.*;
import java.io.Serializable;
class Child implements Serializable
{
	
	String stud_Name;
	Child(String stud_Name)
	{
		this.stud_Name=stud_Name;
	}
}

public class StudentRec02 extends Child
{
	String stud_Addr;
	int stud_Id;
	public StudentRec02(String stud_Name,String stud_Addr,int stu)
	{
		super(stud_Name);
		this.stud_Addr=stud_Addr;
		this.stud_Id=stud_Id;
		
	}
	

	public static void main(String[] args) 
	{
	   StudentRec02 s=new StudentRec02("Sam Nikluas","ABC ,XYZ",11);
	   try
	   {
		   FileOutputStream fileOut=new FileOutputStream("s.txt");
		   ObjectOutputStream out=new ObjectOutputStream(fileOut);
		   out.writeObject(s);
		   out.close();
		   fileOut.close();
		   System.out.println("object Serialized and saved in s.text");
	   }
	   catch(IOException i)
	   {
		   i.printStackTrace();
	   }

	}

}
