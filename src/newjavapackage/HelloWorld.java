package newjavapackage;

public class HelloWorld {

	public static void main(String []args){
	      
        String str1 = "By the power of Grayskull!";
        
        HelloWorld obj = new HelloWorld();
        System.out.println(obj.rplc(str1, "b", "Z"));
        
        
        String str2 = obj.rplc(str1, "a", "4");
        String str3 = obj.rplc(str2, "A", "4");
        String str4 = obj.rplc(str3, "e", "3");
        String str5 = obj.rplc(str4, "E", "3");
        String str6 = obj.rplc(str5, "o", "0");
        String str7 = obj.rplc(str6, "O", "0");
        String str8 = obj.rplc(str7, "s", "5");
        String str9 = obj.rplc(str8, "S", "5");
        String str10 = obj.rplc(str9, "t", "7");
        String str11 = obj.rplc(str10, "T", "7");
        String str12 = obj.rplc(str11, "b", "5");
        String str13 = obj.rplc(str12, "D", "5");
        
        System.out.println(str13);
        
        
        
     }
     
     
      public String rplc(String s, String before_replacing, String after_replacing){
         
        String s1;
        s1=s.replace(before_replacing, after_replacing);
        return s1;
      }
         
     }


