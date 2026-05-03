class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i<s1.length;i++){
            for(int n = 0; n<s2.length; n++){
                if (s1[i].equals(s2[n])) answer++; 
            }
        }
        return answer;
    }
}