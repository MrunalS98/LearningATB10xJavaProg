package Generics;

public class generic_01_prog {
    public static void main(String[] args) {
        tempSum(23,45);
        tempSum("Pramod","Dutta");
        tempSum("Pramod",123);
        tempSum(true,false);
    }

    public static <T> T tempSum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
