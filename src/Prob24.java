import java.util.Scanner;

public class Prob24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int nRows = scanner.nextInt();
        scanner.close();
        int num = 1;
        for (int i = 1; i <= nRows; i++) {
            for(int k = nRows-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}
