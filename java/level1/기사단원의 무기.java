class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] count = new int[number + 1];
        
        for(int i = 1; i < number + 1; i++){
            for(int j = 1; j < (number / i) + 1; j++){
                count[i * j]++;
            }
        }
        
        for(int c : count){
            answer += (c > limit) ? power : c;
        }
        
        return answer;
    }
}
