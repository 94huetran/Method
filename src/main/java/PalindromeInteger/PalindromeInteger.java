package PalindromeInteger;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number check: ");
        int number = scn.nextInt();
        System.out.println(reverse(number));
        System.out.println(isPalindrome(number));
    }

    private static int reverse(int number) {
        String convertToString = Integer.toString(number);
//        char[] warray = convertToString.toCharArray();
//        int reverseNumber = 0;
//        for (int i = 0; i < warray.length / 2; i++) {
//            char temp = warray[i];
//            warray[i] = warray[warray.length - i - 1];
//            warray[warray.length - i - 1] = temp;
//             reverseNumber = Integer.parseInt(String.valueOf(warray));
//        }
//        return number = reverseNumber;
        StringBuilder stringBuilder = new StringBuilder(convertToString);
        stringBuilder.reverse();
        Integer reverseNumber = Integer.parseInt(String.valueOf(stringBuilder));
        return reverseNumber;
        }

        public static boolean isPalindrome(int number){
            return (number == reverse(number));
        }
}

