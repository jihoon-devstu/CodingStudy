class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0 ; i<my_string.length(); i++){
            char a = my_string.charAt(i);
            if(Character.isUpperCase(a)){
                String b = String.valueOf(a).toLowerCase();
                answer += b;
            }else{
                String b = String.valueOf(a).toUpperCase();
                answer += b;
            }
        }
        return answer;
    }
}