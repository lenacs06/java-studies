package class_03_operators_math_string;
public class Arithmetic {
    static void main (){
        // Arithmetic Operators. Example.

        int x = 10;
        int y = 3;

        System.out.println(x + y); // 13
        System.out.println(x - y); // 7
        System.out.println(x * y); // 30
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1

        int z = 5;
        ++z;
        System.out.println(z); // 6
        --z;
        System.out.println(z); // 5

        // Incrementing and Decrementing. Example.

        //Incrementing
        int b = 67;
        ++b;
        System.out.println(b); // 68

        //Decrementing
        int v = 80;
        --v;
        System.out.println(v); // 79
    }
}