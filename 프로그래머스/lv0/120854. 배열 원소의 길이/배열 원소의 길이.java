class Solution {
    public int[] solution(String[] strlist) {
        int[] result = new int[strlist.length];
       
        for(int i=0; i<strlist.length; i++){
            String str = strlist[i];
            String[] str_arr= str.split("");
            
            result[i] = str_arr.length;
        }
        return result;
    }
}