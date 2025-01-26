package loop;

import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number for factorial !");
//        int num = sc.nextInt(); // java.util.InputMismatchException

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}
