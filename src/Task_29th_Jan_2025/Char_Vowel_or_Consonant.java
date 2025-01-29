package Task_29th_Jan_2025;

import java.util.Scanner;

public class Char_Vowel_or_Consonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch); // Convert to lowercase for easier comparison

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Your character is vowel");
        }
        else{
            System.out.println("Your character is consonant");
        }
    }
}
