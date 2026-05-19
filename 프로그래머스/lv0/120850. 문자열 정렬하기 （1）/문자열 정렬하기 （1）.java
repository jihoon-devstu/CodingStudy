import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            char a = my_string.charAt(i);
            if(Character.isDigit(a)){
                list.add(Character.getNumericValue(a));
            }
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}