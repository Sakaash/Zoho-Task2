import java.util.HashMap;

public class Prob15 {
    public static void main(String[] args) {
        int[] array = {1,6,3,9,21}; 
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int num : array){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        boolean found = false;
        System.out.print("Duplicate keys : ");
        for(int key : mp.keySet() ){
            if(mp.get(key)>1){
                System.out.print(key+" ");
                found = true;
            }
        }
        if(!found){
            System.out.print("No duplicates are present!");
        }
    }
}
