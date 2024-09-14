public class Prob5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        int discriminant = (int)Math.sqrt(Math.pow(b,2)-(4*a*c));
        System.out.println("Positive root : " + ((-b+discriminant)/(2*a)));
    }    
}
