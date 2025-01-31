package Tasl_31st_Jan_2025;

import java.util.Scanner;

public class Electricity_Bill_Calculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your consume units");
        int unit = sc.nextInt();

        double bill = ElectricityBill(unit);
        System.out.println("Bill = "+bill);
        sc.close();
    }

    public static double ElectricityBill(int unit) {
        double bill = 0;

        if (unit <= 100) {
            bill = unit * 0.50;
        } else if (unit <= 200) {
            bill = 100 * 0.50 + (unit - 100) * 0.75;
        } else if (unit <= 300) {
            bill = 100 * 0.50 + 100 * 0.75 + (unit - 200) * 1.20;
        } else {
            bill = 100 * 0.50 + 100 * 0.75 + 100 * 1.20 + (unit - 300) * 1.50;
        }

        return bill;
    }
}

