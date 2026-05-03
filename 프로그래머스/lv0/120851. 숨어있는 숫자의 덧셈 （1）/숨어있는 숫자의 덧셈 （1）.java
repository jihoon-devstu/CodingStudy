class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String removed = my_string.replaceAll("\\D","");
        
        for(int i = 0 ; i<removed.length();i++){
            char digit = removed.charAt(i);
            int digitValue = Character.getNumericValue(digit);
            
            answer += digitValue;
            
        }
        
        return answer;
    }
}