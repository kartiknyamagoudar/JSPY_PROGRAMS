package logics;

public class StrRemoveNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove numbers
		String str = "M998eth780od";
		System.out.println(str);
		System.out.println(str.replaceAll("[0-9]",""));
		
		// remove spaces 
		String str1 = "hi       how     are           you";
		System.out.println(str1);
		System.out.println("replace white spaces " +str1.replaceAll(" +"," "));
		
		// length of string
		String str2 = "hi how are you";
		System.out.println(str2);
		System.out.println(str2.replaceAll(" ", "").length());
		
		// removing ovels
		String str3="hI heLLo how r u";
		System.out.println(str3);
		System.out.println(str3.replaceAll("[aeioAEIOU]", ""));
		
		// removing alphabets
		String str4="hI127689 heLLo 6813how r u";
		System.out.println(str4);
		System.out.println(str4.replaceAll("[a-zA-Z]", ""));
		
		
		// count consonenets in the string
		String str5="hi hello how are you";
		System.out.println(str5);
		str5=str5.replaceAll(" ", "");
		System.out.println(str5.replaceAll("[aeiouAEIOU]", ""));
		System.out.println(str5.replaceAll("[aeiouAEIOU]", "").length());
		
		
		// count ovels in an string (^)
		String str6 = "methodoverloading";
		System.out.println(str6.replaceAll("[^aeiou]", ""));
		System.out.println(str6.replaceAll("[^aeiou]", "").length());
		
		// String print only uppercase letters
		String str7 = "MeThOdOvErLoAdInG";
		System.out.println(str7.replaceAll("[^A-Z]", ""));
		
		
		String str8 = "Me@234ThOdO4%AdIn^G";
		System.out.println(str8.replaceAll("[^A-Za-z]", ""));
		System.out.println(str8.replaceAll("[^0-9]", ""));
		System.out.println(str8.replaceAll("[^@%^]", ""));
		
		
		String str9 = "MethodOverloading";
		System.out.println(str9.replaceAll("[^hod]", ""));
		System.out.println(str9.replaceAll("[^Method]", ""));
		System.out.println(str9.replaceAll("[^Over]", ""));
		System.out.println(str9.replaceAll("[^loading]", ""));
		
		
		// var substring (beginning index, end index);
		String str10 = "MethodOverloading";
		System.out.println(str10.substring(3,6));
		System.out.println(str10.substring(0,6));
		System.out.println(str10.substring(6,10));
		System.out.println(str10.substring(10));
		
	}

}
