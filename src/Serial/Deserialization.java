package Serial;
import java.io.*;
public class Deserialization
{

	public static void main(String[] args)throws IOException,ClassNotFoundException
	
	{
		Emp emp=null;
		try
		{
			FileInputStream fileIn=new FileInputStream("char.txt");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			emp=(Emp)in.readObject();
		    in.close();
		    fileIn.close();
		}
        finally
        {
        	System.out.println("deserializing employee");
        	System.out.println("first name of employee:"+emp.name);
        	System.out.println("last name of employee:"+emp.Address);
        	System.out.println("Salary of employee:"+emp.Salary);
        }
	}

}
