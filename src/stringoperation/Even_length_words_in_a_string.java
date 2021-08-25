package stringoperation;

import java.util.Scanner;



public class Even_length_words_in_a_string {

	/**
	 *Java program to print Even length words in a String
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		
		String str = sc.nextLine();
		
		//System.out.println(str);
		
		String arr[]=str.split(" ");
		int len=arr.length;
		
		for (int i=0; i<len; i++){
		    int l1 = arr[i].length();
		    if (l1%2==0){
		    	System.out.println(arr[i]);    
		    }
		}
		
	}
}

	


