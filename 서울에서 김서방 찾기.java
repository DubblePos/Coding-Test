import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
            };
        }
        return answer;
    }
}