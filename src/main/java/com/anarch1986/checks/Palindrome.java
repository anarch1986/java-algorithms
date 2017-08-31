package com.anarch1986.checks;

public class Palindrome {


    public static boolean checkIfPalindrome(String palindrome) {
        for (int i = 0, j = palindrome.length()-1; i <= j; i++, j--) {
            if (palindrome.charAt(i)!=palindrome.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
