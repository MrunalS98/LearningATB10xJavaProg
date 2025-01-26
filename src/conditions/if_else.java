package conditions;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!(as integer)");
        int age = sc.nextInt(); // java.util.InputMismatchException

        if (age >= 18){
            System.out.println("You are allowed to vote!");
        }
        else {
            System.out.println("You are not allowed to vote");
        }

    }
}
