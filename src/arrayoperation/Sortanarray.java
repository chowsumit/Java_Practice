package arrayoperation;

public class Sortanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrInt;
		arrInt = new int[5];
		
		arrInt[0]=4;
		arrInt[1]=3;
		arrInt[2]=2;
		arrInt[3]=1;
		arrInt[4]=5;
		
		
		int len = arrInt.length;
		
		//System.out.println(len);
		
		for (int i=0; i<=len-1;i++) {
			
			int j=i+1;
			
			for (j=1; j<(len);j++) {
				
				if (arrInt[i]>arrInt[j]) {
					
					int temp;
					temp = arrInt[i];
					arrInt[i]=arrInt[j];
					arrInt[j]=temp;
					
					
				}
				
			}
		}
		
		//int len1 = arrInt.length;
		
		/*for (int k=0; k<=len1-1;k++) {
			
			
			System.out.println("After sorting.");
			System.out.println(arrInt[k]);
		}*/
		
		
		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[2]);
		System.out.println(arrInt[3]);
		System.out.println(arrInt[4]);
		
		
		
		
		
		
	}

}
