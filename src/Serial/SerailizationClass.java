package Serial;
import java.io.*;

public class SerailizationClass 
{

	public static void main(String[] args)
	{
		Emp emp=new Emp();
		emp.name="Admin";
		emp.Salary=2000;
		emp.Address=" trichy";
	 
	try
	{
		FileOutputStream fileout=new FileOutputStream("Char.txt");
		ObjectOutputStream out=new ObjectOutputStream(fileout);
		out.writeObject(emp);
		out.close();
		fileout.close();
		System.out.printf("serialized data is saved in char.txt file");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

}
}
