import java.util.Scanner;

public class Prob19 {
    public static void main(String[] args) {
        int[][] md = {{1,2,3},{4,5,6},{7,8,9}};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times to be rotated : ");
        int rotate = scanner.nextInt()%md[0].length;
        scanner.close();
        // Left shift every row
        for (int i = 0; i < md.length; i++) {
            int[] r = new int[rotate];
            int len = md[i].length;
            for (int j = 0; j < r.length; j++) {
                r[j]=md[i][j];
            }
            int temp = rotate;
            while (temp<len) {
                md[i][temp-rotate]= md[i][temp++];
            }
            for (int j = 0; j < r.length; j++) {
                md[i][len-rotate+j] = r[j];
            }
        }
        // Print the elements
        for (int i = 0; i < md.length; i++) {
            System.out.println();
            for (int j = 0; j < md[i].length; j++) {
                System.out.print(md[i][j]+" ");
            }
        }
    }
}
