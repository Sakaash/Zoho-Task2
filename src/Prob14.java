public class Prob14 {
    public static void main(String[] args) {
        int[] array = {2,34,5,6,46,7,363,75,157};
        int[] duplicate = new int[array.length];
        for(int i = 0; i<array.length; i++){
            duplicate[i]=array[i];
        }
        for (int i : duplicate) {
            System.out.print(i+" ");
        }
        
        // Using ref
        // int[] duplicate = array;
        // for(int i : duplicate){
        //     System.out.print(i+" ");
        // }
    }
}
