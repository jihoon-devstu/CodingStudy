import java.util.*;
class Solution {
    public List<Integer> solution(int[] numbers, int num1, int num2) {
        List<Integer> answer = new ArrayList<>();
        int a = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            if(num1<=i && i<=num2) answer.add(numbers[i]);
        }
        return answer;
    }
}