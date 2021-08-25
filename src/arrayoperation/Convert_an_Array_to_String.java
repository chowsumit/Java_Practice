package arrayoperation;

import java.util.*;



public class Convert_an_Array_to_String {

	/**
	 * How convert an array of Strings in a single String in java
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str;
		str = new String[4];
		
		str[0]="I";
		str[1]="love";
		str[2]="my";
		str[3]="country";
		
		String join = "";
		
		
		int len = str.length;
		
		for (int i=0; i<len; i++) {
			
			join = join + str[i]+" "; 
			
		}
		
	    //StringJoiner joiner = new StringJoiner();
		
		System.out.println(join);
		
	}

}
