package Task_29th_Jan_2025;

import java.util.Scanner;

public class Num_even_Odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!(as integer)");
        int num = sc.nextInt();
         if(num % 2 == 0){
             System.out.println("Number is Even");
         }
         else{
             System.out.println("Number is Odd");
         }
    }
}
