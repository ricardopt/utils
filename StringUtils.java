package com.mycompany.mavenproject1;

/**
 *
 * @author Ricardo Mesquita
 */
public class StringUtils {

    /**
     * Simple solution to check if a string is a Palindrome. A slow option would be to use StringBuilder.reverse() and check if it is equal to the input string.
     *
     * @param input
     * @return
     */
    public static boolean isPalindrome(String input) {
        int length = input.length();
        int i;
        for (i = 0; i < (length / 2); ++i) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
