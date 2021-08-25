package stringoperation;

import java.util.Scanner;

public class Stringfetchdigitsum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string that contains digits :");
		String input = sc.nextLine();
		
		int len = input.length();
		int sum = 0;
		
		for (int i=0; i<len;i++){
			
			char temp = input.charAt(i);
			if (Character.isDigit(temp)){				
				int b = Integer.parseInt(String.valueOf(temp));
				//System.out.println(b);
				sum= sum+b;				
			}
			
		}
		
		System.out.println("The summation is :"+sum);
			
			
		}
		
	}


