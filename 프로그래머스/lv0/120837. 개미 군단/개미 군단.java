class Solution {
    public int solution(int hp) {
        
        int result = 0;
        int num1 = 0;
        
        result += (int) hp/5;   //5의 몫
        num1 = (int) hp%5;      //5의 나머지 => 나누어져야하는 수 
        result += (int)(num1/3) + (num1%3);
        
        return result;
    }
}