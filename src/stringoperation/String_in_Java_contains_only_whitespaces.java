package stringoperation;

import java.util.Scanner;

public class String_in_Java_contains_only_whitespaces {

	/**
	 * Program to check if a String in Java contains only whitespaces
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = sc.nextLine();
		String input_check = input.trim();
		boolean b = input_check.isEmpty();
		System.out.println("The input string ["+input+"] contains white space ?");
		
		System.out.println(b);
	}

}
