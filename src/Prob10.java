import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String result = reverseString(s,s.length());
        System.out.println(result);
    }

    public static String reverseString(String s,int lastIndex) {
        int temp = lastIndex;
        while(--lastIndex > 0 && s.charAt(lastIndex)!=' ' ){ }
        
        if(s.charAt(lastIndex)==' ')
            return s.substring(lastIndex+1,temp) + " "+ reverseString(s, lastIndex);
        else
            return s.substring(lastIndex, temp);
    }
}
