import java.time.LocalDate;

class Solution {
    public int solution(int age) {
        int answer = 0;
        
        LocalDate now = LocalDate.now();
        answer = now.getYear() - (age-1);
        
        return answer;
    }
}