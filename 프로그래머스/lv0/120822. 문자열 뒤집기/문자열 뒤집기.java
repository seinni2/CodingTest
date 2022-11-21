class Solution {
    public String solution(String my_string) {
    
        StringBuilder sb = new StringBuilder(my_string);
        String reversedStr = sb.reverse().toString();
        
        return reversedStr;
    }
}