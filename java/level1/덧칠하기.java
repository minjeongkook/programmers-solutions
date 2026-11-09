class Solution {
    public int solution(int n, int m, int[] section) {
        int i = 0;
        int result = 0;

        while(i < section.length){
            int end = section[i] + m - 1;

            while(i < section.length && section[i] <= end){
                i++;
            }

            result++;     
        }

        return result;
    }
}
