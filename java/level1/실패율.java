import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        TreeMap<Double, ArrayList<Integer>> tm = new TreeMap<>(Comparator.reverseOrder());
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i < N + 1; i++){
            int arrive = 0;
            int notClear = 0;

            for(int n : stages){
                if(n >= i) arrive++;
                if(n == i) notClear++;
            }

            double fail = (arrive == 0) ? 0.0 : (double)notClear / arrive;

            tm.computeIfAbsent(fail, k -> new ArrayList<Integer>()).add(i);
        }

        for(ArrayList<Integer> al : tm.values()){
            result.addAll(al);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
