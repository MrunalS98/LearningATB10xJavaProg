package conditions;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int result = sc.nextInt(); // java.util.InputMismatchException

        if (result == 100){
            System.out.println("You got A+");
        }
        else if(result >= 90){
            System.out.println("You got A");
        }
        else if(result >= 80){
            System.out.println("You got B");
        }
        else if(result >= 70){
            System.out.println("You got C");
        }
        else if(result >= 60){
            System.out.println("You got D");
        }
        else if(result >= 50){
            System.out.println("You got E");
        }
        else {
            System.out.println("You got F");
        }
    }
}
