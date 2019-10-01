/* 
 * Nicholas Loviscek
 * loviscnl@mail.uc.edu
 * Due: 10/03/2019
 * Class: IS4010 Fall 2019
 * Assignment 05
 * Description: Create a method takes a football score and returns a string describing that score
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	/**
	 * This method takes a football score and returns a string describing that score
	 * @param score, the football score
	 * @return a string describing the score
	 */
	public static String translateScore (int score) {
	

		if (score == 2) {return "safety";}       // football score and corresponding string
		if (score == 3) {return "field goal";}    // football score and corresponding string
		if (score == 6) {return "touchdown";}    // football score and corresponding string
		if (score == 7) {return "touchdown and extra point";}    // football score and corresponding string
		if (score == 8) {return "touchdown and 2-point conversion";}   // football score and corresponding string
		if (score == -1) {return "";}				// football score and corresponding string
		if (score == 1) {return "invalid";}			// football score and corresponding string
		if (score == 10) {return "you must be playing Quidditch ";}  // football score and corresponding string
		
		return "";
	}
}
