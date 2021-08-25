package stringoperation;

import java.util.Scanner;

public class Stringfetchdigitsum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str1 = sc.nextLine();
		
		
		String str2 = str1.replaceAll("[^0-9]", "");
		
		int len = str2.length();
		int sum = 0;
		
		for (int i = 0; i<=len-1; i++) {
			
			char c = str2.charAt(i);
			
			int s = Integer.parseInt(String.valueOf(c));
			
			sum = sum +s; 
			
			
		}
		
		System.out.println("The sum of the digit is : "+sum);
		
	}

}
