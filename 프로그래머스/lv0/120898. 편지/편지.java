class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] s = message.split("");
        
        for(String c:s){
            answer += 1;
        }
        
        return answer*2;
    }
}