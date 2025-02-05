package Task_5th_Jan_2025;

public class Sum_Natural_Numbers_while {
    public static void main(String[] args) {

        int sum=0;
        int i=1;
        while (i<=10){
            sum +=i;
            i++;
        }
        System.out.println("Sum:-" +sum);
    }
}
