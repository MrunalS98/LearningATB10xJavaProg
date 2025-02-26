package Task_30th_Jan_2025;

import java.util.Scanner;

public class max_of_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        int max = Math.max(Math.max (num1, num2),num3 );

        System.out.println("Larger number:- " +max);

        //int largest;                                                  Using nested if-else statements
//       if (num1 >= num2 && num1 >= num3) {
//            largest = num1;
//        } else if (num2 >= num1 && num2 >= num3) {
//            largest = num2;
//        } else {
//            largest = num3;
//        }

//        public class MaxOfThree {
//
//            public static void main(String[] args) {
//                int a = 10;
//                int b = 25;
//                int c = 15;
//
//                int max = (a > b) ? ( (a > c) ? a : c ) : ( (b > c) ? b : c );
//
//                System.out.println("Maximum number is: " + max);
//            }
       // }

        sc.close();
    }
}
