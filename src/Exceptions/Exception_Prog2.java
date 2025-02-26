package Exceptions;

public class Exception_Prog2 {
    public static void main(String[] args) {

        try {
            int a = 10/0;
            System.out.println(a);              // will print when valid / is applied
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Enter valid inputs");
    }
}
