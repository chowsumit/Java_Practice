package stringoperation;

import java.util.Scanner;

public class Stringconcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings : ");
		
		
		s1= sc.nextLine();
		s2= sc.nextLine();
		
		String s3;
		s3=s1.concat(s2);
		System.out.println("The concatenate string is : "+s3);
		

	}

}
