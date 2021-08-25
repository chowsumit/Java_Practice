package arrayoperation;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] arrStr1; 
	arrStr1 = new String[3];
	
	String[] arrStr2 = new String[2];
	
	arrStr1[0] = "Ash";
	arrStr1[1] = "Jhy";
	arrStr1[2] = "Uhk";
	
	arrStr2[0] = "Okj";
	arrStr2[1] = "Phj";
	
	String str1, str2, str3;
	
	str1="";
	str2="";
	
	int len1 = arrStr1.length;
	int len2 = arrStr2.length;
	
	for(int i=0; i<len1;i++ ) {
		
		str1=str1+" "+arrStr1[i];
		
	}
	
	for(int j=0; j<len1;j++ ) {
		
		str2=str1+" "+arrStr1[j];
		
	} 
	
	str3 = str1.concat(str2);
	//System.out.println(str3);
	
	String[] arrStr3;
	arrStr3=str3.split(" ");
	
	System.out.println(Arrays.toString(arrStr3));
	
	
	
	
	
	
	
	}

}
