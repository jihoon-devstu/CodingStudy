class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        double x = dot[0];
        double y = dot[1];
        if(x<0 && y<0){
            answer = 3;
        }else if (x<0 && 0<y){
            answer = 2;
        }else if (0<x && 0<y){
            answer = 1;
        }else if (0<x && y<0){
            answer = 4;
        }
        
        
        return answer;
    }
}