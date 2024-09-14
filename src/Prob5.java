public class Prob5 {
    public static void main(String[] args) {
        int[] array = {2,5,7};
        int b2 = (int)Math.pow(array[1], 2);
        int ac = array[0]*array[2];
        int a2 = 2*array[0];
        int posNumerator = -array[1] + (int)Math.sqrt(b2-(4*ac));
        int negNumerator = -array[1] - (int)Math.sqrt(b2-(4*ac));
        int denominator = a2;

        int answer =  posNumerator / denominator;
        int answer2 = negNumerator / denominator;
        System.out.println(answer);
        System.out.println(answer2);
    }    
}
