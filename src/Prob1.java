import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();
        if(ch>='A' && ch<='Z'){
            while(!(ch>'Z')){
                System.out.print(ch++);
            }
        }
        if(ch>='a' && ch<='z'){
            while(!(ch>'z')){
                System.out.print(ch++);
            }
        }   
    }
}
