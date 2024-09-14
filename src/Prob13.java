public class Prob13 {
    public static void main(String[] args) {
        int[] arr = {2,7,1,6,8,3,5,9,4,6};
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i<min)
                min = i;
        }
        System.out.println(min);
    }
}
