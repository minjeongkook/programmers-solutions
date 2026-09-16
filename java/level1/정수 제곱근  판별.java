class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);

        if(sqrt % 1 == 0.0) {
            long root = (long) sqrt;
            return (root + 1) * (root + 1);
        }
        return -1;
    }
}
