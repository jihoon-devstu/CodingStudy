class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2==0){
            for(int a = 2; a<=n; a+=2){
                answer += a*a;
            }

        }else{
            for(int i =1; i<=n ; i+=2){
                answer += i; 
            }
        }
        return answer;
    }
}