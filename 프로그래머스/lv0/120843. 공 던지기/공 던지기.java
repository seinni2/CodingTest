class Solution {
    public int solution(int[] numbers, int k) {
        int result = numbers[(2*(k-1) % numbers.length)];
        
        return result;
    }
}