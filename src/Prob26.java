
import java.util.Scanner;
public class Prob26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= number; i++) {
            for (int j = number+1-i; j>0 ; j--) {
                System.out.print("*");
            }
            for (int j = 1; j < 2*i-1; j++) {
                System.out.print("_");
            }
            for (int j = number+1-i; j>0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=number-1; i>=1; i--){
            for (int j = number+1-i; j>0 ; j--) {
                System.out.print("*");
            }
            for (int j = 2*i-2; j>0; j--) {
                System.out.print("_");
            }
            for (int j = number+1-i; j>0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
