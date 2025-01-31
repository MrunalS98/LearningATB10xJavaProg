package Tasl_31st_Jan_2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Visa_Eligible {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter visa status");
        boolean status = sc.nextBoolean();

        if (age >= 18 && status){                                  // status == true is redundant; just use status
            System.out.println("Person can travel");
        }
        else{
            System.out.println("Person can not travel");
        }
        sc.close();
    }

}
