import java.util.ArrayList;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;
		
        // 합을 저장할 저장공간 선언
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for문을 이용하여 배열의 합을 구한다.         
        for(int i = 0; i < nums.length; i++) {
        	if(i + 2 >= nums.length) break;
        	for(int j = i + 1; j < nums.length; j++) {
        		for(int h = j + 1; h < nums.length; h++) {
        			list.add(nums[i] + nums[j] + nums[h]);
        		}
        	}
        }
        
        // 소수판별
        for(Integer i : list) {
        	int count = 2;
        	answer++;
        	while(count < i) {		
        		if(i % count == 0) {
        			answer--;
        			break;
        		}
        		count++;
        	}
        }
        return answer;
    }
}