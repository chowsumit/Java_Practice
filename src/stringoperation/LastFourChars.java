
public class LastFourChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputStr = "Hello world";
		
		
		System.out.println(inputStr.substring(3));
		
		System.out.println(inputStr.length());
		
		int startIndex = inputStr.length()-4;
		
		System.out.println(startIndex);
		
		System.out.println("Last 4 char of the input string is : "+inputStr.substring(startIndex));

	}

}
