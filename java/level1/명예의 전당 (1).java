import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> arr = new ArrayList<>();
        int[] answer = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            if(arr.size() == k) {
                if(arr.get(arr.size()-1) < score[i]) {
                    arr.remove(arr.size()-1);
                } else {
                    answer[i] = arr.get(arr.size()-1);
                    continue;
                }
            }

            arr.add(score[i]);
            Collections.sort(arr, Collections.reverseOrder());
            answer[i] = arr.get(arr.size()-1);
        }

        return answer;
    }
}
