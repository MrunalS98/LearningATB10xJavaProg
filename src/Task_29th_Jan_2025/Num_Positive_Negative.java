package Task_29th_Jan_2025;

import java.util.Scanner;

public class Num_Positive_Negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number(as integer) -> ");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("Your number is positive");
        }
        else{
            System.out.println("Your number is Negative");

            sc.close();
        }
    }
}
