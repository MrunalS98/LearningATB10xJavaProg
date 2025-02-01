package Task_1st_Feb;

import java.util.Scanner;

public class Div_By_five_Eleven {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println("Number is divided by 5 and 11");
        }
        else if(num%5 ==0){
            System.out.println("Number is only divided by 5 and not by 11");
        }
        else if (num%11 ==0){
            System.out.println("Number is only divided by 11 and not by 5");
        }
    }
}
