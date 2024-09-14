
import java.util.Arrays;

public class Prob18 {
    public static void main(String[] args) {
        int[] arr = {13,2,4,15,12,10,5};
        int len = arr.length;

        int oddCount = (len+1)/2;
        int evenCount = len/2;
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int oddIndex = 0, evenIndex = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2==0)
                odd[oddIndex++]=arr[i];
            else
                even[evenIndex++]=arr[i];
        }

        for (int i = 0; i < oddCount; i++) {
            int max = i;
            for (int j = i+1; j < odd.length; j++) {
                if(odd[j]>odd[max])
                    max = j;
            }
            int temp = odd[i];
            odd[i] = odd[max];
            odd[max]= temp;
        }
        for (int i = 0; i < even.length; i++) {
            int min = i;
            for (int j = i+1; j < even.length; j++) {
                if(even[j]<even[min])
                    min = j;
            }
            int temp = even[i];
            even[i] = even[min];
            even[min]= temp;
        }
        
        oddIndex = 0;
        evenIndex = 0;
        for (int i = 0; i < len; i++) {
            if(i%2==0)
                arr[i]=odd[oddIndex++];
            else
                arr[i]=even[evenIndex++];
        }
        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }
}
