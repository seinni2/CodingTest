class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        
        for(int i=0; i<keyinput.length; i++){
            if((board[0]/2)*-1<answer[0]){
                if (keyinput[i].equals("left")){
                        answer[0] -= 1;
                }
            }
            if(board[0]/2>answer[0]){    
                if(keyinput[i].equals("right")){
                        answer[0] += 1;
                }
            }
            if((board[1]/2)*-1<answer[1]) {
                    if(keyinput[i].equals("down")){
                            answer[1] -= 1;
                    } 
            }
            if((board[1]/2>answer[1])){
                   if(keyinput[i].equals("up")){
                            answer[1] += 1;
                    }
                }
            }
        return answer;
    }
}
