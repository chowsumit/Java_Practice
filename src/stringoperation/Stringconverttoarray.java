package stringoperation;

import java.util.Scanner;
//This class will convert the string input into 
//array and dispay a the array in reverse order
public class Stringconverttoarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str =sc.nextLine();
		//System.out.println(str);
		String output=" ";
		String[] arr;
		arr = str.split(" ");
		
		for (int i=arr.length-1; i>=0; i--){
			
			//System.out.println(arr[i]);
			output=output+arr[i]+" ";			
		}		
		System.out.println(output);
		
		
		
	}

}
