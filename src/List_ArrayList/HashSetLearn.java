package List_ArrayList;

import java.util.HashSet;
import java.util.Set;


public class HashSetLearn
{
	public static void main( String args[] )   
	{
		  // doesnt maintain duplicate values 
		 Set<String> names = new HashSet<String>();
		 names.add("Vaibhav");
		 names.add("Grover");
		 names.add("Vaibhav");
		 System.out.println(names);
		 
		 //no order in hashet.. to avoid this we use linkedhashset
		 Set<String> namesmore = new HashSet<String>();
		 namesmore.add("Vaibhav");
		 namesmore.add("Grover");
		 namesmore.add("vinod");
		 namesmore.add("Vaibhav");
		 namesmore.add("pankaj");
		 namesmore.add("sharma");
		 System.out.println(namesmore);
		
	}
}
