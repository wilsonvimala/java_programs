package collections;
import java.util.Iterator;

import java.util.LinkedList;
public class Demolinkedlist {

	public static void main(String[] args) 
	{
		LinkedList<String>data= new LinkedList<String>();
		data.add("java");
		data.add("program");
		data.add("oops");
		data.add("classes");
		Iterator<String>itr=data.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
