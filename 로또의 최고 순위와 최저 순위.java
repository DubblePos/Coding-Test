class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
  
        int cnt_0 = 0;
        int cnt_collect = 0;
        int top = 0;
        
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){
                cnt_0 += 1;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(win_nums[j] == lottos[i]){
                    cnt_collect +=1;
                }
            }
            
        }
        int a;
        int b;
        top = cnt_collect+cnt_0;
        
        
        
        if(top == 6){
            a =1; 
        }else if(top == 5){
            a = 2;
        }else if(top == 4){
            a = 3;
        }else if(top == 3){
            a = 4;
        }else if(top == 2){
            a = 5;
        }else{
            a = 6;
        }
        
        if(cnt_collect == 6){
            b =1; 
        }else if(cnt_collect == 5){
            b = 2;
        }else if(cnt_collect == 4){
            b = 3;
        }else if(cnt_collect == 3){
            b = 4;
        }else if(cnt_collect == 2){
            b = 5;
        }else{
            b = 6;
        }
        
        int[] answer = {a, b};
        return answer;
    }
}