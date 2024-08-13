package List_ArrayList;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetLearn
{
	public static void main( String args[] )   
	{
		 
		//for order of input values - sysout in inpiut order 
		Set<String> orderedNames = new LinkedHashSet<>();
		 orderedNames.add("Vaibhav");
		 orderedNames.add("Grover");
		 orderedNames.add("vinod");
		 orderedNames.add("bhusal");
		 orderedNames.add("bhusal");
		 orderedNames.add("pankaj");
		 orderedNames.add("sharma");
		 System.out.println(orderedNames);
		
	}
}
