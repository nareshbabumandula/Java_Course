package basics;

public class StringMethods {

	public static void main(String[] args) {
		
		String sText1 = "hello";
		String sText2 = "WORLD";
		String sText3 = "   this is core java     ";
		String sText4 = "welcome to java training";
		
		System.out.println(sText1.toUpperCase()); // Convert a lowercase string to an uppercase
		System.out.println(sText2.toLowerCase()); // Convert an uppercase string to the lowercase
		System.out.println(sText3.trim()); // Remove spaces from either sides of a string
		System.out.println(sText4.length()); // Find the length of a string
		System.out.println(sText1.charAt(0)); // return character at a given index
		System.out.println(sText2.indexOf('W')); // returns the index value of the character found
		System.out.println(sText3.contains("java")); // returns true if the substring is found else false
		System.out.println(sText4.substring(0, 5)); // returns the substring in between the beginning and ending index
		System.out.println(sText1.concat(sText2)); // combine or concatenate two strings
		System.out.println(sText1.concat(" ").concat(sText2)); // combine or concatenate two strings with space in between
		System.out.println(sText1+ " " + sText2); // combine or concatenate two strings with space in between
		System.out.println(sText3.isEmpty()); // returns true is the string is empty else false
		System.out.println(sText4.replaceAll("java", "core java")); // replaces a sub string with another sub string
		System.out.println(sText3.endsWith("java")); // returns true else false
		System.out.println(sText4.startsWith("welcome")); // returns true else false
		System.out.println("a".hashCode()); // ASCII value of a
		System.out.println("A".hashCode()); // ASCII value of A
		
		String asText[] = sText4.split(" ");
		System.out.println(asText[0]);
		System.out.println(sText4.join(">", asText));
		System.out.println(sText1.equalsIgnoreCase("HELLO")); // compare strings with case insensitive and returns boolean
		System.out.println(sText1.toUpperCase().contains("HELLO"));
		
		

	}

}
