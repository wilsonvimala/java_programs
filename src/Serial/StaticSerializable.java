package Serial;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
public class StaticSerializable  implements Serializable
      {
	static int x=50;
	public static void main(String[]args)
	{
		StaticSerializable o=new StaticSerializable();
	     System.out.println(" Serialization Successful,Static member value:"+x);
	try
	{
		FileOutputStream f=new FileOutputStream("s.txt");
		ObjectOutputStream ob=new ObjectOutputStream(f);
		ob.writeObject(o);
		ob.close();
		x=48;
		FileInputStream fi=new FileInputStream("s.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
   		o=(StaticSerializable)oi.readObject();
   		oi.close();
   		System.out.println("after deserialization,static member has value:"+x);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	}
}