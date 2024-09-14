public class Prob6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        System.out.println(++a-b--);
        // 11-11 = 0
        // a = 11 b = 10
        System.out.println(a%b++);
        // 11%10 = 1
        // a = 11 b = 11
        System.out.println(a*=b+5);
        // a = a*b + 5    
        // a = 11* 11+5
        // since + precedes * in operator precedence a = 11*16 
        int x = 69;
        System.out.println(x>>>2);
        // Unsigned right shift replaces all sign digits to 0
        // 1000101 -> 0010001 -> 17 in decimal
    }
}
