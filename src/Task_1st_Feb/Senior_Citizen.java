package Task_1st_Feb;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Senior_Citizen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>=0 && age<=12){
            System.out.println("Your age shows that you are a Child");
        }
        else if(age>=13 && age<=19){
            System.out.println("Your age shows that you are a Teenager");
        }
        else if(age>=20 && age<=64){
            System.out.println("Your age shows that you are a Adult");
        }
        else if(age>=65){
            System.out.println("Your age shows that you are a Senior Citizen");
        }
    }
}
