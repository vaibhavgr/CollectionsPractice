package List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListLearn
{
	public static void main( String args[] )   
	{	 
		
//This is not recommending. so we used generic method to initialise arraylist
		
		
		ArrayList listofNames = new ArrayList();
		//List listofNames = new ArrayList();
		listofNames.add("Vaibhav");
		listofNames.add("null");
		System.out.println(listofNames);
	 
		//Generic Method to create 
		List <String> listofNamess = new ArrayList<>();
		listofNamess.add("Vaibhav");
		listofNamess.add(null);
		System.out.println(listofNames);
		
		List <Integer> listofInt = new ArrayList<>();
		listofInt.add(100);
		listofInt.add(null);
		System.out.println(listofInt);
		
//// 		List with pre-defined values
//		List<String> listofEmployees =new ArrayList<>(List.of("vaibhva"));
//		System.out.println(listofEmployees);
//		
		//convert array into arraylist
		Integer[] array = {5,6,7,8};
		List<Integer> ListofInterger = Arrays.asList(array);
		System.out.println(ListofInterger);


		
		
		
	}  
}
