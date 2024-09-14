
import java.util.Scanner;
public class Prob25 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();

        int i;
    
        for(i = 0; i<str.length(); i++){
            int j = str.length()-i-1;
            for(int k = 0;k<str.length(); k++){
                if(k == i || k == j)
                    System.out.print(str.charAt(k));
                else
                    System.out.print(" ");
            }
            System.out.println();  
        }
    }
}

