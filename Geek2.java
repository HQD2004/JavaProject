/*
AUTHOR: Hoang Quan Dinh
FILENAME: Geek2.java
SPECIFICATION: Solving problems recursively
FOR: CS 1400 - ASSIGNMENT #8
TIME SPENT: 30 minutes
*/
public class Geek2 {
    /**
     * Check to see if the match exist in the string.
     * @param str       String examined
     * @param match     String checked to see if in <code>str</code>
     * @return          True if the match exists in the string, false otherwise.
     */
    public static boolean find(String str, String match){
        //Base case
        if (str.length() < match.length()){
            return false;
        }
        //Find match
        if (match.equals(str.substring(0, match.length())) == true){
            return true;
        }
        //Recursive call
        else {
            return find (str.substring(1), match);
        }
    }

    /**
     * Calculates the sums of the digits in an integer.
     * @param n     Integer that the sum is derived from
     * @return      Sum of all the digits in the integer
     */
    public static int digitSum(int n){
        //Base case
        if (n == 0){
            return 0;
        } else {
            //Recursive call
            return n % 10 + digitSum(n/10);
        }
    }

    /**
     * Calculates a digit to the power of another positive integer.
     * @param a     Base
     * @param n     Power raised to
     * @return      <code>a</code>^<code>n</code>
     */
    public static int pow(int a, int n){
        //Base case
        if (n == 0){
            return 1;
        } else {
            //Recursive call
            return a * pow(a, n-1);
        }
    }

    /**
     * Return the smallest digit inside a number.
     * @param number    Number input
     * @return          Smallest digit inside <code>number</code>
     */
    public static int smallestDigit(int number){
        //Base case if single digit
        if (number < 10){
            return number;
        } else {
            //Recursive call checking for the minimum between current first digit and the minimum of the other digits.
            return Math.min(number % 10, smallestDigit(number/10));
        }
    }

    /**
     * Returns the reverse of a string.
     * @param text  Original string
     * @return      Reverse of <code>text</code>
     */
    public static String reverse (String text){
        //Base case
        if (text.length() == 0){
            return "";
        } else {
            //Recursive call adding current final letter to reverse of previous letters.
            return text.substring(text.length()-1) + reverse(text.substring(0, text.length()-1));
        }
    }
}
