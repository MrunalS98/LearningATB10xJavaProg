package Task_30th_Jan_2025;

import java.util.Scanner;

public class Grade_cal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your marks:- ");
        int marks = sc.nextInt();

        if(marks>=0 && marks<=100){

            if ((marks >= 90) && (marks == 100)){
                System.out.println("You got A+");
            }
            else if(marks >= 80 && marks <= 89){
                System.out.println("You got A");
            }
            else if(marks >= 70 && marks <= 79){
                System.out.println("You got B");
            }
            else if(marks >= 60 && marks <= 69){
                System.out.println("You got C");
            }
            else if(marks >= 50 && marks <= 59){
                System.out.println("You got D");
            }
            else if(marks >= 40 && marks <= 49){
                System.out.println("You got E");
            }
            else{
                System.out.println("You got F");
            }
        }
        else {
            System.out.println("Invalid marks input, Please enter valid input");
        }
    }
}
