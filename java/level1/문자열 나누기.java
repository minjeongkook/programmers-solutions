class Solution {
    public int solution(String s) {
        int answer = 0;
        int sameCnt = 0;
        int otherCnt = 0;
        char first = s.charAt(0);

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == first) sameCnt++;
            else otherCnt++;

            if(sameCnt == otherCnt){
                answer++;
                sameCnt = 0;
                otherCnt = 0;
                if(i + 1 < s.length()) first = s.charAt(i + 1);
            }
        }

        if(sameCnt + otherCnt > 0) answer++;

        return answer;
    }
}
