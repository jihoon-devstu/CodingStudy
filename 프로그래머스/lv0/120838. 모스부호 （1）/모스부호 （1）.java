class Solution {
    public String solution(String letter) {
        String[] strArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] words = letter.split(" ");
        String answer = "";
        
        for(int a = 0 ; a < words.length; a++){
            for(int i = 0 ; i<strArray.length; i++){
                if(words[a].equals(strArray[i])){
                    char ch = (char)(i+97);
                    answer += String.valueOf(ch);
                }
            }
        }

    return answer;
}
                   }
                   