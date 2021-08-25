package stringoperation;

import java.util.Scanner;

public class Stringreversebuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string :");
		String original;
		Scanner sc = new Scanner(System.in);
		original=sc.nextLine();
		
		StringBuffer sb = new StringBuffer(original);
		String rev = sb.reverse().toString();
		System.out.println("The original string is : "+ original);
		System.out.println("The string after reverse is : "+rev);
		

	}

}
