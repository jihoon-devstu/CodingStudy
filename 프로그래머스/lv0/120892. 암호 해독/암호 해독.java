class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = code-1 ; i<cipher.length(); i+=code){
            char a = cipher.charAt(i);
            answer += String.valueOf(a);
        }
        return answer;
    }
}