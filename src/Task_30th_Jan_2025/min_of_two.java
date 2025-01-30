package Task_30th_Jan_2025;

import java.util.Scanner;

public class min_of_two {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int min = Math.min(num1,num2);

        System.out.println("Smallest number is:- " +min);
    }
}
