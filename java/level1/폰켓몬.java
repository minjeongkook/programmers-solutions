import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        for(int n : nums) {
            hs.add(n);
        }

        return Math.min(nums.length / 2, hs.size());
    }
}
