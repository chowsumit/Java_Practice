package stringoperation;

import java.util.Scanner;

public class Stringreverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method 

		String original;
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner (System.in);
		original = sc.nextLine();
		
		String rev = "";
		
		int len=original.length();
		
		for (int i=(len - 1);i>=0;i--){
			rev=rev+original.charAt(i);		
		}
		System.out.println("The original string is : "+original);
		System.out.println("The reverse string is : "+rev);
			
		
		
	}

}
