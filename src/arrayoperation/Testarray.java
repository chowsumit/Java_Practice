package arrayoperation;

public class Testarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[];
		intArray= new int[5];
		
		intArray[0] = 55;
		intArray[1] = 21;
		intArray[2] = 25;
		intArray[3] = 12;
		intArray[4] = 37;
		
		
		System.out.println("The length is : "+intArray.length);
		
		for (int i=0; i<(intArray.length);i++){
			
			//System.out.println("Element at index "+i +": "+intArray[i]);
			
			if (intArray[i]==25){
				System.out.println("True");
			}
			
		}
	}

}
