import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        char ch = '\0';
        int number = 0;
        for(int i = 0; i<input.length();i++){
            char c = input.charAt(i);
            if(c>='a'&&c<='z' || c>='A'&&c<='Z'){
                while(number>0){
                    System.out.print(ch);
                    number--;
                }
                number = 0;
                ch = input.charAt(i);
            }
            if(c>='0'&&c<='9'){
                number = number*10 + ((int)c-'0');
            }
        }
        while(number>0){
            System.out.print(ch);
            number--;
        }
    }
}

