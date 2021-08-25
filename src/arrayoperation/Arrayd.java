package arrayoperation;

public class Arrayd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr;
		arr = new int[5];
		arr[0]=5;
		arr[1]=6;
		arr[2]=9;
		arr[3]=2;
		arr[4]=3;
		
		for (int i=0;i<5;i++){
		System.out.println("The value of the integer array index "+i+" is "+arr[i]);
		}
		
		String[] countryArr;
		countryArr = new String[5];
		
		countryArr[0]="Canada";
		countryArr[1]="USA";
		countryArr[2]="UK";
		countryArr[3]="India";
		countryArr[4]="Bangladesh";
		
		for (int i=0;i<=4;i++){
		System.out.println("The value of string array index "+i+" is "+countryArr[i]);
		}
		
	}

}
