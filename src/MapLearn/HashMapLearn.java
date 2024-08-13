package MapLearn;

import java.util.Map;
import java.util.TreeMap;


public class HashMapLearn
{
	public static void main( String args[] )   
	{
		 Map <String,Integer> mp = new TreeMap<String,Integer>();
		 mp.put("Vaibhav", 14000);
		 mp.put("bhusal", 18000);
		 mp.put("Vinod", 14000);
		 mp.put("Vaibhav", 16000);
		 mp.put("Shelodon", 14000);
		 mp.put("hellow", 2000);
//		 System.out.println(mp.get("Vaibhav"));
//		 System.out.println(mp.containsKey("Vaibhav"));
		 
//		 System.out.println(mp.containsKey("Shelodon"));
//		 System.out.println(mp.containsValue(14000));
		 
		 //Iterate full 
		 for(Map.Entry<String, Integer> firstMethod :mp.entrySet())
		 {
			 System.out.println(firstMethod.getKey());
			 System.out.println(firstMethod.getValue());	
		 }
		 //second way to iterate
		 for(String secondmethod: mp.keySet())
		 {
			 System.out.println("key is " +secondmethod );
			 System.out.println("value is " +mp.get(secondmethod) );
		 } 
		 
	
}}
