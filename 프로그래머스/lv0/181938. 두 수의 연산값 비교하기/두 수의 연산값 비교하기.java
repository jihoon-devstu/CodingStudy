class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sta = String.valueOf(a);
        String stb = String.valueOf(b);
        String strab = sta+stb;
    
        int ab = Integer.parseInt(strab);
        
        
        answer = (ab<2*a*b) ? 2*a*b : ab;
        
        return answer;
    }
}