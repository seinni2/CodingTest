class Solution {
    public int solution(int num) {
        long n = num;
            
        for(int i=1; i<=500; i++){
           
           if(n==1){
               return i-1;
           }else if(i==500){
               if(n!=1){
                   return -1;
               }
           }
            else{
               if(n%2==0){
                    n /= 2;
                }else{
                    n = (n * 3) + 1;
                }
           }
        }
        return 0;
    }
}