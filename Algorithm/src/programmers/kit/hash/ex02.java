package programmers.kit.hash;

import java.util.HashMap;
import java.util.Map;

public class ex02 {
	public static void main(String[] args) {
		
	}
	
	public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> hashmap = new HashMap<>();
        
        String answer = "";
        for(String player : participant) {
        	hashmap.put(player, hashmap.getOrDefault(player, 0) + 1);
        }
        
        for(String player : completion) {
        	hashmap.put(player, hashmap.get(player)-1);
        }
        
        // 해시맵 반복문
        for(String key : hashmap.keySet()) {
        	if(hashmap.get(key) != 0) {
        		answer = key;
        	}
        }
        
        return answer;
    }
}
