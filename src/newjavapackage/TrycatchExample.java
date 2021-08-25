package newjavapackage;

public class TrycatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			int num1= 7;
			int num2 = num1/0;
			
			System.out.println("End of try block");
		} catch(ArithmeticException e) {
			
			System.out.println("Number should not devided by zero.");
		}
		
		finally{
			
			System.out.println("Arithmatic error.");
		}
		
		System.out.println("Out of Try Catch and Finally block.");
		
		
	}

}
