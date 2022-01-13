import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n+1; i++){
            if(n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}