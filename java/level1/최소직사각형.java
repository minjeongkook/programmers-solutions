class Solution {
    public int solution(int[][] sizes) {
        int maxLong = 0;
        int maxShort = 0;


        for(int[] size : sizes) {
            int longer = Math.max(size[0], size[1]);
            int shorter = Math.min(size[0], size[1]);

            if(longer > maxLong) maxLong = longer;
            if(shorter > maxShort) maxShort = shorter;
        }

        return maxLong * maxShort;
    }
}
