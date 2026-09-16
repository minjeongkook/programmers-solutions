import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] carr = String.valueOf(n).toCharArray();
        Arrays.sort(carr);

        long answer = 0;

        for(int i = carr.length - 1; i >= 0; i--) {
            answer = answer * 10 + (carr[i] - '0');
        }


        return answer;
    }
}
