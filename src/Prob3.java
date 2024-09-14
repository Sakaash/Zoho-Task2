import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of students :");
        int total = scanner.nextInt();
        scanner.close();
        String group1 = "Group 1\n";
        String group2 = "Group 2\n";
        String group3 = "Group 3\n";
        String group4 = "Group 4\n";
        int rollNo = 101;
        while(total>0){
            if(rollNo%4==1)
                group1 += rollNo +"\n";
            else if(rollNo%4==2)
                group2 += rollNo +"\n";
            else if(rollNo%4==3) 
                group3 += rollNo +"\n";
            else
                group4 += rollNo +"\n";
            rollNo++;
            total--;
        }
        System.err.println(group1+group2+group3+group4);
        
    }
}
