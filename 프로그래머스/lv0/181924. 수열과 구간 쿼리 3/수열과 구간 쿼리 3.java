class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for (int a=0; a<arr.length;a++){
            answer[a] = arr[a];
        }
        int first = 0;
        int second = 0;
        for(int i=0;i<queries.length;i++){
            first = queries[i][0];
            second = queries[i][1];
            int tempt = answer[first];
            answer[first] = answer[second];
            answer[second] = tempt;
        }
        return answer;
    }
}