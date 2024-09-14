public class Prob17 {
    public static void main(String[] args) {
        // Array should be sorted
        int[] arr = {1,2,3,4,5,6,7};
        int[] result = new int[arr.length];
        int index = 0;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            result[index++]=arr[end--];
            result[index++]=arr[start++];
        }
        if(start==end){
            result[index]=arr[start];
        }
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
