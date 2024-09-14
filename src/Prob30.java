
import java.util.Scanner;
public class Prob30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of a NxN Matrix : ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        int[][] result = createDiagonals(arr);
        for (int[] jarr : result) {
            for (int i : jarr) {
                System.out.print(i+" ");
            }
           System.out.println();
        }
    }
    public static int[][] createDiagonals(int[][] arr){
        int n = arr.length;
        int[][] result = new int[n*2-1][];
        for (int i = 0; i < n; i++) {
            result[i] = new int[i+1];
            for(int j = 0; j<=i; j++) {
                result[i][j] = arr[j][i-j];
            }
        }
        for (int i = n; i < 2*n-1; i++) {
            result[i] = new int[2*n-1-i]; 
            for (int j = i-n+1; j<n; j++) {
                result[i][j - (i-n+1)] = arr[j][i-j];
            }
        }
        return result;
    }
}
