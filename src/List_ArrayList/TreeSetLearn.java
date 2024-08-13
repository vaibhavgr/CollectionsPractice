package List_ArrayList;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLearn
{
	public static void main( String args[] )   
	{
		 
		//for results in sorting ascendoing 
		Set<String> orderedNames = new TreeSet<>();
		 orderedNames.add("vaibhav");
		 orderedNames.add("grover");
		 orderedNames.add("vinod");
		 orderedNames.add("bhusal");
		 orderedNames.add("pankaj");
		 orderedNames.add("sharma");
		
		
//		 for(String names :orderedNames)
//		 {
//			 System.out.println(names);
//		 }
		 
		  Iterator<String> iterator =  orderedNames.iterator();
		  while(iterator.hasNext())
		  {
			  System.out.println(iterator.next());
		  }
		 
		 
		 
		 
		 
	}
}
