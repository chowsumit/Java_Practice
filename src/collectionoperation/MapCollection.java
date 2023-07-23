import java.util.HashMap;
import java.util.Map;

/***
 * Not a subtype of Collection, but an important part of the Java Collections Framework. 
 * It represents a mapping between keys and values, where each key is unique. Popular implementations 
 * of Map are HashMap, TreeMap, and LinkedHashMap.
 * ***************************
 * In this example, we create a Map of names (keys) and their corresponding ages (values) using the 
 * HashMap implementation. We add elements to the map, access values using keys, check if a key exists 
 * in the map, remove an entry, get the size of the map, and check if the map is empty. The output 
 * demonstrates the operations performed on the map and its changes throughout the program's execution.
 * */

public class MapCollection {

	public static void main(String[] args) {
		
		Map<String, Integer> students = new HashMap<String, Integer>();
		
		students.put("Mike", 40);
		students.put("Dwit", 30);
		students.put("Jim", 28);
		students.put("Pam", 25);
		students.put("Kelly", 24);
		
		System.out.println(students);
		
		System.out.println(students.size());
		
		System.out.println(students.get("Pam"));
		
		System.out.println(students.containsKey("Dwit"));
		System.out.println(students.containsKey("Andy"));
		System.out.println(students.containsValue(50));
		
		System.out.println(students.remove("Dwit"));
		
		System.out.println(students);
		
		students.clear();
		
		System.out.println(students.isEmpty());
		
		

	}

}

/***
 * Please note that the order of elements in the output might vary since HashMap does not 
 * guarantee a specific order of elements. If you need an ordered map, you can use LinkedHashMap instead.
 * 
 * *********/
