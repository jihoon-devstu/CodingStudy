class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String replace = str1.replace(str2,"");
        answer = (str1.equals(replace)) ? 2 : 1;
        return answer;
    }
}