import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[][] student = new int[][]{{1, 2, 3, 4, 5}, 
                                     {2, 1, 2, 3, 2, 4, 2, 5}, 
                                     {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] count = new int[student.length];

        for(int i = 0; i < student.length; i++){
            for(int j = 0; j < answers.length; j++){
                if(answers[j] == student[i][j % student[i].length]){
                    count[i]++;
                }
            }
        }

        int max = Arrays.stream(count).max().getAsInt();
        int[] answer = new int[student.length];
        int idx = 0;

        for(int i = 0; i < student.length; i++){
            if(count[i] == max) answer[idx++] = i + 1;
        }

        return Arrays.copyOf(answer, idx);
    }
}
