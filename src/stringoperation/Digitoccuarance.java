package stringoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//In an integer searies search for a specific number occurance 

public class Digitoccuarance {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Scanner sc2 = new Scanner (System.in);
		
		BufferedReader sc2 = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the number to be searched : ");
		
		String str2 = sc2.readLine();		
		
		
		
		BufferedReader sc1 = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the range  : ");
		String str1 = sc1.readLine();
		
		int in1 = Integer.parseInt(str1);
		//int in2 = Integer.parseInt(str2);
		
		int[] intArray; 
		intArray = new int[in1+1];
		
		String join = "";
		
		int count = 0;
		
		for (int i=0; i<(in1+1); i++) {
			
			intArray[i]=i;
			join= join + intArray[i];
			
		}
		
		int lenJoin = join.length();
		
		for(int j=0; j<lenJoin;j++) {
			char c = join.charAt(j);
			String str3 = Character.toString(c);
			
				if (str2.equalsIgnoreCase(str3)) {
					count = count +1;
				}
		}
		
		System.out.println("The number of occurance is "+count);
		

	}
	
	
	

}
