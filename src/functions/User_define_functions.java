package functions;

public class User_define_functions {
    public static void main(String[] args) {

        func_one();

        String s = func_two();
        System.out.println(s);

        func_three("Hey", "  Hello");
        func_three("Hi", "  how are you");

        int sum = sum_of_numbers(5,4);
        System.out.println(sum);
        int sum2 = sum_of_numbers(9,4);
        System.out.println(sum2);
        int sum3 = sum_of_numbers(5,7);
        System.out.println(sum3);
    }

    //1.Without Parameters and Without Return Type
    public static void func_one(){
        System.out.println("Hi I am Without Parameters and Without Return Type function");
    }

    //2. Without Parameters but With Return Type
    public static String func_two(){
        return "Hi I am Without Parameters but With Return Type function";
    }

    //With Parameters and Without Return Type ( 90%)
    public static void func_three(String firstname, String lastname){
        System.out.println("Your name is -> " +firstname +lastname );
    }

    //4. With Parameters and With Return Type
    public static int sum_of_numbers(int a, int b){
        return a+b;
    }
}
