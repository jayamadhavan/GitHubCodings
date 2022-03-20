package stringprogram;

public class StringMethod {
	public static void main(String[] args) {

		// String Methods and concepts:

		String name = "Jayalakshmi"; // String Literal
		int number = 2;

		// returns character value for particular index:
		System.out.println(name.charAt(4));// l

		// return sting length:
		System.out.println(name.length());// 11

		// checks the equality of string with the given object:
		System.out.println(name.equals("Jayalakshmi"));// true
		System.out.println(name.equals("Jaya"));// false

		// checks the equality of string with the given string object without case
		// Sensitivity:
		System.out.println(name.equalsIgnoreCase("jayaLakshmi"));// true
		System.out.println(name.equalsIgnoreCase("jaya"));// false

		// check the string is empty or not:
		System.out.println(name.isEmpty());// false

		// returns true or false based on the given value is present or not:
		System.out.println(name.contains("T"));// false
		System.out.println(name.contains("J"));// true

		// take the particular position of the string:
		System.out.println(name.substring(7));// (shmi)

		// take the particular position of the string begin and end index :
		// (end 9th char not come)
		System.out.println(name.substring(4, 9)); // (laksh)

		// appends the string to the given string(joint)
		System.out.println(name.concat("." + "MBA"));// Jayalakshmi.MBA

		// Replace the existing char with given char:
		System.out.println(name.replace("Jaya", "Vijaya"));// Vijayalakshmi
		System.out.println(name.replace("l", "L"));// JayaLakshmi

		// find the position of a charater in the string:
		System.out.println(name.indexOf("L"));// -1
		System.out.println(name.indexOf("l"));// 4

		// find the character specified from the index position:(a index after the
		// value)
		System.out.println(name.indexOf("a", 0));// 1
		System.out.println(name.indexOf("a", 2));// 3
		System.out.println(name.indexOf("a", 4));// 5

		// find the character specified from the index position:
		System.out.println(name.indexOf('y', 2)); // (string substring = 2)
		System.out.println(name.indexOf("laks", 1));// (string substring,int from index =4)

		// trim will remove the white place before and after:
		System.out.println(name.trim());// Jayalakshmi

		// convert the given data type to string;
		System.out.println(String.valueOf("jaya"));// jaya

		// upper case:
		String uppercase = "JAYALAKSHMI";
		System.out.println(uppercase.toLowerCase());// jayalakshmi

		// lower case:
		String lowercase = "jayalakshmi";
		System.out.println(lowercase.toUpperCase());// JAYALAKSHMI

		// return a joined string with given delimiter:
		System.out.println(String.join("-", "Have", "A", "Nice"));// Have-A-Nice
		System.out.println(String.join("/", "27", "01", "2011"));// 27/01/2011

		// split:
		String splitThis = "Have,A,Good,Beginning";
		String[] splittedWords = splitThis.split(",");
		for (String string : splittedWords) {
			System.out.println(string);
		}

 	}

}
