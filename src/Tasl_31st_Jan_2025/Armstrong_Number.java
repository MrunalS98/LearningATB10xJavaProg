package Tasl_31st_Jan_2025;

public class Armstrong_Number {
    public static void main(String[] args) {

        int num1 =153;
        System.out.println("Palindrome:-"+ArmstrongNumber(num1));
        int num2 =-12;
        System.out.println("Palindrome:-"+ArmstrongNumber(num2));
        int num3 =212;
        System.out.println("Palindrome:-"+ArmstrongNumber(num3));
    }

    public static boolean ArmstrongNumber(int num){
//        if(num<0){
//            System.out.println("Please enter valid number");
//            return false;
//        }
        int originalNumber = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length(); // Efficiently get digit count

        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, numberOfDigits); // Use Math.pow for any power
            num /= 10;
        }

        return sum == originalNumber;
    }
}
