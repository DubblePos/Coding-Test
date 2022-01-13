import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // arraylist 선언
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i ++){
            if(i == 0){
                list.add(arr[i]);
            }else if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }else{
                
            }
        }
        
        // int 로 변환
       
        int[] answer =  list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}