public class StringComparisonExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Using the == operator to compare string references
        System.out.println("str1 == str2: " + (str1 == str2));  // Output: true (both reference the same string literal in the string pool)
        System.out.println("str1 == str3: " + (str1 == str3));  // Output: false (str3 is a new string object created using the 'new' keyword)

        // Using the equals method to compare string content
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // Output: true (contents of the strings are the same)
        System.out.println("str1.equals(str3): " + str1.equals(str3));  // Output: true (contents of the strings are the same)
    }
}
