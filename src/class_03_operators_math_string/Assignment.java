package class_03_operators_math_string;
public class Assignment{
    public static void main(String[] args){
        //Assignment Operators
        //Assignment operators are used to assign values to variables.

        // = (simple assignment operator)
        int a = 10;
        System.out.println("Value of a: " + a);

        // += (add and assign operator)
        a += 5; // equivalent to a = a + 5
        System.out.println("Value of a after += 5: " + a);

        // -= (subtract and assign operator)
        a -= 3; // equivalent to a = a - 3
        System.out.println("Value of a after -= 3: " + a);

        // *= (multiply and assign operator)
        a *= 2; // equivalent to a = a * 2
        System.out.println("Value of a after *= 2: " + a);

        // /= (divide and assign operator)
        a /= 4; // equivalent to a = a / 4
        System.out.println("Value of a after /= 4: " + a);

        // %= (modulus and assign operator)
        a %= 7; // equivalent to a = a % 7
        System.out.println("Value of a after %= 7: " + a);

        // &= (bitwise AND and assign operator)
        a &= 1; // equivalent to a = a & 1
        System.out.println("Value of a after &= 1: " + a);

        // |= (bitwise OR and assign operator)
        a |= 2; // equivalent to a = a | 2
        System.out.println("Value of a after |= 2: " + a);

        // ^= (bitwise XOR and assign operator)
        a ^= 3; // equivalent to a = a ^ 3
        System.out.println("Value of a after ^= 3: " + a);

        // >>= (right shift and assign operator)
        a >>= 2; // equivalent to a = a >> 1
        System.out.println("Value of a after >>= 1: " + a);

        // <<= (left shift and assign operator)
        a <<= 2; // equivalent to a = a << 2
        System.out.println("Value of a after <<= 2: " + a);
    }
}