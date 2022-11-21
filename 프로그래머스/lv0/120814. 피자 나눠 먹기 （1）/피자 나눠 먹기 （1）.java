class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if((double) n/7 <= 1.0){
            answer += 1;
        }else if((double) n/7 > 1.0){
            answer += Math.ceil((double) n/7);
        }   
        
        return answer;
    }
}