package stringoperation;

import java.util.Scanner;

public class Stringoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1=sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the character to be searched : ");
		String str2 = sc2.nextLine();
		
		int count=0;
		
		int len = str1.length();
		
		for(int i=0; i<len-1;i++) {
			
			char c = str1.charAt(i);
			
			String str3 = Character.toString(c);
			
			if (str2.equalsIgnoreCase(str3)) {
				
				count = count +1;
			}
			
		}
		
		System.out.println("The occuarance of the character is : "+count);
		
		

	}

}
