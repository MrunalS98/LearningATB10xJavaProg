package Task_7th_Feb_2025;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:- ");
        int num = sc.nextInt();

        if (num >= 1) {

            boolean isPrime = true;            // Assume it's prime initially

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, so it's not prime
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not Prime");
            }
        } else {
            System.out.println("Enter number greater than or equals to 1");
        }
        sc.close();
    }
}
