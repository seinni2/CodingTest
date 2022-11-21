class Solution {
    public String solution(String arr) {
      
        //공백제거
        String[] starr = arr.split("");
        
        //문자 -> 정수로 바꾼 값 넣을 배열 
        int[] int_arr = new int[starr.length];
      
        int i=0;
        for(String part : starr){
           int_arr[i] = Integer.parseInt(part);
           i++;
        }
        
        for(int j=0; j< int_arr.length; j++){
            System.out.println(int_arr[j]);
        }
    }
}