class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String ageStr = String.valueOf(age);
        
        for(char c : ageStr.toCharArray()){
            int digit = c- '0';
            sb.append((char)('a'+digit));
        }
        return sb.toString();
    }
}