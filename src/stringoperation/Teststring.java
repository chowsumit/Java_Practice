package stringoperation;

import java.util.Scanner;

public class Teststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		
		String str = sc.nextLine();
		
		//System.out.println(str);
		
		String[] sArr=str.split(" ");
		
		int len = sArr.length;
		
		//System.out.println(len);
		
		
		for (int i = len-1; i>=0; i--) {
			
			System.out.println(sArr[i]);
		}
	}

}
