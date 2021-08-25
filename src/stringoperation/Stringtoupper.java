package stringoperation;

import java.util.Scanner;

public class Stringtoupper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1, s2;
		System.out.println("Enter the lowercase string : ");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=s1.toUpperCase();
		System.out.println("The string with the upper case is : "+s2);
		

	}

}
