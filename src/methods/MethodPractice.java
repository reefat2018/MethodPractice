package methods;

import java.util.ArrayList;

public class MethodPractice {

	public static void main(String[] args) {
		System.out.println("Q1:" + getName("Chowdhury"));
		System.out.println("Q2:" + getUpperCase("chowdhury"));
		System.out.println("Q3:" + getLowerCase("CHOWDHURY MAJED"));
		System.out.println("Q4:" + getEvenNumber(25));
		System.out.println("Q5:" + getOddNUmber(35));
		System.out.println("Q6:" + getKilometer(5));
		System.out.println("Q7:" + getIndexList("Chowdhury"));
		System.out.println("Q8:" + getCharacter("chowdhury"));
		System.out.println("Q9:" + getSum(5));
		System.out.println("Q10:" + getSquare(3));
	}

	/**
	 * Q.1 Write a method that take your name input and return your name
	 * parameter: String name return type : String serving bucket: variable
	 */

	public static String getName(String name) {
		String text = null;
		text = name;

		return text;
	}

	/**
	 * Q.2 Write a method that take one String input and return same String in
	 * upper case parameter : String text return type: String serving bucket:
	 * variable
	 */

	public static String getUpperCase(String text) {
		String upperCaseText = null;
		upperCaseText = text.toUpperCase();

		return upperCaseText;
	}

	/**
	 * Q.3 Write a method that take one String input and return same String in
	 * lower case parameter : String text return type: String serving bucket:
	 * variable
	 */

	public static String getLowerCase(String text) {
		String lowerCaseText = null;
		lowerCaseText = text.toLowerCase();

		return lowerCaseText;
	}

	/**
	 * Q.4 Write a method that take a number input and return the list of all
	 * even numbers from 0 to that given number parameter: integer number return
	 * type: ArrayList<Integer> serving bucket:ArrayList
	 * 
	 */

	public static ArrayList<Integer> getEvenNumber(int num) {
		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				evenNumberList.add(i);
			}
		}

		return evenNumberList;
	}

	/**
	 * Q.5 Write a method that take a number input and return the list of all
	 * even numbers from 0 to that given number parameter : integer number
	 * return type : ArrayList<Integer> serving bucket : ArrayList
	 */

	public static ArrayList<Integer> getOddNUmber(int num) {
		ArrayList<Integer> oddNumberList = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				oddNumberList.add(i);
			}
		}

		return oddNumberList;
	}

	/**
	 * Q.6 Write a method that take input as mile and return as kilometer
	 * parameter : double return type : double serving bucket : variable
	 */

	public static double getKilometer(double mile) {
		double kilometer = 0;

		kilometer = mile * 1.60934;

		return kilometer;
	}

	/**
	 * Q.7 Write a method that take one String input and return a list of all
	 * index parameter : String text return type : ArrayList<Interger> serving
	 * bucket : List
	 */

	public static ArrayList<Integer> getIndexList(String text) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();

		for (int i = 0; i < text.length(); i++) {
			indexList.add(i);
		}
		return indexList;
	}

	/**
	 * Q.8 Write a method that take one String input and return a list of all
	 * character parameter : String text return type : ArrayList<Character>
	 * serving bucket : List
	 */

	public static ArrayList<Character> getCharacter(String text) {
		ArrayList<Character> characterList = new ArrayList<Character>();

		for (int i = 0; i < text.length(); i++) {
			characterList.add(text.charAt(i));
		}
		return characterList;
	}

	/**
	 * Q.9 Write a method that take one number input and return the sum of 1 to
	 * that given number parameter : Integer return type : integer serving
	 * bucket: variable
	 */

	public static int getSum(int num) {
		int sumResult = 0;

		for (int i = 0; i <= num; i++) {
			sumResult = sumResult + i;
		}
		return sumResult;
	}

	/**
	 * Q.10 Write a method that take one number input and return square that
	 * given number parameter : integer number return type : integer serving
	 * bucket : variable
	 */

	public static int getSquare(int number) {
		int square = 0;

		square = number * number;

		return square;
	}
}
