package Task_1st_Feb;

import java.util.Scanner;

public class Year_Month_Day {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
        double days = sc.nextDouble();

        if(days<0){
            System.out.println("Invalid Input");
        }
        else {
            double years = days / 365;
            double DaysAfterYearsRemaining = days % 365;
            double months = DaysAfterYearsRemaining / 30;
            double daysRemaining = DaysAfterYearsRemaining % 30;

            System.out.println(days+ "Days is equals to :- "+ years + " years, " + months + " months, and " + days + " days.");
        }
    }
}
