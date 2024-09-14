import java.util.Scanner;

public class Prob22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        // Input : 5
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        for(int i = 1; i<=number; i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j = i; j<=(number*2)-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
