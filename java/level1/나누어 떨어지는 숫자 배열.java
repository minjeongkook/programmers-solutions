import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> answer = new ArrayList<>();

        for(int n : arr) {
            if(n % divisor == 0) {
                answer.add(n);
            }
        }

        if(answer.isEmpty()) answer.add(-1);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
