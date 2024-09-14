import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();
        System.out.println(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z' 
                           ? ch+" is an Alphabet" : ch+" is not an Alphabet");
    }
}
