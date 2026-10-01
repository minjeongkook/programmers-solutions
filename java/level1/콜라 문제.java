class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cur = n;

        while(cur >= a) {
            int quo = cur / a;
            int mod = cur % a;

            answer += quo * b;
            cur = quo * b + mod;
        }

        return answer;
    }
}
