import java.util.Scanner;

public class Prob20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        // Input : 5
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321   
        for(int i = 1; i<=number; i++){
            for(int k = i;k<number;k++){
                System.out.print(" ");
            }
            int j;
            for(j = 1; j<=i; j++){
                System.out.print(j);
            }
            j=j-1;
            while(j>1){
                System.out.print(--j);
            }
            System.out.println();
        }
    }
}
