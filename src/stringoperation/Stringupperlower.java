package stringoperation;

import java.util.Scanner;

public class Stringupperlower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str = "I hav  1 Pen 2 Pencils 3 erasers   6 othery item item";
		
		int len=str.length();
		
		for(int i=0;i<=len;i++){
			
			char ch = str.charAt(i); 
			if(ch.isDigit()){
				
			}*/
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = scr.nextLine();
		
		
		
		String str2=input.toUpperCase();
		String str3=input.toLowerCase();
		
		System.out.println("After converting to uppercase the inpur string is "+str2);
		System.out.println("After converting to lowercase the inpur string is "+str3);
		
		
				
				
			}
			
		

	}


