class Solution {
    public int solution(String[] babbling) {
        String[] speak = new String[]{"aya", "ye", "woo", "ma"};
        int answer = 0;

        for(String babb : babbling) {
            for(String s : speak) {
                babb = babb.replace(s + s, "!");
                babb = babb.replace(s, " ");
            }

            babb = babb.replace(" ", "");

            if(babb.equals("")) answer++;
        }

        return answer;
    }
}
