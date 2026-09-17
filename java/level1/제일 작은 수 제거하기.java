import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};

        int min = Arrays.stream(arr).min().getAsInt();
        List<Integer> answer = new ArrayList<>();

        for(int n : arr) {
            if(n != min) answer.add(n);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
