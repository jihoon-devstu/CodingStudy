class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = "";
        String ba = "";
        int parseab = 0;
        int parseba = 0;
        
        ab = String.valueOf(a)+String.valueOf(b);
        ba = String.valueOf(b)+String.valueOf(a);
        parseab = Integer.parseInt(ab);
        parseba = Integer.parseInt(ba);
        
        if(parseab<parseba){
            answer = parseba;
        }else if(parseab==parseba){
            answer = parseab;
        }else{
            answer = parseab;
        }
        return answer;
    }
}