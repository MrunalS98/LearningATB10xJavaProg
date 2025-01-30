package Task_30th_Jan_2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Alphabet_check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Alphabet:- ");
        char ch = sc.next().charAt(0);

        if((ch >='a' && ch<='z') || (ch >='A' && ch<='Z')){
            System.out.println("Character is alphabet");
        }
        else{
            System.out.println("Character is not alphabet");
        }

        sc.close();
    }
}
