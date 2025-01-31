package Tasl_31st_Jan_2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bonus_Calculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        System.out.println("Enter your work experience");
        double exp = sc.nextDouble();

        double bonus = Bonus_cal(salary,exp);
        System.out.println("Bonus = " +bonus);
        sc.close();

    }
        public static double Bonus_cal(double salary, double exp) {
            double bonus = 0;
            
            if (exp>=1 && exp<=3){
                bonus = salary *0.05;
            }
            else if (exp>=4 && exp<=6 ){
                bonus = salary*0.10;
            }
            else if (exp > 6 ) {
                bonus = salary*0.15;
            }
            return bonus;
    }

}
