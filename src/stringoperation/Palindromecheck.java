package stringoperation;

import java.util.Scanner;

public class Palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		
		String str1 = sc.nextLine();
		
		String rev = "";
		
		int len = str1.length();
		
		for (int i=len-1; i>=0; i-- ) {
			
			char c = str1.charAt(i);
			rev = rev+c;
		}

		//System.out.println(rev);
		
		if (str1.equalsIgnoreCase(rev)) {
			
			System.out.println("The word is Palindrome.");
		} else {
			
			System.out.println("The word is not Palindrome.");
			
		}
		
	}

}
