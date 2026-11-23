import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        int answer = n - lost.length;
        Set<Integer> reserveSet = new HashSet<>();
        for(int r : reserve){
            reserveSet.add(r);
        }

        List<Integer> realLost = new ArrayList<>();
        for(int l : lost){
            if(reserveSet.remove(l)) answer++;
            else realLost.add(l);
        }

        for(int l : realLost){
            if(reserveSet.remove(l - 1)) answer++;
            else if(reserveSet.remove(l + 1)) answer++;
        }

        return answer;
    }
}
