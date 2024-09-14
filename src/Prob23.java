import java.util.Scanner;

public class Prob23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        // Input : 5
        // 9 9 9 9 9 9 9 9 9
        //  8 8 8 8 8 8 8 8
        //   7 7 7 7 7 7 7
        //    6 6 6 6 6 6
        //     5 5 5 5 5
        //      4 4 4 4
        //       3 3 3
        //        2 2
        //         1

        for(int i = 1; i<=number; i++){
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=number+1-i; j++){
                System.out.print(number+1-i+" ");
            }
            System.out.println();
        }
    }
}
