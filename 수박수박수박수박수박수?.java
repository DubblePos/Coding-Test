import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=0; i<n; i++){
            if(i%2==0){
                answer += "수";
            }
            if(i%2==1){
                answer += "박";
            }
        }
        return answer;
    }
}