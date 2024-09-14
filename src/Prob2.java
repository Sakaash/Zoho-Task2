public class Prob2 {
    public static void main(String[] args) {
        int a = 5;   //binary : 0101
        int b = 10;  //binary : 1010

        // Bitwise AND operation values at same positon is not 
        // the 1 & 1 OUTPUT is 0 (0000)
        System.out.println(a&b);

        // Bitwise OR operation all position at both value either have 1 
        // any one value so OUTPUT is 15 (1111)
        System.out.println(a|b);

        // Bitwise XOR operation at any position the values should differ 
        // for 1 else it will be OUTPUT is 15 (1111)
        System.out.println(a^b); 

        // Bitwise NOT can only work on one variable it can only work 
        // with 0s and 1s !a = 1111 .... 1010  therefore 5 produce
        // -6 through the 2's complement method
        System.out.println(~a);

        // Left shift - shifts all elements to left n times and adds 0 
        // adds 0 to last element
        System.out.println(a<<1);

        // Right shift - shifts all elements to right n times and adds 0 
        // if positive else 1
        System.out.println(a>>1);

        // Unsigned right shift - fills 0 always in the sign bits
        System.out.println(a>>>1);
    }
}
