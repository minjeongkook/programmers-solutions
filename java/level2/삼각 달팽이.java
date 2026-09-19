import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[][] tempArr = new int[n][n];
        int[][] move = new int[][] {{1, 0}, {0, 1}, {-1, -1}};
        int mode = 0;
        int num = 1;

        int y = 0;
        int x = 0;
        tempArr[y][x] = num++;

        while(true) {
            int ny = y + move[mode][0];
            int nx = x + move[mode][1];

            if(ny < 0 || ny >= n || nx < 0 || nx >= n || tempArr[ny][nx] != 0) {
                mode = (mode + 1) % 3;

                ny = y + move[mode][0];
                nx = x + move[mode][1];

                if(ny < 0 || ny >= n || nx < 0 || nx >= n || tempArr[ny][nx] != 0) {
                    break;
                }   
            }

            tempArr[ny][nx] = num++;
            y = ny;
            x = nx;
        }

        List<Integer> arr = new ArrayList<>();
        for(int[] temp : tempArr) {
            for(int t : temp) {
                if(t != 0) arr.add(t);
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
