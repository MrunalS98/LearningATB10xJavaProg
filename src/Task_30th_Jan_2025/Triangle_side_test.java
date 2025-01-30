package Task_30th_Jan_2025;

import java.util.Scanner;

public class Triangle_side_test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");

        System.out.print("Side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Side 3: ");
        double side3 = sc.nextDouble();

        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

        sc.close(); // Close the scanner to release resources
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        // Triangle Inequality Theorem: The sum of any two sides must be greater than the third side.
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
