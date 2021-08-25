package stringoperation;

import java.util.Scanner;
//This class will fetch all the digits from a string
public class Stringfetchdigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = sc.nextLine();
		
		String numOnly=input.replaceAll("[^0-9]", "");
		System.out.println(numOnly);
		
		
		

	}

}
