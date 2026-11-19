import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int correctCnt = 0;

        for(int n : lottos){
            if(n == 0) zeroCnt++;
            else if(Arrays.stream(win_nums).anyMatch(k -> k == n)) correctCnt++;
        }

        int c = zeroCnt + correctCnt;
        answer[0] = Math.min(7 - c, 6);
        answer[1] = Math.min(7 - correctCnt, 6);

        return answer;
    }
}
