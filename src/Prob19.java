import java.util.Scanner;

public class Prob19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter no of cols : ");
        int columns = scanner.nextInt();
        System.out.println("Enter the matrix : ");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the number of times to be rotated : ");
        
        scanner.close();
        // Left shift every row
        
        int temp;
        for(int i = 0; i<matrix.length-1; i++)
        {
            for(int j = i+1; j<matrix[i].length; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Right rotate logic  
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; (matrix[i].length%2==0?
        //                 j<matrix[i].length/2:
        //                 j<=matrix[i].length/2); j++)
        //     {
        //         temp = matrix[i][j];
        //         matrix[i][j] = matrix[i][matrix[i].length-1-j];
        //         matrix[i][matrix[i].length-1-j] = temp;
        //     }
        // }

        // Left rotate logic
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix[i].length-1-i][j];
                matrix[matrix[i].length-1-i][j] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}
