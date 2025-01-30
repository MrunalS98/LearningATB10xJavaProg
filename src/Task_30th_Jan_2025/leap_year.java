package Task_30th_Jan_2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year:-");
        int year = sc.nextInt();

        if(year%4==0 && year%100==0){
            if (year%400==0){
                System.out.println("Year is leap year");
            }
        }
        else {
            System.out.println("Year is not a leap year");
        }

    }
}
