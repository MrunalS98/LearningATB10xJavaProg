package Task_29th_Jan_2025;

import java.util.Scanner;

public class Vote_eligible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!(as integer)");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("Your are not eligible to vote");
        }
    }
}
