package class_03_operators_math_string;
public class Logical{
    public static void main(String[] args){
        //Logical operators are used to combine multiple boolean expressions.

        // AND (&&) operator
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // returns false because both a and b are not true

        // OR (||) operator
        System.out.println(a || b); // returns true because at least one of a or b is true

        // NOT (!) operator
        System.out.println(!a); // returns false because a is true
    }
}