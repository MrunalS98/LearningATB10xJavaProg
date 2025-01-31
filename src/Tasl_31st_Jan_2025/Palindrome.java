package Tasl_31st_Jan_2025;

public class Palindrome {
    public static void main(String[] args) {

        int num1 =12321;
        System.out.println("Palindrome:-"+PalindromeNumber(num1));
        int num2 =-12321;
        System.out.println("Palindrome:-"+PalindromeNumber(num2));
        int num3 =212;
        System.out.println("Palindrome:-"+PalindromeNumber(num3));
    }

    public static boolean PalindromeNumber(int num){
        if (num<0){
            return false;
        }
        int originalNumber  = num;
        int reversedNumber = 0;

        while (num>0){
            int lastDigit = num % 10;                                         // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;                  // Build the reversed number
            num = num / 10;                                                     // Remove the last digit
        }
        return originalNumber == reversedNumber;
    }
}
