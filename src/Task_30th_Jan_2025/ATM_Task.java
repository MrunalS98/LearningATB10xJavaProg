package Task_30th_Jan_2025;

import java.util.Scanner;

public class ATM_Task {
    public static void main(String[] args) {

        final int balance = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdrawal");
        long amount = sc.nextLong();

        if (amount > 0 && amount < 10000) {

            if (amount % 100 == 0){
                System.out.println("Your new balance is:-");
                System.out.println(balance - amount);
            }
            else {
                System.out.println("Enter amount in multiple of 100");
            }
        }
        else {
            System.out.println("Enter valid amount");
        }
    }
}