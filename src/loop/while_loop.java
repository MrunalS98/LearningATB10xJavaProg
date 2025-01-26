package loop;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number for factorial !");
        int num = sc.nextInt(); // java.util.InputMismatchException

        int factorial = 1;  //Initialize variables

        while (num > 0) {
            factorial *= num;    //program logic
            num--;
        }
        System.out.println("Factorial of is: " + factorial); //print statement
        sc.close();  // closing scanner class
    }
}
