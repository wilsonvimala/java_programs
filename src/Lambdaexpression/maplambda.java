package Lambdaexpression;
import java.util.*;
public class maplambda 
{

	public static void main(String[] args)
	{
		Map<String,String>data=new HashMap<String,String>();
		data.put("company", "systech");
		data.put("language", "java");
		data.put("topic","lambda Expression ");
		data.forEach((Key,value)->System.out.println(Key+" : "+value));
		


	}

}
