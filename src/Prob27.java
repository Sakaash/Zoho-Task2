
import java.util.Scanner;
public class Prob27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string : ");
        String s2 = scanner.nextLine();
        scanner.close();
        int wordAt = isSubString(s1, s2);
        System.out.println(wordAt);
    }
    public static int isSubString(String string, String word){
        int index = 0;
        int wLen = word.length();
        while(index+wLen<string.length()){
            if(string.substring(index, index+wLen).equals(word)){
                return index;
            }
            index++;
        }
        return -1;
    }
}
