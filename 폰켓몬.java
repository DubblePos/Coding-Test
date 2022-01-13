import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> list_1 = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            list_1.add(nums[i]);
        }
        if(list_1.size() > nums.length/2){
            answer = nums.length/2;
        }else{
            answer = list_1.size();
        }
        return answer;
    }
}