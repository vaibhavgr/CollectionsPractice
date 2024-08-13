package List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListIteratorLearn
{
	public static void main( String args[] )   
	{

		List <Integer> listofInt = new ArrayList<>();
		listofInt.add(100);
		listofInt.add(200);
		System.out.println(listofInt);
		
		
		
		Iterator<Integer> iterator = listofInt.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());	
		}
		
		//second-way
	for(int i = 0; i<listofInt.size() ; i++)
		{
			System.out.println(listofInt.get(i));
		}
		
	}  
}
