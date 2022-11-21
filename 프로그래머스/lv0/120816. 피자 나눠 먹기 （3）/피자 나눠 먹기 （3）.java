class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(slice < n){
            answer += Math.ceil((double) n / slice);
        }else if(slice >= n){
            answer += 1;
        }
        return answer;
    }
}