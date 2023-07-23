import java.util.HashSet;
import java.util.Set;

/*************
 * Set collection that does not allow duplicate elements. It ensures that all elements are unique. 
 * Popular implementations of Set are HashSet, TreeSet, and LinkedHashSet.
 * ******************************************
 * In this example, we create a Set of strings using the HashSet implementation. We add elements to the set, 
 * check if an element exists in the set, remove an element, get the size of the set, clear the set, and 
 * check if the set is empty. The output demonstrates the operations performed on the set and its changes 
 * throughout the program's execution.
 *   * 
 * ************/

public class SetCollection {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> fruits = new HashSet<String>();
		
		//Adding values to the fruits map
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("grapes");
		
		//Displaying the set
		System.out.println(fruits);
		System.out.println(fruits);
		System.out.println(fruits);
		System.out.println(fruits);
		
		//size of the set
		int setSize = fruits.size();
		System.out.println("Size of the set is : "+setSize );
		
		//Checking for a specific fruit
		String expectedFruit ="grapes";
		boolean contains = fruits.contains(expectedFruit);
		System.out.println(contains);
		
		fruits.remove("apple");
		System.out.println(fruits.contains("apple"));
		
		System.out.println(fruits.size());
		
		fruits.clear();
		
		System.out.println(fruits.size());
		System.out.println(fruits.isEmpty());  

	}

}

/***
 * Note that sets do not allow duplicate elements, so adding "Apple" multiple times only results 
 * in a single occurrence of "Apple" 
 * in the set.
 * 
 * ****/
