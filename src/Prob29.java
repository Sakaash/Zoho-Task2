
import java.util.Scanner;
public class Prob29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(i==1||i==size||j==size){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
