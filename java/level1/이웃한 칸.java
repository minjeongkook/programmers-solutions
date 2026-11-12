class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;

        int[] dy = new int[]{-1, 1, 0, 0};
        int[] dx = new int[]{0, 0, -1, 1};

        for(int i = 0; i < 4; i++){
            int ny = h + dy[i];
            int nx = w + dx[i];

            if(check(ny, nx, n) && board[ny][nx].equals(board[h][w])) answer++;
        }

        return answer;
    }

    private boolean check(int ny, int nx, int n){
        return 0 <= ny && ny < n && 0 <= nx && nx < n;
    }
}
