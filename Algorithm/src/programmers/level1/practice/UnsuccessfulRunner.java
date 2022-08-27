package programmers.level1.practice;

import java.util.HashMap;

/*
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * 
 * 
 * 제한사항
 - 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 - completion의 길이는 participant의 길이보다 1 작습니다.
 - 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 - 참가자 중에는 동명이인이 있을 수 있습니다.
 * 
 */
public class UnsuccessfulRunner {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "ana"};
		String[] completion = {"ana", "mislav"};
		
		String answer = solution(participant, completion);
		
		System.out.println(answer);
		
	}
	
	public static String solution(String[] participant, String[] completion) {
		// sort를 이용
		/*
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(!completion[i].equals(participant[i])) {
				return participant[i];
			}
		}
		
		return participant[participant.length-1];
		*/
		
		// HashMap을 이용
		String answer = "";
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		for (String player : participant) hashmap.put(player, hashmap.getOrDefault(player, 0) + 1); // 동일한 키 값이 있으면 value에 1 더해주기
        for (String player : completion) hashmap.put(player, hashmap.get(player) - 1); // 해당하는 키 값의 value 값을 -1 해줌

        for (String key : hashmap.keySet()) { // keyset을 도는 동안
            if (hashmap.get(key) != 0){ // 해당하는 키 값의 value가 0이 아니라면
                answer = key;
            }
        }
        
        return answer;
        
    }
}
