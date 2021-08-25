package collectionoperation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Collectionlistvectorset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>  mylist1 = new ArrayList<String>(); 
        mylist1.add("practice"); 
        mylist1.add("code"); 
        mylist1.add("quiz"); 
        mylist1.add("geeksforgeeks"); 
          
        // Let us create vector of strings 
        List<String>  mylist2 = new Vector<String>(); 
        mylist2.add("geeks"); 
        mylist2.add("geek"); 
        mylist2.add("for"); 
        mylist2.add("coder"); 
          
        // Let us create a vector  
        List mylist3 = new Vector(); 
          
        mylist3.add(1);  
        mylist3.add("practice");      
          
        // Let us create a Set of strings 
        Set<String>  mylist4 = new HashSet<String>(); 
        mylist4.add("practice"); 
        mylist4.add("code"); 
        mylist4.add("quiz"); 
        mylist4.add("geeksforgeeks"); 
        
        System.out.println("Values in ArrayList mylist1 are : "+mylist1);
        System.out.println("Values in Vector mylist2 are : "+mylist2);
        System.out.println("Values in Vector mylist3 are : "+mylist3);
        System.out.println("Values in HashSet mylist4 are : "+mylist4);

	}

}
