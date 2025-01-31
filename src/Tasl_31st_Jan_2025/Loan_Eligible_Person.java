package Tasl_31st_Jan_2025;

import java.util.Scanner;

public class Loan_Eligible_Person{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        System.out.println("Enter your creditScore");;
        int creditScore = sc.nextInt();

        if (age>=18&&age<=80 && salary>=30000 && creditScore>=650&&creditScore<=850){
            System.out.println("You are eligible for loan");
        }
        else{
            System.out.println("Ypu are not eligible for loan");
        }

        sc.close();
    }
}
