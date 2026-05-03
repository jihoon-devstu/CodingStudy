class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int canbuy = money/5500;
        answer[0] = canbuy;
        answer[1] = money - (canbuy*5500);
        return answer;
    }
}