package Task_30th_Jan_2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:- ");
        int num = sc.nextInt();

        if(num >= 1){

            if(num % 1==0 && num % num==0){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not Prime");
            }
        }
        else {
            System.out.println("Enter number greater than or equals to 1");
        }
    }
}
