class Solution {
    public double solution(int n, int t) {
        int result = 0;
        
        for(int i=0; i<t; i++){
            result = n * 2;
            n = result;
        }
     
        return result;
    }
}