package Task_30th_Jan_2025;

import java.util.Scanner;

public class min_of_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("Enter three number");
        int num3 = sc.nextInt();

        int min = Math.min(Math.min(num1, num2),num3);

        System.out.println("Smallest number is:- " +min);

        sc.close();
    }
}
