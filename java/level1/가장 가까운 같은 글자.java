class Solution {
    public int[] solution(String s) {
		int[] answer = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			int j = i-1;
			
			while(j >= 0) {
				if(s.charAt(j) == cur) {
					answer[i] = i - j;
					break;
				}
				j--;
			}
			
			if(j == -1) answer[i] = -1;	
		}
		
        return answer;
    }
}


///// Other Solution /////
import java.util.HashMap;

class OtherSolution {
    public int[] otherSolution(String s) {
		int[] answer = new int[s.length()];
		HashMap<Character, Integer> hs = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(hs.containsKey(c)) {
				answer[i] = i - hs.get(c);
			} else {
				answer[i] = -1;
			}
			
			hs.put(c, i);
		}
		
        return answer;
    }
}
