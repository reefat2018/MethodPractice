package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {

	public static void main(String[] args) {
		System.out.println("Q1:" + getName("Chowdhury"));
		System.out.println("Q2:" + getUpperCase("chowdhury"));
		System.out.println("Q3:" + getLowerCase("CHOWDHURY MAJED"));
		System.out.println("Q4:" + getEvenNumber(25));
		System.out.println("Q5:" + getOddNumber(35));
		System.out.println("Q6:" + getKilometer(5));
		System.out.println("Q7:" + getIndexList("Chowdhury"));
		System.out.println("Q8:" + getCharacter("chowdhury"));
		System.out.println("Q9:" + getSum(5));
		System.out.println("Q10:" + getSquare(3));
		System.out.println("Q11:" + Arrays.toString(getnumArray(10)));
		System.out.println("Q12:" + Arrays.toString(getnumberArray(12)));
		
		System.out.println("Q13:" + getNumberList(15));
		System.out.println("Q14:" + getFizzBuzz(25));
		
		int[] numArray ={12, 3, 15, 8, 30, 6, 20};
		System.out.println("Q15:" + getMaxNumber(numArray));
		
		int[] num1Array ={22, 13, 5, 8, 3, 16, 22};
		System.out.println("Q16:" + getMinNumber(num1Array));
		System.out.println("Q17:" + getStringValue(200));
		System.out.println("Q18:" + getStringRepValue("50"));
		
		System.out.println("Q19:" + searchCharA("This is a String"));
		System.out.println("Q20:" + getSum("This is a string"));	
	}

	/**
	 * Q.1 Write a method that take your name input and return your name.
	 * parameter: String name 
	 * return type : String 
	 * serving bucket: variable
	 */

	public static String getName(String name) {
		String text = null;
		text = name;

		return text;
	}

	/**
	 * Q.2 Write a method that take one String input and return same String in upper case.
	 * parameter : String text 
	 * return type: String 
	 * serving bucket: variable
	 */

	public static String getUpperCase(String text) {
		String upperCaseText = null;
		upperCaseText = text.toUpperCase();

		return upperCaseText;
	}

	/**
	 * Q.3 Write a method that take one String input and return same String in lower case. 
	 * parameter : String text 
	 * return type: String 
	 * serving bucket: variable
	 */

	public static String getLowerCase(String text) {
		String lowerCaseText = null;
		lowerCaseText = text.toLowerCase();

		return lowerCaseText;
	}

	/**
	 * Q.4 Write a method that take a number input and return the list of all even numbers from 0 to that given number.
	 * parameter: integer number 
	 * return type: ArrayList<Integer> 
	 * serving bucket:ArrayList
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
	 * Q.5 Write a method that take a number input and return the list of all even numbers from 0 to that given number .
	 * parameter : integer number
	 * return type : ArrayList<Integer> 
	 * serving bucket : ArrayList
	 */

	public static ArrayList<Integer> getOddNumber(int num) {
		ArrayList<Integer> oddNumberList = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				oddNumberList.add(i);
			}
		}

		return oddNumberList;
	}

	/**
	 * Q.6 Write a method that take input as mile and return as kilometer.
	 * parameter : double 
	 * return type : double 
	 * serving bucket : variable
	 */

	public static double getKilometer(double mile) {
		double kilometer = 0;

		kilometer = mile * 1.60934;

		return kilometer;
	}

	/**
	 * Q.7 Write a method that take one String input and return a list of all index.
	 * parameter : String text 
	 * return type : ArrayList<Interger> 
	 * serving bucket : List
	 */

	public static ArrayList<Integer> getIndexList(String text) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();

		for (int i = 0; i < text.length(); i++) {
			indexList.add(i);
		}
		return indexList;
	}

	/**
	 * Q.8 Write a method that take one String input and return a list of all character. 
	 * parameter : String text 
	 * return type : ArrayList<Character>
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
	 * Q.9 Write a method that take one number input and return the sum of 1 to that given number .
	 * parameter : Integer 
	 * return type : integer serving
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
	 * Q.10 Write a method that take one number input and return square that given number. 
	 * parameter : integer number 
	 * return type : integer serving
	 * bucket : variable
	 */

	public static int getSquare(int number) {
		int square = 0;

		square = number * number;

		return square;
	}
	
	/**
	 * Q. 11 Write a method that take one number input and return an Array that contains 0 to given number.
	 * return type: int []
	 * parameter : int num
	 * serving bucket: Array
	 * * 
	 */	
	
	public static int[] getnumArray(int num) {
		int[] numArray = new int[num + 1];

		for (int n = 0; n <= num; n++) {
			numArray[n] = n;
		}

		return numArray;
	}
	
	/**
	 * Q. 12 Write a method that take one number input and return an Array that contains 1 to given number.
	 * return type : int []
	 * parameter : int num
	 * serving bucket : Array
	 * 
	 */
	
	public static int [] getnumberArray (int num) {
		int [] numberArray = new int [num];
		
		for (int i = 1; i <= num; i++){
			numberArray [i-1] = i;
		}
		
		return numberArray;
	}
	
	/**
	 * Q. 13 Write a method that take one number input and return a number list starting from 0 to given number.
	 * return type : ArrayList
	 * parameter : int num
	 * serving bucket : ArrayList
	 */
	
	public static ArrayList<Integer> getNumberList(int num){
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i<= num; i++){
			numberList.add(i);
		}
				
		return numberList;
	}
	
	/**
	 *  Q. 14 Write a method that take one number input and return 'fizz' if the given number divided by 5 and return 'buzz' if the given number divided by 5 & 3 otherwise return 'fizz buzz'.  
	 *  return type: String 
	 *  parameter : int num
	 *  serving bucket: variable
	 */
	
	
	public static String getFizzBuzz(int num) {
		String message = null;

		if (num % 5 == 0 && num % 3 == 0) {
			message = "Buzz;";

		} else if (num % 5 == 0) {
			message = "Fizz";
		} else {
			message = "FizzBuzz";
		}
		return message;
	}
	
	/**
	 * Q. 15 Write a method that take one number array input and return the Max Number.
	 * return type : integer
	 * parameter : int [] numArray
	 * serving bucket : variable
	 * 
	 */
	
	public static int getMaxNumber(int[] numArray) {
		int maxNumber = numArray[0];

		for (int i = 0; i < numArray.length; i++) {
			if (maxNumber < numArray[i]) {

				maxNumber = numArray[i];
			}
		}
		return maxNumber;
	}
	
	 /**
	  * Q. 16 Write a method that take one number array input and return the Min Number.
	  * return type : integer
	  * parameter : int [] numArray
	  * serving bucket : variable
	  */
	
	public static int getMinNumber(int[] num1Array) {

		int minNumber = num1Array[0];
		for (int i = 0; i < num1Array.length; i++) {
			if (minNumber > num1Array[i]) {
				minNumber = num1Array[i];
			}
		}
		return minNumber;
	}
	
	/**
	 * Q. 17 Write a method that take a number input and return the same value as a String. 
	 * return type: String
	 * parameter : int
	 * serving bucket : variable
	 */
	
	public static String getStringValue (int num){
		
		String stringText = null;
		
		stringText = String.valueOf(num);
		
		return stringText;
	}
	
	/** Q. 18 Write a method that take a String representation of number input and return the same value as an integer.
	 * return type : int
	 * parameter : string text
	 * serving bucket : variable 
	 */
	
	public static int getStringRepValue (String num){
		int intValue = 0;
		
		intValue= Integer.valueOf(num);
		
		return intValue;
	}
	
	/**
	 * Q. 19 Write a method that take String input & return true if it contains char 'a' otherwise return false
	 * parameter : String text 
	 * return type : boolean 
	 * serving bucket : variable
	 */

	public static boolean searchCharA(String text) {
		boolean result = false;
		text = text.toLowerCase();
		result = text.contains("a");

		return result;
	}
	
	
	/**
	 * Q. 20 Write a method that take a one String input and return the sum of all index.
	 * parameter : String text
	 * return : int 
	 * serving bucket : variable
	 * 
	 */
	
	public static int getSum(String text) {
		int result = 0;
		
		for (int i = 0; i < text.length(); i = i + 1) {
			
			result = result + i;
		}

		return result;
	}
	}
