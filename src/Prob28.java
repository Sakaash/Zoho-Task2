
import java.util.Scanner;
public class Prob28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfTerms = scanner.nextInt();
        scanner.close();
        int output = 0;
        int adder = 1;
        for(int i = 0; i<nOfTerms; i++){
            output += adder;
            adder = adder*10 + 1;
        }
        System.out.println(output);
    }
}
