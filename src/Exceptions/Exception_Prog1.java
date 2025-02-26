package Exceptions;

public class Exception_Prog1 {

    public static void main(String[] args) {

        int a = 0;
        int b =10;
        int result = 0;
        try {
            result = b/a;
            }
        catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println("Please enter valid inputs");

    }
}
