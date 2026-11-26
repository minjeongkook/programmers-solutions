import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String info[] = {"code", "date", "maximum", "remain"};

        int extIdx = Arrays.asList(info).indexOf(ext);
        int sortIdx = Arrays.asList(info).indexOf(sort_by);

        List<int[]> al = new ArrayList<>();
        for(int[] d : data){
            if(d[extIdx] < val_ext) al.add(d);
        }

        al.sort((a, b) -> Integer.compare(a[sortIdx], b[sortIdx]));

        return al.toArray(new int[0][]);
    }
}
