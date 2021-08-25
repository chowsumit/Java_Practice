package stringoperation;

import java.util.Scanner;
//This class will convert the string input into 
//array and dispay a the array in reverse order
public class Stringconverttoarray_oAuth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url : ");
		String str =sc.nextLine();
		//System.out.println(str);
		String output=" ";
		String[] arr;
		arr = str.split("&code=");
		
		String str2 = arr[1];
		String[] arr1;
		
		arr1 = str2.split("&scope=");
		
		String codeValue = arr1[0];
		
		
		
		
		
	}

}
