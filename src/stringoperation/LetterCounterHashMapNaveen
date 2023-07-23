import java.util.HashMap;
import java.util.Map;

/****
 * This program will take input string
 * Then it will count each letter of the string 
 * And provide the output with counter
 * ****/

public class LetterCounterHashMapNaveen {
	
	public static void getCharCount(String name) {   //creating a method to count letters
		
		char charArr[] = name.toCharArray(); //Converting the input string to array of characters
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();//creating a map that will contain character and count
		
		for(char c: charArr) { //traversing through the map
			
			if(charMap.containsKey(c)) {        //checking whether the map contains the character as key 
				charMap.put(c, charMap.get(c)+1); //if the character(as key) present it will increase the value by 1
			}else {
				charMap.put(c, 1);  //if the map does not contain the char(key), it will insert the char as key and assign the value as count 1
			}
			
		}
		
		System.out.println(name +" : "+charMap); //Finally it will display the map with char(key) and their values(count)
	}
	
	public static void main(String args[]) { //creating the main method from which the program will run
	
	     getCharCount("jsdfjkhfdkhklbcjhsb"); //calling the method with the input string as argument
	
	}
	
}
