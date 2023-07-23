import java.util.ArrayList;
import java.util.List;

/******
 * In this example, we create a List of integers using the ArrayList implementation. We add elements 
 * to the list, retrieve elements by index, check if an element exists in the list, remove an element, 
 * get the size of the list, clear the list, and check if the list is empty. The output demonstrates the 
 * operations performed on the list and its changes throughout the program's execution.
 * 
 * ******/

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(50);
		numbers.add(30);
		numbers.add(40);
		numbers.add(80);
		
		//printing the list
		System.out.println(numbers);
		
		//Accessing the element by index
		int fisrtElement = numbers.get(0);
		System.out.println("First element of the list : "+fisrtElement);
		
		//Checking if element is exist
		boolean isExist = numbers.contains(30);
		System.out.println("Is 30 present in the list : "+isExist);
		
		//Checking the size
		int sizeList = numbers.size();
		System.out.println("The size of the List is : "+sizeList);
		
		//Removing an element
		numbers.remove(2);
		
		
		
		//Size of list after removing element
		System.out.println( numbers.size());
		
		//Clearing the list
		numbers.clear();
		//Checking if empty
		System.out.println(numbers.isEmpty());
		

	}

}
