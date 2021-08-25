package stringoperation;

import java.util.Scanner;




public class Stringlength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string : ");
		String s1;
		Scanner sc = new Scanner (System.in);
		s1= sc.nextLine();
		
		
		int len;
		len= s1.length();
		
		System.out.println("The length of the string is : "+len);
		
		
	}

}
