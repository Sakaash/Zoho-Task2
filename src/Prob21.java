import java.util.Scanner;

public class Prob21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        // Input : 5
        //     5
        //    454
        //   34543
        //  2345432
        // 123454321   
        for(int i = 1; i<=number; i++){
            for(int k = i;k<number;k++){
                System.out.print(" ");
            }
            int j;
            for(j = number+1-i; j<=number; j++){
                System.out.print(j);
            }
            j=j-1;
            while(j>number-i+1){
                System.out.print(--j);
            }
            System.out.println();
        }
    }
}
