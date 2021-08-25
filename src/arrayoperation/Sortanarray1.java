package arrayoperation;

import java.util.Arrays;

public class Sortanarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrInt;
		arrInt = new int[5];
		
		arrInt[0]=4;
		arrInt[1]=3;
		arrInt[2]=2;
		arrInt[3]=1;
		arrInt[4]=5;
		
		Arrays.sort(arrInt);
		
		System.out.println("First print = Array after sort :");
		for (int i=0; i<arrInt.length;i++) {
			
			System.out.println(arrInt[i]);
			
		}
		
		System.out.println("Second print = Array after sort :"+Arrays.toString(arrInt));
		
			
	}

}
