import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        int result = 0;
        
        while(n > 0){
            //나머지 
            alist.add(n%10);
            //몫
            n = n/10;
        }
        
        for(int i:alist){
            result += i;
        }
        
        return result;
    }
}