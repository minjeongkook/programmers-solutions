import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        if(m > score.length) return 0;

        Arrays.sort(score);

        int temp = 0;
        for(int i = score.length - m; i >= 0; i -= m){
            temp += score[i];
        }

        return temp * m;
    }
}
