package Task_7th_Feb_2025;

import java.util.Scanner;

public class Table_of_given_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:-");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        // Close the scanner
        sc.close();
    }
}
