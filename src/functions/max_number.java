package functions;

public class max_number {
    public static void main(String[] args) {

        int max = max_num(9,6);
        System.out.println(max);
    }

    public static int max_num(int a, int b){
        return a > b ? a : b;               //can your Math.max()
    }
}
