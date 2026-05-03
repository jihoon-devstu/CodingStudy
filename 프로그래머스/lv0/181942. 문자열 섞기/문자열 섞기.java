class Solution {
    public String solution(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();
        String c = "";
        for (int i = 0; i < Math.max(a, b); i++) {
            if (i < a) c += str1.charAt(i);
            if (i < b) c += str2.charAt(i);
        }
        String answer = c;
        return answer;
    }
}