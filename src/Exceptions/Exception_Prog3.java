package Exceptions;

public class Exception_Prog3 {
    public static void main(String[] args) {

        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        }
        catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
