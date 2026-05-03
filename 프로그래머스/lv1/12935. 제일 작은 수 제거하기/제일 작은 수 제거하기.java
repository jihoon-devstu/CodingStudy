import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] brr = arr.clone();
        int target = 0;
        if(arr.length ==1){
            list.add(-1);
        }else{
            Arrays.sort(brr);
            target = brr[0];
            for(int n : arr){
                if(n!=target){
                    list.add(n);
                }
            }
        }
        return list;
    }
}