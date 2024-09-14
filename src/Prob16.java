public class Prob16 {
    public static void main(String[] args) {
        int[] array1 = {2,4,5,6,7,9,10,13};
        int[] array2 = {2,3,4,5,6,7,8,9,11,15};
        int[] mergedArr = new int[array1.length+array2.length];
        int i = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1<array1.length &&index2<array2.length) {
            if(array1[index1]<array2[index2]){
                mergedArr[i++]=array1[index1++];
            }
            else if (array1[index1]>array2[index2]) {
                mergedArr[i++]=array2[index2++];
            }
            else{
                mergedArr[i++]=array1[index1++];
                index2++;
            }
        }
        while (index1<array1.length) {
            mergedArr[i++] = array1[index1++];
        }
        while (index2<array2.length) {
            mergedArr[i++] = array2[index2++];
        }
        for (int j : mergedArr) {
            System.out.print(j+" ");
        }
    }
}
